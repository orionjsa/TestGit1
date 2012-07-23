package org.combinedEvent.Eaton.events;

import java.math.BigDecimal;


public class LongJump extends Event implements IFieldEvent {

	private final BigDecimal PARAM_A = new BigDecimal("0.14354");
	private final BigDecimal PARAM_B = new BigDecimal("220.00");
	private final BigDecimal PARAM_C = new BigDecimal("1.40");

	public LongJump() {
		super();
		this.setDistance("221");
	}
	
	public LongJump(String measurement) {
		if (measurement == null || measurement.equals("")) {
			this.setDistance("221");
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
