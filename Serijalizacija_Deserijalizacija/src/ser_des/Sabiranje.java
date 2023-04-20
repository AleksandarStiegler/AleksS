package ser_des;

import java.io.Serializable;

public class Sabiranje implements Serializable{
	
	/*
	 * Kako bismo koristili Serializable interfejs potrebno je imprementirati ga
	 * u klasi i treba uvesti ( importovati ) java.io.Serializable
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

}
