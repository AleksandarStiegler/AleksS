package praksa;

public class Osoba {
	
	// Deklarisanje atributa i brojaca
	String name;
	String kuca;
	String fajlporuka;
	int srecan, tuzan, zaljubljen;
	
	// Pravimo konstruktor za osobu ideja je da unutar njega cuvamo podatke o 
	// trenutnom stanju psihe
	Osoba(String n, String k, String p){
		this.name = n;
		this.kuca = k;
		this.fajlporuka = p;
		srecan = 0;
		tuzan = 0;
		zaljubljen = 0;
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
	
	public int srecan() {
		return srecan;
	}
	
	public int tuzan() {
		return tuzan;
	}
	
	public int zaljubljen() {
		return zaljubljen;
	}
	
	public void postaviSrecan(int n) {
		this.srecan = n;
	}
	public void postaviTuzan(int n) {
		this.srecan = n;
	}
	public void postaviZaljubljen(int n) {
		this.srecan = n;
	}
	
	

}
