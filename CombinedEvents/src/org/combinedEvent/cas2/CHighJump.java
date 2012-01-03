package org.combinedEvent.cas2;


public class CHighJump extends FieldEvent  {

	private final String PARAM_A = "0.8465";
	private final String PARAM_B = "75.00";
	private final String PARAM_C = "1.42";

	public CHighJump() {
		// TODO Auto-generated constructor stub
	}

	public String getMeasurement() {
		return distance;
	}

	public void setMeasurement(String measurement) {
		this.distance = measurement;
		points = compute(distance, PARAM_A, PARAM_B, PARAM_C);
	}

	public String getPoints() {
		return points;
	}
}
