package no.hvl.dat100.jplab12.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import no.hvl.dat100.jplab12.oppgave2.Bilde;
import no.hvl.dat100.jplab12.oppgave2.Tekst;
import no.hvl.dat100.jplab12.oppgave3.Blogg;
import no.hvl.dat100.jplab12.oppgave5.LesBlogg;

public class TestLesBlogg {

	private static String FILNAVN = "bloggkorrect.dat";
	
	@Test
	public void testles() {
		
		Blogg samling = LesBlogg.les(FILNAVN);

		Tekst innlegg1 = new Tekst(1,"Ole Olsen","23-10-2019","en tekst");
		Bilde innlegg2 = new Bilde(2,"Oline Olsen","24-10-2019","et bilde","http://www.picture.com/oo.jpg");
		
		assertEquals(samling.getAntall(),2);
		assertTrue(samling.finnes(innlegg1));
		assertTrue(samling.finnes(innlegg2));
		
		System.out.println(samling.toString());
	}
	
}
