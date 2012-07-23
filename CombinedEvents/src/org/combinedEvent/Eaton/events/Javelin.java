package org.combinedEvent.Eaton.events;

import java.math.BigDecimal;


public class Javelin extends Event implements IFieldEvent {

	private final BigDecimal PARAM_A = new BigDecimal("10.14");
	private final BigDecimal PARAM_B = new BigDecimal("7.00");
	private final BigDecimal PARAM_C = new BigDecimal("1.08");

	public Javelin() {
		super();
		this.setDistance("7.01");
	}
	
	public Javelin(String measurement) {
		if (measurement == null || measurement.equals("")) {
			this.setDistance("7.01");
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
