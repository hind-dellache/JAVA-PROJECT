package Cabinet;
public class Medicament {
    private String nom; // Nom du médicament
    private String dosage; // Dosage du médicament

    // Constructeur
    public Medicament(String nom, String dosage) {
        this.nom = nom;
        this.dosage = dosage;
    }

    // Getters et setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    // Méthode toString() pour afficher les informations du médicament
    @Override
    public String toString() {
        return "Medicament{" +
                "nom='" + nom + '\'' +
                ", dosage='" + dosage + '\'' +
                '}';
    }
}