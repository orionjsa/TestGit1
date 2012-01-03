package org.combinedEvent;

public class Event {

	private String competitor; // object athlete
	private String venue; // object with place & date
	private Result result;
	
	public Event() {
		result = new Result();
	}

	protected void setPerformance(String perf) {
		result.setPerformance(perf);
	}

}
