package org.combinedEvent.Eaton.events;

import java.math.BigDecimal;


public class Run110mH extends Event implements ITrackEvent {

	private final BigDecimal PARAM_A = new BigDecimal("5.74352");
	private final BigDecimal PARAM_B = new BigDecimal("28.50");
	private final BigDecimal PARAM_C = new BigDecimal("1.92");

	public Run110mH() {
		super();
		this.setTime("28.49");
	}
	
	public Run110mH(String time) {
		if (time == null || time.equals("")) {
			this.setTime("28.49");
		} else {
			this.setTime(time);
		}
	}

	public String getTime() {
		return perf;
	}

	public void setTime(String time) {
		this.perf = time;
		points = compute(new BigDecimal(time), PARAM_A, PARAM_B, PARAM_C, TRACK_EVENT);
	}

	public int getPoints() {
		return points;
	}
}
