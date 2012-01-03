package org.combinedEvent.cas2;

import java.math.BigDecimal;

public class FieldEvent {

	protected String distance;
	protected String points;

	public FieldEvent() {
		// TODO Auto-generated constructor stub
	}

	protected String compute(String distance, String pA, String pB, String pC) {
		BigDecimal mDistance = new BigDecimal(distance);
		BigDecimal a = new BigDecimal(pA);
		BigDecimal b = new BigDecimal(pB);
		BigDecimal c = new BigDecimal(pC);
		BigDecimal mPoints = a.multiply(new BigDecimal(Math.pow(mDistance.subtract(b).doubleValue(),c.doubleValue())));
		mPoints = mPoints.setScale(0, BigDecimal.ROUND_DOWN);
		return mPoints.toString();
	}
}
