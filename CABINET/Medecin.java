package Cabinet;

import java.util.Objects;

import java.time.LocalDateTime; // utilisée pour manipuler les objets de date et heure, notamment pour la vérification de la disponibilité du médecin.
import java.util.ArrayList; //   utilisée pour travailler avec des listes dynamiques, notamment pour stocker les consultations effectuées par le médecin.
import java.util.List; //  utilisée pour déclarer et manipuler des listes, qui sont utilisées pour stocker les consultations du médecin.
public class Medecin {

    
    private String nom; // Nom du médecin
    private String prenom; // Prénom du médecin
    private String specialite; // Spécialité du médecin
    private String adresse; // Adresse du médecin
    private String numeroTelephone; // Numéro de téléphone du médecin
    private String email; // Adresse e-mail du médecin
    private List<Consultation> consultations; // Liste des consultations effectuées par le médecin

    // Constructeur
    public Medecin( String nom, String prenom, String specialite, String adresse, String numeroTelephone, String email) {
        
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
        this.adresse = adresse;
        this.numeroTelephone = numeroTelephone;
        this.email = email;
        this.consultations = new ArrayList<>(); // Initialisation de la liste des consultations
    }

    // Getters et setters

    
    
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
    @Override
    public String toString() {
        return "Medecin{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", specialite='" + specialite + '\'' +
                ", adresse='" + adresse + '\'' +
                ", numeroTelephone='" + numeroTelephone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medecin medecin = (Medecin) o;
        return Objects.equals(nom, medecin.nom) &&
               Objects.equals(prenom, medecin.prenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom);
    }

    //! Méthodes spécifiques

    /**
     * Renvoie la liste des consultations effectuées par le médecin.
     * @return La liste des consultations
     */
    public List<Consultation> getConsultations() {
        return consultations;
    }

    /**
     * Ajoute une consultation à la liste des consultations du médecin.
     * @param consultation La consultation à ajouter
     */
    public void ajouterConsultation(Consultation consultation) {
        consultations.add(consultation); // Ajouter une consultation à la liste du médecin
    }

    /**
     * Vérifie la disponibilité du médecin à une date et heure spécifiées.
     * @param dateHeure La date et heure à vérifier
     * @return true si le médecin est disponible, sinon false
     */
    public boolean verifierDisponibilite(LocalDateTime dateHeure) {
        return true; // Exemple simple de retour // Vérifier si le médecin est disponible à la date et à l'heure données
    }
}
