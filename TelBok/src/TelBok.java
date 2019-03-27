import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class TelBok {

	public static void main(String[] args) { // i eksempelet, kaster feilmelding

		String navn = "", nummer;

		Properties bok = new Properties();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Alternative method: Scanner sc = new Scanner(System.in);

		try {
			FileInputStream fil = new FileInputStream("telefonbok.dat");
			bok.loadFromXML(fil);
		} catch (Exception e) {
			// do nothing
		}

		do {

			try {
				System.out.println("Legg inn navn:");
				// navn = sc.netxtLine();
				navn = br.readLine();
				if (navn.equals("q"))
					continue;
				System.out.println("Legg inn telefonnummer:");
				// nummer = sc.netxtLine();
				nummer = br.readLine();
				bok.put(navn, nummer);
			} catch (Exception e) {

			}
		} while (!navn.equals("q"));

		FileOutputStream utfil;

		try {
			utfil = new FileOutputStream("telefonbok.dat");
			bok.storeToXML(utfil, "Telefonbok", "utf8");
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
