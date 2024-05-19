package Cabinet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cabinet_Medical {
    // Attributs du cabinet médical
    private String nom;
    private String adresse;
    private String numeroTelephone;
    private String email;
    private List<Medecin> medecins;
    private List<Patient> patients;
    private List<RendezVous> rendezVousList;
    private List<DossierMedical> dossiersMedicaux;


    // Constructeur
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

    // Méthodes pour la gestion des patients
    public void ajouterPatient(Patient patient) {
        patients.add(patient);
    }
    

    public void supprimerPatient(Patient patient) {
        patients.remove(patient);
    }

    public void supprimerPatient(String nom, String prenom) {
        Iterator<Patient> iterator = patients.iterator();
        while (iterator.hasNext()) {
            Patient patient = iterator.next();
            if (patient.getNom().equals(nom) && patient.getPrenom().equals(prenom)) {
                iterator.remove();
                break;
            }
        }
    }

    // Méthodes pour la gestion des rendez-vous
    public void ajouterRendezVous(RendezVous rendezVous) {
        rendezVousList.add(rendezVous);
    }

    // Méthodes pour la gestion des dossiers médicaux
    public void ajouterDossierMedical(DossierMedical dossierMedical) {
        dossiersMedicaux.add(dossierMedical);
    }
public void supprimerRendezVous(String nomMedecin, String prenomMedecin, String nomPatient, String prenomPatient, String jour, String mois, String annee) {
    Iterator<RendezVous> iterator = rendezVousList.iterator();
    while (iterator.hasNext()) {
        RendezVous rendezVous = iterator.next();
        if (rendezVous.getMedecin().getNom().equals(nomMedecin) && 
            rendezVous.getMedecin().getPrenom().equals(prenomMedecin) && 
            rendezVous.getPatient().getNom().equals(nomPatient) && 
            rendezVous.getPatient().getPrenom().equals(prenomPatient) && 
            rendezVous.getJour().equals(jour) && 
            rendezVous.getMois().equalsIgnoreCase(mois) && 
            rendezVous.getAnnee().equals(annee)) {
            iterator.remove();
            System.out.println("Rendez-vous supprimé avec succès.");
            return; // Supposons qu'il n'y a qu'un seul rendez-vous correspondant à ces informations
        }
    }
    System.out.println("Aucun rendez-vous trouvé avec les informations fournies.");
}
    public void supprimerDossierMedical(DossierMedical dossierMedical) {
        dossiersMedicaux.remove(dossierMedical);
    }

    // Méthodes pour la gestion des médecins
    public void ajouterMedecin(Medecin medecin) {
        medecins.add(medecin);
    }

    public void supprimerMedecin(String nom, String prenom) {
        Iterator<Medecin> iterator = medecins.iterator();
        while (iterator.hasNext()) {
            Medecin medecin = iterator.next();
            if (medecin.getNom().equals(nom) && medecin.getPrenom().equals(prenom)) {
                iterator.remove();
                break;
            }
        }
    }

  

    public DossierMedical rechercherDossierParNom(String nom) {
        for (DossierMedical dossier : dossiersMedicaux) {
            if (dossier.getPatient().getNom().equalsIgnoreCase(nom)) {
                return dossier;
            }
        }
        return null;
    }

    public Patient rechercherPatientParNom(String nom) {
        for (Patient patient : patients) {
            if (patient.getNom().equalsIgnoreCase(nom)) {
                return patient;
            }
        }
        return null;
    }
    public String afficherDossierMedicalPatient(String nom, String prenom) {
        for (Patient patient : patients) {
            if (patient.getNom().equalsIgnoreCase(nom) && patient.getPrenom().equalsIgnoreCase(prenom)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Dossiers médicaux de ").append(nom).append(" ").append(prenom).append(":\n");
                /*for (DossierMedical dossier : patient.getDossiersMedical()) {
                    stringBuilder.append(dossier).append("\n");
                }*/
                return stringBuilder.toString();
            }
        }
        return "Patient non trouvé ou aucun dossier médical disponible pour ce patient.";
    }

    public boolean ajouterDossierMedicalAPatient(String nomPatient, DossierMedical dossierMedical) {
        Patient patient = rechercherPatientParNom(nomPatient);
        if (patient != null) {
            patient.ajouterDossierMedical(dossierMedical);
            dossiersMedicaux.add(dossierMedical);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cabinet_Medical{" +
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
    
    
    // Méthodes pour afficher les détails
    public void afficherMedecins() {
        System.out.println("Liste des médecins:");
        for (Medecin medecin : medecins) {
            System.out.println(medecin);  // Affiche les informations de chaque médecin
        }
    }

    public void afficherPatients() {
        System.out.println("Liste des patients:");
        for (Patient patient : patients) {
            System.out.println(patient);  // Affiche les informations de chaque patient
        }
    }
        public void afficherRendezVous() {
        System.out.println("Liste des rendez-vous:");
        for (RendezVous rendezVous : rendezVousList) {
            System.out.println(rendezVous);  // Affiche les informations de chaque rendez-vous
        }
    }
    

   
    
    
    public String afficherRendezVousPatient(String nom, String prenom) {
    for (Patient patient : patients) {
        if (patient.getNom().equalsIgnoreCase(nom) && patient.getPrenom().equalsIgnoreCase(prenom)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Rendez-vous de ").append(nom).append(" ").append(prenom).append(":\n");
            for (RendezVous rendezVous : patient.getRendezVousList()) {
                stringBuilder.append(rendezVous).append("\n");
            }
            return stringBuilder.toString();
        }
    }
    return "Patient non trouvé ou aucun rendez-vous disponible pour ce patient.";
}
    
public boolean ajouterRendezVousAPatient(String nomPatient, RendezVous rendezVous) {
    Patient patient = rechercherPatientParNom(nomPatient);
    if (patient != null) {
        patient.ajouterRendezVous(rendezVous);
        rendezVousList.add(rendezVous);
        return true;
    }
    return false;
}    
}


   

    
