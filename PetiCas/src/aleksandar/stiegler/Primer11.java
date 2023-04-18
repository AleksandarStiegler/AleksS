package aleksandar.stiegler;

import java.util.Scanner;

public class Primer11 {
	public static void main(String[] args) throws Exception {
		
		Scanner input = new Scanner(System.in);
		// a,b,c stranice trouglova
		// s - poluobim trougla
		// P - povrsina trougla
		// R - poluprecnik opisanog kruga
		// r - poluprecnik upisanog kruga
		// d - rastojanje izmedju centra opisanog i upisanog kruga
		System.out.println("Unesite vrednost za stranicu a ");
		double a = input.nextDouble();
		System.out.println("Unesite vrednost za stranicu b ");
		double b = input.nextDouble();
		System.out.println("Unesite vrednost za stranicu c ");
		double c = input.nextDouble();
		double s , P , R , r, d;
		s = (a+b+c)/2;
		P = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		R = a*b*c/(4*P);
		r = (a*b*c)/(2*R*s);
		d = Math.sqrt(R*(R-2*r));
		
		//Stampanje rezultata
		System.out.print("R = " +R +"\nr = " + r +"\nP = " +P +"\nR = " + R +"\nr = " +r +"\nd = " + d  );
		
		// lepse bi bilo da sam formatirao ali sad je gotovo
				
		
		
		
	}

}
