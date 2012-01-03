package org.combinedEvent.cas2;


public class CJavelinThrow extends FieldEvent  {

	private final String PARAM_A = "10.14";
	private final String PARAM_B = "7.00";
	private final String PARAM_C = "1.08";

	public CJavelinThrow() {
		// TODO Auto-generated constructor stub
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
		points = compute(distance, PARAM_A, PARAM_B, PARAM_C);
	}

	public String getPoints() {
		return points;
	}
}
