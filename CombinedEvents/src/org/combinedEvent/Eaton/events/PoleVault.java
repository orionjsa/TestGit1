package org.combinedEvent.Eaton.events;

import java.math.BigDecimal;


public class PoleVault extends Event implements IFieldEvent {

	private final BigDecimal PARAM_A = new BigDecimal("0.2797");
	private final BigDecimal PARAM_B = new BigDecimal("100.00");
	private final BigDecimal PARAM_C = new BigDecimal("1.35");

	public PoleVault() {
		super();
		this.setDistance("101");
	}
	
	public PoleVault(String measurement) {
		if (measurement == null || measurement.equals("")) {
			this.setDistance("101");
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
