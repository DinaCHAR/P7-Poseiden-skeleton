package com.nnk.springboot.services;

import com.nnk.springboot.domain.User;
import com.nnk.springboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

//Annotation qui indique que cette classe est un service géré par Spring
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    // Injection du repository permettant d’accéder aux utilisateurs enregistrés
    @Autowired
    private UserRepository userRepository;

    // Méthode obligatoire de l’interface UserDetailsService (utilisée par Spring Security)
    // Elle est appelée automatiquement lors de l'authentification avec un nom d'utilisateur
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	// Recherche de l’utilisateur par son nom d’utilisateur dans la base
        // Si aucun utilisateur n’est trouvé, on lance une exception
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));

     // Création et retour d’un objet UserDetails contenant :
        // le nom d’utilisateur
        // le mot de passe (déjà encodé)
        // la liste des rôles/permissions (ici, un seul rôle)
        return new org.springframework.security.core.userdetails.User(
                user.getUsername(),			//ID
                user.getPassword(),			//MP
                Collections.singletonList(	//Lise de roles (ici un suel)
                		new SimpleGrantedAuthority(user.getRole()))
        );
    }
}