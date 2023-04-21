package ser_des;

import java.io.Serializable;

public class Sabiranje implements Serializable{
	
	/*
	 * Kao i kod serializacije za deserializaciju nam je potrebno da klasa i
	 * implementira Serializable interfejs inace dzabe sve. Takodje je potrebno
	 * da nam ove klase u projektima za Serializaciju i Deserializaciju budu 
	 * identicni.
	 */
	
	int a;
	int b;
	
	Sabiranje(){
		a = 1;
		b = 1;
	}
	Sabiranje(int aa, int bb){
		this.a = aa;
		this.b = bb;
	}
	
	public void Ispisi() {
		System.out.println("Zbir elemenata a = "+a+" i b = "+b+" iznosi = "+(a+b));
				
	}
	/*
	 * Staticka polja se ne serializuju posto ona pripadaju klasi a ne objektu
	 * Definicija klase se ne cuva prilikom serializacije tako da prilikom
	 * deserializacije potrebno je castovati u trazeni tip podataka za taj objekat
	 * serialVersionUID VEOMA VAZNO!! - jedinstveni ID ( indentifikacioni broj kao
	 * jmbg za nas) od 64 bita koji sluzi da se koristi pravi deserializer za 
	 * prethodno odradjenu serializaciju. 
	 * Sta to zapravo znaci - generalno ako se oba broja ne poklope iskocice nam
	 * greska koja ce da nam ispise serialVersionUID za serializer koji je koriscen
	 * i deserializator koji smo probali da iskoristimo. Dakle videcemo oba broja
	 * i znacemo da smo koristili pogresan, pa na osnovo njega mozemo da nadjemo
	 * koji zapravo deserializator (koju klasu u nekom projektu ) bi trebali da 
	 * koristimo. 
	 * U ovomo ilustrativnom primeru je to malo teze prikazati pa sam zato malo 
	 * opsirnije pisao kako sam shvatio, ali je u principu ovo zaista bitno.
	 * Zamislite da imate vise projekata koji koriste serializaciju i deserializaciju,
	 * posto smo rekli da se taj napravljen fajl moze deliti kako izmedju racunara
	 * tako i putem interneta bilo bi zaista tesko da zapamtimo tacno koj fajl bi 
	 * trebali gde da ucitamo. E u ovakvim slucajevima je serialVersionUID fantastican
	 * ako pogresimo gde smo ubacili fajl tacno cemo dobiti jedinstven broj koji samo
	 * trebamo poklopiti sa brojem u pravoj klasi i eto nam naseg objekta nazad.
	 * Da se vratim na analogiju saved game koji sam vec koristio. Ako bismo probali
	 * da recimo save iz Dragon Age-a ucitamo u Mass Effect - u ne bismo dobili nista
	 * posto to nije ista igra. Nikad nisam probao tako nesto ali najverovatnije ili
	 * ne bismo uopste videli taj save game u loading opcijama ili bismo ga videli i 
	 * kad bismo probali da ga pokrenemo igra bi ili pukla pokusavajuci da pokrene 
	 * nesto sto nije za nju ili bi iskocilo upozorenje da to nije moguce uraditi 
	 * posto nije odgovarajuci save ili nesto slicno.
	 */

}
