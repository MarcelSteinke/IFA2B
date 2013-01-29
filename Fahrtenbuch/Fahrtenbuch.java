package Fahrtenbuch;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;

public class Fahrtenbuch {

    private String name;
    private String kommentar;
    private final List fahrtenliste;
    private String startDate;
    private String endDate;

   
    public Fahrtenbuch() {
        this.fahrtenliste = new List();
    }
    public Fahrtenbuch(String fahrtenbuch, String kommentar, String pStartDate, String pEndDate) {
        this.name = fahrtenbuch;
        this.kommentar = kommentar;
        this.startDate = pStartDate;
        this.endDate = pEndDate;
        this.fahrtenliste = new List();
    }

    public Fahrtenbuch(String fahrtenbuch, String pStartDate, String pEndDate) {
        this.name = fahrtenbuch;
        this.startDate = pStartDate;
        this.endDate = pEndDate;
        this.fahrtenliste = new List();
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getName() {
        return name;
    }

    public String getKommentar() {
        return kommentar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKommentar(String kommentar) {
        this.kommentar = kommentar;
    }

    public List getFahrtenliste() {
        return fahrtenliste;
    }

    public void trageStreckeEin(int pStrecke, double pPreis, String pKommentar) {
        /*
         * initialisiere Kontrollvariablen sollte eine der drei Variablen auf
         * True gesetzt worden sein liegt ein Fehler vor. Welcher das ist wird
         * anhand der drei Variablen festgestellt und mit einer entsprechenden
         * Fehlermeldung quitiert.
         */
        boolean streckeGroesserTausend = false;
        boolean streckeKleinerEins = false;
        boolean preisKleinerNull = false;
        if (pStrecke > 1000) {
            streckeGroesserTausend = true;
        }
        if (pStrecke < 1) {
            streckeKleinerEins = true;
        }
        if (pPreis < 0.0) {
            preisKleinerNull = true;
        }
        if (streckeGroesserTausend == false && streckeKleinerEins == false
                && preisKleinerNull == false) {
            fahrtenliste.toLast();
            Fahrt fahrt = new Fahrt(pStrecke, pPreis, pKommentar);
            fahrtenliste.append(fahrt);
        } else {
            if (streckeGroesserTausend == true) {
                String streckeZuGrossFehler = "Die Strecke muss kleiner 1000 sein! "
                        + "Ihre Eingabe lautet " + pStrecke;
                JOptionPane.showMessageDialog(null, streckeZuGrossFehler,
                        "Strecke zu Groß", 0);
            }
            if (streckeKleinerEins == true) {
                String streckeZuKleinFehler = "Die Strecke muss groesser 1 sein! "
                        + "Ihre Eingabe lautet " + pPreis;
                JOptionPane.showMessageDialog(null, streckeZuKleinFehler,
                        "Strecke zu Groß", 0);
            }
            if (preisKleinerNull == true) {
                String preisKleinerNullFehler = "Der Preis muss groesser Null sein! "
                        + "Ihre Eingabe lautet " + pKommentar;
                JOptionPane.showMessageDialog(null, preisKleinerNullFehler,
                        "Strecke zu Groß", 0);
            }
        }
    }
    public void trageStreckeEin(int pStrecke, double pPreis) {
        /*
         * initialisiere Kontrollvariablen sollte eine der drei Variablen auf
         * True gesetzt worden sein liegt ein Fehler vor. Welcher das ist wird
         * anhand der drei Variablen festgestellt und mit einer entsprechenden
         * Fehlermeldung quitiert.
         */
        boolean streckeGroesserTausend = false;
        boolean streckeKleinerEins = false;
        boolean preisKleinerNull = false;
        if (pStrecke > 1000) {
            streckeGroesserTausend = true;
        }
        if (pStrecke < 1) {
            streckeKleinerEins = true;
        }
        if (pPreis < 0.0) {
            preisKleinerNull = true;
        }
        if (streckeGroesserTausend == false && streckeKleinerEins == false
                && preisKleinerNull == false) {
            fahrtenliste.toLast();
            Fahrt fahrt = new Fahrt(pStrecke, pPreis);
            fahrtenliste.append(fahrt);
        } else {
            if (streckeGroesserTausend == true) {
                String streckeZuGrossFehler = "Die Strecke muss kleiner 1000 sein! \n "
                        + "Ihre Eingabe lautet" + pStrecke;
                JOptionPane.showMessageDialog(null, streckeZuGrossFehler,
                        "Strecke zu Groß", 0);
            }
            if (streckeKleinerEins == true) {
                String streckeZuKleinFehler = "Die Strecke muss groesser 1 sein! \n "
                        + "Ihre Eingabe lautet" + pPreis;
                JOptionPane.showMessageDialog(null, streckeZuKleinFehler,
                        "Strecke zu Groß", 0);
            }
            if (preisKleinerNull == true) {
                String preisKleinerNullFehler = "Der Preis muss groesser Null sein! \n "
                        + "Ihre Eingabe lautet" + pPreis;
                JOptionPane.showMessageDialog(null, preisKleinerNullFehler,
                        "Strecke zu Groß", 0);
            }
        }
    }

    public int getAnzahlGefahrenerStrecken() {
        int lAnzahl = 0;
        fahrtenliste.toFirst();
        while (fahrtenliste.hasAccess()) {
            lAnzahl++;
            fahrtenliste.next();
        }
        return lAnzahl;
    }

    public int getGesamtKilometer() {
        int lAnzahl = 0;
        fahrtenliste.toFirst();
        while (fahrtenliste.hasAccess()) {
            lAnzahl += ((Fahrt) fahrtenliste.getObject()).getStrecke();
        }
        return lAnzahl;
    }

    public double getGesamtKosten() {
        double lAnzahl = 0;
        fahrtenliste.toFirst();
        while (fahrtenliste.hasAccess()) {
            lAnzahl += (((Fahrt) fahrtenliste.getObject()).getKilometerpreis()) * (((Fahrt) fahrtenliste.getObject()).getStrecke());
        }
        return lAnzahl;
    }

    public double getDurchschnittskosten() {
        int anzahlStrecken = this.getAnzahlGefahrenerStrecken();
        double lAnzahl = 0;
        fahrtenliste.toFirst();
        while (fahrtenliste.hasAccess()) {
            lAnzahl += ((Fahrt) fahrtenliste.getObject()).getKilometerpreis() / anzahlStrecken;
        }
        return lAnzahl;
    }
    
}