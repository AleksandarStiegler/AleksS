package aleksandar.stiegler;

public class PrimerSedam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//a) j= 3 + --i, je isto kao i i=i-1; j=3+i rezultat i = 2 j = 5
		
		int i = 3, j = 4; 
		System.out.println("i = " + i + " j = " + j);
		j = 3 + --i; // j = 3 + (i - 1) umanji i pa izračunaj 
		System.out.println("i = " + i + " j = " + j); 

		
		
		// Posto sam ga samo roknuo ovde koristimo promenjene vrednosti pa je 
		// razlicit rezultat ukoliko bi otvorio novu klasu radilo bi kako treba
		// i rezultat bi bio i=2 j = 5 valjda moracu da proverim kad budem slusao
		// ponovo i vezbao
		System.out.println("i = " + i + " j = " + j); 
		j = 3 + i--; // j = 3 + i pa -1 tj izracunaj pa oduzmi 1
		System.out.println("i = " + i + " j = " + j); 
		// Moracu da proverim ovo ponovo, razumem ali kao kroz maglu tu je negde na 
		// ivici pa da pogledam jos jednom i razgrnem sve sto je nejasno
		
		
	}

}
