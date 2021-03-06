package org.combinedEvent.decathlon.events;

import java.math.BigDecimal;


public class Shotput extends Event implements IFieldEvent {

	private final BigDecimal PARAM_A = new BigDecimal("51.39");
	private final BigDecimal PARAM_B = new BigDecimal("1.50");
	private final BigDecimal PARAM_C = new BigDecimal("1.05");

	public Shotput() {
		super();
	}
	
	public Shotput(String measurement) {
		this.setDistance(measurement);
	}
	
	public String getDistance() {
		return perf;
	}

	public void setDistance(String distance) {
		this.perf = distance;
		if (distance == null || distance.equals("")) {
			distance ="1.51";
		}
		points = compute(new BigDecimal(distance), PARAM_A, PARAM_B, PARAM_C, FIELD_EVENT);
	}

	public int getPoints() {
		return points;
	}
	
	public String findPerfWithPoints(BigDecimal points) {
		BigDecimal bd = retreivePerf(points, PARAM_A, PARAM_B, PARAM_C, FIELD_EVENT);
		return bd.setScale(2, BigDecimal.ROUND_UP).toString();
	}
}
