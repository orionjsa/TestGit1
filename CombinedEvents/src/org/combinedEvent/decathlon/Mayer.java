package org.combinedEvent.decathlon;


public class Mayer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Decathlon actuel = new Decathlon("JO", "", "", "", "", "", "", "", "", "", "");
		
		// les 3 derniers deca
		Decathlon dernierDeca = new Decathlon("Deca n", "10.21", "823", "14.20", "205", "46.70", "13.70", "42.81", "530", "58.87", "4:14.48");
		Decathlon avantDernierDeca = new Decathlon("Deca n-1", "10.46", "746", "14.44", "202", "46.99", "13.85", "46.17", "460", "55.17", "4:18.94");
		Decathlon antepenultiemeDeca = new Decathlon("Deca n-2", "10.33", "780", "14.14", "205", "46.35", "13.52", "41.58", "505", "56.19", "4:24.10");
		
		// pronostic
		Decathlon pronostic = new Decathlon("Pronostic", "10.35", "780", "14.00", "200", "46.80", "13.90", "43.00", "500", "56.00", "4:20.00");
		// record perso deca
		Decathlon recordPerso = new Decathlon("Personal Record", "", "", "", "", "", "", "", "", "", "");
		// record perso epreuves
		Decathlon persoEpreuves = new Decathlon("Personal Best", "", "", "", "", "", "", "", "", "", "");
		// record France
		Decathlon recordFrance = new Decathlon("France Record", "", "", "", "", "", "", "", "", "", "");
		// record Europe
		Decathlon recordArea = new Decathlon("Area Record", "", "", "", "", "", "", "", "", "", "");
		// record du monde
		Decathlon recordDuMonde = new Decathlon("World Record", "10.21", "823", "14.20", "205", "46.70", "13.70", "42.81", "530", "58.87", "4:14.48");
		
		Decathlon moyenneSurLes3DerniersDeca = Utils.avg3derniersDeca(dernierDeca, avantDernierDeca, antepenultiemeDeca);
		Decathlon newRecord = new Decathlon("New World Record", "", "", "", "", "", "", "", "", "", "");
		Decathlon newWorldRecord = Utils.toBeatRecord(actuel, recordDuMonde, newRecord, moyenneSurLes3DerniersDeca, persoEpreuves);
		
		
		
		
		
		// print JO
		System.out.println(actuel);
		// pronostic
		System.out.println(pronostic);
		// print moyenne
		System.out.println(moyenneSurLes3DerniersDeca);
		// print to beat
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
