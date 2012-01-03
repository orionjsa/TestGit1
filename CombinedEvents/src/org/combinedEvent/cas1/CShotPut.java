package org.combinedEvent.cas1;

import java.math.BigDecimal;

public class CShotPut {

	private final String PARAM_A = "51.39";
	private final String PARAM_B = "1.50";
	private final String PARAM_C = "1.05";

	private String distance;
	private String points;
	
	public CShotPut() {
		// TODO Auto-generated constructor stub
	}
	
	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
		points = compute(distance);
	}

	public String getPoints() {
		return points;
	}
	private String compute(String distance) {
		BigDecimal mDistance = new BigDecimal(distance);
		BigDecimal a = new BigDecimal(PARAM_A);
		BigDecimal b = new BigDecimal(PARAM_B);
		BigDecimal c = new BigDecimal(PARAM_C);
		BigDecimal mPoints = a.multiply(new BigDecimal(Math.pow(mDistance.subtract(b).doubleValue(),c.doubleValue())));
		mPoints = mPoints.setScale(0, BigDecimal.ROUND_DOWN);
		return mPoints.toString();
	}
}
