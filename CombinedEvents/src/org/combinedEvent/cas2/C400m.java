package org.combinedEvent.cas2;


public class C400m extends TrackEvent {

	private final String PARAM_A = "1.53775";
	private final String PARAM_B = "82.00";
	private final String PARAM_C = "1.81";

	public C400m() {
		// TODO Auto-generated constructor stub
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
		points = compute(time, PARAM_A, PARAM_B, PARAM_C);
	}

	public String getPoints() {
		return points;
	}
}
