package no.hvl.dat100.jplab12.oppgave6;

import no.hvl.dat100.jplab12.oppgave1.Innlegg;
import no.hvl.dat100.jplab12.oppgave3.Blogg;

public class HtmlBlogg extends Blogg {

	public HtmlBlogg() {
		super();
	}
	
	private static String HTMLPREFIX = 
			"<!DOCTYPE html>\n<html lang=\"en\">\n\t<head>\n\t\t<title>DAT100 Blogg</title>\n\t</head>\n\t<body>\n";
	
	private static String HTMLPOSTFIX = 
			"\t</body>\n</html>";
	
	@Override
	public String toString() {
		var sb = new StringBuilder(HTMLPREFIX);
		for (Innlegg innlegg : getSamling()) {
			if (innlegg == null) break;
			sb.append(innlegg.toHTML()).append("\t\t<hr>\n");
		}
		sb.append(HTMLPOSTFIX);
		return sb.toString();
		
	}
}
