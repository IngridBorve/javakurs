package no.itfakultetet.java;

import java.util.Map;

public class App {

	public static void main(String[] args) {

		
 // Sjekk at det gis ett argument til programmet eller opplys om bruken
        
        if (args.length != 1) {
            System.out.println("Bruk: java -Jar ord.jar <tekstfil>");
            System.exit(0);
        }
		
        String filnavn = args[0]; 

        Ord ord = new Ord();
        ord.setFil(filnavn);
        
     // Les inn filen fra argumentet til programmet og gi en melding om at vi behandler filen
        System.out.println("Behandler " + ord.getFil());
        
        // start en tidtaker
        Long start = System.currentTimeMillis();
        
        //sett private variabler
        ord.setFil1("alfabetisk_" + filnavn); //fil1 er navnet på filen som skal være alfabetisk sortert
        ord.setFil2("antall_" + filnavn); //fil2 er navnet på filen som skal være sortert etter antall forekomster
        
        
        // Lag to Maps hvor vi kan mellomlagre ordene i tekstfilen vi leser inn 
        Map<String, Integer> tre = ord.lesFil(ord.getFil());
        Map<String, Integer> sortert = ord.sorterFil(tre);
        
        ord.skrivfil(ord.getFil1(), tre);
        ord.skrivfil(ord.getFil2(), sortert);
      
        Long stop = System.currentTimeMillis();
        Double tid = (stop-start)/1000.0;
        
        System.out.println("Filene "+ord.getFil1()+" og "+ord.getFil2()+" ble skrevet på "+tid+" sekunder");
        
	} //end main

}
