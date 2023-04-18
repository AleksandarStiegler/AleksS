package aleksandar.stiegler;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Primer13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  DecimalFormat df = new DecimalFormat("#.##");
  Scanner input = new Scanner(System.in);
  
  System.out.println("Unesite vrednost u incima");
  double x = input.nextDouble();
  
  double d ;
  
  d = x * 2.54;
  // Stampanje rezultata
  
  System.out.println("Vrednost u centimetrima je "+d);
	}

}
