package aleksandar.stiegler;

import java.util.Scanner;

public class Primer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite vrednost za a ");
		double a = input.nextDouble();
		System.out.println("Unesite vrednost za b ");
		double b = input.nextDouble();
		System.out.println("y = " + (1-Math.min(a, b))/(1+Math.max(a, b)));

	}

}
