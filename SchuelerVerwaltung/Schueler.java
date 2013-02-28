package SchuelerVerwaltung;

public class Schueler {

	private String vorname;
	private String nachname;
	private double note;

	public Schueler(String vorname, String nachname, double note) {
		this.vorname = vorname;
		this.nachname = nachname;
		if (note >= 1.0 && note <= 6.0)
			this.note = note;
		else {
		}

	}

	public Schueler(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public double getNote() {
		return note;
	}

	public void setNote(int note) {
		if (note <= 1.0 && note >= 6.0)
			this.note = note;
		else {
		}
	}

	public String datenAusgeben() {
		String output = "Name: " + this.getVorname() + " " + this.getNachname()
				+ " - " + "Aktuelle Note: " + this.getNote();
		return output;
	}
	
	/**
	 * @override
	 */

	public String toString() {
		String output = "Name: " + this.getVorname() + " " + this.getNachname()
				+ " - " + "Aktuelle Note: " + this.getNote();
		return output;

	}

}
