package Cabinet;
import java.util.ArrayList; // utilisée pour créer une liste dynamique (tableau redimensionnable) pour stocker les dossiers médicaux du patient.
import java.util.Date;// Pour utiliser le type Date pour représenter la date de naissance
import java.util.List;// Pour utiliser l'interface List pour stocker les antécédents médicaux, chirurgicaux, les allergies, etc.
import java.util.Map;// Pour utiliser l'interface Map pour stocker les informations sur le terrain du patient
public class Patient {
    private int id; // Identifiant unique du patient
    private String nom; // Nom du patient
    private String prenom; // Prénom du patient
    private Date dateNaissance; // Date de naissance du patient
    private String telephone; // Numéro de téléphone du patient
    private String adresse; // Adresse du patient
    private List<String> antecedentsMedicaux; // Liste des antécédents médicaux du patient
    private List<String> antecedentsChirurgicaux; // Liste des antécédents chirurgicaux du patient
    private Map<String, String> terrain; // Informations sur le terrain du patient (poids, taille, constantes, ...)
    private List<String> allergies; // Liste des allergies du patient
    private List<DossierMedical> dossiersMedical; // Liste des dossiers médicaux du patient
    private List<RendezVous> rendezVousList; // Liste des rendez-vous du patient
    // Constructeur
    public Patient(int id, String nom, String prenom, Date dateNaissance, String telephone, String adresse ) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.telephone = telephone;
        this.adresse = adresse;
        this.dossiersMedical = new ArrayList<>(); // Initialisation de la liste des dossiers médicaux
        this.rendezVousList = new ArrayList<>(); // Initialisation de la liste des rendez-vous
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

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<String> getAntecedentsMedical() {
        return antecedentsMedicaux;
    }

    public void setAntecedentsMedicaux(List<String> antecedentsMedicaux) {
        this.antecedentsMedicaux = antecedentsMedicaux;
    }

    public List<String> getAntecedentsChirurgical() {
        return antecedentsChirurgicaux;
    }

    public void setAntecedentsChirurgicaux(List<String> antecedentsChirurgicaux) {
        this.antecedentsChirurgicaux = antecedentsChirurgicaux;
    }

    public Map<String, String> getTerrain() {
        return terrain;
    }

    public void setTerrain(Map<String, String> terrain) {
        this.terrain = terrain;
    }

    public List<String> getAllergies() {
        return allergies;
    }

    public void setAllergies(List<String> allergies) {
        this.allergies = allergies;
    }

    // Méthode toString() pour afficher les informations du patient
    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", telephone='" + telephone + '\'' +
                ", adresse='" + adresse + '\'' +
                ", antecedentsMedicaux=" + antecedentsMedicaux +
                ", antecedentsChirurgicaux=" + antecedentsChirurgicaux +
                ", terrain=" + terrain +
                ", allergies=" + allergies +
                '}';
    }
    // Méthode pour ajouter un dossier médical à la liste des dossiers médicaux du patient
    public void ajouterDossierMedical(DossierMedical dossierMedical) {
        dossiersMedical.add(dossierMedical);
    }  
    // Méthode pour ajouter un rendez-vous à la liste des rendez-vous du patient
    public void ajouterRendezVous(RendezVous rendezVous) {
        rendezVousList.add(rendezVous);
    }
    // Méthode pour supprimer un rendez-vous de la liste des rendez-vous du patient
    public void supprimerRendezVous(RendezVous rendezVous) {
        rendezVousList.remove(rendezVous);
    }

    // Méthode pour modifier les informations personnelles du patient
    public void modifierInformations(String nom, String prenom, String adresse, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
}
}