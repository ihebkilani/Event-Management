package tn.insat.projetang.eventmanager.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.insat.projetang.eventmanager.entities.Event;
import tn.insat.projetang.eventmanager.repository.EventRepository;
import tn.insat.projetang.eventmanager.services.EventService;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/Event")
public class EventController {

    @Autowired
    EventService eventService;

    @Autowired
    EventRepository eventRepository;

    @PostMapping()
    public void addEvent(@RequestBody Event event){

        eventService.addEvent(event);

    }


    @GetMapping()
    public List<Event> findEvent(){
        return eventRepository.findAll();
    }


}
