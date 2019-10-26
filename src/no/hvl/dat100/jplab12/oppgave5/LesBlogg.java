package no.hvl.dat100.jplab12.oppgave5;

import no.hvl.dat100.jplab12.oppgave2.Bilde;
import no.hvl.dat100.jplab12.oppgave2.Tekst;
import no.hvl.dat100.jplab12.oppgave3.Blogg;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LesBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab12/tests/";

	private static String BILDE = "BILDE";

	public static Blogg les(String filnavn) {

		var file = new File(MAPPE + filnavn);
		Blogg blogg = null;

		try {
			var leser = new Scanner(file);
			int antall = Integer.parseInt(leser.nextLine());
			blogg = new Blogg(antall);

			String type;
			int id;
			String bruker;
			String dato;
			int likes;
			String tekst;
			String url;

			int i = 0;
			do {
				type = leser.nextLine();
				id = Integer.parseInt(leser.nextLine());
				bruker = leser.nextLine();
				dato = leser.nextLine();
				likes = Integer.parseInt(leser.nextLine());
				tekst = leser.nextLine();

				if (type.equals(BILDE)) {
					url = leser.nextLine();
					blogg.leggTil(new Bilde(id, bruker, dato, likes, tekst, url));
				} else {
					blogg.leggTil(new Tekst(id, bruker, dato, likes, tekst));
				}
				i++;
			} while (i < antall);

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

		return blogg;

	}
}
