package com.nnk.springboot.services;

import com.nnk.springboot.domain.RuleName;
import com.nnk.springboot.repositories.RuleNameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Annotation qui indique que cette classe est un service Spring (logique métier)
@Service
public class RuleNameService {
	
    // Injection automatique du repository pour accéder à la base de données des RuleName
    @Autowired
    private RuleNameRepository ruleNameRepository;
    
    // Méthode pour récupérer tous les enregistrements RuleName dans la base
    public List<RuleName> findAll() {
        return ruleNameRepository.findAll();
    }
    
    // Méthode pour enregistrer (ajouter ou mettre à jour) un objet RuleName dans la base
    public RuleName save(RuleName ruleName) {
        return ruleNameRepository.save(ruleName);
    }
    
    // Méthode pour rechercher un RuleName par son identifiant
    // Retourne un Optional pour indiquer que l’objet peut ne pas exister
    public Optional<RuleName> findById(Integer id) {
        return ruleNameRepository.findById(id);
    }
    // Méthode pour supprimer un RuleName de la base à partir de son identifiant
    public void delete(Integer id) {
        ruleNameRepository.deleteById(id);
    }
}
