package praksa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Poruka extends Osoba {

	String message;

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

	}

	public int izbrojiSrecan(String p) {
		List<String> srecan = new ArrayList<String>();
		File f = new File("resource/message_logs/" + p);

		int k = 0;
		Pattern pat = Pattern.compile("\\🙂|\\😄|\\|😍");
		try {
			BufferedReader bfr = new BufferedReader(new FileReader(f));
			String l;

			while ((l = bfr.readLine()) != null) {
				srecan.add(l);
			}
			for (String s : srecan) {
				Matcher mat = pat.matcher(s);
				if (mat.find()) {
					k++;
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return k;

	}
	
	public int izbrojiTuzan(String p) {
		List<String> srecan = new ArrayList<String>();
		File f = new File("resource/message_logs/" + p);

		int k = 0;
		Pattern pat = Pattern.compile("\\🤬|\\👿|\\|😢|\\😞");
		try {
			BufferedReader bfr = new BufferedReader(new FileReader(f));
			String l;

			while ((l = bfr.readLine()) != null) {
				srecan.add(l);
			}
			for (String s : srecan) {
				Matcher mat = pat.matcher(s);
				if (mat.find()) {
					k++;
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return k;

	}
	public int izbrojiZaljubljen(String p) {
		List<String> srecan = new ArrayList<String>();
		File f = new File("resource/message_logs/" + p);

		int k = 0;
		Pattern pat = Pattern.compile("\\|😘\\|😍");
		try {
			BufferedReader bfr = new BufferedReader(new FileReader(f));
			String l;

			while ((l = bfr.readLine()) != null) {
				srecan.add(l);
			}
			for (String s : srecan) {
				Matcher mat = pat.matcher(s);
				if (mat.find()) {
					k++;
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return k;

	}

	public int brojPoruka(String s) {
		int k = 0;
		try {
			BufferedReader bfr = new BufferedReader(new FileReader("resource/message_logs/" + s));
			String l;
			while ((l = bfr.readLine()) != null) {
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

}
