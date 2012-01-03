package org.combinedEvent.cas2;


public class C110mH extends TrackEvent {

	private final String PARAM_A = "5.74352";
	private final String PARAM_B = "28.50";
	private final String PARAM_C = "1.92";

	public C110mH() {
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
