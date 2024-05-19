package Cabinet;
import java.util.concurrent.atomic.AtomicInteger;

public class RendezVous {
    private static final AtomicInteger compteur = new AtomicInteger(0);
    private Patient patient;
    private String jour;
    private String mois;
    private String annee;
    private String motif;
    private Medecin medecin;

    public RendezVous(Patient patient, String jour, String mois, String annee, String motif, Medecin medecin) {
        this.patient = patient;
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
        this.motif = motif;
        this.medecin = medecin;
    }
public String getJour() {
        return jour;
    }

    // Setter pour jour
    public void setJour(String jour) {
        this.jour = jour;
    }

    // Getter pour mois
    public String getMois() {
        return mois;
    }

    // Setter pour mois
    public void setMois(String mois) {
        this.mois = mois;
    }

    // Getter pour annee
    public String getAnnee() {
        return annee;
    }

    // Setter pour annee
    public void setAnnee(String annee) {
        this.annee = annee;
    }
    
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }

    @Override
    public String toString() {
        return "RendezVous{" +
                "patient=" + patient +
                ", date=" + jour + " " + mois + " " + annee +
                ", motif='" + motif + '\'' +
                ", medecin='" + medecin + '\'' +
                '}';
    }

    public static RendezVous prendreRendezVous(Patient patient, String jour, String mois, String annee, Medecin medecin) {
        RendezVous rendezVous = attribuerRendezVous(patient, jour, mois, annee, medecin);
        if (rendezVous != null) {
            System.out.println("Rendez-vous pris avec succès pour le " + rendezVous.getJour() + " " + rendezVous.getMois() + " " + rendezVous.getAnnee() + " avec le Dr. " + medecin.getNom() + ".");
        }
        return rendezVous;
    }

    public static RendezVous attribuerRendezVous(Patient patient, String jour, String mois, String annee, Medecin medecin) {
        // Logique de vérification de disponibilité du médecin
        RendezVous rendezVous = new RendezVous(patient, jour, mois, annee, "Motif non spécifié", medecin);
        // Logique d'enregistrement du rendez-vous
        return rendezVous;
        
        
     
    }
    
   
}
