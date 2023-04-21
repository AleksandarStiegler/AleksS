package ser_des;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializacija_Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		/*
		 * Za razliku od Serializacije ovde ne pravimo novi objekat nego ga samo
		 * deklarisemo posto je cilj da ovde iskoristimo objekat koji smo vec 
		 * napravili u prethodnom projektu.
		 */
		
		Sabiranje sab = null;
		
		/* 
		 * Potrebno nam je da uvedemo klase koje ce da nam pretvore objekat koji 
		 * je trenutno gomila bajtova u identican objekat koji smo prethodno 
		 * napravili tj. da ga vrati u prvobitno stanje. Za to koristimo 
		 * FileInputStream i kako smo tamo imali ObjectOutputStream ovde imamo
		 * logicno suprotno odnosno ObjectInputStream kako bi povezali fajl i 
		 * klasu
		 */
		FileInputStream fis = new FileInputStream("C:\\Users\\LostTale\\Desktop\\Java\\Praksa\\Serijalizacija_Deserijalizacija\\sabiranje.ser");
		/* Ovde moramo da unesemo tacnu putanju do fajla koji smo sacuvali
		*  kako bismo mogli da izvucemo podatke. Ono sto sam primetio ako prvo 
		*  prekopiramo putanju a nestavimo pod navodnike prijavljivace nam gresku
		*  posto se \ koriste za razne "prelaske" \n > novi red \t > sledeci tab
		*  itd. Da bi to izbegli treba svugde gde imamo jednu \ da dodamo jos 
		*  jednu \ tako da bi to izgledalo ovako \\ ili laksi nacin 
		*  odmah unutar zagrada staviti navodnike i kad ubacimo kopiranu putanju
		*  Eclipse editor odmah stavlja duple \\
		*/
		
		ObjectInputStream objIS = new ObjectInputStream(fis);
		
		/* Sad kad smo povezali vreme je da nas deklarisani objekat dobije svoje
		 * ime . I onda treba da castujemo u tip podataka koji smo koristili.
		 */
		
		sab = (Sabiranje) objIS.readObject();
		// i da zatvorimo streamove
		objIS.close();
		fis.close();
		
		sab.Ispisi();
		
		/* 
		 * VEOMA BITNO !!! Paketi u ova 2 projekta su mi imali razlicita imena
		 * program nije hteo da radi posto nije mogao da nadje paket sa imenom
		 * iz prvog projekta i nije mogao da realizuje taj sacuvani objekat.
		 * Cim sam ime paketa promenio i nazvao ga isto kao i u prethodnom 
		 * projektu sve je proradilo
		 */

	}

}
