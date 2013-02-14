package ContainerOOP;

public class ContainerVerwaltung {

	private int containerArray[][];

	public ContainerVerwaltung(int bays, int tiers) {
		this.containerArray = new int[bays][tiers];
	}

	public int[][] getContainerArray() {
		return containerArray;
	}

	public void fuegeContainerNachGewichtEin(Container pContainer) {
		for (int i = 0; i < this.getContainerArray().length; i++) {
			for (int j = 0; j < this.getContainerArray()[i].length; j++) {
				if (pContainer.getGewicht() > this.getContainerArray()[i][j]) {
					containerArray[i][j] = pContainer.getGewicht();
				}
			}
		}
	}
	
	public void fuegeContainerAnPositionEin(Container pContainer) {
		for (int i = 0; i < this.getContainerArray().length; i++) {
			for (int j = 0; j < this.getContainerArray()[i].length; j++) {
				if (this.getContainerArray()[i][j] == 0) {
					containerArray[i][j] = pContainer.getGewicht();
				}
			}
		}
	}
	
	public static void main (String [] args) {
		ContainerVerwaltung myVerwaltung = new ContainerVerwaltung(3, 4);
		Container container1 = new Container(23);
		Container container2 = new Container(22);
		Container container3 = new Container(11);
		Container container4 = new Container(10);
		Container container5 = new Container(9);
		Container container6 = new Container(9);
		Container container7 = new Container(8);
		Container container8 = new Container(8);
		Container container9 = new Container(8);
		Container container10 = new Container(7);
		Container container11 = new Container(7);
		Container container12 = new Container(6);
		
		
			myVerwaltung.fuegeContainerAnPositionEin(container1);
		

	}

}
