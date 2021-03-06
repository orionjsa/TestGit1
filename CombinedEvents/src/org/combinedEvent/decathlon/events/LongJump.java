package org.combinedEvent.decathlon.events;

import java.math.BigDecimal;


public class LongJump extends Event implements IFieldEvent {

	private final BigDecimal PARAM_A = new BigDecimal("0.14354");
	private final BigDecimal PARAM_B = new BigDecimal("220.00");
	private final BigDecimal PARAM_C = new BigDecimal("1.40");

	public LongJump() {
		super();
	}
	
	public LongJump(String measurement) {
		this.setDistance(measurement);
	}

	public String getDistance() {
		return perf;
	}

	public void setDistance(String measurement) {
		this.perf = measurement;
		if (measurement == null || measurement.equals("")) {
			measurement ="221";
		}
		points = compute(new BigDecimal(measurement), PARAM_A, PARAM_B, PARAM_C, FIELD_EVENT);
	}

	public int getPoints() {
		return points;
	}
	
	public String findPerfWithPoints(BigDecimal points) {
		BigDecimal bd = retreivePerf(points, PARAM_A, PARAM_B, PARAM_C, FIELD_EVENT);
		return bd.setScale(0, BigDecimal.ROUND_UP).toString();
	}
}
