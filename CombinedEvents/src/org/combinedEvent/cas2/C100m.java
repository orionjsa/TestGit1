package org.combinedEvent.cas2;


public class C100m extends TrackEvent {
	
	private final String PARAM_A = "25.4347";
	private final String PARAM_B = "18.00";
	private final String PARAM_C = "1.81";

	public C100m() {
		super();
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
