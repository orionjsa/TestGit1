package org.combinedEvent.cas6;

import java.math.BigDecimal;

public enum DecathlonEvents {

	_100m ("25.4347", "18.00", "1.81", -1),
	LONGJUMP ("0.14354", "220.00", "1.40", 1),
	SHOTPUT ("51.39", "1.50", "1.05", 1),
	HIGHJUMP ("0.8465", "75.00", "1.42", 1),
	_400m ("1.53775", "82.00", "1.81", -1),
	_110mH ("5.74352", "28.50", "1.92", -1),
	DISCUSTHROW ("12.91", "4.00", "1.10", 1),
	POLEVAULT ("0.2797", "100.00", "1.35", 1),
	JAVELINTHROW ("10.14", "7.00", "1.08", 1),
	_1500m ("0.03768", "480.00",  "1.85", -1);

	private String a;
	private String b;
	private String c;
	private int signe;
	
	private DecathlonEvents(String a, String b, String c, int signe) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.signe = signe;
	}
	
	public String compute(String perf) {
		BigDecimal mPerf = new BigDecimal(perf);
		BigDecimal valueA = new BigDecimal(a);
		BigDecimal valueB = new BigDecimal(b);
		BigDecimal valueC = new BigDecimal(c);
		BigDecimal mPoints = valueA.multiply(new BigDecimal(Math.pow(mPerf.subtract(valueB).multiply(new BigDecimal(signe)).doubleValue(),valueC.doubleValue())));
		mPoints = mPoints.setScale(0, BigDecimal.ROUND_DOWN);
		return mPoints.toString();
	}
}
