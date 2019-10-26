package no.hvl.dat100.jplab12.oppgave4;

import no.hvl.dat100.jplab12.oppgave3.Blogg;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SkrivBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab12/tests/";

	public static boolean skriv(Blogg blogg, String filnavn) {

		try {
			var writer = new PrintWriter(MAPPE + filnavn);
			writer.println(blogg.toString());
			writer.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			return false;
		}

		return true;
	}


}
