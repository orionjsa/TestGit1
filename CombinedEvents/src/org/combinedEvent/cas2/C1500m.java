package org.combinedEvent.cas2;


public class C1500m extends TrackEvent {

	private final String PARAM_A = "0.03768";
	private final String PARAM_B = "480.00";
	private final String PARAM_C = "1.85";

	public C1500m() {
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
