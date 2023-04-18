package aleksandar.stiegler;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PrimerOsam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("#.##");
		System.out.println("Unesite vrednost za x ");
		double x = input.nextDouble();
		System.out.println("Unesite vrednost za y ");
		double y = input.nextDouble();
		System.out.println("Unesite vrednost za z ");
		double z = input.nextDouble();
		
		System.out.println("Rezultat funkcije f = " + df.format( (x+y)*(x+z)*Math.sin(x)/(2*x-y)));
		
		

	}

}
