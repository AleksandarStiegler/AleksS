package aleksandar.stiegler;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IndeksTelesneMase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("#.###");
		System.out.println("Unesite  visinu u metrima ");
		double h = input.nextDouble();
		System.out.println("Unesite masu u kilogramima ");
		double m = input.nextDouble();
		
		System.out.println("Indeks telesne mase BMI je "+ df.format( m / (h*h)) );
		
	}

}
