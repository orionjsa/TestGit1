package org.combinedEvent.Eaton.events;

import java.math.BigDecimal;


public class Run400m extends Event implements ITrackEvent {

	private final BigDecimal PARAM_A = new BigDecimal("1.53775");
	private final BigDecimal PARAM_B = new BigDecimal("82.00");
	private final BigDecimal PARAM_C = new BigDecimal("1.81");

	public Run400m() {
		super();
		this.setTime("81.99");
	}
	
	public Run400m(String time) {
		if (time == null || time.equals("")) {
			this.setTime("81.99");
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