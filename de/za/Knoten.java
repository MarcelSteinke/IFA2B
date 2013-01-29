package de.za;


public class Knoten {

	private Object inhalt;
	private Knoten nachfolger;

	public Knoten(Object inhalt, Knoten nachfolger) {
		super();
		this.inhalt = inhalt;
		this.nachfolger = nachfolger;
	}

	public Object getInhalt() {
		return inhalt;
	}

	public void setInhalt(Object inhalt) {
		this.inhalt = inhalt;
	}

	public Knoten getNachfolger() {
		return nachfolger;
	}

	public void setNachfolger(Knoten nachfolger) {
		this.nachfolger = nachfolger;
	}

}