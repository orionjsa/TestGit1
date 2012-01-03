package org.combinedEvent.cas2;

import java.math.BigDecimal;

public class TrackEvent {

	protected String time;
	protected String points;

	public TrackEvent() {
		// TODO Auto-generated constructor stub
	}

	protected String compute(String time, String pA, String pB, String pC) {
		BigDecimal mTime = new BigDecimal(time);
		BigDecimal a = new BigDecimal(pA);
		BigDecimal b = new BigDecimal(pB);
		BigDecimal c = new BigDecimal(pC);
		BigDecimal mPoints = a.multiply(new BigDecimal(Math.pow(b.subtract(mTime).doubleValue(),c.doubleValue())));
		mPoints = mPoints.setScale(0, BigDecimal.ROUND_DOWN);
		return mPoints.toString();
	}
}
