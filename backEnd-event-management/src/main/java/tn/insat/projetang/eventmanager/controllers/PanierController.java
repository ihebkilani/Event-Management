package tn.insat.projetang.eventmanager.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.insat.projetang.eventmanager.entities.Panier;
import tn.insat.projetang.eventmanager.repository.PanierRepository;
import tn.insat.projetang.eventmanager.services.PanierService;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/Panier")
public class PanierController {

    @Autowired
    PanierService panierService;

    @Autowired
    PanierRepository panierRepository;

    @PostMapping()
    public void addPanier(@RequestBody Panier panier){

        panierService.addPanier(panier);

    }


    @GetMapping()
    public List<Panier> findPanier(){
        System.out.println("dkhal");
        return panierRepository.findAll();

    }
}
