package tn.insat.projetang.eventmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.insat.projetang.eventmanager.entities.Requirement;

import java.util.List;

public interface RequirementRepository extends JpaRepository<Requirement, Long> {
}
