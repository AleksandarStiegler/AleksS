package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		
		/*
		 * Nesto osnovno za pocetak.
		 * Liste su zapravo uredjene kolekcije. Mozemo dohvatati sve elemente
		 * unutar listi preko njihovih indeksa.
		 * Dozvoljeno je dupliranje elemenata takodje nam liste dozvoljavaju
		 * da imamo prazne elemente (null) . Mozemo ovo posmatrati kao kontrolne
		 * nule na tekucim racunima, mozemo da ih zanemarimo prilikom unosa racuna
		 * za neku uplatu posto su one tu samo da drze mesta za buduce korisnike
		 * primer 265-00000012346-54 ovaj racun mozemo i ovako napisati
		 * 265-12346-54 ove nule pre toga ne ulaze u obzir dok ne dodju u upotrebu
		 * kod kasnijih racuna. Barem ja tako shvatam null elemente cuvare mesta 
		 * koji se kasnije mogu iskoristiti
		 * Liste su slicne nizovima u tome da indeksiranje krece od 0 tj prvi 
		 * element liste ima 0 indeks. Velika razlika u odnosu na nizove je u tome
		 * sto liste nisu ogranicene. Niz prilikom deklaracije i inicijalizacije
		 * mora imati i jasno definisan opseg (granicu) , dok su liste otvorene
		 * i mogu im se elementi naknadno dodavati. Po defaultu ce se dodavati 
		 * na poslednje slobodno mesto. Imamo dosta ugradjenih funkcija koje nam 
		 * omogucavaju kretanje kroz liste.
		 * Jos jedan dodatak dodavanje elementa na odredjen indeks ne znaci da cemo
		 * mi da prelepimo preko postojeceg elementa vec da mi na ajde da kazemo
		 * na silu ubacujemo na to mesto element a svi elementi koji su se nalazili
		 * od tog indeksa do poslednjeg ce da se pomere za mesto udesno tj indeks 
		 * ce da se uveca za jedan. E sad ajde da prodjemo kroz neke osnovne 
		 * primere i metode
		 */
		
		List<String> alist = new ArrayList<String>(); // deklariasali smo listu
		/*
		 * Kao sto smo vec rekli liste imaju ugradjene metode jedna od njih je 
		 * metoda add koja nam dozvoljava da unesemo elemente u listu pa ajde da 
		 * ubacimo par reci
		 */
		
		alist.add("Bicikl");
		alist.add("Motor");
		alist.add("Auto");
		alist.add("Kamion");
		alist.add("Avion");
		alist.add("Camac");
		
		// Kroz liste mozemo i da se krecemo unapredjenom for petljom
		
		for (String i : alist) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		/* Jedna od metoda je contains koja nam omogucava da proverimo da li se 
		*  trazeni element nalazi u listi. Ono sto smo vec pomenuli je da elementi
		*  se mogu ponavljati unutar liste pa ce on uvek stati na prvom nadjenom
		*/
		
		System.out.println(alist.contains("Auto"));
		// Rezultat ce biti prikazan kao boolean ili true ili false
		System.out.println(alist.contains("Helikopter"));
		/*
		 * Mogli smo da uvedemo i logicku promenljivu pa da to bude malo uredjenije 
		 * ili da dobijemo neki drugi ispis na ekranu proci cu kroz primer
		 */
		
		boolean sadrzi = alist.contains("Trotinet");
		if(sadrzi = true) {
			System.out.println("Element 'Trotinet' se nalazi u listi! ");
		}else {
			System.out.println("Element 'Trotinet' se ne nalazi u listi! ");
		}
		
	
		
		/*
		 * Posto ima vise metoda koje se koriste u listama probacu da ih ne ponavljam
		 * jer pored ArrayLista imamo i LinkedListe kao i vektore pa cu kroz njih proci
		 * i ostale metode.
		 */
		System.out.println(alist.get(3));
		/* Kao sto mozemo da vidimo ugradjenom metodom get mozemo da vratimo (dobijemo)
		*  element koji se nalazi na poziciji koju smo trazili. Napominjem jos jednom
		*  indeksiranje ide od 0 tako da kad trazite odredjeno mesto i treba vam element
		* na 5-tom mestu treba da uneste broj manje u ovom slucaju 4.
		*/
		
		/*
		 * VEOMA BITNO - ukoliko zelimo da ubacimo element na odredjeno mesto
		 * ili da dohvatimo sa tog mesta, moramo znati da li lista uopste ima toliko
		 * elemenate u suprotnom cemo dobiti gresku (error) IndeksOutOfBounds
		 * za proveru duzine liste mozemo koristiti ugradjenu metodu size()
		 */
		
		System.out.println("Trenutna duzina liste "+alist.size());
		
		// rekli smo da lista nije ogranicena pa ajde da sada dodamo jos 1-2 clana
		
		alist.add("Marko");
		alist.add("Maja");
		
		System.out.println("Trenutna duzina liste "+alist.size());
		// Kao sto mozemo da vidimo nasa lista se uvecala
		
		/*
		 * Jedna od zanimljivih funkcija je ukoliko trazimo neki element i zelimo
		 * da vidimo gde se on nalazi u listi, koristimo IndexOf()
		 * pa ajde i da vidimo primer za to
		 */
		
		System.out.println("Kamion se nalazi na "+(1 + alist.indexOf("Kamion"))+" mestu");
		
		// Ajde da vidimo i sta se desava kada element ne postoji a pokusamo da 
		// mu dohvatimo indeks
		
		int k = alist.indexOf("Trotinet");
		System.out.println(k);
		// Posto se element ne nalazi u listi dobicemo vrednost -1
		
		/*
		 * Pored ovoga imamo i metode remove() koja uklanja odredjeni clan iz 
		 * liste kao i clear() koja ocisti listu u potpunosti . U ovom primeru
		 * necu koristiti clear() to cu ostaviti za sledeci
		 */
		
		alist.remove("Auto");
		alist.remove(4);
		
		System.out.println("Trenutna duzina liste "+alist.size());
		
		// Ovo su 2 nacina na koji mozemo da uklonimo elemente prvi je preko
		// naziva elementa a drugi preko indeksa
		
		/*
		 * Posto pricamo o listamo moramo i da pomenemo iterator i listiterator
		 * U ovom primeru cu proci samo kroz iterator a u sledecem listiterator
		 * pa cemo i objasniti koja je razlika izmedju njih
		 */
		
		Iterator<String> iter = alist.iterator();
		/*
		 * Zasto je Iterator tipa String a ne nekog drugog?
		 * Pa ovo je nas slucaj mi smo koristili podatke tipa String
		 * da smo napravili listu tipa Integer ili Double takav bi nam tip 
		 * bio i Iterator.
		 * Iterator nam sluzi za kretanje kroz listu i ide od pocetka do kraja 
		 * liste. Metode koje su nam na raspolaganju :
		 * next() - prikazuje sledeci clan liste
		 * hasNext() - je logicka metoda koja vraca true ili false
		 * remove() - pa identicno kao i remove koji smo malopre odradili uklanja
		 * element iz liste. 
		 */
		
		// ajde kroz jedan primer da prodjemo metode
		
		while (iter.hasNext()) {
			if(iter.next().equals("Bicikl") ) {
				iter.remove();
				System.out.println("Element je uklonjen iz liste!");
			}
			
			while(iter.hasNext()) {
				System.out.println(iter.next());
			}
			
		}
		
		

	}

}
