package org.combinedEvent.cas4;


public class C1500m extends Event {

	private final String PARAM_A = "0.03768";
	private final String PARAM_B = "480.00";
	private final String PARAM_C = "1.85";

	public C1500m() {
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
