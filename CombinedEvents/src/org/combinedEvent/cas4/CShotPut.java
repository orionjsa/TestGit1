package org.combinedEvent.cas4;


public class CShotPut extends Event implements IFieldEvent {

	private final String PARAM_A = "51.39";
	private final String PARAM_B = "1.50";
	private final String PARAM_C = "1.05";

	public CShotPut() {
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
