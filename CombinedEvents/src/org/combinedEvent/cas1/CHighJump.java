package org.combinedEvent.cas1;

import java.math.BigDecimal;

public class CHighJump {

	private final String PARAM_A = "0.8465";
	private final String PARAM_B = "75.00";
	private final String PARAM_C = "1.42";

	private String measurement;
	private String points;
	
	public CHighJump() {
		// TODO Auto-generated constructor stub
	}

	public String getMeasurement() {
		return measurement;
	}

	public void setMeasurement(String measurement) {
		this.measurement = measurement;
		points = compute(measurement);
	}

	public String getPoints() {
		return points;
	}
	private String compute(String measurement) {
		BigDecimal mMeasurement = new BigDecimal(measurement);
		BigDecimal a = new BigDecimal(PARAM_A);
		BigDecimal b = new BigDecimal(PARAM_B);
		BigDecimal c = new BigDecimal(PARAM_C);
		BigDecimal mPoints = a.multiply(new BigDecimal(Math.pow(mMeasurement.subtract(b).doubleValue(),c.doubleValue())));
		mPoints = mPoints.setScale(0, BigDecimal.ROUND_DOWN);
		return mPoints.toString();
	}
}
