package praksa;

import java.io.BufferedReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Poruka extends Osoba {

	String message;
	int srecan, tuzan, zaljubljen;
	public String poruka() {
		return message;
	}

	public String loadMessages(String fileName) {
		String k = "";
		StringBuilder strBuild = new StringBuilder();
		File file = new File("resource/message_logs/" + fileName);

		try {
			BufferedReader buffer = new BufferedReader(new FileReader(file));
			String aLine;
			buffer.readLine();
			while ((aLine = buffer.readLine()) != null) {
				strBuild.append(aLine);
				strBuild.append("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		k = strBuild.toString();
		return k;
	}

	Poruka(String n, String k, String p, String dopisivanje) {
		super(n, k, p);
		this.message = loadMessages(dopisivanje);
		srecan = 0;
		tuzan = 0;
		zaljubljen = 0;

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
		this.tuzan = n;
	}
	public void postaviZaljubljen(int n) {
		this.zaljubljen = n;
	}


	public int brojPoruka(String s) {
		int k = 0;
		try {
			BufferedReader b = new BufferedReader(new FileReader("resource/message_logs/" + s));
			String l;
			while ((l = b.readLine()) != null) {
				String niz[] = l.split(",");
				if (niz.length > 1) {
					k++;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return k;
	}
	public  int izbrojiSrecan(String string) {
		int sr = 0;
		File filesrecan = new File("resource/message_logs/"+string);
		Pattern patSrecan = Pattern.compile("\\😍|\\😄|\\🙂");
		String line;
		try {
			BufferedReader bfr = new BufferedReader(new FileReader(filesrecan));
			while((line = bfr.readLine()) != null) {
				Matcher matSrecan = patSrecan.matcher(line);
				if(matSrecan.find()) {
					sr++;
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return sr;
	}
	
	public int izbrojiTuzan(String string) {
		int tu = 0;
		File filetuzan = new File("resource/message_logs/"+string);
		Pattern patTuzan = Pattern.compile("\\😢|\\😭|\\👿|\\😞");
		String line;
		try {
			BufferedReader bfr = new BufferedReader(new FileReader(filetuzan));
			while((line = bfr.readLine()) != null) {
				Matcher matTuzan = patTuzan.matcher(line);
				if(matTuzan.find()) {
					tu++;
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return tu;
	}
	
	
	public int izbrojiZaljubljen(String string) {
		int zalj = 0;
		File filezaljubljen = new File("resource/message_logs/"+string);
		Pattern patZaljubljen = Pattern.compile("\\😍|\\😘");
		String line;
		try {
			BufferedReader bfr = new BufferedReader(new FileReader(filezaljubljen));
			while((line = bfr.readLine()) != null) {
				Matcher matZaljubljen = patZaljubljen.matcher(line);
				if(matZaljubljen.find()) {
					zalj++;
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return zalj;
	}
	
	

}
