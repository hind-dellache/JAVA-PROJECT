package Cabinet;
import java.time.LocalDate; // Pour utiliser le type LocalDate pour représenter la date
import java.time.LocalTime; // Pour utiliser le type LocalTime pour représenter l'heure

public class Consultation {
    private LocalDate date; // Date de la consultation
    private LocalTime heure; // Heure de la consultation
    private String motif; // Motif de la consultation
    private String anamnese; // Anamnèse de la consultation
    private String examenPhysique; // Examen physique de la consultation
    private String diagnostic; // Diagnostic de la consultation
    private Ordonnance ordonnance; // Ordonnance de la consultation
    private CertificatMedical certificatMedical; // Certificat médical de la consultation

    // Constructeur
    public Consultation(LocalDate date, LocalTime heure, String motif, String anamnese, String examenPhysique, String diagnostic, Ordonnance ordonnance, CertificatMedical certificatMedical) {
        this.date = date;
        this.heure = heure;
        this.motif = motif;
        this.anamnese = anamnese;
        this.examenPhysique = examenPhysique;
        this.diagnostic = diagnostic;
        this.ordonnance = ordonnance;
        this.certificatMedical = certificatMedical;
    }

    // Getters et setters
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHeure() {
        return heure;
    }

    public void setHeure(LocalTime heure) {
        this.heure = heure;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public String getAnamnese() {
        return anamnese;
    }

    public void setAnamnese(String anamnese) {
        this.anamnese = anamnese;
    }

    public String getExamenPhysique() {
        return examenPhysique;
    }

    public void setExamenPhysique(String examenPhysique) {
        this.examenPhysique = examenPhysique;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public Ordonnance getOrdonnance() {
        return ordonnance;
    }

    public void setOrdonnance(Ordonnance ordonnance) {
        this.ordonnance = ordonnance;
    }

    public CertificatMedical getCertificatMedical() {
        return certificatMedical;
    }

    public void setCertificatMedical(CertificatMedical certificatMedical) {
        this.certificatMedical = certificatMedical;
    }

    // Méthode toString() pour afficher les informations de la consultation
    @Override
    public String toString() {
        return "Consultation{" +
                "date=" + date +
                ", heure=" + heure +
                ", motif='" + motif + '\'' +
                ", anamnese='" + anamnese + '\'' +
                ", examenPhysique='" + examenPhysique + '\'' +
                ", diagnostic='" + diagnostic + '\'' +
                ", ordonnance=" + ordonnance +
                ", certificatMedical=" + certificatMedical +
                '}';
    }
    // Méthode pour ajouter une ordonnance à la consultation

    public void ajouterOrdonnance(Ordonnance ordonnance) {
        this.ordonnance = ordonnance;
    }
// Méthode pour ajouter un certificat médical à la consultation

public void ajouterCertificatMedical(CertificatMedical certificatMedical) {
    this.certificatMedical = certificatMedical;
}

    
}