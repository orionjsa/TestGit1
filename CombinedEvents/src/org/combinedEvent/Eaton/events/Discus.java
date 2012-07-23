package org.combinedEvent.Eaton.events;

import java.math.BigDecimal;


public class Discus extends Event implements IFieldEvent {

	private final BigDecimal PARAM_A = new BigDecimal("12.91");
	private final BigDecimal PARAM_B = new BigDecimal("4.00");
	private final BigDecimal PARAM_C = new BigDecimal("1.10");

	public Discus() {
		super();
		this.setDistance("4.01");
	}
	
	public Discus(String measurement) {
		if (measurement == null || measurement.equals("")) {
			this.setDistance("4.01");
		} else {
			this.setDistance(measurement);
		}
	}

	public String getDistance() {
		return perf;
	}

	public void setDistance(String distance) {
		this.perf = distance;
		points = compute(new BigDecimal(distance), PARAM_A, PARAM_B, PARAM_C, FIELD_EVENT);
	}

	public int getPoints() {
		return points;
	}
}
