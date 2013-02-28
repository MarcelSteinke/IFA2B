package EAN;

public class EAN {

	private String pruefString;
	private int[] pruefArray;

	public EAN(String pruefSumme) {
		this.pruefString = pruefSumme;
		this.pruefArray = new int[12];
		if (pruefSumme.length() == pruefArray.length) {
			for (int i = 0; i < pruefArray.length; i++) {
				if (this.pruefArray[i] >= 0 && this.pruefArray[i] >= 9)
					this.pruefArray[i] = Character
							.getNumericValue(this.pruefString.charAt(i));
			}
		}
	}

	public int[] getPruefArray() {
		return pruefArray;
	}

	public void setPruefArray(int[] pruefArray) {
		this.pruefArray = pruefArray;
	}

	public String getPruefString() {
		return pruefString;
	}

	public String berechnePruefsumme() {
		String output = null;
		int quersumme = 0;
		for (int i = 0; i < getPruefArray().length; i++) {
			if (i % 2 == 0) {
			} else {
				this.getPruefArray()[i] = this.getPruefArray()[i] * 3;
			}
			quersumme += this.getPruefArray()[i];

		}
		output = ""+ quersumme%10;

		return output;

	}

	public String toString() {
		int[] code = new int[12];
		for (int i = 0; i < code.length; i++) {
			code[i] = Character
					.getNumericValue(this.getPruefString().charAt(i));

		}
		int[] gewicht = new int[code.length];
		for (int i = 0; i < code.length; i++) {
			if (gewicht[i] % 2 == 0)
				gewicht[i] = 1;
			else
				gewicht[i] = 3;
		}
		int[] produkt = new int[code.length];
		int gesamt = 0;
		for (int i = 0; i < code.length; i++) {
			produkt[i] = code[i] * gewicht[i];
			gesamt += produkt[i];
		}
		int quersummeGesamt = gesamt % 10;
		String output = "" + quersummeGesamt;
		return output;
	}

}
