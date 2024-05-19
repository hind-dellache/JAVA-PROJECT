package Cabinet;
import java.util.List; // Pour utiliser l'interface List pour stocker les allergies
public class InformationsMedicales {
    private String antecedentsMedicaux; // Antécédents médicaux du patient
    private String antecedentsChirurgicaux; // Antécédents chirurgicaux du patient
    private Terrain terrain; // Informations sur le terrain du patient
    private List<String> allergies; // Allergies du patient
    private Constantes constantes; // Constantes médicales du patient
    private String resumeTraitements; // Résumé des traitements médicaux du patient

    // Constructeur
    public InformationsMedicales(String antecedentsMedicaux, String antecedentsChirurgicaux, Terrain terrain, List<String> allergies, Constantes constantes, String resumeTraitements) {
        this.antecedentsMedicaux = antecedentsMedicaux;
        this.antecedentsChirurgicaux = antecedentsChirurgicaux;
        this.terrain = terrain;
        this.allergies = allergies;
        this.constantes = constantes;
        this.resumeTraitements = resumeTraitements;
    }

    // Getters et setters
    public String getAntecedentsMedicaux() {
        return antecedentsMedicaux;
    }

    public void setAntecedentsMedicaux(String antecedentsMedicaux) {
        this.antecedentsMedicaux = antecedentsMedicaux;
    }

    public String getAntecedentsChirurgicaux() {
        return antecedentsChirurgicaux;
    }

    public void setAntecedentsChirurgicaux(String antecedentsChirurgicaux) {
        this.antecedentsChirurgicaux = antecedentsChirurgicaux;
    }

    public Terrain getTerrain() {
        return terrain;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }

    public List<String> getAllergies() {
        return allergies;
    }

    public void setAllergies(List<String> allergies) {
        this.allergies = allergies;
    }

    public Constantes getConstantes() {
        return constantes;
    }

    public void setConstantes(Constantes constantes) {
        this.constantes = constantes;
    }

    public String getResumeTraitements() {
        return resumeTraitements;
    }

    public void setResumeTraitements(String resumeTraitements) {
        this.resumeTraitements = resumeTraitements;
    }

    // Méthode toString() pour afficher les informations médicales
    @Override
    public String toString() {
        return "InformationsMedicales{" +
                "antecedentsMedicaux='" + antecedentsMedicaux + '\'' +
                ", antecedentsChirurgicaux='" + antecedentsChirurgicaux + '\'' +
                ", terrain=" + terrain +
                ", allergies=" + allergies +
                ", constantes=" + constantes +
                ", resumeTraitements='" + resumeTraitements + '\'' +
                '}';
    }
    
}
