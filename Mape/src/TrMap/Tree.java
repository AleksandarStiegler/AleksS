package TrMap;

import java.util.Map;
import java.util.TreeMap;

public class Tree {

	public static void main(String[] args) {
		
		/*
		 * TreeMap : 
		 * Veoma je bitno da se naglasi da dok su nam HashMap i LinkedHashMap
		 * dozvoljavali da imamo po jednu null vrednost za kljuc i vise null 
		 * vrednosti za elemente TreeMap to ne dozvoljava. Dakle vrednosti MORAJU
		 * biti dodeljene. 
		 * Omogucava pretragu po prirodnom redosledu kljuceva (ne po unesenom nego
		 * npr ako bi uneli prvo kljuc 4 pa onda 8 pa onda 1 ne bi islo izlistavanje
		 * 4 = nekavrednost; 8 = nekavrednost pa 1 = nekavrednost nego 1 pa 4 pa 8)
		 * ili koriscenjem komparatora (poredjivaca) na osnovu neke vrednosti 
		 * 
		 * I ovde sam planirao da iskoristim caseInsensitive tako da cu napraviti
		 * 2 mape da prodjem oba slucaja. Van toga sve metode koje su radile u 
		 * prethodnim HashMap i LinkedHashMap rade i ovde pa mozemo da ih preskocimo
		 * samo cemo za islistavanje vrednosti da ostane u secanju 
		 */
		
		Map<Integer,Double> trmap = new TreeMap<Integer,Double>();
		// Double da bi malo skratio kucanje
		
		trmap.put(4, 14.5);
		trmap.put(19, 1.23);
		trmap.put(25, 18.33);
		trmap.put(1, 4.17);
		trmap.put(11, 100.15);
		trmap.put(15, 2.14);
		trmap.put(2, 1.73);
		trmap.put(7, 2.71);
		
		System.out.println(trmap);
		/*
		 * Kao sto mozemo da vidimo redosled kljuceva kako sam ih ja ubacivao je 
		 * navrat nanos, ali kad smo ih prikazali videli smo da je redosled prirodno
		 * rastuci tj ide od 1 navise nevezano za to kada smo ih uneli.
		 * ajde sada da vidimo i drugi slucaj
		 */
		
		System.out.println();
		
		Map<String,String> trmap1 = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
		// ajde da probam da vidim kako ovo radi
		
		trmap1.put("aaaa", "Pera");
		trmap1.put("abba", "Mika");
		trmap1.put("aagd", "Laza");
		trmap1.put("bada", "Zika");
		trmap1.put("acee", "Kurta");
		trmap1.put("aafa", "Murta");
		trmap1.put("aggg", "I ostali");
		
		System.out.println(trmap1);
		// OK vidimo da on sortira to stvarno lepo posto smo koristili string
		// ono sto ja vidim je da krece poredjenje od prvog karaktera pa ka ostalim
		// i onda ih sortira po abecednom redosledu
		System.out.println("\n");
		System.out.println(" Kljuc : Vrednost");
		for(Map.Entry<String, String> me : trmap1.entrySet()) {
			System.out.println(me.getKey()+ " : "+me.getValue());
		}
		// Ovde zelim da vidim da li ce mi pronaci trazenu vrednost ako unesem pogresno
		// velika i mala slova
		System.out.println("Vrednost 'Mika' se nalazi u mapi : "+trmap1.containsValue("mika"));
		// Ok nece dakle lose sam shvatio sta ovo treba da radi ostavicu za neki drugi dan
		// kad budem prosao vise primera i imao malo vise znanja oko ovih metoda
		
		
		
	}

}
