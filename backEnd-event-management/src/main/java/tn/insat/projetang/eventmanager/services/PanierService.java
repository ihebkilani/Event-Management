package tn.insat.projetang.eventmanager.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.insat.projetang.eventmanager.entities.Panier;
import tn.insat.projetang.eventmanager.repository.PanierRepository;

import java.util.List;

@Service
public class PanierService {

    @Autowired
    PanierRepository panierRepository;

    public List<Panier> findPanier(){
        return panierRepository.findAll();
    }

    public void addPanier(Panier panier){
        panierRepository.save(panier);
    }
}
