package org.combinedEvent.cas3;


public class C400m extends Event {

	private final String PARAM_A = "1.53775";
	private final String PARAM_B = "82.00";
	private final String PARAM_C = "1.81";

	public C400m() {
		// TODO Auto-generated constructor stub
	}

	public String getTime() {
		return perf;
	}

	public void setTime(String time) {
		this.perf = time;
		points = compute(time, PARAM_A, PARAM_B, PARAM_C, TRACK_EVENT);
	}

	public String getPoints() {
		return points;
	}
}
