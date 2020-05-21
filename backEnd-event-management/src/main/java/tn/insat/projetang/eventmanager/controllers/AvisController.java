package tn.insat.projetang.eventmanager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.insat.projetang.eventmanager.entities.Avis;
import tn.insat.projetang.eventmanager.repository.AvisRepository;
import tn.insat.projetang.eventmanager.services.AvisService;

import java.util.List;

@RestController
@RequestMapping("/Avis")
@CrossOrigin
public class AvisController {

    @Autowired
    AvisService avisService;

    @Autowired
    AvisRepository avisRepository;

    @RequestMapping(method = RequestMethod.POST)
    public void addAvis(@RequestBody Avis avis){

        avisService.addAvis(avis);

    }


    @GetMapping()
    public List<Avis> findAvis(){
        return avisRepository.findAll();
    }

}
