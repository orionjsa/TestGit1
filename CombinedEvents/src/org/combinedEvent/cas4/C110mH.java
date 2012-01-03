package org.combinedEvent.cas4;


public class C110mH extends Event {

	private final String PARAM_A = "5.74352";
	private final String PARAM_B = "28.50";
	private final String PARAM_C = "1.92";

	public C110mH() {
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
