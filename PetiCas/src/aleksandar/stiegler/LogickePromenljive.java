package aleksandar.stiegler;

import java.util.Scanner;

public class LogickePromenljive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner input = new Scanner(System.in); 
		 System.out.print("Unesite vrednost za x: ");
		 boolean x = input.nextBoolean(); 
		 System.out.print("Unesite vrednost za y: "); 
		 boolean y = input.nextBoolean(); 
		 boolean z = !(x & y) | x & y;
		 System.out.println("y = " + z);
		 // uff prioriteti 
		 // prioritet je zagrada 
		 // Tautologija   za & samo ako su oba tacna izraz je tacan u suprotnom je netacan
		 // za | ( ili ) samo ako su oba netacna izraz je netacan u suprotnom je tacan
		 //  baciti pogled na tautologiju
		 
		
		
	}

}
