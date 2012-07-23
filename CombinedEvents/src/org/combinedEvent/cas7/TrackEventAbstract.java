package org.combinedEvent.cas7;


public abstract class TrackEventAbstract extends EventAbstract{

	public TrackEventAbstract() {
		// TODO Auto-generated constructor stub
	}

	protected String compute2(String perf, String pA, String pB, String pC) {
		return super.compute(perf, pA, pB, pC, TRACK_EVENT);
	}
}
