package Vektor;

import java.util.Vector;

public class Vektor {

	public static void main(String[] args) {
		
		/*
		 * Vektori su dinamicki nizovi kao i liste. Kao i kod lista elementima
		 * vektora mozemo pristupiti preko indeksa. Vektori koriste iste metode
		 * kao i liste i takodje mogu koristiti listIterator kao i Iterator
		 * Vektori koriste Fail-Fast Iteratore sto znaci da ce da prekine sto je 
		 * brze moguce deo koda koji utice na ceo program. Najcesce se koriste
		 * kod niti.
		 */
		
		int n []= {12,33,21,56,134,213,111};
		Vector<Integer> vekt = new Vector<Integer>();
		
		for(int i : n) {
			vekt.add(i);
		}
		
		for(int k : vekt) {
			System.out.print(k + "  ");
		}
		System.out.println();
		
		vekt.remove(3);
		for(int k : vekt) {
			System.out.print(k + "  ");
		}
		System.out.println();
		
		vekt.add(3,999);
		vekt.set(2, 666);

		for(int k : vekt) {
			System.out.print(k + "  ");
		}
		System.out.println();
		
		System.out.println("Trenutna duzina vektora "+vekt.size());
	
	
	// Radio sam niz u liste ali nisam obrnuto pa ajde i to da uradimo
	
	int niz[] = new int[vekt.size()];
	
	for(int i = 0; i < vekt.size(); i++) {
		niz[i] = vekt.get(i);
	}
	
	System.out.println("Kapacitet vektora "+vekt.capacity());
	/*
	 * capacity() metoda nam prikazuje kapacitet vektora po osnovnim postavkama
	 * ili default vrednosti to je 10 glavna razlika u odnosu na size je u tome
	 * sto size() pokazuje broj elemenata u nizu a kapacitet i prazna mesta 
	 * u koliko ih ima , sad cu da dodam par elemenata da premasimo kapacitet
	 * pa da vidimo sta se desava
	 */
	vekt.add(155);
	vekt.add(0120);
	vekt.add(16);
	vekt.add(5);
	vekt.add(10);
	
	System.out.println("Trenutna duzina vektora je "+vekt.size()+
			" , dok je kapacitet vektora "+vekt.capacity());
	// Dakle mozemo da primetimo da je kapacitet razlicit od size
	// Ako sam dobro razumeo ukoliko ne definisemo koliko ce povecanje vektora biti
	// on ce u svakom prelasku granice (prelivanju) da se duplira pa ajde da vidim
	// da li sam dobro razumeo
	
	for (int i = 0; i < 15; i++ ) {
		vekt.add(i);
	}
	
	System.out.println("Trenutna duzina vektora je "+vekt.size()+
			" , dok je kapacitet vektora "+vekt.capacity());
	// Dakle duplira se kapacitet , prvo nam je bio 10 pa 20 pa 40
	System.out.println("Elementi niza : ");
	for(int i = 0; i < niz.length; i++) {
		System.out.print(niz[i]+ "  ");
	}
	System.out.println();
	vekt.clear();
	
	}
}
