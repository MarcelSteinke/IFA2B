package ContainerVerladen;

public class Container {

	private int bays;
	private int tiers;
	private int gewicht;

	public Container(int x, int y, int gewicht) {
		this.bays = x;
		this.tiers = y;
		this.gewicht = gewicht;
	}
	
	public Container(int gewicht) {
		this.gewicht = gewicht;
		this.bays = 0;
		this.tiers = 0;
	}

	public int getX() {
		return bays;
	}

	public void setX(int x) {
		this.bays = x;
	}

	public int getY() {
		return tiers;
	}

	public void setY(int y) {
		this.tiers = y;
	}

	public int getGewicht() {
		return gewicht;
	}

	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}

}
