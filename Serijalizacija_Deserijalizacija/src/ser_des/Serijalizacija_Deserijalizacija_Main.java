package ser_des;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class Serijalizacija_Deserijalizacija_Main {

	public static void main(String[] args) throws Exception{
		
		/* Serijalizacija i deserijalizacija nekog objekta nam omogucava
		 * da sacuvamo stanje tog programa nakon sto izadjemo iz njega i onda 
		 * ga mogli naknadno pozvati.
		 * Serijalizacija - cuva stanje objekta i pretvara ga u niz bajtova 
		 * kako bi mogli da ga sacuvamo u fajl ili posaljemo na neki racunar.
		 * Ovo shvatam kao save game , gde kad u igri kazemo save (sacuvaj) on
		 * pravi fajl koji cuva trenutno stanje naseg napretka u pomenutoj igri.
		 * Deserijalizacija - radi obrnuto ona vraca taj niz bajtova pomocu kojeg
		 * smo sacuvali stanje naseg objekta kako bismo mogli da nastavimo rad. 
		 * Ovo mozemo da posmatramo kao loading saved game , odnosno ucitavanje
		 * fajla kojim smo sacuvali napredak u igri i mozemo da nastavimo da se 
		 * igramo bez da smo primorani da krenemo od 0 tj ispocetka.
		 */
		
		Sabiranje sab = new Sabiranje(3,5);
		
		
		
		/* Napravio sam neku jednostavnu klasu cisto kao primer i napravili smo
		*  ovde instancu te klase. Sada da bismo mogli da sacuvamo ovo potreban 
		*  nam je Interfejs Serializable koji ubacujemo u klasu koja omogucava
		*  serijalizaciju ovog objekta u mom primeru to ce biti u klasi Sabiranje.
		*  Koristicemo FileOutput stream koji smo ranije koristili za kreiranje
		*  fajlova. Ono sto nisam pomenuo pre nije ni bilo potrebe je da se ovi 
		*  fajlovi cuvaju pod extenzijom .ser . Ovo je bilo bitno sad posto potrebno
		*  nam je da znamo kakav tip fajla cemo kreirati
		*/
		
		FileOutputStream fos = new FileOutputStream("sabiranje.ser");
		// Ovim smo samo napravili fajl gde cemo cuvati sada je potrebno i da 
		// ovaj objekat smestimo u taj fajl pa koristimo ObjectOutputStream
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(sab);
		
		oos.close();
		fos.close();
		// Cisto da imamo neki pregled gde smo
		System.out.println("Objekat je sacuvan!");
		/* Ono sto je bitno da napomenem, posto nisam pravio posebnu putanju 
		 * prilikom kreiranja fajla on ce po defaultu (podrazumevanom) biti 
		 * smesten u trenutnom projetku.
		 */

	}

}
