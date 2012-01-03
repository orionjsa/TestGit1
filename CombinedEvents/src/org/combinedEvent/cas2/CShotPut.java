package org.combinedEvent.cas2;


public class CShotPut extends FieldEvent {

	private final String PARAM_A = "51.39";
	private final String PARAM_B = "1.50";
	private final String PARAM_C = "1.05";

	public CShotPut() {
		// TODO Auto-generated constructor stub
	}
	
	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
		points = compute(distance, PARAM_A, PARAM_B, PARAM_C);;
	}

	public String getPoints() {
		return points;
	}
}
