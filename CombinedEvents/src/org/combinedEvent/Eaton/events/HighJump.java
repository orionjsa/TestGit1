package org.combinedEvent.Eaton.events;

import java.math.BigDecimal;


public class HighJump extends Event implements IFieldEvent {

	private final BigDecimal PARAM_A = new BigDecimal("0.8465");
	private final BigDecimal PARAM_B = new BigDecimal("75.00");
	private final BigDecimal PARAM_C = new BigDecimal("1.42");

	public HighJump() {
		super();
		this.setDistance("76");
	}
	
	public HighJump(String measurement) {
		if (measurement == null || measurement.equals("")) {
			this.setDistance("76");
		} else {
			this.setDistance(measurement);
		}
	}

	public String getDistance() {
		return perf;
	}

	public void setDistance(String measurement) {
		this.perf = measurement;
		points = compute(new BigDecimal(perf), PARAM_A, PARAM_B, PARAM_C, FIELD_EVENT);
	}

	public int getPoints() {
		return points;
	}
}
