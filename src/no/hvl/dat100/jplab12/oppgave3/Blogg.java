package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.oppgave1.Innlegg;
import no.hvl.dat100.jplab12.oppgave2.Tekst;

import java.util.ArrayList;

public class Blogg {

	private Innlegg[] samling;
	private int antall; // antall lagrede innlegg i samling

	public Blogg() {
		this(20);
	}

	public Blogg(int lengde) {
		samling = new Innlegg[lengde];
	}

	public int getAntall() {
		return antall;
	}

	public Innlegg[] getSamling() {
		return samling;
	}

	public int finnInnlegg(Innlegg innlegg) {

		for (int i = 0; i < antall; i++) {
			if (samling[i].erLik(innlegg)) {
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		return finnInnlegg(innlegg) != -1;
	}

	public boolean ledigPlass() {
		return antall < samling.length;
	}
	
	public boolean leggTil(Innlegg innlegg) {

		if (!ledigPlass()) utvid();
		if (finnes(innlegg)) return false;
		samling[antall] = innlegg;
		antall++;
		return true;
	}
	
	public String toString() {
		var sb = new StringBuilder(Integer.toString(antall)).append("\n");
		for (Innlegg innlegg : samling) {
			if (innlegg == null) break;
			sb.append(innlegg.toString());
		}
		return sb.toString();
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		var samling = new Innlegg[this.samling.length * 2];
		for (int i = 0; i < this.samling.length; i++) { // kan bruke System.arraycopy() her
			samling[i] = this.samling[i];
		}
		this.samling = samling;
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {
		return leggTil(innlegg);
	}
	
	public boolean slett(Innlegg innlegg) { // sletter slik at det ikke blir hull i arrayen

		int inn = finnInnlegg(innlegg);
		if (inn == -1) return false;
		antall--;
		samling[inn] = samling[antall];
		samling[antall] = null;
		return true;
	}
	
	public int[] search(String keyword) {
		var result = new ArrayList<Integer>();
		for (Innlegg innlegg: samling) {
			if (!(innlegg instanceof Tekst)) continue;
			if (((Tekst) innlegg).getTekst().toLowerCase().contains(keyword.toLowerCase())) {
				result.add(innlegg.getId());
			}
		}

		var ids = new int[result.size()];
		for (int i = 0; i < ids.length; i++) {
			ids[i] = result.get(i);
		}
		return ids;
	}
}