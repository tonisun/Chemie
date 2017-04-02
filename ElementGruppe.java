package de.tzeidler.chemie.util;

/**
 * 
 * @author Toni Zeidler
 *
 */
public enum ElementGruppe {
	Alkalimetalle (1),
	Erdalkalimetalle(2),
	Halbmetalle(3),
	Lanthanoide(5),
	Nichtmetalle(6),
	Actinide(4),
	Borgruppe(13),
	Kohlenstoffe(14),
	Pnicogene(15),
	Chalkogene(16),
	Halogene(17),
	Edelgase(18);
	
	
	private final int gruppenNummer;
	
	ElementGruppe(int gruppenNummer){
		this.gruppenNummer = gruppenNummer;
	}
}
