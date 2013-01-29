/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Fahrtenbuch;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.util.Date;

/**
 *
 * @author Max_2
 */
public class FahrtenBuchGui {

    private List fahrtenbuchListe;
    private Fahrtenbuch fahrtenbuch;

    public FahrtenBuchGui() {
        fahrtenbuchListe = new List();
        fahrtenbuch = new Fahrtenbuch();
    }

    public static void main(String[] args) {
        FahrtenBuchGui myGui = new FahrtenBuchGui();
        myGui.fahrtenbuch.setName("Arbeitswege");
        myGui.fahrtenbuch.setKommentar("");
        myGui.fahrtenbuch.trageStreckeEin(150, 0.65);
        myGui.fahrtenbuch.trageStreckeEin(190, 0.95);
        myGui.fahrtenbuch.trageStreckeEin(999, 0.35);
        myGui.fahrtenbuch.trageStreckeEin(153, 0.55);
        myGui.fahrtenAuswertenMenue();

        //myGui.mainMenue();
    }

    public void mainMenue() {
        char antwort = JOptionPane.showInputDialog("Hallo und herzlich Willkommen zum Fahrtenbuch! \n" + "Bitte wähle eine der folgenden Optionen \n"
                + "n = Neues Fahrtenbuch anlegen. Im Fahrtenbuch \n"
                + "q = Programm beenden").charAt(0);
        switch (antwort) {
            case 'n':
                String name = JOptionPane.showInputDialog("Name angeben: ");
                String kommentar = JOptionPane.showInputDialog("Kommentar angeben (optional): ");
                String startDate = JOptionPane.showInputDialog("Startdatum angeben: ");
                String endDate = JOptionPane.showInputDialog("Enddatum angeben: ");
                fahrtenbuch = new Fahrtenbuch(name, kommentar, startDate, endDate);
                fahrtenbuchListe.toLast();
                fahrtenbuchListe.append(fahrtenbuch);
                this.fahrtErstellenMenue();
            case 'q':
                System.exit(1);
            default:
                this.mainMenue();
        }
    }

    public void fahrtErstellenMenue() {
        char antwort2 = JOptionPane.showInputDialog("Möchten sie mit der Erstellung der Strecken fortfahren? (j/n) \n").charAt(0);
        switch (antwort2) {
            case 'j':
                int strecke = Integer.parseInt(JOptionPane.showInputDialog("Laenge der Strecke angeben: "));
                double preis = Double.parseDouble(JOptionPane.showInputDialog("Preis pro Kilometer angeben: "));
                String streckenkommentar = JOptionPane.showInputDialog("kommentar angeben (optional) : ");
                if (streckenkommentar.isEmpty()) {
                    fahrtenbuch.trageStreckeEin(strecke, preis, streckenkommentar);
                } else {
                    fahrtenbuch.trageStreckeEin(strecke, preis);
                }
                char antwort3 = JOptionPane.showInputDialog("Moechten sie eine weitere Strecke anlegen? (j/n)").charAt(0);
                if(antwort3 == 'j')
                this.fahrtErstellenMenue();
                else this.fahrtenAuswertenMenue();
                
            case 'n':
                System.exit(1);
             
            default:
                this.fahrtErstellenMenue();
        }


    }

    public void fahrtenAuswertenMenue() {
        char antwort = JOptionPane.showInputDialog("Bitte geben sie an, welche Auswertung sie erhalten moechten, \n"
                + "a = Gesamtzahl der gefahrenen Strecken\n"
                + "s = Gesamtzahl der gefahrenen Kilometer\n"
                + "d = Gesammtkosten der gefahrenen Kilometer\n"
                + "f = Durchschnittskosten der gesamt gefahrenen Kilometer").charAt(0);
        switch(antwort) {
            case 'a':
                JOptionPane.showMessageDialog(null, fahrtenbuch.getAnzahlGefahrenerStrecken());
                break;
            case 's':
                JOptionPane.showMessageDialog(null, fahrtenbuch.getGesamtKilometer());
                break;
            case 'd':
                JOptionPane.showMessageDialog(null, fahrtenbuch.getGesamtKosten());
                break;
            case 'f':
                JOptionPane.showMessageDialog(null, fahrtenbuch.getDurchschnittskosten());
                break;       
        }        
    }
}
