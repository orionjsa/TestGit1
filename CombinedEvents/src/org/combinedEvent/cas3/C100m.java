package org.combinedEvent.cas3;


public class C100m extends Event {
	
	private final String PARAM_A = "25.4347";
	private final String PARAM_B = "18.00";
	private final String PARAM_C = "1.81";

	public C100m() {
		super();
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
