package ContainerOOP;

public class Container {

	private int gewicht;
	private int bay;
	private int tier;

	public Container(int gewicht) {
		this.setGewicht(gewicht);
	}
	
	public int getGewicht() {
		return gewicht;
	}
	public void setGewicht(int gewicht) {
		if(gewicht >=0)
		this.gewicht = gewicht;
	}
	public int getBay() {
		return bay;
	}
	public void setBay(int bay) {
		this.bay = bay;
	}
	public int getTier() {
		return tier;
	}
	public void setTier(int tier) {
		this.tier = tier;
	}
	public Container(int gewicht, int bay, int tier) {
		this.gewicht = gewicht;
		this.bay = bay;
		this.tier = tier;
	}
	
	
}
