package tn.insat.projetang.eventmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.insat.projetang.eventmanager.entities.Event;


public interface EventRepository extends JpaRepository<Event, Long> {
}
