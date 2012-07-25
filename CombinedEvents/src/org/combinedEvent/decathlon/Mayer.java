package org.combinedEvent.decathlon;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

import org.combinedEvent.decathlon.events.Run1500m;

public class Mayer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Decathlon actuel = new Decathlon("JO", "10.30", "790", "14.50", "205", "46.50", "", "", "", "", "");
		
		// les 3 derniers deca
		Decathlon dernierDeca = new Decathlon("Deca n", "10.21", "823", "14.20", "205", "46.70", "13.70", "42.81", "530", "58.87", "4:14.48");
		Decathlon avantDernierDeca = new Decathlon("Deca n-1", "10.46", "746", "14.44", "202", "46.99", "13.85", "46.17", "460", "55.17", "4:18.94");
		Decathlon antepenultiemeDeca = new Decathlon("Deca n-2", "10.33", "780", "14.14", "205", "46.35", "13.52", "41.58", "505", "56.19", "4:24.10");
		
		// pronostic
		Decathlon pronostic = new Decathlon("Pronostic", "10.35", "780", "14.00", "200", "46.80", "13.90", "43.00", "500", "56.00", "4:20.00");
		// record perso deca
		Decathlon recordPerso = new Decathlon("Personal Record", "10.21", "823", "14.20", "205", "46.70", "13.70", "42.81", "530", "58.87", "4:14.48");
		// record perso epreuves
		Decathlon persoEpreuves = new Decathlon("Personal Best", "10.19", "823", "14.78", "211", "45.68", "13.34", "47.36", "530", "61.68", "4:14.48");
		// record pays
		Decathlon recordUSA = new Decathlon("USA Record", "10.21", "823", "14.20", "205", "46.70", "13.70", "42.81", "530", "58.87", "4:14.48");
		// record amerique du nord
		Decathlon recordArea = new Decathlon("Area Record", "10.21", "823", "14.20", "205", "46.70", "13.70", "42.81", "530", "58.87", "4:14.48");
		// record du monde
		Decathlon recordDuMonde = new Decathlon("World Record", "10.21", "823", "14.20", "205", "46.70", "13.70", "42.81", "530", "58.87", "4:14.48");
		
		Decathlon moyenneSurLes3DerniersDeca = avg3derniersDeca(dernierDeca, avantDernierDeca, antepenultiemeDeca);
		Decathlon newWorldRecord = toBeatWorldRecord(actuel, recordDuMonde, moyenneSurLes3DerniersDeca, persoEpreuves);
		
		
		
		
		
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
		System.out.println(recordUSA);
		// print record amerique
		System.out.println(recordArea);
		// print record du monde
		System.out.println(recordDuMonde);
	}
	
	public static Decathlon toBeatWorldRecord(Decathlon actuel, Decathlon recordDuMonde, Decathlon moyenneSurLes3DerniersDeca, Decathlon personalBest) {
		// trouver la repartition de point en se basant sur le deca moyen
		Map repartition = getRepartirion(moyenneSurLes3DerniersDeca);
		BigDecimal totalRepartition = new BigDecimal("0");
		// compter combien il reste d'epreuves
		int restantes = 0;
		if (actuel.getRun100m().getTime() == null || actuel.getRun100m().getTime().equals("")) {
			restantes++;
			totalRepartition = totalRepartition.add((BigDecimal) repartition.get("1"));
		}
		if (actuel.getLongJump().getDistance() == null || actuel.getLongJump().getDistance().equals("")) {
			restantes++;
			totalRepartition = totalRepartition.add((BigDecimal) repartition.get("2"));
		}
		if (actuel.getShotput().getDistance() == null || actuel.getShotput().getDistance().equals("")) {
			restantes++;
			totalRepartition = totalRepartition.add((BigDecimal) repartition.get("3"));
		}
		if (actuel.getHighJump().getDistance() == null || actuel.getHighJump().getDistance().equals("")) {
			restantes++;
			totalRepartition = totalRepartition.add((BigDecimal) repartition.get("4"));
		}
		if (actuel.getRun400m().getTime() == null || actuel.getRun400m().getTime().equals("")) {
			restantes++;
			totalRepartition = totalRepartition.add((BigDecimal) repartition.get("5"));
		}
		if (actuel.getRun110mH().getTime() == null || actuel.getRun110mH().getTime().equals("")) {
			restantes++;
			totalRepartition = totalRepartition.add((BigDecimal) repartition.get("6"));
		}
		if (actuel.getDiscus().getDistance() == null || actuel.getDiscus().getDistance().equals("")) {
			restantes++;
			totalRepartition = totalRepartition.add((BigDecimal) repartition.get("7"));
		}
		if (actuel.getPoleVault().getDistance() == null || actuel.getPoleVault().getDistance().equals("")) {
			restantes++;
			totalRepartition = totalRepartition.add((BigDecimal) repartition.get("8"));
		}
		if (actuel.getJavelin().getDistance() == null || actuel.getJavelin().getDistance().equals("")) {
			restantes++;
			totalRepartition = totalRepartition.add((BigDecimal) repartition.get("9"));
		}
		if (actuel.getRun1500m().getTime() == null || actuel.getRun1500m().getTime().equals("")) {
			restantes++;
			totalRepartition = totalRepartition.add((BigDecimal) repartition.get("10"));
		}
		// soustraire du WR+1pt le total actuel puis diviser par le nombre d epreuves restantes
		int ecartParEpreuve = (recordDuMonde.getTotal()+2-actuel.getTotal())/restantes;
		// on génére une perf en fonction de l'ecart du total et la repartion des points dans les epruves
		int ecart = (recordDuMonde.getTotal()+1-actuel.getTotal());
		String s100 = actuel.getRun100m().getTime();
		String sLong = actuel.getLongJump().getDistance();
		String sShot = actuel.getShotput().getDistance();
		String sHigh = actuel.getHighJump().getDistance();
		String s400 = actuel.getRun400m().getTime();
		String s110 = actuel.getRun110mH().getTime();
		String sDisc = actuel.getDiscus().getDistance();
		String sPole = actuel.getPoleVault().getDistance();
		String sJav = actuel.getJavelin().getDistance();
		String s1500 = actuel.getRun1500m().getTime();
		Decathlon deca = new Decathlon("New World Record",s100,sLong,sShot,sHigh,s400,s110,sDisc,sPole,sJav,s1500);
				
		if (s100 == null || s100.equals("")) {
			BigDecimal pts100 = ((BigDecimal) repartition.get("1")).multiply(new BigDecimal(ecart)).divide(totalRepartition, 0, RoundingMode.HALF_UP);
			if (pts100.compareTo(new BigDecimal(personalBest.getRun100m().getPoints())) < 0) {
				s100 = actuel.getRun100m().findPerfWithPoints(pts100);
			} else {
				s100 = personalBest.getRun100m().getTime();
			}
			deca = new Decathlon("New World Record",s100,sLong,sShot,sHigh,s400,s110,sDisc,sPole,sJav,s1500);
			ecart = recordDuMonde.getTotal()+1-deca.getTotal();
			totalRepartition = totalRepartition.subtract((BigDecimal) repartition.get("1"));
		}
		if (sLong == null || sLong.equals("")) {
			BigDecimal ptsLong = ((BigDecimal) repartition.get("2")).multiply(new BigDecimal(ecart)).divide(totalRepartition, 0, RoundingMode.HALF_UP);
			if (ptsLong.compareTo(new BigDecimal(personalBest.getLongJump().getPoints())) < 0) {
				sLong = actuel.getLongJump().findPerfWithPoints(ptsLong);
			} else {
				sLong = personalBest.getLongJump().getDistance();
			}
			deca = new Decathlon("New World Record",s100,sLong,sShot,sHigh,s400,s110,sDisc,sPole,sJav,s1500);
			ecart = recordDuMonde.getTotal()+1-deca.getTotal();
			totalRepartition = totalRepartition.subtract((BigDecimal) repartition.get("2"));
		}
		if (sShot == null || sShot.equals("")) {
			BigDecimal ptsShot = ((BigDecimal) repartition.get("3")).multiply(new BigDecimal(ecart)).divide(totalRepartition, 0, RoundingMode.HALF_UP);
			if (ptsShot.compareTo(new BigDecimal(personalBest.getShotput().getPoints())) < 0) {
				sShot = actuel.getShotput().findPerfWithPoints(ptsShot);
			} else {
				sShot = personalBest.getShotput().getDistance();
			}
			deca = new Decathlon("New World Record",s100,sLong,sShot,sHigh,s400,s110,sDisc,sPole,sJav,s1500);
			ecart = recordDuMonde.getTotal()+1-deca.getTotal();
			totalRepartition = totalRepartition.subtract((BigDecimal) repartition.get("3"));
		}
		if (sHigh == null || sHigh.equals("")) {
			BigDecimal ptsHigh = ((BigDecimal) repartition.get("4")).multiply(new BigDecimal(ecart)).divide(totalRepartition, 0, RoundingMode.HALF_UP);
			if (ptsHigh.compareTo(new BigDecimal(personalBest.getHighJump().getPoints())) < 0) {
				sHigh = actuel.getHighJump().findPerfWithPoints(ptsHigh);
			} else {
				sHigh = personalBest.getHighJump().getDistance();
			}
			deca = new Decathlon("New World Record",s100,sLong,sShot,sHigh,s400,s110,sDisc,sPole,sJav,s1500);
			ecart = recordDuMonde.getTotal()+1-deca.getTotal();
			totalRepartition = totalRepartition.subtract((BigDecimal) repartition.get("4"));
		}
		if (s400 == null || s400.equals("")) {
			BigDecimal pts400 = ((BigDecimal) repartition.get("5")).multiply(new BigDecimal(ecart)).divide(totalRepartition, 0, RoundingMode.HALF_UP);
			if (pts400.compareTo(new BigDecimal(personalBest.getRun400m().getPoints())) < 0) {
				s400 = actuel.getRun400m().findPerfWithPoints(pts400);
			} else {
				s400 = personalBest.getRun400m().getTime();
			}
			deca = new Decathlon("New World Record",s100,sLong,sShot,sHigh,s400,s110,sDisc,sPole,sJav,s1500);
			ecart = recordDuMonde.getTotal()+1-deca.getTotal();
			totalRepartition = totalRepartition.subtract((BigDecimal) repartition.get("5"));
		}
		if (s110 == null || s110.equals("")) {
			BigDecimal pts110 = ((BigDecimal) repartition.get("6")).multiply(new BigDecimal(ecart)).divide(totalRepartition, 0, RoundingMode.HALF_UP);
			if (pts110.compareTo(new BigDecimal(personalBest.getRun110mH().getPoints())) < 0) {
				s110 = actuel.getRun110mH().findPerfWithPoints(pts110);
			} else {
				s110 = personalBest.getRun110mH().getTime();
			}
			deca = new Decathlon("New World Record",s100,sLong,sShot,sHigh,s400,s110,sDisc,sPole,sJav,s1500);
			ecart = recordDuMonde.getTotal()+1-deca.getTotal();
			totalRepartition = totalRepartition.subtract((BigDecimal) repartition.get("6"));
		}
		if (sDisc == null || sDisc.equals("")) {
			BigDecimal ptsDisc = ((BigDecimal) repartition.get("7")).multiply(new BigDecimal(ecart)).divide(totalRepartition, 0, RoundingMode.HALF_UP);
			if (ptsDisc.compareTo(new BigDecimal(personalBest.getDiscus().getPoints())) < 0) {
				sDisc = actuel.getDiscus().findPerfWithPoints(ptsDisc);
			} else {
				sDisc = personalBest.getDiscus().getDistance();
			}
			deca = new Decathlon("New World Record",s100,sLong,sShot,sHigh,s400,s110,sDisc,sPole,sJav,s1500);
			ecart = recordDuMonde.getTotal()+1-deca.getTotal();
			totalRepartition = totalRepartition.subtract((BigDecimal) repartition.get("7"));
		}
		if (sPole == null || sPole.equals("")) {
			BigDecimal ptsPole = ((BigDecimal) repartition.get("8")).multiply(new BigDecimal(ecart)).divide(totalRepartition, 0, RoundingMode.HALF_UP);
			if (ptsPole.compareTo(new BigDecimal(personalBest.getPoleVault().getPoints())) < 0) {
				sPole = actuel.getPoleVault().findPerfWithPoints(ptsPole);
			} else {
				sPole = personalBest.getPoleVault().getDistance();
			}
			deca = new Decathlon("New World Record",s100,sLong,sShot,sHigh,s400,s110,sDisc,sPole,sJav,s1500);
			ecart = recordDuMonde.getTotal()+1-deca.getTotal();
			totalRepartition = totalRepartition.subtract((BigDecimal) repartition.get("8"));
		}
		if (sJav == null || sJav.equals("")) {
			BigDecimal ptsJav = ((BigDecimal) repartition.get("9")).multiply(new BigDecimal(ecart)).divide(totalRepartition, 0, RoundingMode.HALF_UP);
			if (ptsJav.compareTo(new BigDecimal(personalBest.getJavelin().getPoints())) < 0) {
				sJav = actuel.getJavelin().findPerfWithPoints(ptsJav);
			} else {
				sJav = personalBest.getJavelin().getDistance();
			}			
			deca = new Decathlon("New World Record",s100,sLong,sShot,sHigh,s400,s110,sDisc,sPole,sJav,s1500);
			ecart = recordDuMonde.getTotal()+1-deca.getTotal();
			totalRepartition = totalRepartition.subtract((BigDecimal) repartition.get("9"));
		}
		if (s1500 == null || s1500.equals("")) {
			BigDecimal pts1500 = ((BigDecimal) repartition.get("10")).multiply(new BigDecimal(ecart)).divide(totalRepartition, 0, RoundingMode.HALF_UP);
			if (pts1500.compareTo(new BigDecimal(personalBest.getRun1500m().getPoints())) < 0) {
				s1500 = actuel.getRun1500m().findPerfWithPoints(pts1500);
			} else {
				s1500 = personalBest.getRun1500m().getTime();
			}
			deca = new Decathlon("New World Record",s100,sLong,sShot,sHigh,s400,s110,sDisc,sPole,sJav,s1500);
			ecart = recordDuMonde.getTotal()+1-deca.getTotal();
			totalRepartition = totalRepartition.subtract((BigDecimal) repartition.get("10"));
		}
		// de la plus petite à la plus forte répartir les points jusqu'au points du record en deca
		// si le WR n'est pas battu faire la meme chose avec le best dans chaque epreuves
		// si le WR n'est pas battu repartir l'ecart de point restant dans chaque epreuve
		
		deca = new Decathlon("New World Record",s100,sLong,sShot,sHigh,s400,s110,sDisc,sPole,sJav,s1500);
		return deca;
	}
	
	public static Map<String, BigDecimal> getRepartirion(Decathlon avg) {
		Map<String, BigDecimal> repartition = new HashMap<String, BigDecimal>();
		repartition.put("1", (new BigDecimal(avg.getRun100m().getPoints()).divide(new BigDecimal(avg.getTotal()), 2, RoundingMode.HALF_UP)));
		repartition.put("2", (new BigDecimal(avg.getLongJump().getPoints()).divide(new BigDecimal(avg.getTotal()), 2, RoundingMode.HALF_UP)));
		repartition.put("3", (new BigDecimal(avg.getShotput().getPoints()).divide(new BigDecimal(avg.getTotal()), 2, RoundingMode.HALF_UP)));
		repartition.put("4", (new BigDecimal(avg.getHighJump().getPoints()).divide(new BigDecimal(avg.getTotal()), 2, RoundingMode.HALF_UP)));
		repartition.put("5", (new BigDecimal(avg.getRun400m().getPoints()).divide(new BigDecimal(avg.getTotal()), 2, RoundingMode.HALF_UP)));
		repartition.put("6", (new BigDecimal(avg.getRun110mH().getPoints()).divide(new BigDecimal(avg.getTotal()), 2, RoundingMode.HALF_UP)));
		repartition.put("7", (new BigDecimal(avg.getDiscus().getPoints()).divide(new BigDecimal(avg.getTotal()), 2, RoundingMode.HALF_UP)));
		repartition.put("8", (new BigDecimal(avg.getPoleVault().getPoints()).divide(new BigDecimal(avg.getTotal()), 2, RoundingMode.HALF_UP)));
		repartition.put("9", (new BigDecimal(avg.getJavelin().getPoints()).divide(new BigDecimal(avg.getTotal()), 2, RoundingMode.HALF_UP)));
		repartition.put("10", (new BigDecimal(avg.getRun1500m().getPoints()).divide(new BigDecimal(avg.getTotal()), 2, RoundingMode.HALF_UP)));
		return repartition;
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
		Double r1500 = avg3Events(n.getRun1500m().getInternalTime(), nMoins1.getRun1500m().getInternalTime(), nMoins2.getRun1500m().getInternalTime());
		
		Decathlon deca = new Decathlon("AVG",r100,rlong,rshot,rhigh,r400,r110,rdisc,rpole,rjav,Run1500m.internalTime2String(r1500));
		return deca;
	}
	
	public static String avg3Events(String p1, String p2, String p3) {
		BigDecimal b1 = new BigDecimal(p1);
		BigDecimal b2 = new BigDecimal(p2);
		BigDecimal b3 = new BigDecimal(p3);
		BigDecimal res = b1.add(b2).add(b3).divide(new BigDecimal("3"), 2, RoundingMode.HALF_UP);
		
		return res.toString();
	}
	
	public static Double avg3Events(Double p1, Double p2, Double p3) {
		BigDecimal b1 = new BigDecimal(p1);
		BigDecimal b2 = new BigDecimal(p2);
		BigDecimal b3 = new BigDecimal(p3);
		BigDecimal res = b1.add(b2).add(b3).divide(new BigDecimal("3"), 2, RoundingMode.HALF_UP);
		
		return new Double(res.doubleValue());
	}

}
