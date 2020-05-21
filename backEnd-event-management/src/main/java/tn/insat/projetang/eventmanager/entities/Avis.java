package tn.insat.projetang.eventmanager.entities;

import javax.persistence.*;

@Entity
@Table(name = "app_avis")
public class Avis {

    @Id
    @GeneratedValue
    private int id;

    private String commentaire;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return user.getUsername();
    }

    public void setUser(User user) {
        this.user = user;
    }




}
