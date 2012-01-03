package org.combinedEvent.cas2;


public class CDiscusThrow extends FieldEvent  {

	private final String PARAM_A = "12.91";
	private final String PARAM_B = "4.00";
	private final String PARAM_C = "1.10";

	public CDiscusThrow() {
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
