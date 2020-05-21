package tn.insat.projetang.eventmanager.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.insat.projetang.eventmanager.entities.Requirement;
import tn.insat.projetang.eventmanager.repository.RequirementRepository;
import tn.insat.projetang.eventmanager.services.RequirementService;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/requirement")
public class RequirementController {

    @Autowired
    RequirementService requirementService;

    @Autowired
    RequirementRepository requirementRepository;


    @GetMapping("/{budgetReq}")
    public List<Requirement> findByBudget(@PathVariable  double budgetReq){
        return requirementService.findByBudget(budgetReq);
    }


    @GetMapping()
    public List<Requirement> findAll(){
        return requirementRepository.findAll();
    }
}
