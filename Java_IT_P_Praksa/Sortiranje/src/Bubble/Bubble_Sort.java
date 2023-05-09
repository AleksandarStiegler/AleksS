package Bubble;

public class Bubble_Sort {

	public static void main(String[] args) {
		
		/*
		 * Bubble sortiranje je najjednostavniji nacin sortiranja koji uporedjuje dva susedna elementa niza 
		 * i menja im mesta. Problem je kompleksnost, posto konstantno prolazi kroz niz i uporedjuje 
		 * elemente ova vrsta sortiranja nije pogodna za rad sa velikom kolicinom podataka posto je spora.
		 */
		
		int niz [] = {1, 5, 3, 9, 8, 6, 4};
		
		// Uzeli smo jedan proizvoljan niz nad kojim cemo da prikazemo princip 
		
		System.out.println("Pocetni niz : ");
		for (int i = 0; i < niz.length; i ++) {
			System.out.print(niz[i]+"  ");
		}
		
		int temp ; // treba nam jedna promenljiva da bismo mogli da menjamo mesta i ne izgubimo element
		for (int i = 1; i < niz.length; i++) {
			for(int j = 0; j < i; j++) {
				temp = niz[i];
				if (niz[j] > niz[i]) {
					niz[i] = niz[j];
					niz[j] = temp;
				}
			}
		}
		
		System.out.println("\n\nNiz posle sortiranja : ");
		for (int i = 0 ; i < niz.length; i ++) {
			System.out.print(niz[i]+ "  ");
		}
		/*
		 * Kao sto mozemo da vidimo niz smo sortirali u ovom slucaju je u rastucem poretku ali je isto tako
		 * moguce i da se odradi u opadajucem poretku 
		 */
		
		for (int i = 1; i < niz.length; i++) {
			for(int j = 0; j < i; j++) {
				temp = niz[j];
				if (niz[j] < niz[i]) {
					niz[j] = niz[i];
					niz[i] = temp;
				}
			}
		}
		
		System.out.println("\n\nNiz posle sortiranja u opadajucem poretku : ");
		for (int i = 0 ; i < niz.length; i ++) {
			System.out.print(niz[i]+ "  ");
		}
		
		
		

	}

}
