package no.hvl.dat100.jplab12.tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestInnlegg {

	@Test
	public void testConstructor1() {
		TInnlegg innlegg = new TInnlegg(1,"Ole Olsen","23-10-2019");
		
		assertEquals("Ole Olsen",innlegg.getBruker());
		assertEquals(1,innlegg.getId());
		assertEquals(0,innlegg.getLikes());	
		assertEquals("23-10-2019",innlegg.getDato()); 
	}

	@Test
	public void testConstructor2() {
		TInnlegg innlegg = new TInnlegg(1,"Ole Olsen","23-10-2019",7);
		
		assertEquals("Ole Olsen",innlegg.getBruker());
		assertEquals(1,innlegg.getId());
		assertEquals(7,innlegg.getLikes());	
		assertEquals("23-10-2019",innlegg.getDato()); 
	}
	
	@Test
	public void testSet() {
		
		TInnlegg innlegg = new TInnlegg(1,"Ole Olsen","23-10-2019",7);

		innlegg.setBruker("Oline Olsen");
		innlegg.setDato("24-10-2019");
		
		assertEquals("Oline Olsen",innlegg.getBruker());
		assertEquals("24-10-2019",innlegg.getDato());
	}
	
	@Test
	public void testdoLike() {
		
		TInnlegg innlegg = new TInnlegg(1,"Ole Olsen","23-10-2019");

		assertEquals(0,innlegg.getLikes());	

		innlegg.doLike();

		assertEquals(1,innlegg.getLikes());	

	}
	
	
	@Test
	public void testLik() {
	
		TInnlegg innlegg1 = new TInnlegg(1,"Ole Olsen","23-10-2019");
		TInnlegg innlegg2 = new TInnlegg(2,"Oline Olsen","24-10-2019");
	
		assertFalse(innlegg1.erLik(innlegg2));
		assertTrue(innlegg1.erLik(innlegg1));
	}
	
	@Test
	public void testtoString () {
		
		TInnlegg innlegg = new TInnlegg(1,"Ole Olsen","23-10-2019");

		assertEquals("1\nOle Olsen\n23-10-2019\n0\n",innlegg.toString());

	}
}
