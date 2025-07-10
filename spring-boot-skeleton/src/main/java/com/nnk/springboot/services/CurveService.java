package com.nnk.springboot.services;

import com.nnk.springboot.domain.CurvePoint;
import com.nnk.springboot.repositories.CurvePointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Annotation indiquant que cette classe est un service Spring (composant de la couche métier)
@Service
public class CurveService {
    // Injection du repository permettant d'interagir avec les données CurvePoint dans la base
    @Autowired
    private CurvePointRepository curvePointRepository;
    
    // Méthode pour récupérer tous les enregistrements CurvePoint de la base de données
    public List<CurvePoint> findAll() {
        return curvePointRepository.findAll();
    }
    
    // Méthode pour enregistrer (créer ou mettre à jour) un CurvePoint en base
    public CurvePoint save(CurvePoint curvePoint) {
        return curvePointRepository.save(curvePoint);
    }
    
    // Méthode pour retrouver un CurvePoint à partir de son identifiant
    // Retourne un Optional, ce qui permet de gérer le cas où l'élément n'existe pas
    public Optional<CurvePoint> findById(Integer id) {
        return curvePointRepository.findById(id);
    }
    
    // Méthode pour supprimer un CurvePoint de la base à partir de son identifiant
    public void delete(Integer id) {
        curvePointRepository.deleteById(id);
    }
}