package no.hvl.dat100.jplab12.tests;

import no.hvl.dat100.jplab12.oppgave2.Bilde;
import no.hvl.dat100.jplab12.oppgave2.Tekst;
import no.hvl.dat100.jplab12.oppgave4.SkrivBlogg;
import no.hvl.dat100.jplab12.oppgave6.HtmlBlogg;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

class TestHtmlBlogg {

private static String FILNAVN = "blogg.html";
	
	@Test
	public void testskriv() {
		
		Tekst innlegg1 = new Tekst(1,"Ole Olsen","23-10-2019","DAT100 oppgave 6");
		Bilde innlegg2 = new Bilde(2,"Oline Olsen","24-10-2019","HVL logo","https://www.west-norway.no/wp-content/uploads/2018/05/HVL-nettside.jpg");
		
		HtmlBlogg samling = new HtmlBlogg();
		
		samling.leggTil(innlegg1);
		samling.leggTil(innlegg2);
		
		assertTrue(SkrivBlogg.skriv(samling, FILNAVN));
	}	
}
