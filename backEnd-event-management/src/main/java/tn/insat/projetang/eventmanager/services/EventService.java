package tn.insat.projetang.eventmanager.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.insat.projetang.eventmanager.entities.Event;
import tn.insat.projetang.eventmanager.repository.EventRepository;

import java.util.List;

@Service
public class EventService {

    @Autowired
    EventRepository eventRepository;

    public List<Event> findEvent(){
        return eventRepository.findAll();
    }

    public void addEvent(Event event){
        eventRepository.save(event);
    }


}
