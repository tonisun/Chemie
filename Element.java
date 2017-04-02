package de.tzeidler.chemie.util;

import java.sql.Connection;
/**
 * TODO: Element Gruppe stimmt nicht und ob element natürlich ist
 *  
 * @author Toni Zeidler
 *
 */
public enum Element {

	H  (1, false, "H", "Wasserstoff", 1.0079, new int[] {1}, 2.1, true, AgregatZustand.Gas, ElementGruppe.Alkalimetalle),
	He (2, false, "He", "Helium", 4.0026, new int[] {2}, 0.0, true, AgregatZustand.Gas, ElementGruppe.Halogene),
	
	Li (3, false, "Li", "Lithium", 6.941, new int[] {2,1}, 1.0, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Be (4, false, "Be", "Beryllium", 9.0122, new int[] {2,2}, 1.5, true, AgregatZustand.Feststoff, ElementGruppe.Erdalkalimetalle),
	B  (5, false, "B", "Bor", 10.811, new int[] {2,3}, 2.0, true, AgregatZustand.Feststoff, ElementGruppe.Borgruppe),
	C  (6, false, "C", "Kohlenstoff", 12.011, new int[] {2,4}, 2.5, true, AgregatZustand.Feststoff, ElementGruppe.Kohlenstoffe),
	N  (7, false, "N", "Stickstoff", 14.007, new int[] {2,5}, 3.0, true, AgregatZustand.Gas, ElementGruppe.Actinide),
	O  (8, false, "O", "Sauerstoff", 15.999, new int[] {2,6}, 3.5, true, AgregatZustand.Gas, ElementGruppe.Borgruppe),
	F  (9, false, "F", "Fluor", 18.988, new int[] {2,7}, 4.0, true, AgregatZustand.Gas, ElementGruppe.Halogene),
	Ne (10, false, "Ne", "Neon", 20.180, new int[] {2,8}, 0.0, true, AgregatZustand.Gas, ElementGruppe.Edelgase),
	
	Na (11, false, "Na", "Natrium", 22.99, new int[] {2,8,1}, 0.9, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Mg (12, false, "Mg", "Magnesium", 24.305, new int[] {2,8,2}, 1.2, true, AgregatZustand.Feststoff, ElementGruppe.Erdalkalimetalle),
	Al (13, false, "Al", "Aluminium", 26.982, new int[] {2,8,3}, 1.5, true, AgregatZustand.Feststoff, ElementGruppe.Halbmetalle),
	Si (14, false, "Si", "Silicium", 28.086, new int[] {2,8,4}, 1.8, true, AgregatZustand.Feststoff, ElementGruppe.Halbmetalle),
	P  (15, false, "P", "Phosphor", 30.974, new int[] {2,8,5}, 2.1, true, AgregatZustand.Feststoff, ElementGruppe.Nichtmetalle),
	S  (16, false, "S", "Schwefel", 32.065, new int[] {2,8,6}, 2.5, true, AgregatZustand.Feststoff, ElementGruppe.Nichtmetalle),
	Cl (17, false, "Cl", "Chlor", 35.453, new int[] {2,8,7}, 3.0, true, AgregatZustand.Gas, ElementGruppe.Nichtmetalle),
	Ar (18, false, "Ar", "Argon", 39.948, new int[] {2,8,8}, 0.0, true, AgregatZustand.Gas, ElementGruppe.Edelgase),
	
	K  (19, false, "K", "Kalium", 39.0983, new int[] {2,8,8,1}, 0.8, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Ca (20, false, "Ca", "Calcium", 40.078, new int[] {2,8,8,2}, 1.0, true, AgregatZustand.Feststoff, ElementGruppe.Erdalkalimetalle),
	Sc (21, false, "Sc", "Scandium", 44.956, new int[] {2,8,9,2}, 1.3, true, AgregatZustand.Feststoff, ElementGruppe.Lanthanoide),
	Ti (22, false, "Ti", "Titan", 47.867, new int[] {2,8,10,2}, 1.5, true, AgregatZustand.Feststoff, ElementGruppe.Lanthanoide),
	V  (23, false, "V", "Vanadium", 50.942, new int[] {2,8,11,2}, 1.6, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Cr (24, false, "Cr", "Chrom", 51.996, new int[] {2,8,13,1}, 1.6, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Mn (25, false, "Mn", "Mangan", 54.938, new int[] {2,8,13,2}, 1.5, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Fe (26, false, "Fe", "Eisen", 55.845, new int[] {2,8,14,2}, 1.8, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Co (27, false, "Co", "Cobalt", 58.933, new int[] {2,8,15,2}, 1.8, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Ni (28, false, "Ni", "Nickel", 58.693, new int[] {2,8,16,2}, 1.8, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Cu (29, false, "Cu", "Kupfer", 63.546, new int[] {2,8,18,1}, 1.9, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Zn (30, false, "Zn", "Zink", 65.38, new int[] {2,8,18,2}, 1.6, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Ga (31, false, "Ga", "Gallium", 69.723, new int[] {2,8,18,3}, 1.6, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Ge (32, false, "Ge", "Germanium", 72.64, new int[] {2,8,18,4}, 1.8, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	As (33, false, "As", "Arsen", 74.922, new int[] {2,8,18,5}, 2.0, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Se (34, false, "Se", "Selen", 78.96, new int[] {2,8,18,6}, 2.4, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Br (35, false, "Br", "Brom", 79.904, new int[] {2,8,18,7}, 2.8, true, AgregatZustand.Flussigkeit, ElementGruppe.Alkalimetalle),
	Kr (36, false, "Kr", "Krypton", 83.798, new int[] {2,8,18,8}, 0.0, true, AgregatZustand.Gas, ElementGruppe.Alkalimetalle),
	
	Rb (37, false, "Rb", "Rubidium", 85.468, new int[] {2,8,18,8,1}, 0.8, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Sr (38, false, "Sr", "Strontium", 87.62, new int[] {2,8,18,8,2}, 1.0, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Y  (39, false, "Y", "Yttrium", 88.906, new int[] {2,8,18,9,2}, 1.3, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Zr (40, false, "Zr", "Rubidium", 91.224, new int[] {2,8,18,10,2}, 1.4, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Nb (41, false, "Nb", "Niob", 92.906, new int[] {2,8,18,12,1}, 1.6, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Mo (42, false, "Mo", "Molybdän", 95.96, new int[] {2,8,18,13,1}, 1.8, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Tc (43, true, "Tc", "Technetium", 98.91, new int[] {2,8,18,13,2}, 1.9, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Ru (44, false, "Ru", "Ruthenium", 101.07, new int[] {2,8,18,15,1}, 2.2, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Rh (45, false, "Rh", "Rhodium", 102.91, new int[] {2,8,18,16,1}, 2.2, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Pd (46, false, "Pd", "Palladium", 106.42, new int[] {2,8,18,18}, 2.2, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Ag (47, false, "Ag", "Silber", 107.87, new int[] {2,8,18,18,1}, 1.9, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Cd (48, false, "Cd", "Cadmium", 112.41, new int[] {2,8,18,18,2}, 1.7, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	In (49, false, "In", "Indium", 114.82, new int[] {2,8,18,18,3}, 1.7, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Sn (50, false, "Sn", "Zinn", 118.71, new int[] {2,8,18,18,4}, 1.8, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Sb (51, false, "Sb", "Antimon", 121.76, new int[] {2,8,18,18,5}, 1.9, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Te (52, false, "Te", "Tellur", 127.6, new int[] {2,8,18,18,6}, 2.1, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	I  (53, false, "I", "Iod", 126.9, new int[] {2,8,18,18,7}, 2.5, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Xe (54, false, "Xe", "Xenon", 131.29, new int[] {2,8,18,18,8}, 0.0, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	
	Cs (55, false, "Cs", "Cäsium", 132.91, new int[] {2,8,18,18,8,1}, 0.7, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Ba (56, false, "Ba", "Barium", 137.33, new int[] {2,8,18,18,8,2}, 0.9, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	La (57, false, "La", "Lanthan", 138.91, new int[] {2,8,18,18,9,2}, 1.1, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Ce (58, false, "Ce", "Cer", 140.12, new int[] {2,8,18,19,9,2}, 1.1, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Pr (59, false, "Pr", "Praseodym", 140.91, new int[] {2,8,18,21,8,2}, 1.1, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Nd (60, false, "Nd", "Neodym", 144.24, new int[] {2,8,18,22,8,2}, 1.1, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Pm (61, true, "Pm", "Promethium", 146.90, new int[] {2,8,18,23,8,2}, 1.1, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Sm (62, false, "Sm", "Samarium", 150.36, new int[] {2,8,18,24,8,2}, 1.2, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Eu (63, false, "Eu", "Europium", 151.96, new int[] {2,8,18,25,8,2}, 1.2, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Gd (64, false, "Gd", "Gadolinium", 157.25, new int[] {2,8,18,25,9,2}, 1.2, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Tb (65, false, "Tb", "Terbium", 158.93, new int[] {2,8,18,27,8,2}, 1.2, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Dy (66, false, "Dy", "Dysprosium", 162.50, new int[] {2,8,18,28,8,2}, 1.2, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Ho (67, false, "Ho", "Holmium", 164.93, new int[] {2,8,18,29,8,2}, 1.2, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Er (68, false, "Er", "Erbium", 167.26, new int[] {2,8,18,30,8,2}, 1.2, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Tm (69, false, "Tm", "Thulium", 168.93, new int[] {2,8,18,31,8,2}, 1.2, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Yb (70, false, "Yb", "Ytterbium", 173.05, new int[] {2,8,18,32,8,2}, 1.2, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Lu (71, false, "Lu", "Luthetium", 174.97, new int[] {2,8,18,32,9,2}, 1.2, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Hf (72, false, "Hf", "Hafnium", 178.49, new int[] {2,8,18,32,10,2}, 1.3, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Ta (73, false, "Ta", "Tantal", 180.95, new int[] {2,8,18,32,11,2}, 1.5, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	W  (74, false, "W", "Wolfram", 183.84, new int[] {2,8,18,32,12,2}, 1.7, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Re (75, false, "Re", "Rhenium", 186.21, new int[] {2,8,18,32,13,2}, 1.9, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Os (76, false, "Os", "Osmium", 190.23, new int[] {2,8,18,32,14,2}, 2.2, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Ir (77, false, "Ir", "Iridium", 192.22, new int[] {2,8,18,32,15,2}, 2.2, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Pt (78, false, "Pt", "Platin", 195.08, new int[] {2,8,18,32,17,1}, 2.2, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Au (79, false, "Au", "Gold", 196.97, new int[] {2,8,18,32,18,1}, 2.4, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Hg (80, false, "Hg", "Quecksilber", 200.59, new int[] {2,8,18,32,18,2}, 1.9, true, AgregatZustand.Flussigkeit, ElementGruppe.Alkalimetalle),
	Tl (81, false, "Tl", "Thallium", 204.38, new int[] {2,8,18,32,18,3}, 1.8, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Pb (82, false, "Pb", "Blei", 207.2, new int[] {2,8,18,32,18,4}, 1.8, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Bi (83, true, "Bi", "Bismut", 208.98, new int[] {2,8,18,32,18,5}, 1.9, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Po (84, true, "Po", "Polonium", 209.98, new int[] {2,8,18,32,18,6}, 2.0, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	At (85, true, "At", "Astat", 210.0, new int[] {2,8,18,32,18,7}, 2.2, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Rn (86, true, "Rn", "Radon", 222.0, new int[] {2,8,18,32,18,8}, 0.0, true, AgregatZustand.Gas, ElementGruppe.Alkalimetalle),
	
	Fr (87, true, "Fr", "Francium", 223.0, new int[] {2,8,18,32,18,8,1}, 0.7, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Ra (88, true, "Ra", "Radium", 226.03, new int[] {2,8,18,32,18,8,2}, 0.9, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Ac (89, true, "Ac", "Actinium", 227.0, new int[] {2,8,18,32,18,9,2}, 1.1, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Th (90, true, "Th", "Thorium", 232.04, new int[] {2,8,18,32,18,10,2}, 1.3, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Pa (91, true, "Pa", "Protaktinium", 231.04, new int[] {2,8,18,32,20,9,2}, 1.5, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	U  (92, true, "U", "Uran", 238.0, new int[] {2,8,18,32,21,9,2}, 1.4, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Np (93, true, "Np", "Neptunium", 237.05, new int[] {2,8,18,32,22,9,2}, 1.3, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Pu (94, true, "Pu", "Plutonium", 244.10, new int[] {2,8,18,32,24,8,2}, 1.3, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Am (95, true, "Am", "Americium", 243.10, new int[] {2,8,18,32,25,8,2}, 1.3, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Cm (96, true, "Cm", "Curium", 247.10, new int[] {2,8,18,32,25,9,2}, 1.3, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Bk (97, true, "Bk", "Berkelium", 247.10, new int[] {2,8,18,32,25,10,2}, 1.3, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Cf (98, true, "Cf", "Californium", 251.10, new int[] {2,8,18,32,28,8,2}, 1.3, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Es (99, true, "Es", "Einsteinium", 254.10, new int[] {2,8,18,32,29,8,2}, 1.3, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Fm (100, true, "Fm", "Fermium", 257.10, new int[] {2,8,18,32,30,8,2}, 1.3, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Md (101, true, "Md", "Mendelevium", 258.0, new int[] {2,8,18,32,31,8,2}, 1.3, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	No (102, true, "No", "Nobelium", 259.0, new int[] {2,8,18,32,32,8,2}, 1.3, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Lr (103, true, "Lr", "Lawrencium", 260.0, new int[] {2,8,18,32,32,9,2}, 1.3, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Rf (104, true, "Rf", "Rutherfordium", 261.0, new int[] {2,8,18,32,32,10,2}, 0.0, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Db (105, true, "Db", "Dubnium", 262.0, new int[] {2,8,18,32,32,11,2}, 0.0, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Sg (106, true, "Sg", "Seaborgium", 263.0, new int[] {2,8,18,32,32,12,2}, 0.0, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Bh (107, true, "Bh", "Bohrium", 262.0, new int[] {2,8,18,32,32,13,2}, 0.0, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Hs (108, true, "Hs", "Hassium", 265.0, new int[] {2,8,18,32,32,14,2}, 0.0, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Mt (109, true, "Mt", "Meitnerium", 266.0, new int[] {2,8,18,32,32,15,2}, 0.0, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Ds (110, true, "Ds", "Darmstadtium", 269.0, new int[] {2,8,18,32,32,17,1}, 0.0, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Rg (111, true, "Rg", "Röntgenium", 272.0, new int[] {2,8,18,32,32,18,1}, 0.0, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Cn (112, true, "Cn", "Copernicium", 277.0, new int[] {2,8,18,32,32,18,2}, 0.0, true, AgregatZustand.Flussigkeit, ElementGruppe.Alkalimetalle),
	Nh (113, true, "Nh", "Nihonium", 287.0, new int[] {2,8,18,32,32,18,3}, 0.0, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Fl (114, true, "Fl", "Flerovium", 289.0, new int[] {2,8,18,32,32,18,4}, 0.0, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Mc (115, true, "Mc", "Moscovium", 288.0, new int[] {2,8,18,32,32,18,5}, 0.0, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Lv (116, true, "Lv", "Livermorium", 289.0, new int[] {2,8,18,32,32,18,6}, 0.0, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Ts (117, true, "Ts", "Tennessiene", 293.0, new int[] {2,8,18,32,32,18,7}, 0.0, true, AgregatZustand.Feststoff, ElementGruppe.Alkalimetalle),
	Og (118, true, "Og", "Oganesson", 294.0, new int[] {2,8,18,32,32,18,8}, 0.0, true, AgregatZustand.Gas, ElementGruppe.Alkalimetalle);
	
	
	private final int ordnungsZahl;
	private final boolean istRadioaktiv;
	private final String symbol;
	private final String elementName;
	private final double atomGewicht;
	private final int[] elektronenKonfiguration;
	private final double elektronegativität;
	private final boolean istNatürlichesElement;
	private final AgregatZustand aggregatZustand;
	private final ElementGruppe elementGruppe;
	
	
	Element (
			 int ordnungsZahl, 
			 boolean istRadioaktiv,
			 String symbol,
			 String elementName,
			 double atomGewicht,
			 int[] elektronenKonfiguration,
			 double elektronegativität,
			 boolean istNatürlichesElement,
			 AgregatZustand aggregatZustand,
			 ElementGruppe elementGruppe
			 ){
	
		this.ordnungsZahl = ordnungsZahl;
		this.istRadioaktiv = istRadioaktiv;
		this.symbol = symbol;
		this.elementName = elementName;
		this.atomGewicht = atomGewicht;
		
		/*
		// Test ob OrdnungsZahl und Anzahl Elektronen gleich sind 
		int zaehler =0;
		for (int i = 0; i < elektronenKonfiguration.length; i++) {
			zaehler += elektronenKonfiguration[i];
		}
		if(this.ordnungsZahl == zaehler) System.out.println("OK"); else System.out.println(this.ordnungsZahl+" Nit OK! "+ zaehler);
		*/
		
		this.elektronenKonfiguration = elektronenKonfiguration;
		this.elektronegativität = elektronegativität;
		this.istNatürlichesElement = istNatürlichesElement;
		this.aggregatZustand = aggregatZustand;
		this.elementGruppe = elementGruppe;
	}
	 
	public int ordnungsZahl(){ return ordnungsZahl; }
	public boolean istRadioaktiv(){ return istRadioaktiv; }
	public String symbol(){ return symbol; }
	public String elementName(){ return elementName; }
	public double atomGewicht(){ return atomGewicht; }
	public int[] elektronenKonfiguration(){ return elektronenKonfiguration; }
	public double elektronegativität(){ return elektronegativität;}
	public boolean istNatürlichesElement(){ return istNatürlichesElement; }
	public AgregatZustand aggregatZustand(){ return aggregatZustand; }
	public ElementGruppe elementGruppe(){ return elementGruppe; }
	
	/**TODO
	 * SQLite Table "element"
	 * 	element={
	 * 		ordnungs_zahl 	INTEGER(3) NOT NULL,
	 * 		symbol 			VARCHAR(3) PRIMARY_KEY NOT NULL,
	 * 		ist_radioaktiv 	BOOLEAN NOT NULL,
	 * 		element_name 	VARCHAR(20) NOT NULL,
	 * 		.....
	 * 
	 * }
	 * 
	 * @param conn
	 */
	public void insertIntoSQLiteDB(Connection conn){
		String createStmt = "IF NOT EXIST CREATE TABLE element ("
				+ "ordnungs_zahl 	INTEGER(3) NOT NULL, "
				+ "symbol 			VARCHAR(3) PRIMARY_KEY NOT NULL, "
				+ "ist_radioaktiv 	BOOLEAN NOT NULL, "
				+ "element_name 		VARCHAR(20) NOT NULL,"
				+ "atom_gewicht		DECIMAL(3.4) NOT NULL,"
				+ "electronen_konf	VARCHAR(20) NOT NULL,"
				+ "negativitaet		DECIMAL(1.1) ,"
				+ "ist_natuerlich	BOOLEAN NOT NULL,"
				+ "agregat_zustand	VARCHAR(20) NOT NULL,"
				+ "gruppe			VARCHAR(20) NOT NULL);";
		
		String insertStmt = "INSERT INTO element";
	}
	
	/**
	 * DEMO  main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// --- Ein Element
		final Element ELEMENT = Element.Ac;
		
		System.out.println("\t" + ELEMENT.toString() + " - " + ELEMENT.elementName);
		System.out.println("=================================");
		
		System.out.println("OrdnungsZahl:\t" + ELEMENT.ordnungsZahl);
		System.out.println("Symbol:\t\t" + ELEMENT.symbol);
		
		System.out.println("Name:\t\t" + ELEMENT.elementName);
		System.out.println("Atom Gewicht:\t" + ELEMENT.atomGewicht);
		
		System.out.print("Elektron Konf:\t");
		for (int i = 0; i < ELEMENT.elektronenKonfiguration.length; i++) {
			System.out.print(ELEMENT.elektronenKonfiguration[i] + " ");
		}
		System.out.println();
		
		System.out.println("Negativität:\t" + ELEMENT.elektronegativität);
		String jain = ELEMENT.istRadioaktiv ? "Ja" : "Nein";
		System.out.println("Ist Radioaktiv: " + jain);
		jain = ELEMENT.istNatürlichesElement ? "Ja" : "Nein";
		System.out.println("Ist natürlich:\t" + jain);
		System.out.println("Agregat Zustand:\t" + ELEMENT.aggregatZustand);
		System.out.println("Gruppe:\t\t" + ELEMENT.elementGruppe);
		
		// Schleife über alle Werte in Elemente
		for (Element e : Element.values()){
			System.out.println("=================================");
		
			System.out.println("OrdnungsZahl:\t" + e.ordnungsZahl);
			System.out.println("Symbol:\t\t" + e.symbol);
		
			System.out.println("Name:\t\t" + e.elementName);
			System.out.println("Atom Gewicht:\t" + e.atomGewicht);
		
			System.out.print("Elektron Konf:\t");
			for (int i = 0; i < e.elektronenKonfiguration.length; i++) {
				System.out.print(e.elektronenKonfiguration[i] + " ");
			}
			System.out.println();
		
			System.out.println("Negativität:\t" + e.elektronegativität);
			jain = e.istRadioaktiv ? "Ja" : "Nein";
			System.out.println("Ist Radioaktiv: " + jain);
			jain = e.istNatürlichesElement ? "Ja" : "Nein";
			System.out.println("Ist natürlich:\t" + jain);
			System.out.println("Agregat Zustand:\t" + e.aggregatZustand);
			System.out.println("Gruppe:\t\t" + e.elementGruppe);
		}	
	}
}
