package org.combinedEvent.cas1;

import java.math.BigDecimal;

public class CDiscusThrow {

	private final String PARAM_A = "12.91";
	private final String PARAM_B = "4.00";
	private final String PARAM_C = "1.10";

	private String distance;
	private String points;
	
	public CDiscusThrow() {
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
