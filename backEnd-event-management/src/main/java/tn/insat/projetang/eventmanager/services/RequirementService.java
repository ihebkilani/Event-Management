package tn.insat.projetang.eventmanager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.insat.projetang.eventmanager.entities.Requirement;
import tn.insat.projetang.eventmanager.repository.RequirementRepository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class RequirementService {
    @Autowired
    RequirementRepository requirementRepository;

    public List<Requirement> findByBudget(double budget) {

        List<Requirement> requirements=requirementRepository.findAll();
        ArrayList<Requirement> requirements1=new ArrayList<Requirement>();
        for(int i=0;i<requirements.size();i++)
        {
            if ((requirements.get(i).getBudgetReq())<budget)
                requirements1.add(requirements.get(i));

        }
        return requirements1;
    }
}
