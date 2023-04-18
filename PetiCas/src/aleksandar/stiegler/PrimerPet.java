package aleksandar.stiegler;

import java.util.Scanner;

public class PrimerPet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Napisati program kojim se logickoj promenljivoj  dodelju vrednost true
		// ako se od odsecaka sa duzinama x,y,z moze konstruisati trougao
		// resenje da bi se konstruisao trougao zbir 2 stranice mora biti veci od ostale stranice
		// p = (x+y?>z) && (x+z>y) && (z+y>x)
		
		 Scanner input = new Scanner(System.in);
		 
		 System.out.print("Unesite stranicu trougla x: "); 
		 int x = input.nextInt(); 
		 System.out.print("Unesite stranicu trougla y: "); 
		 int y = input.nextInt(); 
		 System.out.print("Unesite stranicu trougla z: "); 
		 int z = input.nextInt(); 
		 boolean p = (x + y > z) && (x + z > y) && (y + z > x); 
		 
		 System.out.println("p = " + p);
		

	}

}
