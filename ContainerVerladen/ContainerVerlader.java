package ContainerVerladen;

import de.za.*;

public class ContainerVerlader {

	List myListe = new List();
	int bays=1, tiers=1;

	public void setMyListe(List myListe) {
		this.myListe = myListe;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContainerVerlader meinHafen = new ContainerVerlader();
		// meinHafen.clearList();
		meinHafen.clearList();
		meinHafen.saveContainerAtEndOfList(23);
		meinHafen.saveContainerAtEndOfList(22);
		meinHafen.saveContainerAtEndOfList(11);
		meinHafen.saveContainerAtEndOfList(10);
		meinHafen.saveContainerAtEndOfList(9);
		meinHafen.saveContainerAtEndOfList(9);
		meinHafen.saveContainerAtEndOfList(8);
		meinHafen.saveContainerAtEndOfList(8);
		meinHafen.saveContainerAtEndOfList(8);
		meinHafen.saveContainerAtEndOfList(7);
		meinHafen.saveContainerAtEndOfList(7);
		meinHafen.saveContainerAtEndOfList(6);

		meinHafen.printContainerList();

	}

	private void printContainerList() {
		myListe.toFirst();
		while (myListe.hasAccess()) {
			System.out.println(((Container) myListe.getObject()).getX() + " | "
					+ ((Container) myListe.getObject()).getY() + " | "
					+ ((Container) myListe.getObject()).getGewicht() + " | ");
			myListe.next();
		}
	}

	private boolean clearList() {
		this.myListe = new List();
		return true;
	}

	/**
	 * fuegt einen neuen Container mit dem gewaehlten Gewicht an die gewaehlte
	 * Stelle ein.
	 * 
	 * @param int x, int y, int gewicht
	 * @return void
	 */
	private boolean forceInsertContainer(int x, int y, int gewicht) {
		myListe.toFirst();
		while (myListe.hasAccess()) {

			Container newContainer = new Container(x, y, gewicht);
			if ((((Container) myListe.getObject()).getX()) == x
					&& ((((Container) myListe.getObject()).getY()) == y)
					&& (((Container) myListe.getObject()).getGewicht()) == gewicht) {
				myListe.insert(newContainer);
				return true;
			}
		}
		return false;
	}

	/**
	 * this method adds an new container savely at the end of the list.
	 * 
	 * @param int gewicht - only weight is needed
	 * 
	 * @return boolean true - if the action was successfull
	 */

	private boolean saveContainerAtEndOfList(int gewicht) {
		myListe.toFirst();
		if (!myListe.hasAccess()) {

			Container newContainer = new Container(gewicht);
			myListe.insert(newContainer);
			return true;
		} else if (myListe.hasAccess()) {
			myListe.toLast();
			
			Container newContainer = new Container(bays, tiers, gewicht);
			bays++;
			tiers++;
			myListe.append(newContainer);
			return true;

		}

		else
			return false;

	}

	private void containerLoeschen(Container pContainer) {
		myListe.toFirst();
		while (myListe.hasAccess()) {

			if ((pContainer.getX() == ((Container) myListe.getObject()).getX())
					&& (pContainer.getY() == ((Container) myListe.getObject())
							.getY())) {
				myListe.remove();
			}
		}
	}

	private void containerLoeschen(int x, int y, int gewicht) {
		myListe.toFirst();
		while (myListe.hasAccess()) {
			if ((((Container) myListe.getObject()).getX()) == x
					&& (((Container) myListe.getObject()).getY()) == y) {
				myListe.remove();
			}
		}
	}

	private void containerAnKooridnatenSortiertEinfuegen(Container pContainer) {
		myListe.toFirst();
		while (myListe.hasAccess()) {

			if ((pContainer.getX() <= ((Container) myListe.getObject()).getX())
					&& (pContainer.getY() >= ((Container) myListe.getObject())
							.getY())) {
				myListe.insert(pContainer);
			}
		}
	}

	private void containerAufPositionEinfuegen(Container pContainer, int x,
			int y) {
		myListe.toFirst();
		while (myListe.hasAccess()) {

			if ((((Container) myListe.getObject()).getX()) == x
					&& (((Container) myListe.getObject()).getY()) == y) {
				myListe.insert(pContainer);
			}
		}
	}

}
