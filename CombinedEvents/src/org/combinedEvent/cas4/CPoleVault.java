package org.combinedEvent.cas4;


public class CPoleVault extends Event {

	private final String PARAM_A = "0.2797";
	private final String PARAM_B = "100.00";
	private final String PARAM_C = "1.35";

	public CPoleVault() {
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
