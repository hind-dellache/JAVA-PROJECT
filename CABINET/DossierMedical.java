package Cabinet;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class DossierMedical {
    private static final AtomicInteger compteur = new AtomicInteger(0);
    
    private Patient patient;
    private List<Consultation> consultations;
    private SuiviMedical suiviMedical;
    private List<Ordonnance> ordonnances;
    private List<CertificatMedical> certificatsMedical;
    private Map<LocalDateTime, Object> rendezVousMap;

    // Constructeur avec les données nécessaires
    public DossierMedical(Patient patient, List<Consultation> consultations, SuiviMedical suiviMedical, List<Ordonnance> ordonnances, List<CertificatMedical> certificatsMedical) {
        this.patient = patient;
        this.consultations = consultations;
        this.setSuiviMedical(suiviMedical);
        this.ordonnances = ordonnances;
        this.certificatsMedical = certificatsMedical;
        this.rendezVousMap = new HashMap<>();
    }

    // Constructeur par défaut
    public DossierMedical(Patient patient) {
        this.patient = patient;
        this.consultations = new ArrayList<>();
        this.setSuiviMedical(null);
        this.ordonnances = new ArrayList<>();
        this.certificatsMedical = new ArrayList<>();
        this.rendezVousMap = new HashMap<>();
    }

    public Patient getPatient() {
        return patient;
    }

    public void ajouterConsultation(Consultation consultation) {
        consultations.add(consultation);
    }

    public void ajouterOrdonnance(Ordonnance ordonnance) {
        ordonnances.add(ordonnance);
    }

    public void ajouterCertificatMedical(CertificatMedical certificatMedical) {
        certificatsMedical.add(certificatMedical);
    }

    public void annulerRendezVous(LocalDateTime dateRdv) {
        if (rendezVousMap.containsKey(dateRdv)) {
            rendezVousMap.remove(dateRdv);
            System.out.println("Rendez-vous annulé pour le " + dateRdv);
        } else {
            System.out.println("Aucun rendez-vous trouvé pour le " + dateRdv);
        }
    }

    public void enregistrerConsultation(Consultation consultation) {
        consultations.add(consultation);
        System.out.println("Consultation enregistrée pour le patient " + patient.getNom());
    }

    public SuiviMedical getSuiviMedical() {
        return suiviMedical;
    }

    public void setSuiviMedical(SuiviMedical suiviMedical) {
        this.suiviMedical = suiviMedical;
    }

    public void afficherDossierMedical() {
        System.out.println("Dossier médical du patient: " + patient.getNom());
        System.out.println("Consultations:");
        for (Consultation consultation : consultations) {
            System.out.println(consultation);
        }
        System.out.println("Suivi médical: " + suiviMedical);
        System.out.println("Ordonnances:");
        for (Ordonnance ordonnance : ordonnances) {
            System.out.println(ordonnance);
        }
        System.out.println("Certificats médicaux:");
        for (CertificatMedical certificat : certificatsMedical) {
            System.out.println(certificat);
        }
    }

    public static RendezVous prendreRendezVous(Patient patient, String jour, String mois, String annee, Medecin medecin) {
        RendezVous rendezVous = RendezVous.attribuerRendezVous(patient, jour, mois, annee, medecin);
        if (rendezVous != null) {
            System.out.println("Rendez-vous pris avec succès pour le " + rendezVous.getJour() + " " + rendezVous.getMois() + " " + rendezVous.getAnnee() + " avec le Dr. " + medecin.getNom() + ".");
        }
        return rendezVous;
    }
}
