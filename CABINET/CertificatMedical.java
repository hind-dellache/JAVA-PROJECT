package Cabinet;
import java.util.Date; // Pour utiliser le type Date

import Patient;
public class CertificatMedical {
    private Patient patient; // Patient associé au certificat médical
    private String motif; // Motif du certificat médical
    private Date date; // Date du certificat médical

    // Constructeur
    public CertificatMedical(Patient patient, String motif, Date date) {
        this.patient = patient;
        this.motif = motif;
        this.date = date;
    }

    // Getters et setters
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // Méthode toString() pour afficher les informations du certificat médical
    @Override
    public String toString() {
        return "CertificatMedical{" +
                "patient=" + patient +
                ", motif='" + motif + '\'' +
                ", date=" + date +
                '}';
    }
}