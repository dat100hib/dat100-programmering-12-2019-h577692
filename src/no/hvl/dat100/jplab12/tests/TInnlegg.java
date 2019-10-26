package no.hvl.dat100.jplab12.tests;

import no.hvl.dat100.jplab12.oppgave1.Innlegg;

public class TInnlegg extends Innlegg {
	
	public TInnlegg(int id, String bruker, String dato) {
		super(id, bruker,dato);
	}

	public TInnlegg(int id, String bruker, String dato, int likes) {
		super(id, bruker,dato,likes);
	}

}
