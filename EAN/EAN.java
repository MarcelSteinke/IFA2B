package EAN;

public class EAN {

	private String pruefString;
	private int[] pruefArray;

	public EAN(String pruefSumme) {
		this.pruefString = pruefSumme;
		this.pruefArray = new int[12];
		if (pruefSumme.length() == pruefArray.length) {
			for (int i = 0; i < pruefArray.length; i++) {
				if (Character.getNumericValue(this.pruefString.charAt(i)) >= 0
						&& Character
								.getNumericValue(this.pruefString.charAt(i)) <= 9)
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
		output = "" + (10 - (quersumme % 10));

		return output;

	}

	public String toString() {
		String output = this.berechnePruefsumme();
		return output;
	}

}
