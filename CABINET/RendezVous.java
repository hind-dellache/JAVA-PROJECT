package Cabinet;
import java.time.LocalDateTime; // Nous utilisons le type LocalDateTime pour représenter la date et l'heure
import java.util.concurrent.atomic.AtomicInteger;

import Cabinet.Medecin;
import Cabinet.Patient;
public class RendezVous {
    private static final AtomicInteger compteur = new AtomicInteger(0);
    // Méthode pour générer un identifiant unique de manière atomique
    private static int genererIdUnique() {
        return compteur.incrementAndGet();
    }
    private int id; // Identifiant unique du rendez-vous
    private Patient patient; // Objet Patient correspondant au patient concerné par le rendez-vous
    private LocalDateTime dateHeure; // Date et heure du rendez-vous
    private String motif; // Motif du rendez-vous
    private String statut; // Statut du rendez-vous (en attente, confirmé, annulé)
    private Medecin medecin;

    // Constructeur
    public RendezVous(int id, Patient patient, LocalDateTime dateHeure, String motif, String statut,Medecin medecin) {
        this.id = id;
        this.patient = patient;
        this.dateHeure = dateHeure;
        this.motif = motif;
        this.statut = statut;
        this.medecin = medecin;
    }

    // Getters et setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LocalDateTime getDateHeure() {
        return dateHeure;
    }

    public void setDateHeure(LocalDateTime dateHeure) {
        this.dateHeure = dateHeure;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }
    // Méthode toString() pour afficher les informations du rendez-vous
    @Override
    public String toString() {
        return "RendezVous{" +
                "id=" + id +
                ", patient=" + patient +
                ", dateHeure=" + dateHeure +
                ", motif='" + motif + '\'' +
                ", statut='" + statut + '\'' +
                '}';
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
    
}