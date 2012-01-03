package org.combinedEvent.cas2;


public class CLongJump extends FieldEvent  {

	private final String PARAM_A = "0.14354";
	private final String PARAM_B = "220.00";
	private final String PARAM_C = "1.40";

	public CLongJump() {
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
