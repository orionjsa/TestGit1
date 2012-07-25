package org.combinedEvent.decathlon.events;

import java.math.BigDecimal;


public class Run110mH extends Event implements ITrackEvent {

	private final BigDecimal PARAM_A = new BigDecimal("5.74352");
	private final BigDecimal PARAM_B = new BigDecimal("28.50");
	private final BigDecimal PARAM_C = new BigDecimal("1.92");

	public Run110mH() {
		super();
	}
	
	public Run110mH(String time) {
		this.setTime(time);
	}

	public String getTime() {
		return perf;
	}

	public void setTime(String time) {
		this.perf = time;
		if (time == null || time.equals("")) {
			time = "28.49";
		}
		points = compute(new BigDecimal(time), PARAM_A, PARAM_B, PARAM_C, TRACK_EVENT);
	}

	public int getPoints() {
		return points;
	}
	
	public String findPerfWithPoints(BigDecimal points) {
		BigDecimal bd = retreivePerf(points, PARAM_A, PARAM_B, PARAM_C, TRACK_EVENT);
		return bd.setScale(2, BigDecimal.ROUND_DOWN).toString();
	}
}
