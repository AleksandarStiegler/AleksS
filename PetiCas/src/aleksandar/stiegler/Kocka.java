package aleksandar.stiegler;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kocka {
	public static void main(String[] args) throws Exception {
	/*	BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));  
		// Unos podatka a
		double a;
		System.out.print("Unesite vrednost za a: ");
		a = Double.parseDouble(ulaz.readLine());  
		double P,V;
		
		System.out.println(" Povrsina kocke P = "+ 6*a*a);
		System.out.println(" Zapremina kocke V = "+ a*a*a);
		iskopiracu profesorovo resenje da imam oba
		*/
		
		// a - stranica kocke // p - površina kocke // v - zapremina kocke 
		double a, p, v;  
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in)); 
		// Unos stranice kocke 
		System.out.print("Unesite stranicu kocke a: ");
		a = Double.parseDouble(ulaz.readLine()); 
		// Izračunavanje površine i zapremine kocke 
		p = 6 * a * a;
		v = Math.pow(a, 3);  
		// Štampanje vrednosti površine i zapremine kocke
		System.out.println("Za unetu stranicu kocke a = " + a + " izračunata površina je " + p + " a zapremina " + v);
		
		
}
}
