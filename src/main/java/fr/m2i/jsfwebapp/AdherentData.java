package fr.m2i.jsfwebapp;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "adherentData", eager = true)
@SessionScoped
public class AdherentData {

    private List<Adherent> adherents = new ArrayList();

    private String nom;
    private String prenom;
    private String dateDeNaissance;
    private String ville;
    private String loisir;
    private String genre;

    public List<Adherent> getAdherents() {
        return adherents;
    }

    public String addAdherent() {

        Adherent adherent = new Adherent(nom, prenom, dateDeNaissance, ville, loisir, genre);
        adherents.add(adherent);

        nom = null;
        prenom = null;
        dateDeNaissance = null;
        ville = null;
        loisir = null;
        genre = null;

        return "showListAdherent";
    }

    public void setAdherents(List<Adherent> adherents) {
        this.adherents = adherents;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getLoisir() {
        return loisir;
    }

    public void setLoisir(String loisir) {
        this.loisir = loisir;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
