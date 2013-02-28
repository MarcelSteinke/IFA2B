package ContainerOOP;
import de.za.Stack;
public class ContainerVerwaltung {

	private int containerArray[][];
	private Stack tempStack;

	public ContainerVerwaltung(int bays, int tiers) {
		tempStack = new Stack();
		this.containerArray = new int[bays][tiers];
	}

	public int[][] getContainerArray() {
		return containerArray;
	}

	public void fuegeContainerNachGewichtEin(Container pContainer) {
		for (int i = 0; i < this.getContainerArray().length; i++) {
			for (int j = 0; j < this.getContainerArray()[i].length; j++) {
				if ((containerArray[i][j] == 0 && containerArray[i - 1][j - 1] != pContainer
						.getGewicht())) {
					containerArray[i][j] = pContainer.getGewicht();
				}
				if ((i >= 1 && j >= 1)
						&& (containerArray[i - 1][j - 1] != pContainer
								.getGewicht())) {
					containerArray[i][j] = pContainer.getGewicht();
					break;
				}
			}
		}
	}

	public void fuegeContainerAnPositionEin(Container pContainer) {
		for (int bay = 0; bay < this.getContainerArray().length; bay++) {
			for (int tier = 0; tier < this.getContainerArray()[bay].length; tier++) {
				if ((pContainer.getGewicht() != containerArray[bay][tier]) ) {
					containerArray[pContainer.getBay()][pContainer.getTier()] = pContainer
							.getGewicht();
				}
			}
			break;
		}
	}
	
	public void fuegeContainerausStackEin() {
		
	}

	public int gebeContainerAnPositionAus(int bay, int tier) {
		return this.getContainerArray()[bay][tier];
	}

	public String gibAlleContainerAus() {
		String output = "";
		for (int i = 0; i < containerArray.length; i++) {
			for (int j = 0; j < containerArray[i].length; j++) {
				if (containerArray[i][j] > 0) {
					output += this.getContainerArray()[i][j];
				}
			}
		}
		return output;
	}
	
	public void legeContainerAn(int gewicht) {
		tempStack.push(new Container(gewicht));
	}

	public static void main(String[] args) {
		
		ContainerVerwaltung myVerwaltung = new ContainerVerwaltung(4, 3);
		Container container1 = new Container(23, 0, 0);
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
		myVerwaltung.tempStack.push(container1);
		myVerwaltung.tempStack.push(container2);
		myVerwaltung.tempStack.push(container3);
		myVerwaltung.tempStack.push(container4);
		myVerwaltung.tempStack.push(container5);
		myVerwaltung.tempStack.push(container6);
		myVerwaltung.tempStack.push(container7);
		myVerwaltung.tempStack.push(container8);
		myVerwaltung.tempStack.push(container9);
		myVerwaltung.tempStack.push(container10);
		myVerwaltung.tempStack.push(container11);
		myVerwaltung.tempStack.push(container12);


		System.out.println(myVerwaltung.gibAlleContainerAus());

	}

}
