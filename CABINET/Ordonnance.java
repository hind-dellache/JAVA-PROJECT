package Cabinet;
import java.util.List; // Pour utiliser l'interface List pour stocker les médicaments
public class Ordonnance {
    private List<Medicament> medicaments; // Liste des médicaments prescrits
    private String posologie; // Posologie des médicaments
    private int dureeTraitement; // Durée du traitement en jours
    private Patient patient;
    private String motif;

    // Constructeur
    public Ordonnance(List<Medicament> medicaments, String posologie, int dureeTraitement) {
        this.medicaments = medicaments;
        this.posologie = posologie;
        this.dureeTraitement = dureeTraitement;
    }

    // Getters et setters
    public List<Medicament> getMedicaments() {
        return medicaments;
    }

    public void setMedicaments(List<Medicament> medicaments) {
        this.medicaments = medicaments;
    }

    public String getPosologie() {
        return posologie;
    }

    public void setPosologie(String posologie) {
        this.posologie = posologie;
    }

    public int getDureeTraitement() {
        return dureeTraitement;
    }

    public void setDureeTraitement(int dureeTraitement) {
        this.dureeTraitement = dureeTraitement;
    }

    // Méthode toString() pour afficher les informations de l'ordonnance
    @Override
    public String toString() {
        return "Ordonnance{" +
                "medicaments=" + medicaments +
                ", posologie='" + posologie + '\'' +
                ", dureeTraitement=" + dureeTraitement +
                '}';
    }
     // Méthode pour ajouter un médicament à la liste des médicaments de l'ordonnance
     public void ajouterMedicament(Medicament medicament) {
        medicaments.add(medicament);
    }
    // Méthode pour modifier la posologie de l'ordonnance
    public void modifierPosologie(String posologie) {
        this.posologie = posologie;
    }

    // Méthode pour modifier la durée du traitement de l'ordonnance
    public void modifierDureeTraitement(int duree) {
        this.dureeTraitement = duree;
    }
    // Méthode pour générer le certificat médical pour le patient
    public void genererCertificat() {
        // Implémentez ici la logique pour générer le certificat médical
        // Vous pouvez par exemple créer une chaîne de caractères représentant le contenu du certificat
        String contenuCertificat = "Certificat médical pour le patient " + patient.getNom() + " avec le motif : " + motif;
        
        // Imprimez ou retournez le certificat généré
        System.out.println("Certificat médical généré : " + contenuCertificat);
    }

}