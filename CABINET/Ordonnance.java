package Cabinet;
import java.util.List; // Pour utiliser l'interface List pour stocker les médicaments

public class Ordonnance {
    private List<Medicament> medicaments; // Liste des médicaments prescrits
    private String posologie; // Posologie des médicaments
    private String dureeTraitement; // Durée du traitement en jours
    private Patient patient;
    private String motif;
    private Medecin medecin;

    // Constructeur
    public Ordonnance(List<Medicament> medicaments, String posologie, String dureeTraitement, Patient patient, String motif, Medecin medecin) {
        this.medicaments = medicaments;
        this.posologie = posologie;
        this.dureeTraitement = dureeTraitement;
        this.patient = patient;
        this.motif = motif;
        this.medecin = medecin;
    }

    // Getters
    public List<Medicament> getMedicaments() {
        return medicaments;
    }

    public String getPosologie() {
        return posologie;
    }

    public String getDureeTraitement() {
        return dureeTraitement;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getMotif() {
        return motif;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    // Setters
    public void setMedicaments(List<Medicament> medicaments) {
        this.medicaments = medicaments;
    }

    public void setPosologie(String posologie) {
        this.posologie = posologie;
    }

    public void setDureeTraitement(String dureeTraitement) {
        this.dureeTraitement = dureeTraitement;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }
    
   

    // Méthode toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ordonnance:\n");
        sb.append("Patient: ").append(patient.getNom()).append(" ").append(patient.getPrenom()).append("\n");
        sb.append("Médecin: ").append(medecin.getNom()).append(" ").append(medecin.getPrenom()).append("\n");
        sb.append("Motif: ").append(motif).append("\n");
        sb.append("Posologie: ").append(posologie).append("\n");
        sb.append("Durée du traitement: ").append(dureeTraitement).append(" jours\n");
        sb.append("Médicaments prescrits:\n");
        for (Medicament medicament : medicaments) {
            sb.append("- ").append(medicament.getNom()).append(" (").append(medicament.getDosage()).append(" mg").append(")\n");
        }
        return sb.toString();
    }
}
