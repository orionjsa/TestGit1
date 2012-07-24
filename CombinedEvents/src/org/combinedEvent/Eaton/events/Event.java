package org.combinedEvent.Eaton.events;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Event {

	protected String perf;
	protected int points;

	public Event() {
		// TODO Auto-generated constructor stub
	}

	protected int compute(BigDecimal perf, BigDecimal a, BigDecimal b, BigDecimal c, BigDecimal s) {
		if (perf == null || perf.equals("")) {
			return 0;
		}
		BigDecimal mPoints = a.multiply(new BigDecimal(Math.pow(perf.subtract(b).multiply(s).doubleValue(),c.doubleValue())));
		mPoints = mPoints.setScale(0, BigDecimal.ROUND_DOWN);
		return mPoints.intValue();
	}
	
	protected BigDecimal retreivePerf(BigDecimal point, BigDecimal a, BigDecimal b, BigDecimal c, BigDecimal s) {
		if (point == null || point.equals("")) {
			return null;
		}
		BigDecimal perf = new BigDecimal(Math.pow(point.divide(a, 5, RoundingMode.HALF_UP).doubleValue(),1.0/c.doubleValue())).multiply(s).add(b);
		return perf;
	}
}
