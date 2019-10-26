package no.hvl.dat100.jplab12.oppgave1;

import no.hvl.dat100.jplab12.common.TODO;

public abstract class Innlegg {

	private int id;
	private String bruker;
	private String dato;
	private int likes;


	public Innlegg(int id, String bruker, String dato) {
		this(id, bruker, dato, 0);
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
	}

	public int getId() {
		return id;
	}

	public String getBruker() {
		return bruker;
	}

	public String getDato() {
		return dato;
	}

	public int getLikes() {
		return likes;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public void doLike () {

		likes += 1;
	}
	
	public boolean erLik(Innlegg innlegg) {

		return id == innlegg.id;
	}
	
	@Override
	public String toString() {
		
		return id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
