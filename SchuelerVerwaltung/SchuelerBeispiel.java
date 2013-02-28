package SchuelerVerwaltung;

public class SchuelerBeispiel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Schueler sch1 = new Schueler("Max", "Hellwig", 2.0);
		System.out.println(sch1);
	}

	public String datenVonSchuelerAusgeben(Schueler pSchueler) {
		String output = "Name: " + pSchueler.getVorname() + " "
				+ pSchueler.getNachname() + " - " + "Aktuelle Note: "
				+ pSchueler.getNote();
		return output;
	}
	
	

}
