/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author max
 */
public class DoubleRange {

    public static void main(String[] args) {
        DoubleRange myRange = new DoubleRange();
        double[] exampleArray = new double[5];
        exampleArray[0] = 19;
        exampleArray[1] = 9;
        exampleArray[2] = 33;
        exampleArray[3] = 4;
        exampleArray[4] = 5;
        short[] messreihe = new short[100000];
        messreihe[0] = 2;
        messreihe[1] = 4;
        messreihe[2] = 5;
        messreihe[3] = 6;
        messreihe[4] = 8;
        messreihe[5] = 10;
        messreihe[6] = 2;
        messreihe[7] = 9;
        messreihe[8] = 6;
        messreihe[9] = 9;
        messreihe[90] = 3;
        messreihe[999] = -1;
        myRange.messreihe(messreihe);
        System.out.println("Spannweite ist: " + myRange.range(exampleArray));
    }

    public double range(double[] pArray) {
        double spannweite = 0;
        double[] array = new double[pArray.length];
        System.arraycopy(pArray, 0, array, 0, pArray.length);
        double min = array[0];
        double max = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            } else {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            spannweite = max - min;
        }
        return spannweite;
    }

    public void messreihe(short[] messreihe) {
        short auswertung = 0;
        int[] auswertungsreihe = new int[10];
        for (int i = 0; i < messreihe.length; i++) {
            if (auswertung == -1) {
                break;
            }
            auswertung = messreihe[i];
            switch (auswertung) {
                case 1:
                    auswertungsreihe[1]++;
                    break;
                case 2:
                    auswertungsreihe[2]++;
                    break;
                case 3:
                    auswertungsreihe[3]++;
                    break;
                case 4:
                    auswertungsreihe[4]++;
                    break;
                case 5:
                    auswertungsreihe[5]++;
                    break;
                case 6:
                    auswertungsreihe[6]++;
                    break;
                case 7:
                    auswertungsreihe[7]++;
                    break;
                case 8:
                    auswertungsreihe[8]++;
                    break;
                case 9:
                    auswertungsreihe[9]++;
                    break;
            }
        }
        System.out.println("Statistisches Ergebnis: \n");
        for (int i = 1; i < auswertungsreihe.length; i++) {
            System.out.println("Auswertung an der Stelle " + i + ": " + auswertungsreihe[i]);
        }
    }
}