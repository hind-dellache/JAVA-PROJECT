package Cabinet;
public class Terrain {
    private float poids; // Poids du patient
    private float taille; // Taille du patient
    private String groupeSanguin; // Groupe sanguin du patient

    // Constructeur
    public Terrain(float poids, float taille, String groupeSanguin) {
        this.poids = poids;
        this.taille = taille;
        this.groupeSanguin = groupeSanguin;
    }

    // Getters et setters
    public float getPoids() {
        return poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }

    public float getTaille() {
        return taille;
    }

    public void setTaille(float taille) {
        this.taille = taille;
    }

    public String getGroupeSanguin() {
        return groupeSanguin;
    }

    public void setGroupeSanguin(String groupeSanguin) {
        this.groupeSanguin = groupeSanguin;
    }

    // Méthode toString() pour afficher les informations du terrain médical
    @Override
    public String toString() {
        return "Terrain{" +
                "poids=" + poids +
                ", taille=" + taille +
                ", groupeSanguin='" + groupeSanguin + '\'' +
                '}';
    }
}
