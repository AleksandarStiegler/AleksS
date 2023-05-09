package Merge;

public class Merge_Sort {
	/*
	 * Merge sortiranje koristimo kod vecih setova podataka (lista)
	 * posto spada u relativno lako i efikasno sortiranje. 
	 * Radi na principu tako sto podeli taj niz na podnizove i onda
	 * ih sortira , pa ih spoji nazad i to radi sve dok vise ne moze
	 * da ih deli. Bitno je pomenuti da je stabilno sortiranje tako 
	 * da nece imati problema prilikom sortiranja elemenata sa istom
	 * vrednoscu sto znaci da prilikom svakog sortiranja ce biti na
	 * istim pozicijama. 
	 * Zasnovano je na rekurziji koja deli listu (niz) na pola dokle
	 * god to moze.
	 */
	
	/* E sad rekli smo da delimo niz dokle god je to moguce sta to
	 * znaci za nas. Cilj nam je da dodjemo do atomicnosti tj da 
	 * dodjemo do takve podele da smo niz (listu) rastavili da kazemo
	 * na sastavne delove pa ih onda uporedjuje na osnovu vrednosti
	 * i onda ih vraca u sortiran niz. Mi ovde moramo da napisemo 
	 * rekurziju koja ce da se ponavlja sve do tog trenutka gde smo
	 * postigli atomicnost. Sta se onda desava tokom poredjenja
	 * mi vracamo (sortiramo) elemente u manje nizove koje ponovo
	 * sortiramo sve dok se ne vratimo na prvobitno duzinu
	 * primer  4 3 1 5 pa ih podelimo na 4 3 i 1 5 pa ih podelimo
	 * na 4 i 3 i 1 i 5 i ovde smo dostigli atomicnost i sad ih 
	 * vracamo u sortiranom poretku 4 > 3 pa je 3 4  i 1 < 5 pa 
	 * ovde i ostaje 1 5, onda se spajaju ta dva podniza i porede
	 * vrednosti ponovo i formira se konacan niz pa je to onda ovako
	 * 1 3 4 5. E ajde da vidimo kako to izgleda kroz program
	 */
	
	// Deklarisacemo levu, desnu stranu niza kao i sredinu posto 
	// moramo naci tacku preseka
	
	public static void mergeSort(int niz[]) {
		// Potrebno je sada kreirati pod nizove kako bi oni mogli kasnije
		// biti spojeni
		int duzina = niz.length;
		if(duzina <= 1) {
			return;
		}
		// Da bi kreirali nove podnizove potrebno nam je da vidimo duzine
		// oba niza tako da moramo prvo naci "sredinu"
		
		int sredina = duzina / 2;
		int niz1[] = new int [sredina]; // leva strana
		int niz2[] = new int [duzina - sredina]; // desna strana
		
		// sada je potrebno dodati te elemente u podnizove
		int k = 0;
		for(int i = 0; i < duzina; i ++) {
			if( i < sredina) {
				niz1[i] = niz[i];
				/* ovde prolazimo kroz prvi deo niza i dodajemo u levi
				 * pod niz ali da ne bismo pravili novu petlju mozemo
				 * da nastavimo i da dodajemo ostatak u desni pod niz
				 * deklarisacu jos jedan brojac van niza druga mogucnost
				 * je realno napraviti 2 petlje jedna koja ce ici kroz
				 * prvu polovinu i druga koja ce proci kroz ostatak
				*/
			}else {
				niz2[k] = niz[i];
				/* Ovo k smo deklarisali kao brojac van petlje kako bismo
				 * mogli da nastavimo i dodajemo elemente u drugi podniz
				 * bez da idemo u dve petlje meni se ovako vise svidja ali
				 * princip je isti nema neke razlike koje mogu da uocim
				 * na prvi pogled. Kad dodamo element ostaje nam da 
				 * inkrementiramo brojac kako ne bismo sve stavljali na 
				 * istu poziciju jelte.
				 */
				k++;
				// I ovako cemo formirati oba niza
			}
		}
		mergeSort(niz1);// Da nastavimo da delimo sad levi podniz
		mergeSort(niz2);// Da nastavimo da delimo desni podniz
		/*
		 * Kad prodjemo kompletno i podelimo nizove potrebno je da ih 
		 * vratimo i spojimo. Tako da nam je potrebna jos jedna metoda
		 * koja ce to da zapravo radi
		 */
		spoji(niz1, niz2, niz);
		
		
	}
	// Ovde cemo da napisemo metodu koja ce da spaja
	public static void spoji(int leviNiz[], int desniNiz[], int niz[]) {
		// Potrebno je naci duzine i sacuvati ih kako bi mogli da spajamo
		
		int levo = niz.length / 2;
		int desno = niz.length - levo;
	
		// Sledece sto moramo da uradimo je da uvedemo brojace koji ce
		// da nam prate indekse podnizova i da vidimo kako da ih spajamo
		int i = 0; // Prati poziciju elemenata u glavnom nizu
		int lbr = 0; // Prati levi podniz
		int dbr = 0; // prati desni podniz
		
		while (lbr < levo && dbr < desno) {
			// Dakle dokle god imamo elemente prolazicemo kroz petlju
			if (leviNiz[lbr] < desniNiz[dbr]) { // trazimo manje clanove
				// i onda manji clan (naravno pricamo o vrednosti clana)
				// se vraca na "i" poziciju glavnog niza
				niz[i] = leviNiz[lbr];
				lbr ++;
				i ++;
			}else {
				niz[i] = desniNiz[dbr];
				i ++ ;
				dbr ++;
			}
		}
		// Ono sto moze da se desi je da nam ostane element koji nemamo 
		// sa cime da uporedimo pa nam ostaje da obradimo i taj slucaj
		
		while ( lbr < levo) {
			niz[i] = leviNiz[lbr];
			i++;
			lbr ++; 
		}
		
		while (dbr < desno) {
			niz[i] = desniNiz[dbr];
			i ++;
			dbr ++;
		}
		// Ovim smo napisali oba slucaja na krajevima levog i desnog
		// podniza gde vise nemamo sta da poredimo i ako pogledamo kroz
		// kod vidimo da kad prodjemo kroz sve petlje mi smo reformirali
		// nas pocetni niz 
		
	}
	
	public static void stampajNiz(int niz[]) {
		for (int i = 0; i < niz.length ; i++) {
			System.out.print(niz[i] + "  ");
			
		}
		System.out.println();
	}
	
	

	public static void main(String[] args) {
		
	
		
		int niz[] = {5, 67, 82, 13, 55, 4, 6, 23, 11, 14, 45, 25, 1, 3};
	
		System.out.println("Pocetni niz : ");
		stampajNiz(niz);
		
		mergeSort(niz);
		
		System.out.println("\nSortiran niz : ");
		stampajNiz(niz);
	
		/*
		 * Kao sto mozemo da vidimo kroz rezultat dobili smo zaista
		 * sortiran niz. Veoma je bitno naglasiti da je ovo dosta
		 * brza metoda za sortiranje od Bubble i Selection sortiranja
		 * ali treba imati na umu da isto tako i zauzima dosta vise 
		 * memorije ( prostora ) posto mora da se prave svi oni dodatni
		 * podnizovi
		 */

	}

}
