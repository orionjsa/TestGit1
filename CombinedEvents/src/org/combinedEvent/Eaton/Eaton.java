package org.combinedEvent.Eaton;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Eaton {

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
		Decathlon pronostic = new Decathlon("Pronostic", "10.40", "770", "14.00", "200", "47.00", "13.90", "42.00", "490", "56.00", "4:20.00");
		// record perso deca
		Decathlon recordPerso = new Decathlon("Personal Record", "10.21", "823", "14.20", "205", "46.70", "13.70", "42.81", "530", "58.87", "4:14.48");
		// record perso epreuves
		Decathlon persoEpreuves = new Decathlon("Personal Best", "10.19", "823", "14.78", "211", "45.68", "13.34", "47.36", "530", "61.68", "4:14.48");
		// record du monde
		Decathlon recordDuMonde = new Decathlon("World Record", "10.21", "823", "14.20", "205", "46.70", "13.70", "42.81", "530", "58.87", "4:14.48");
		
		Decathlon moyenneSurLes3DerniersDeca = avg3derniersDeca(dernierDeca, avantDernierDeca, antepenultiemeDeca);
		//Decathlon toBeatWorldRecord = avg3derniersDeca(dernierDeca, avantDernierDeca, antepenultiemeDeca);
		
		
		
		
		
		// print JO
		System.out.println(actuel);
		// pronostic
		System.out.println(pronostic);
		// print moyenne
		System.out.println(moyenneSurLes3DerniersDeca);
		// print to beat
		//System.out.println(toBeatWorldRecord);
		// print perso epreuves
		System.out.println(persoEpreuves);
		// print perso deca
		System.out.println(recordPerso);
		// print record du monde
		System.out.println(recordDuMonde);
	}
	
	public static Decathlon avg3derniersDeca(Decathlon n, Decathlon nMoins1, Decathlon nMoins2) {
		String r100 = avg3Events(n.getRun100m().getTime(), nMoins1.getRun100m().getTime(), nMoins2.getRun100m().getTime());
		String rlong = avg3Events(n.getLongJump().getDistance(), nMoins1.getLongJump().getDistance(), nMoins2.getLongJump().getDistance());
		String rshot = avg3Events(n.getShotput().getDistance(), nMoins1.getShotput().getDistance(), nMoins2.getShotput().getDistance());
		String rhigh = avg3Events(n.getHighJump().getDistance(), nMoins1.getHighJump().getDistance(), nMoins2.getHighJump().getDistance());
		String r400 = avg3Events(n.getRun400m().getTime(), nMoins1.getRun400m().getTime(), nMoins2.getRun400m().getTime());
		String r110 = avg3Events(n.getRun110mH().getTime(), nMoins1.getRun110mH().getTime(), nMoins2.getRun110mH().getTime());
		String rdisc = avg3Events(n.getDiscus().getDistance(), nMoins1.getDiscus().getDistance(), nMoins2.getDiscus().getDistance());
		String rpole = avg3Events(n.getPoleVault().getDistance(), nMoins1.getPoleVault().getDistance(), nMoins2.getPoleVault().getDistance());
		String rjav = avg3Events(n.getJavelin().getDistance(), nMoins1.getJavelin().getDistance(), nMoins2.getJavelin().getDistance());
		//String r1500 = avg3Events(n.getRun1500m().getTime(), nMoins1.getRun1500m().getTime(), nMoins2.getRun1500m().getTime());
		
		Decathlon deca = new Decathlon("AVG",r100,rlong,rshot,rhigh,r400,r110,rdisc,rpole,rjav,"4:20.00");
		return deca;
	}
	
	public static String avg3Events(String p1, String p2, String p3) {
		BigDecimal b1 = new BigDecimal(p1);
		BigDecimal b2 = new BigDecimal(p2);
		BigDecimal b3 = new BigDecimal(p3);
		BigDecimal res = b1.add(b2).add(b3).divide(new BigDecimal("3"), 2, RoundingMode.HALF_UP);
		
		return res.toString();
	}

}
