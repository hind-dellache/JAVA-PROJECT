package Cabinet;
import java.util.ArrayList;
import java.util.List;

public class Cabinet_Medical {
    private String nom;
    private String adresse;
    private String numeroTelephone;
    private String email;
    private List<Medecin> medecins;
    private List<Patient> patients;
    private List<RendezVous> rendezVousList;
    private List<DossierMedical> dossiersMedicaux;

    public Cabinet_Medical(String nom, String adresse, String numeroTelephone, String email) {
        this.nom = nom;
        this.adresse = adresse;
        this.numeroTelephone = numeroTelephone;
        this.email = email;
        this.medecins = new ArrayList<>();
        this.patients = new ArrayList<>();
        this.rendezVousList = new ArrayList<>();
        this.dossiersMedicaux = new ArrayList<>();
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public String getEmail() {
        return email;
    }

    public List<Medecin> getMedecins() {
        return medecins;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public List<RendezVous> getRendezVousList() {
        return rendezVousList;
    }

    public List<DossierMedical> getDossiersMedicaux() {
        return dossiersMedicaux;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMedecins(List<Medecin> medecins) {
        this.medecins = medecins;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public void setRendezVousList(List<RendezVous> rendezVousList) {
        this.rendezVousList = rendezVousList;
    }

    public void setDossiersMedicaux(List<DossierMedical> dossiersMedicaux) {
        this.dossiersMedicaux = dossiersMedicaux;
    }
    public String toString() {
        return "CabinetMedical{" +
                "nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", numeroTelephone='" + numeroTelephone + '\'' +
                ", email='" + email + '\'' +
                ", medecins=" + medecins +
                ", patients=" + patients +
                ", rendezVousList=" + rendezVousList +
                ", dossiersMedicaux=" + dossiersMedicaux +
                '}';
    }

// Méthodes pour la gestion des patients
public void ajouterPatient(Patient patient) {
    patients.add(patient);
}

public void supprimerPatient(Patient patient) {
    patients.remove(patient);
}

// Méthodes pour la gestion des rendez-vous
public void ajouterRendezVous(RendezVous rendezVous) {
    rendezVousList.add(rendezVous);
}

public void supprimerRendezVous(RendezVous rendezVous) {
    rendezVousList.remove(rendezVous);
}

// Méthodes pour la gestion des dossiers médicaux
public void ajouterDossierMedical(DossierMedical dossierMedical) {
    dossiersMedicaux.add(dossierMedical);
}

public void supprimerDossierMedical(DossierMedical dossierMedical) {
    dossiersMedicaux.remove(dossierMedical);
}
public void ajouterMedecin(Medecin medecin) {
    medecins.add(medecin);
}

public void supprimerMedecin(Medecin medecin) {
    medecins.remove(medecin);
}
}