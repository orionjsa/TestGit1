package org.combinedEvent.cas3;


public class CHighJump extends Event  {

	private final String PARAM_A = "0.8465";
	private final String PARAM_B = "75.00";
	private final String PARAM_C = "1.42";

	public CHighJump() {
		// TODO Auto-generated constructor stub
	}

	public String getMeasurement() {
		return perf;
	}

	public void setMeasurement(String measurement) {
		this.perf = measurement;
		points = compute(perf, PARAM_A, PARAM_B, PARAM_C, FIELD_EVENT);
	}

	public String getPoints() {
		return points;
	}
}
