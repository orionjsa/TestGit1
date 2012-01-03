package org.combinedEvent.cas4;


public class CJavelinThrow extends Event  {

	private final String PARAM_A = "10.14";
	private final String PARAM_B = "7.00";
	private final String PARAM_C = "1.08";

	public CJavelinThrow() {
		// TODO Auto-generated constructor stub
	}

	public String getDistance() {
		return perf;
	}

	public void setDistance(String distance) {
		this.perf = distance;
		points = compute(distance, PARAM_A, PARAM_B, PARAM_C, FIELD_EVENT);
	}

	public String getPoints() {
		return points;
	}
}
