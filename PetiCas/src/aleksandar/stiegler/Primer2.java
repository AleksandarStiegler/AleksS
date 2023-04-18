package aleksandar.stiegler;

import java.util.Scanner;

public class Primer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// napisati program kojim se za unete vrednosti a i b 
		// izracunava prema formuli
		// y=5+max(a na 2, be na 2)
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite vrednost za a ");
		double a = input.nextDouble();
		System.out.println("Unesite vrednost za b ");
		double b = input.nextDouble();
		
		System.out.println("y = "+ (5+ Math.max(a*a,b*b)));
		
		
	}

}
