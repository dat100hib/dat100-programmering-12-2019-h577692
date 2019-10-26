package no.hvl.dat100.jplab12.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import no.hvl.dat100.jplab12.oppgave2.Bilde;
import no.hvl.dat100.jplab12.oppgave2.Tekst;

import no.hvl.dat100.jplab12.oppgave4.*;
import no.hvl.dat100.jplab12.oppgave3.*;

public class TestSkrivBlogg {

	private static String FILNAVN = "blogg.dat";
	
	@Test
	public void testskriv() {
		
		Tekst innlegg1 = new Tekst(1,"Ole Olsen","23-10-2019","en tekst");
		Bilde innlegg2 = new Bilde(2,"Oline Olsen","24-10-2019","et bilde","http://www.picture.com/oo.jpg");
		
		Blogg samling = new Blogg();
		
		samling.leggTil(innlegg1);
		samling.leggTil(innlegg2);
		
		assertTrue(SkrivBlogg.skriv(samling, FILNAVN));
	}	
}
