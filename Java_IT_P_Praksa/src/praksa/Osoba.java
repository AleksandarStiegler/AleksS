package praksa;

public class Osoba {
	
	// Deklarisanje atributa i brojaca
	String name;
	String kuca;
	String fajlporuka;
	
	
	// Pravimo konstruktor za osobu ideja je da unutar njega cuvamo podatke o 
	// trenutnom stanju psihe
	Osoba(String n, String k, String p){
		this.name = n;
		this.kuca = k;
		this.fajlporuka = p;
		
	}
	
	// Metode za vracanje zeljenih informacija
	public String ime() {
		return name;
	}
	
	public String kuca() {
		return kuca;
	}
	public String fajlporuka() {
		return fajlporuka;
	}
	
	
	
	

}
