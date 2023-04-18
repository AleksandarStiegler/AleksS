package aleksandar.stiegler;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ZadatakZaVezbu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("#.###");
  System.out.println("Unesite vrednost za x");
  double x = input.nextDouble();
  double y;
  y = Math.sqrt((Math.exp(x/2)+1.2*Math.sin(2*x))/(3.3*Math.cos(x)+7.1*Math.exp(x)));
  System.out.println("Vrednost izraza y = " + df.format(y));
	
  
	}
}
