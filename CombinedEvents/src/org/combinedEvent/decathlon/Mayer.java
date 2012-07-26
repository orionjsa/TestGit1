package org.combinedEvent.decathlon;


public class Mayer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Decathlon actuel = new Decathlon("JO", "", "", "", "", "", "", "", "", "", "");
		
		// les 3 derniers deca
		Decathlon dernierDeca = new Decathlon("Deca n", "11.19", "750", "13.23", "209", "48.75", "14.21", "43.13", "515", "61.58", "4:18.04");
		Decathlon avantDernierDeca = new Decathlon("Deca n-1", "11.34", "734", "14.34", "207", "49.94", "14.34", "39.28", "490", "57.50", "4:19.65");
		Decathlon antepenultiemeDeca = new Decathlon("Deca n-2", "11.23", "734", "12.44", "201", "48.66", "14.74", "38.64", "490", "60.96", "4:19.79");
		
		// pronostic
		Decathlon pronostic = new Decathlon("Pronostic", "11.20", "740", "14.00", "205", "49.00", "14.40", "42.00", "500", "60.00", "4:20.00");
		// record perso deca
		Decathlon recordPerso = new Decathlon("Personal Record", "11.19", "750", "13.23", "209", "48.75", "14.21", "43.13", "515", "61.58", "4:18.04");
		// record perso epreuves
		Decathlon persoEpreuves = new Decathlon("Personal Best", "11.10", "763", "14.34", "210", "48.66", "14.21", "43.13", "520", "61.58", "4:18.04");
		// record France
		Decathlon recordFrance = new Decathlon("National Record", "10.72", "777", "14.19", "210", "47.10", "13.98", "44.36", "500", "54.72", "4:27.83");
		// record Europe
		Decathlon recordArea = new Decathlon("Area Record", "10.64", "811", "15.33", "212", "47.79", "13.92", "47.92", "480", "70.16", "4:21.98");
		// record du monde
		Decathlon recordDuMonde = new Decathlon("World Record", "10.21", "823", "14.20", "205", "46.70", "13.70", "42.81", "530", "58.87", "4:14.48");
		
		Decathlon moyenneSurLes3DerniersDeca = Utils.avg3derniersDeca(dernierDeca, avantDernierDeca, antepenultiemeDeca);
		Decathlon newPersonalRecord = Utils.toBeatRecord("New Personal Record", actuel, recordPerso, moyenneSurLes3DerniersDeca, persoEpreuves);
		Decathlon newFranceRecord = Utils.toBeatRecord("New National Record", actuel, recordFrance, moyenneSurLes3DerniersDeca, persoEpreuves);
		Decathlon newEuropeanRecord = Utils.toBeatRecord("New European Record", actuel, recordArea, moyenneSurLes3DerniersDeca, persoEpreuves);
		Decathlon newWorldRecord = Utils.toBeatRecord("New World Record", actuel, recordDuMonde, moyenneSurLes3DerniersDeca, persoEpreuves);
		
		
		
		
		
		// print JO
		System.out.println(actuel);
		// pronostic
		System.out.println(pronostic);
		// print moyenne
		System.out.println(moyenneSurLes3DerniersDeca);
		// print to beat
		System.out.println(newPersonalRecord);
		System.out.println(newFranceRecord);
		System.out.println(newEuropeanRecord);
		System.out.println(newWorldRecord);
		// print perso epreuves
		System.out.println(persoEpreuves);
		// print perso deca
		System.out.println(recordPerso);
		// print record pays
		System.out.println(recordFrance);
		// print record europe
		System.out.println(recordArea);
		// print record du monde
		System.out.println(recordDuMonde);
	}

}
