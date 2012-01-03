package org.combinedEvent.cas2;


public class CPoleVault extends FieldEvent {

	private final String PARAM_A = "0.2797";
	private final String PARAM_B = "100.00";
	private final String PARAM_C = "1.35";

	public CPoleVault() {
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
