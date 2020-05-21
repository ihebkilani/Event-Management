package tn.insat.projetang.eventmanager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.insat.projetang.eventmanager.entities.Avis;
import tn.insat.projetang.eventmanager.repository.AvisRepository;

import java.util.List;

@Service
public class AvisService {
    @Autowired
    AvisRepository avisRepository;

    public List<Avis> findAvis(){
        return avisRepository.findAll();
    }

    public void addAvis(Avis avis){
        avisRepository.save(avis);
    }

}

