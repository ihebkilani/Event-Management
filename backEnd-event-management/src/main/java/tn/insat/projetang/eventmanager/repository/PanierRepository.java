package tn.insat.projetang.eventmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.insat.projetang.eventmanager.entities.Panier;

public interface PanierRepository extends JpaRepository<Panier, Long> {
}
