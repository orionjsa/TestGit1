package org.combinedEvent.Eaton.events;

import java.math.BigDecimal;


public class Shotput extends Event implements IFieldEvent {

	private final BigDecimal PARAM_A = new BigDecimal("51.39");
	private final BigDecimal PARAM_B = new BigDecimal("1.50");
	private final BigDecimal PARAM_C = new BigDecimal("1.05");

	public Shotput() {
		super();
		this.setDistance("1.51");
	}
	
	public Shotput(String measurement) {
		if (measurement == null || measurement.equals("")) {
			this.setDistance("1.51");
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
