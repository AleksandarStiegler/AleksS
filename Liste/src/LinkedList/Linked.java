package LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Linked {

	public static void main(String[] args) {
		
		/*
		 * Kao i za ArrayListu za LinkedListu vaze iste metode
		 * Najveca razlika u odnosu na ArrayListu je da mi imamo i pokazivac i element
		 * Dakle pri unosu elementa dodeljujemo mu pokazivac koji jasno pokazuje na
		 * sledeci par u listi ma gde god da se on nalazio.
		 * Posto sam prosao kroz metode koje se najcesce koriste kroz ArrayList
		 * ovde cu da odradim listIterator i jos koju metodu ako mi padne napamet
		 * i clear().
		 */
		
		// listIterator nam u odnosu na Iterator omogucava da se krecemo kroz listu
		// u oba smera od prvog ka poslednjem i od poslednjeg ka prvom
		
		String str[] = {"Marko", "Maja", "Vanja", "Sanja", "Tanja", "Mirko", "Slavko"};
		
		List <String> llist = new LinkedList<String>();
		
		for(String s : str) {
			llist.add(s);
		}
		/*
		 * Na ovaj nacin smo nas kreiran niz koji je statickog oblika prebacili
		 * u listu tj dinamicki niz
		 */
		
		for(String s : llist) {
			System.out.print(s+" , ");
		}
		
		ListIterator<String> lister = llist.listIterator();
		System.out.println();
		while(lister.hasNext()) {
			System.out.print(lister.next()+ " , ");
		}
		// i ovime smo kao i kod iteratora prosli kroz listu od prvog do poslednjeg
		/*
		 * E sad da bismo se vratili kroz listu potrebno je koristiti obrnutu
		 * komandu tj hasPrevious() i previous();
		 */
		
		System.out.println();
		while(lister.hasPrevious()) {
			System.out.print(lister.previous()+ " , ");
		}
		System.out.println();
		
		/*
		 * Ono sto jos nisam pomenuo je da mozemo da postavimo novu vrednost 
		 * nekom odredjenom elementu, kao i da postojecoj listi mozemo pridodati
		 * jos jednu listu ne moramo ici element po element tako da cu da napravim
		 * jos jednu listu 
		 */
		
		List <String> ll2 = new LinkedList<String>();
		
		ll2.add("Pera");
		ll2.add("Laza");
		ll2.add("Mika");
		ll2.add("Zika");
		System.out.println("Trenutna duzina nase liste "+llist.size());
		llist.addAll(ll2);
		System.out.println("Trenutna duzina nase liste "+llist.size());
		// Mozemo videti da se lista prosirila za 4 elementa
		for(String s : llist) {
			System.out.print(s+" , ");
		}
		
		// Vec sam rekao da clear() cisti celu listu ali pored cele liste mi mozemo
		// i da koristimo clear() da ocistimo (izbrisemo) deo liste
		
		llist.subList(2, 6).clear();
		System.out.println();
		System.out.println("Trenutna duzina nase liste "+llist.size());
	
		/*
		 * Ono sto je bitno kada koristimo ovako podlistu je da kada brisemo 
		 * idemo od zadatog indeksa ukljucujuci i njega do kranjeg indeksa koji
		 * se ne ukljucuje
		 */
		for(String s : llist) {
			System.out.print(s+" , ");
		}
		System.out.println();
		// Kao sto sam i rekao mozemo primetiti da su Vanja Sanja Tanja i Mirko
		// izbrisani iz liste
		llist.set(3, "Rumpelstiltskin");
		/*
		 * Koriscenjem set metode smo u nasem slucaju promenili 3-ci indeks 
		 * odnosno 4-tog clana liste u Rumpelstiltskin
		 */
		for(String s : llist) {
			System.out.print(s+" , ");
		}
		System.out.println();
		// za kraj brisanje liste
		llist.clear();
		System.out.println("Trenutna duzina nase liste "+llist.size());
		
		
	}

}
