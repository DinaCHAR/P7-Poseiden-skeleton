package com.nnk.springboot.services;

import com.nnk.springboot.domain.Trade;
import com.nnk.springboot.repositories.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Annotation Spring qui indique que cette classe est un service métier
@Service
public class TradeService {
    // Injection du repository Trade pour interagir avec la base de données
    @Autowired
    private TradeRepository tradeRepository;
    
    // Méthode pour récupérer tous les enregistrements de type Trade en base
    public List<Trade> findAll() {
        return tradeRepository.findAll();
    }
    
    // Méthode pour enregistrer un Trade dans la base de données
    // Cela peut être une création ou une mise à jour si l'objet a déjà un ID
    public Trade save(Trade trade) {
        return tradeRepository.save(trade);
    }
    // Méthode pour rechercher un Trade par son identifiant
    // Retourne un Optional pour permettre de gérer le cas où le Trade n'existe pas
    public Optional<Trade> findById(Integer id) {
        return tradeRepository.findById(id);
    }
    
    // Méthode pour supprimer un Trade à partir de son identifiant
    public void delete(Integer id) {
        tradeRepository.deleteById(id);
    }
}