import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		
		/*
		 * REGEX - regular expresion regularni izrazi (sabloni)
		 * Sluze za brzu pretragu i manipulaciju tekstom.
		 * Uporedjuje se niz znakova sa tekstom kako bi se pronasli svi 
		 * odgovarajuci delovi teksta. REGEX je veoma dobar pri pretrazi sablona
		 * u listama kako bismo izdvojili neke delove koji se slazu sa nasim
		 * postavljenim sablonom. Recimo da imamo korisnike i da za svakog znamo
		 * banku koju koristi, unosom imena banke u sablon mi bismo mogli da 
		 * izdvojimo sve i samo te nase korisnike koji imaju racune u toj banci 
		 * koju smo uzeli za primer.
		 */

		/*
		 * "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do 
		 * eiusmod tempor incididunt ut labore et dolore magna aliqua. 
		 * Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
		 * nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in 
		 * reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla 
		 * pariatur. Excepteur sint occaecat cupidatat non proident, sunt 
		 * in culpa qui officia deserunt mollit anim id est laborum."
		 * Ovo cu da iskoristim za trazenje paterna malo je poduze ali ok
		 */
		// Pattern i Matcher klase
		
		// Pattern klasa koju pravimo je zapravo sablon koji mi zelimo da trazimo
		// kao sto cemo da vidimo na primeru
		
		Pattern pat = Pattern.compile("dolor");
		
		// Matcher klasa je klasa u koju ubacujemo nas Pattern (sablon) i onda
		// trazimo podudaranje. Pr:
		
		Matcher mat = pat.matcher("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod "
				+ "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim "
				+ "veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip "
				+ "ex ea commodo consequat. Duis aute irure dolor in "
				+ "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. "
				+ "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui "
				+ "officia deserunt mollit anim id est laborum.");
		
		// Ovo je jedan od osnovnih test tekstova (filera) kad nesto vezbamo 
		
		/* Sad da prodjemo kroz ugradjene metode i da pocnemo sa find()
		 * find() - trazi nam sluzi da pronadje ta podudaranja u tekstu
		 * odnosno da pronadje svako podudaranje. 
		 */
		
		
		while(mat.find()) {
			System.out.println("Sablon nadjen od "+mat.start()+ " do "+(mat.end() - 1));
		}
		/*
		 * start() i end() metode nam sluze za dohvatanje pocetnog (start) odnosno
		 * zavrsnog (end) indeksa , s tim da end ne vraca poslednji indeks vec prvi
		 * do njega zato na kraju stavljamo - 1 da bismo bili na pravom indeksu.
		 * Ne zaboraviti da indeksiranje ide od 0!
		 */
		
		// S obzirom da moze da se desi los unos mala i velika slova mozemo da 
		// uvedemo Case_Insensitive pa ajde da vidimo i to
		
		Pattern pat1 = Pattern.compile("DOloR",Pattern.CASE_INSENSITIVE);
		
		System.out.println("\n\n");
		
		Matcher match = pat1.matcher("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod "
				+ "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim "
				+ "veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip "
				+ "ex ea commodo consequat. Duis aute irure dolor in "
				+ "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. "
				+ "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui "
				+ "officia deserunt mollit anim id est laborum.");
		
		while(match.find()) {
			System.out.println("Sablon nadjen od "+match.start()+ " do "+(match.end() - 1));
		}
		/*
		 * Evo dobili smo u oba slucaja isto . Ovo mislim da je veoma korisno 
		 * u svakoj klasi gde mi dozvoljavamo korisniku da unosi patern sam.
		 * Niko nam ne garantuje da ce korisnik ispravno uneti ceo sablon ili
		 * da nece da zaboravi da ugasi Capslock ili da nece na pogresno mesto
		 * da stavi veliko slovo itd. Ovo nam resava taj problem kao i poredjenje
		 * stringova koje smo radili gde smo koristili equalsIgnoreCase
		 */
		
		
		
		
	}

}
