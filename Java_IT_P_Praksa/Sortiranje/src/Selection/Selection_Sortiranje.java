package Selection;

public class Selection_Sortiranje {

	public static void main(String[] args) {
	
		/*
		 * Selection vrsta sortiranja je brza od bubble sortiranja posto moze da se
		 * krece u oba pravca kroz listu ( niz ) i posmatra najvece i najmanje elemente
		 * u listi pa ih sortira. Kao i Bubble sortiranje jednostavan nacin sortiranja i
		 * lak za shvatanje. Moze da se koristi kod sortiranja manjih grupa podataka ali
		 * kao i bubble sort puno puta se prolazi kroz listu (niz). Nije pogodna za
		 * velike liste posto mora iznova i iznova da prolazi kroz listu sto nam govori
		 * da je potrebno dosta vremena da se izvrsi. Posto stalno pisemo i menjamo
		 * mesta elementima pa je lose na sistemima koji imaju spor hard i RAM. Ako
		 * imamo dosta duplikata to je takodje problem posto ih nepotrebno sortira. U
		 * vecini slucajeva bolji su heapsort i quicksort
		 */
		
		int niz [] = {4, 15, 33, 1, 65, 23, 12, 18,3, 17, 55,22, 11, 6, 2};
		int n = niz.length;
		System.out.println("Pocetan niz : ");
		for(int i = 0; i < n; i++) {
			System.out.print(niz[i] + "  ");
		}
		System.out.println();
		
		for(int i = 0; i < n-1 ; i++) {
			int min = i;
			/* 
			 * Prvo sto cemo da uradimo je da deklarisemo pocetni indeks 
			 * u prvoj petlji kao minimum sto je realna situacija, ali
			 * to ne znaci da nam je najmanji clan u preostalom nizu na
			 * toj poziciji tako da moramo da prodjemo kroz ostatak liste (niza)
			 * i da vidimo gde nam je zaista najmanji element i onda cemo
			 * zabeleziti njegovu lokaciju(indeks) kako bismo kasnije mogli
			 * da pozovemo clan na toj lokaciji i pomerimo ga na zeljenu 
			 * tj pocetnu poziciju i. Kao sto mozemo da vidimo posle svakog
			 * prolaska mi smanjujemo duzinu niza kroz koju mi prolazimo 
			 * odnosno broj clanova niza.
			 */
			for (int j = i+1; j < n; j++) {
				if(niz[j] < niz[min]) {
					min = j; // Odredjujemo zaista minimalnu vrednost
					// za preostale clanove kako bismo mogli da sortiramo
				}
			}
			int temp = niz[min];
			niz[min] = niz[i];
			niz[i] = temp;
			/*
			 * Kroz ovaj deo mi zapravo promenimo lokacije i sortiramo niz
			 * kako treba. Meni se vise svidja nego bubble sort
			 */
		}
		
		System.out.println("Sortiran niz : ");
		for(int i = 0; i < n; i++) {
			System.out.print(niz[i] + "  ");
		}
	}

}
