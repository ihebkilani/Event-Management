package tn.insat.projetang.eventmanager.entities;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "panier")
public class Panier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToOne(mappedBy = "panier")
    private User user;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "panier")
    private List<Event> events;

    public Panier() {
    }

    public Panier(User user, List<Event> events) {
        this.user = user;
        this.events = events;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public Long getUserId() {
        return user.getId();
    }

    public void setUser(User user) {
        this.user = user;
    }
}
