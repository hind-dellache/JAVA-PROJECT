package Cabinet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import Cabinet.Consultation;
public class Medecin {

    private int id;
    private String nom;
    private String prenom;
    private String specialite;
    private String adresse;
    private String numeroTelephone;
    private String email;
    private List<Consultation> consultations; // Ajouter la liste des consultations

    // Constructeur
    public Medecin(int id, String nom, String prenom, String specialite, String adresse, String numeroTelephone, String email) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
        this.adresse = adresse;
        this.numeroTelephone = numeroTelephone;
        this.email = email;
        this.consultations = new ArrayList<>(); // Initialiser la liste des consultations
    }
    // Getters et setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Méthodes spécifiques

    public List<Consultation> getConsultations() {
        return consultations;
    }

    public void ajouterConsultation(Consultation consultation) {
        consultations.add(consultation); // Ajouter une consultation à la liste du médecin
    }

    public boolean verifierDisponibilite(LocalDateTime dateHeure) {
        return true; // Exemple simple de retour // Vérifier si le médecin est disponible à la date et à l'heure données
    }
}