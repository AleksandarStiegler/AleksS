package praksa;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class MAIN {

	public static ArrayList<Osoba> listaKorisnika(String tekst) {

		ArrayList<Osoba> kor = new ArrayList<Osoba>();
		try {

			BufferedReader bfr = new BufferedReader(new FileReader(tekst));
			Pattern pat = Pattern.compile("^([A-Za-z ]+),\s([A-Za-z ]+),\s([A-Za-z0-9_.]+)$");

			String aline;
			while ((aline = bfr.readLine()) != null) {
				Matcher mat = pat.matcher(aline);
				if (mat.matches()) {
					String ime = mat.group(1);
					String kuca = mat.group(2);
					String fajlporuka = mat.group(3);
					if(!mat.group(1).equalsIgnoreCase("character"))
					kor.add(new Osoba(ime, kuca, fajlporuka));

				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return kor;

	}
	
	

	public static void main(String[] args) {

		ArrayList<Osoba> korisniciChata;
		korisniciChata = listaKorisnika("resource/got_meta_data.txt");
		
		ArrayList<Poruka> por = new ArrayList<Poruka>();
		
		
		for (Osoba o : korisniciChata) {
			System.out.println("======================================");
			System.out.println("Ime : " + o.ime() + "\nPripadnost : " + o.kuca + "\nChat fajl : " + o.fajlporuka());
			System.out.println("======================================");
			System.out.println("\n");
		}
		
		String s = "Daenerys Stormborn";
	
		System.out.println("Poruke koje je Daenerys Stormborn poslala : \n");
		
	
		
			for(Osoba o : korisniciChata) {
				por.add(new Poruka(o.ime(), o.kuca(), o.fajlporuka(), o.fajlporuka()));
			}
			
			for (Poruka p : por) {
				if (s.equalsIgnoreCase(p.ime())) {
					System.out.println(p.poruka());
				}
			}
			
			for(Poruka p : por) {
				String s1 = p.fajlporuka();
				int i = p.brojPoruka(s1);
				System.out.println("Korisnik : "+p.ime()+" -> "+i+" poruka.");
				
				int sr = p.izbrojiSrecan(s1);
				p.postaviSrecan(sr);
				int t = p.izbrojiTuzan(s1);
				p.postaviTuzan(t);
				int z = p.izbrojiZaljubljen(s1);
				p.postaviZaljubljen(z);
			}
			int najsrecniji = 0;
			int najtuzniji = 0;
			String najSrecnijiIme = null;
			String najTuznijiIme = null;
			for(Osoba o : korisniciChata) {
				System.out.println(o.ime()+" : "+o.srecan());
				int tempsr = o.srecan();
				int temptu = o.tuzan();
				String tSrecan = o.ime();
				String tTuzan = o.ime();
				if(tempsr > najsrecniji) {
					najsrecniji = tempsr;
					najSrecnijiIme = tSrecan;
				}
				if(temptu > najtuzniji) {
					najtuzniji = temptu;
					najTuznijiIme = tTuzan;
				}
			}
			System.out.println("\n\nNajsrecnija osoba : "+najSrecnijiIme+"\nNajtuznija osoba : "+najTuznijiIme);
			
			
		
	}

}
