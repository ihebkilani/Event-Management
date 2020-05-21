

package tn.insat.projetang.eventmanager.entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private Date date;

    private double budget;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "event_requirements",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "requirement_id"))
    private List<Requirement> requirements;

    @ManyToOne
    @JoinColumn(name = "panier_id")
    private Panier panier;

    public Event() {
    }

    public Event(String name, String description, Date date, double budget, List<Requirement> requirements, Panier panier) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.budget = budget;
        this.requirements = requirements;
        this.panier = panier;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public Long getPanierId() {
        return panier.getId();
    }

    public void setPanier(Panier panier) {
        this.panier = panier;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public List<Requirement> getRequirements() {
        return requirements;
    }

    public void setRequirements(List<Requirement> requirements) {
        this.requirements = requirements;
    }
}
