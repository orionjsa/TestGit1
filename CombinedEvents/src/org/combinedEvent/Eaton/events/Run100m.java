package org.combinedEvent.Eaton.events;

import java.math.BigDecimal;


public class Run100m extends Event implements ITrackEvent {
	
	private final BigDecimal PARAM_A = new BigDecimal("25.4347");
	private final BigDecimal PARAM_B = new BigDecimal("18.00");
	private final BigDecimal PARAM_C = new BigDecimal("1.81");

	public Run100m() {
		super();
		this.setTime("17.99");
	}
	
	public Run100m(String time) {
		if (time == null || time.equals("")) {
			this.setTime("17.99");
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
