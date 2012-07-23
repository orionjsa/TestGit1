package org.combinedEvent.cas7;

import java.math.BigDecimal;

public abstract class EventAbstract {

	protected final String TRACK_EVENT = "-1";
	protected final String FIELD_EVENT = "1";
	
	protected String perf;
	protected String points;

	public EventAbstract() {
		// TODO Auto-generated constructor stub
	}

	protected String compute(String perf, String pA, String pB, String pC, String pS) {
		BigDecimal mPerf = new BigDecimal(perf);
		BigDecimal a = new BigDecimal(pA);
		BigDecimal b = new BigDecimal(pB);
		BigDecimal c = new BigDecimal(pC);
		BigDecimal mPoints = a.multiply(new BigDecimal(Math.pow(mPerf.subtract(b).multiply(new BigDecimal(pS)).doubleValue(),c.doubleValue())));
		mPoints = mPoints.setScale(0, BigDecimal.ROUND_DOWN);
		return mPoints.toString();
	}
}
