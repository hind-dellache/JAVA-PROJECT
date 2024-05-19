package Cabinet;
import java.util.Date; // Pour utiliser le type Date

public class CertificatMedical {
    private Patient patient; // Patient associé au certificat médical
    private String motif; // Motif du certificat médical
    private Date date; // Date du certificat médical
    private Medecin medecin;

    // Constructeur
    public CertificatMedical(Patient patient, String motif, Date date, Medecin medecin) {
        this.patient = patient;
        this.motif = motif;
        this.date = date;
        this.medecin = medecin;
    }

    // Getters
    public Patient getPatient() {
        return patient;
    }

    public String getMotif() {
        return motif;
    }

    public Date getDate() {
        return date;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    // Setters
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "CertificatMedical{" +
                "patient=" + patient +
                ", motif='" + motif + '\'' +
                ", date=" + date +
                ", medecin=" + medecin +
                '}';
    }
}
   
