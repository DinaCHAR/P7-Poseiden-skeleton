package com.nnk.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

//Annotation qui indique que cette classe contient une configuration Spring
@Configuration

//Active la sécurité Web de Spring Security
@EnableWebSecurity
public class SecurityConfig {

    // Service chargé de charger les utilisateurs depuis la base (implémente UserDetailsService)
    private final UserDetailsService userDetailsService;

    // Injection du UserDetailsService via le constructeur
    public SecurityConfig(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    // Configuration de la chaîne de filtres de sécurité
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests((auth) -> auth
                // Routes publiques accessibles sans authentification
                .requestMatchers("/", "/home", "/css/**", "/js/**").permitAll()
                .requestMatchers("/login", "/app/login").permitAll()
                // Routes protégées accessibles uniquement aux utilisateurs ayant le rôle ADMIN
                .requestMatchers("/user/**").hasAuthority("ADMIN")
                .requestMatchers("/secure/**").hasAuthority("ADMIN")
                // Toute autre requête nécessite une authentification
                .anyRequest().authenticated()
            )
            .formLogin((form) -> form
                 // Définition de la page de login personnalisée
                .loginPage("/login")
                // URL utilisée par Spring pour traiter les données du formulaire de connexion
                .loginProcessingUrl("/app/login")
                // Gestion de la redirection après une connexion réussie
                .successHandler((request, response, authentication) -> {
                    String redirectURL = request.getContextPath();
                    if (authentication.getAuthorities().stream()
                            .anyMatch(grantedAuthority -> grantedAuthority.getAuthority().equals("ROLE_ADMIN"))) {
                        redirectURL = "/bidList/list";// Redirection pour les admins (modifiable)
                    } else {
                        redirectURL = "/bidList/list";// Redirection par défaut pour tous
                    }
                    response.sendRedirect(redirectURL);
                })
             // Redirection en cas d’échec d’authentification
                .failureUrl("/login?error=true")
                .permitAll()
            )
            .logout((logout) -> logout
            	// URL pour se déconnecter
                .logoutUrl("/logout")
                // Redirection après déconnexion
                .logoutSuccessUrl("/login?logout")
                .permitAll()
            )
            // Désactive la protection CSRF (à ne faire que si tu sais pourquoi)
            .csrf(csrf -> csrf.disable());

        return http.build();
    }

    // Déclaration du bean AuthenticationManager pour gérer l’authentification
    @Bean
    public AuthenticationManager authManager(HttpSecurity http) throws Exception {
        AuthenticationManagerBuilder authenticationManagerBuilder = 
            http.getSharedObject(AuthenticationManagerBuilder.class);
        // Configuration de l’authentification avec notre UserDetailsService et un encodeur de mot de passe
        authenticationManagerBuilder
            .userDetailsService(userDetailsService)
            .passwordEncoder(passwordEncoder());
        return authenticationManagerBuilder.build();
    }

    // Bean pour encoder les mots de passe avec l’algorithme BCrypt
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}