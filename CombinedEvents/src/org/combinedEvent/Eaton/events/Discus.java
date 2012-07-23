package org.combinedEvent.Eaton.events;

import java.math.BigDecimal;


public class Discus extends Event implements IFieldEvent {

	private final BigDecimal PARAM_A = new BigDecimal("12.91");
	private final BigDecimal PARAM_B = new BigDecimal("4.00");
	private final BigDecimal PARAM_C = new BigDecimal("1.10");

	public Discus() {
		super();
	}
	
	public Discus(String measurement) {
		this.setDistance(measurement);
	}

	public String getDistance() {
		return perf;
	}

	public void setDistance(String distance) {
		this.perf = distance;
		if (distance == null || distance.equals("")) {
			distance ="4.01";
		}
		points = compute(new BigDecimal(distance), PARAM_A, PARAM_B, PARAM_C, FIELD_EVENT);
	}

	public int getPoints() {
		return points;
	}
}
