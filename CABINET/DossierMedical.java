package Cabinet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class DossierMedical {
    private static final AtomicInteger compteur = new AtomicInteger(0);
    // Méthode pour générer un identifiant unique de manière atomique
    private static int genererIdUnique() {
        return compteur.incrementAndGet();
    }
    private Patient patient; // Patient associé au dossier médical
    private List<Consultation> consultations; // Liste des consultations du patient
    private SuiviMedical suiviMedical; // Suivi médical du patient
    private List<Ordonnance> ordonnances; // Liste des ordonnances
    private List<CertificatMedical> certificatsMedical; // Liste des certificats médicaux
    private Map<LocalDateTime, Object> rendezVousMap; // Map des rendez-vous

    // Constructeur avec les données nécessaires
    public DossierMedical(Patient patient, List<Consultation> consultations, SuiviMedical suiviMedical, List<Ordonnance> ordonnances, List<CertificatMedical> certificatsMedical) {
        this.patient = patient;
        this.consultations = consultations;
        this.suiviMedical = suiviMedical;
        this.ordonnances = ordonnances;
        this.certificatsMedical = certificatsMedical;
        this.rendezVousMap = new HashMap<>();
    }
    
    // Constructeur par défaut
    public DossierMedical(Patient patient) {
        this.patient = patient;
        this.consultations = new ArrayList<>();
        this.suiviMedical = null; // ou initialisez-le avec un nouvel objet si nécessaire
        this.ordonnances = new ArrayList<>();
        this.certificatsMedical = new ArrayList<>();
        this.rendezVousMap = new HashMap<>();
    }

    // Méthode pour ajouter une consultation au dossier médical
    public void ajouterConsultation(Consultation consultation) {
        consultations.add(consultation);
    }

    // Méthode pour ajouter une ordonnance au dossier médical
    public void ajouterOrdonnance(Ordonnance ordonnance) {
        ordonnances.add(ordonnance);
    }

    // Méthode pour ajouter un certificat médical au dossier médical
    public void ajouterCertificatMedical(CertificatMedical certificatMedical) {
        certificatsMedical.add(certificatMedical);
    }
// Méthode pour prendre un rendez-vous
public static RendezVous prendreRendezVous(Patient patient, LocalDateTime dateHeure, Medecin medecin) {
    // Appeler la méthode attribuerRendezVous pour créer le rendez-vous
    RendezVous rendezVous = attribuerRendezVous(patient, dateHeure, medecin);

    // Si le rendez-vous a été créé avec succès, confirmer au patient
    if (rendezVous != null) {
        System.out.println("Rendez-vous pris avec succès pour le " + rendezVous.getDateHeure() + " avec le Dr. " + medecin.getNom() + ".");
    }

    return rendezVous;
}

// Méthode pour attribuer un rendez-vous
public static RendezVous attribuerRendezVous(Patient patient, LocalDateTime dateHeure, Medecin medecin) {
    // Vérifier la disponibilité du médecin
    if (!medecin.verifierDisponibilite(dateHeure)) {
        System.out.println("Le médecin n'est pas disponible à cette date et heure.");
        return null;
    }

    // Créer un nouveau rendez-vous
    RendezVous rendezVous = new RendezVous(genererIdUnique(), patient, dateHeure, "Motif non spécifié", "En attente", medecin);

    // Enregistrer le rendez-vous (si nécessaire)
    enregistrerRendezVous(rendezVous);

    return rendezVous;
}

// Méthode pour enregistrer un rendez-vous
public static void enregistrerRendezVous(RendezVous rendezVous) {
    // Implémenter la logique d'enregistrement du rendez-vous (par exemple, dans une base de données)
    System.out.println("Le rendez-vous a été enregistré.");
}
    // Méthode pour annuler un rendez-vous pour une date et heure spécifiées
    public void annulerRendezVous(LocalDateTime dateRdv) {
        if (rendezVousMap.containsKey(dateRdv)) {
            rendezVousMap.remove(dateRdv);
            System.out.println("Rendez-vous annulé pour le " + dateRdv);
        } else {
            System.out.println("Aucun rendez-vous trouvé pour le " + dateRdv);
        }
    }

    // Méthode pour enregistrer une consultation dans le dossier médical
    public void enregistrerConsultation(Consultation consultation) {
        consultations.add(consultation);
        System.out.println("Consultation enregistrée pour le patient " + patient.getNom());
    }
}