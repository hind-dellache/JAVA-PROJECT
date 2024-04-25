package Cabinet;
import java.util.List; // Pour utiliser l'interface List pour stocker les consultations
import java.util.ArrayList;
public class SuiviMedical {
    private Patient patient; // Patient suivi médical
    private InformationsMedicales informationsMedicales; // Informations médicales du patient
    private List<Consultation> historiqueConsultations; // Historique des consultations du patient
    private List<String> antecedents;
    private List<String> observationsMedicales;

    // Constructeur
    public SuiviMedical(Patient patient, InformationsMedicales informationsMedicales, List<Consultation> historiqueConsultations) {
        this.patient = patient;
        this.informationsMedicales = informationsMedicales;
        this.historiqueConsultations = historiqueConsultations;
        this.antecedents = new ArrayList<>();
        this.observationsMedicales = new ArrayList<>();
    }
    

    // Getters et setters
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public InformationsMedicales getInformationsMedicales() {
        return informationsMedicales;
    }

    public void setInformationsMedicales(InformationsMedicales informationsMedicales) {
        this.informationsMedicales = informationsMedicales;
    }

    public List<Consultation> getHistoriqueConsultations() {
        return historiqueConsultations;
    }

    public void setHistoriqueConsultations(List<Consultation> historiqueConsultations) {
        this.historiqueConsultations = historiqueConsultations;
    }

    // Méthode toString() pour afficher les informations du suivi médical
    @Override
    public String toString() {
        return "SuiviMedical{" +
                "patient=" + patient +
                ", informationsMedicales=" + informationsMedicales +
                ", historiqueConsultations=" + historiqueConsultations +
                '}';
    }
    // Méthode pour mettre à jour les consultations dans le suivi médical
    public void mettreAJourConsultations(List<Consultation> nouvellesConsultations) {
        historiqueConsultations.addAll(nouvellesConsultations);
    }
     // Méthode pour ajouter une consultation à l'historique des consultations

     public void ajouterConsultation(Consultation consultation) {
        historiqueConsultations.add(consultation);
    }
    // Méthode pour ajouter un antécédent médical ou chirurgical à la fiche du patient
    public void ajouterAntecedent(String antecedent) {
        antecedents.add(antecedent);
    }

    // Méthode pour ajouter une observation médicale à la fiche du patient
    public void ajouterObservationMedicale(String observation) {
        observationsMedicales.add(observation);
    }

    // Méthode pour récupérer la liste des antécédents du patient
    public List<String> getAntecedents() {
        return antecedents;
    }

    // Méthode pour récupérer la liste des observations médicales du patient
    public List<String> getObservationsMedicales() {
        return observationsMedicales;
    }
}
