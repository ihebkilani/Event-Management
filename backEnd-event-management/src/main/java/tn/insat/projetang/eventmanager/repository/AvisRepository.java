package tn.insat.projetang.eventmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.insat.projetang.eventmanager.entities.Avis;

@Repository
public interface AvisRepository extends JpaRepository<Avis, Integer>{
}
