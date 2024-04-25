package Cabinet;
public class TensionArterielle {
    private int pressionSystolique;
    private int pressionDiastolique;

    public TensionArterielle(int pressionSystolique, int pressionDiastolique) {
        this.pressionSystolique = pressionSystolique;
        this.pressionDiastolique = pressionDiastolique;
    }

    // Getters et setters
    public int getPressionSystolique() {
        return pressionSystolique;
    }

    public void setPressionSystolique(int pressionSystolique) {
        this.pressionSystolique = pressionSystolique;
    }

    public int getPressionDiastolique() {
        return pressionDiastolique;
    }

    public void setPressionDiastolique(int pressionDiastolique) {
        this.pressionDiastolique = pressionDiastolique;
    }
}