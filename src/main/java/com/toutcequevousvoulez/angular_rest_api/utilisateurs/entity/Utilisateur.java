package com.toutcequevousvoulez.angular_rest_api.utilisateurs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private int age;
    private String poste;
    private String competences;
    private String note;
    private String image;

    public Utilisateur() {
    }

    public Utilisateur(Long id, String nom, int age, String poste, String competences, String note, String image) {
        super();
        this.id = id;
        this.nom = nom;
        this.age = age;
        this.poste = poste;
        this.competences = competences;
        this.note = note;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getCompetences() {
        return competences;
    }

    public void setCompetences(String competences) {
        this.competences = competences;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "SuperTropBienMonsieurSlashMadame{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", age=" + age +
                ", poste='" + poste + '\'' +
                ", competences='" + competences + '\'' +
                ", note='" + note + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
