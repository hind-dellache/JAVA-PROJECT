package Cabinet;
public class Constantes {
    private String tensionArterielle; // Tension artérielle du patient
    private int frequenceCardiaque; // Fréquence cardiaque du patient
    private float temperature; // Température corporelle du patient

    // Constructeur
    public Constantes(String tensionArterielle, int frequenceCardiaque, float temperature) {
        this.tensionArterielle = tensionArterielle;
        this.frequenceCardiaque = frequenceCardiaque;
        this.temperature = temperature;
    }

    // Getters et setters
    public String getTensionArterielle() {
        return tensionArterielle;
    }

    public void setTensionArterielle(String tensionArterielle) {
        this.tensionArterielle = tensionArterielle;
    }

    public int getFrequenceCardiaque() {
        return frequenceCardiaque;
    }

    public void setFrequenceCardiaque(int frequenceCardiaque) {
        this.frequenceCardiaque = frequenceCardiaque;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    // Méthode toString() pour afficher les informations des constantes médicales
    @Override
    public String toString() {
        return "Constantes{" +
                "tensionArterielle='" + tensionArterielle + '\'' +
                ", frequenceCardiaque=" + frequenceCardiaque +
                ", temperature=" + temperature +
                '}';
    }
}
