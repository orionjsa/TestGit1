package org.combinedEvent.cas4;


public class CDiscusThrow extends Event  {

	private final String PARAM_A = "12.91";
	private final String PARAM_B = "4.00";
	private final String PARAM_C = "1.10";

	public CDiscusThrow() {
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
