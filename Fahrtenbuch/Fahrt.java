package Fahrtenbuch;

public class Fahrt {

    private int strecke;
    private double kilometerpreis;
    private String kommentar;

    public Fahrt(int strecke, double kilometerpreis, String kommentar) {
        this.strecke = strecke;
        this.kilometerpreis = kilometerpreis;
        this.kommentar = kommentar;
    }

    public Fahrt(int strecke, double kilometerpreis) {
        this.strecke = strecke;
        this.kilometerpreis = kilometerpreis;
    }

    public int getStrecke() {
        return strecke;
    }

    public double getKilometerpreis() {
        return kilometerpreis;
    }

    public String getKommentar() {
        return kommentar;
    }

    public void setStrecke(int strecke) {
        this.strecke = strecke;
    }

    public void setKilometerpreis(double kilometerpreis) {
        this.kilometerpreis = kilometerpreis;
    }

    public void setKommentar(String kommentar) {
        this.kommentar = kommentar;
    }
}
