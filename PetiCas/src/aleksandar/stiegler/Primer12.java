package aleksandar.stiegler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Primer12 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		// n - trocifren broj
		// s - cifra stotice
		// d - cifra desetice 
		// j - cifra jedinice 
		// zbir - zbir cifara trocifrenog broja
		int n, s, d, j, zbir; 
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		// Unos trocifrenog broja 
		System.out.print("Unesite trocifren broj n: ");
		n = Integer.parseInt(ulaz.readLine()); 
		// Nalazenje cifara trocifrenog broja 
		s = n / 100; 
		d = (n - s * 100) / 10;
		j = n - s * 100 - d * 10;  
		// Izracunavanje zbira cifara trocifrenog broja 
		zbir = s + d + j; 
		// Stampanje rezultata 
		System.out.println("Zbir cifara trocifrenog broja " + n + " je " + zbir);

		// s = n / 100
		// d = (n % 100) / 10
		// j = n % 10
	}

}
