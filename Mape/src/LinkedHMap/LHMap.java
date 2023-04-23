package LinkedHMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LHMap {

	public static void main(String[] args) {
		
		/*
		 * LinkedHashMap prosiruje (extends) HashMap i samim tim nasledjuje i sve
		 * metode koje su bile vezane za HashMap. Najveca razlika im je sto se kod
		 * linked mapa cuvaju i pozicije elemenata. Sta to znaci? Pa HashMap je 
		 * osmisljena kako bi se imala mogucnost lakog dodavanja i manipulacija
		 * podataka koje su vezane za jedinstveni kljuc. Ono sto HashMap nije imala
		 * je poredak koji je da kazemo "fixiran" , pa su kodovi mogli da izvlace
		 * podatke nasumicnim redosledom nemamo nicim garantovan redosled po kojem
		 * bi podatke izvlacili iz mape. Tu nastupa LinkedHashMap koja pored svih
		 * pogodnosti koje pruza HashMap omogucava i organizovan redosled posto se
		 * prati poredak unosa podataka i tim onda podatcima u mapi mozemo da 
		 * pristupimo po poretku kako su uneti.
		 * 
		 * Ono sto nisam pomenuo za HashMap a vazi i za LinkedHashMap je da 
		 * implementacija nije sinhronizovana. Ako imamo vise niti (threadova) koji
		 * koji istovremeno pristupaju mapi i bar jedan od njih vrsi izmenu potrebno
		 * je izvrsiti sinhronizaciju externo. Ne verujem da cu proci nesto tako
		 * kroz ilustrativni primer ali mislim da je bitno i da treba da mi ostane 
		 * u glavi pa sam i odradio napomenu.
		 */
		
		/* Ovde cu proci par metoda koje nisam koristio u HashMap da ne bih ponavljao
		*  U HashMap - u sam koristio integer za kljuc ajde ovde da iskoristimo
		*  String tip. 
		*/
		Map<String,String> linkhmap = new LinkedHashMap<String,String>();
		System.out.println(linkhmap.isEmpty());
		linkhmap.put("aaa", "Aleksandar");
		linkhmap.put("aab", "Aleksa");
		linkhmap.put("aac", "Andrija");
		linkhmap.put("aad", "Borivoje");
		linkhmap.put("aae", "Boban");
		System.out.println(linkhmap.isEmpty());
		// Jos jedna od metoda koju nismo koristili je isEmpty() koja proverava 
		// da li je nasa lista prazna pa cu je staviti pre i posle dodavanja 
		// Kao sto smo mogli da vidimo metoda je logickog tipa pa ce nam vratiti ili
		// true ili false 
		
		// Ajde da prvo izlistamo sve elemente po redosledu kojim su dodati
		
		System.out.println(linkhmap);
		System.out.println();
		
		// Da bismo proverili da li neki kljuc ili element (vrednost) postoji koristimo
		// containsKey() za kljuc ili containsValue() za vrednost
		
		System.out.println("Sadrzi AAA : "+linkhmap.containsKey("AAA"));
		System.out.println("Sadrzi aaa : "+linkhmap.containsKey("aaa"));
		/*
		 * Gledao sam i kako bi resili da to bude nevezano za mala ili velika slova
		 * i najbolja resenja koja sam video je da se napravi TreeMap koja ce biti
		 * caseInsensitive dakle nece biti zavisna od malih velikih slova ili da se
		 * napravi na ulazu da svaki unos nevezano za to kako ce korisnik uneti budu
		 * mala slova . Ovo za TreeMap mi se svidja pa cu probati to kroz sledeci 
		 * primer da uradim a ovo drugo ostaje za neki drugi trenutak.
		 */
		
		System.out.println("Sadrzi vrednost 'Maja' : "+linkhmap.containsValue("Maja"));
		System.out.println("Sadrzi vrednost 'Boban' : "+linkhmap.containsValue("Boban"));
		
		// U prethodnom primeru kod HashMap-a sam koristio metodu za promenu vrednosti
		// kao sto smo rekli sve te metode su aktivne i ovde pa cemo da uradimo nju
		// kao i metodu za brisanje (uklanjanje) vrednosti iz mape koju nisam iskoristio
		
		System.out.println(linkhmap);
		// Da ne bih gledao gore koji su mi kljucevi i elementi uzecemo jos jedno
		// ispisivanje pa cemo da izaberemo 2 clana jedan da promenimo a jedan uklonimo
		
		linkhmap.put("aab",	"Petronije"	);
		linkhmap.remove("aae");
		System.out.println(linkhmap);
		
		/* Kao sto mozemo da vidimo uspesno smo promenili vrednost elementa koji
		 * je bio vezan za kljuc "aab" kao i da smo obrisali element aae
		 * ajde da dodamo jos koju vrednost pa da uzmemo jos jednom da prodjemo
		 * kroz mapu kao u prethodnom primeru
		 */
		linkhmap.put("abc", "Horizont");
		linkhmap.put("cde", "Tasmanija");
		linkhmap.put("efg", "Titanium");
		
		System.out.println("Imamo trenutno : "+linkhmap.size()+" elemenata.");
		System.out.println(linkhmap);
		System.out.println();
		System.out.println("Kljuc : Vrednost");
		for(Map.Entry<String, String> me : linkhmap.entrySet()) {
			String key = me.getKey();
			String value = me.getValue();
			System.out.println(key + " : "+ value);
		}
		// Mape mozemo isprazniti kao i liste metodom clear()
		linkhmap.clear();
		
		System.out.println("Mapa je prazna : "+linkhmap.isEmpty());
		
		

	}

}
