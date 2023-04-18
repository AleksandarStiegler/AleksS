package aleksandar.stiegler;
import java.io.*;
public class Primer9{
	public static void main(String[] args) throws Exception {
	// Deklarisanje podataka
	double x; boolean y;  
	BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));  
	// Unos podatka x
	System.out.print("Unesite vrednost za x: ");
	x = Double.parseDouble(ulaz.readLine());  
	// Izracunavanje vrednosti funkcije y
	y = Math.sqrt((2 + x - Math.pow(x, 3)) / (x + 2)) > 0 || Math.exp(x) < x - 1 && Math.sqrt(x - 1) <= 0; 
	// Stampanje rezultata
	System.out.println("Vrednost funkcije y je " + y); } }
