package EAN;

import javax.swing.JOptionPane;

public class EAN_Anwendung {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inString = null;
		EAN ean = null;

		inString = JOptionPane.showInputDialog(null,
				"12-stellige EAN-Zahl eingeben: ", "978390184611");

		ean = new EAN(inString);
		JOptionPane.showMessageDialog(null,
				"EAN-Pruefziffer: " + ean.toString() + "\n\n fuer: " + inString
						+ "\n\n");
	}

}
