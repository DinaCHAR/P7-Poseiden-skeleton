package com.nnk.springboot.services;

import com.nnk.springboot.domain.Rating;
import com.nnk.springboot.repositories.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Annotation indiquant que cette classe fait partie de la couche "Service" (logique métier)
@Service
public class RatingService {
	
    // Injection automatique du repository pour accéder aux opérations en base sur l'entité Rating
    @Autowired
    private RatingRepository ratingRepository;
    
    // Méthode pour récupérer tous les objets Rating présents en base de données
    public List<Rating> findAll() {
        return ratingRepository.findAll();
    }
    
    // Méthode pour enregistrer un Rating dans la base (création ou mise à jour)
    public Rating save(Rating rating) {
        return ratingRepository.save(rating);
    }
    
    // Méthode pour retrouver un Rating à partir de son identifiant
    // Le retour est de type Optional pour gérer les cas où l'objet n'existe pas
    public Optional<Rating> findById(Integer id) {
        return ratingRepository.findById(id);
    }
    
    // Méthode pour supprimer un Rating en base à partir de son identifiant
    public void delete(Integer id) {
        ratingRepository.deleteById(id);
    }
}