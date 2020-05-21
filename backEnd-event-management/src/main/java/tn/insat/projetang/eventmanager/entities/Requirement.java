package tn.insat.projetang.eventmanager.entities;


import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

@Entity
@Table(name = "requirement")
public class Requirement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double budgetReq;

    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 60)
    private TypeRequirement type;

    public Requirement() {
    }

    public Requirement(double budget, TypeRequirement type) {
        this.budgetReq = budget;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getBudgetReq() {
        return budgetReq;
    }

    public void setBudgetReq(double budgetReq) {
        this.budgetReq = budgetReq;
    }

    public TypeRequirement getType() {
        return type;
    }

    public void setType(TypeRequirement type) {
        this.type = type;
    }
}
