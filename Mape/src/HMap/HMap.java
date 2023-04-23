package HMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HMap {

	public static void main(String[] args) {

		// HashMap

		/*
		 * Mape sadrze vrednosti (clanove) u zavisnosti od kljuca . Dakle svaka vrednost
		 * ima svoj jedinstveni kljuc. Mape ne dozvoljavaju duplikate kljuceva, kao i
		 * baze koje smo radili svaki unos ima svoj jedinstveni primarni kljuc tako i
		 * ovde. Dakle kljuc mora biti jedinstven dok vrednost (element) vezan za njega
		 * moze biti ponovljen u nekom prethodnom paru. HashMap i LinkedHashMap
		 * dozvoljavaju null(prazne) kljuceve i vrednosti dok TreeMap ne, ali to cemo
		 * videti u primerima. Ono sto je bitno je da su Mape veoma korisne za pretragu,
		 * menjanje i brisanje po kljucevima posto su jedinstveni i ako nadjemo ili vec
		 * znamo jedinstveni kljuc ne mozemo pogresiti pri menjanju ili brisanju
		 * podataka koji su vezani za njega. Jednostavno ne nagadjamo da li je to
		 * stvarno podatak koji zelimo da menjamo ili ne. Ako je vezan za kljuc koji smo
		 * uneli pravi podatak posmatramo i mozemo bez brige da ga menjamo ili brisemo.
		 */

		Map<Integer, String> hmap = new HashMap<Integer, String>();

		// Posto smo rekli da imaju parove kljuc : vrednost evo mozemo ovako
		// ne znam da li smo mogli i String da koristimo kao kljuc, u bazama moze
		// ali nije prakticno pa je idealno koristiti Integer sa primarne kljuceve
		// tako da sam to primenio i ovde

		/*
		 * Za razliku od lista gde smo za ubacivanje elemenata koristili metodu add ovde
		 * koristimo put ili putAll ako imamo neku mapu koju zelimo da pridodamo
		 * postojecoj mapi pa da ubacimo sve vrednosti iz prve mape da ne idemo "peske"
		 * jednu po jednu.
		 */

		hmap.put(1, "Nebo");
		hmap.put(2, "Plavo");
		hmap.put(3, "Zeleno");
		hmap.put(4, "Trava");
		hmap.put(5, "Mleko");
		hmap.put(6, "Mleko");
		/*
		 * Kroz mape se ne mozemo kretati na obican nacin vec moramo da konvertujemo
		 * (pretvorimo) u Set i onda mozemo da se krecemo kroz nju pomocu metoda
		 * keySet() ili entrySet()
		 */

		Set sethmap = hmap.entrySet();
		Iterator iter = sethmap.iterator();
		while (iter.hasNext()) {
			Map.Entry mapen = (Map.Entry) iter.next();
			// Ovim smo mapirali kako bismo mogli da izvucemo kljuceve i
			// vrednosti koje su vezane za njih odvojeno
			System.out.println(mapen.getKey() + " : " + mapen.getValue());

		}
		// Moze i na drugi nacin
		System.out.println("\n\n");

		for (Map.Entry m : hmap.entrySet()) {
			System.out.print(m.getKey() + " : " + m.getValue() + "; ");
		}
		// Kao sto vidimo dobili smo identicne rezultate u oba slucaja
		// U ovom primeru unapredjena for petlja je mnogo jednostavnija
		// ali verovatno ce za neke slucajeve Set biti korisniji

		/*
		 * E sada posto smo rekli da je moguce da se promeni vrednost koja je vezana za
		 * neki kljuc, ajde da vidimo to
		 */
		System.out.println("\n");
		hmap.put(2, "Trava");

		for (Map.Entry m : hmap.entrySet()) {
			System.out.print(m.getKey() + " : " + m.getValue() + "; ");
		}
		// Mozemo videti da je drugi element u mapi promenjen
		System.out.println("\n");
		// Da vidimo elemente mape ili mapiranje elemenata
		System.out.println(hmap);

	}

}
