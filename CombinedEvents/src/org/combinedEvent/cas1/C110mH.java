package org.combinedEvent.cas1;

import java.math.BigDecimal;

public class C110mH {

	private final String PARAM_A = "5.74352";
	private final String PARAM_B = "28.50";
	private final String PARAM_C = "1.92";

	private String time;
	private String points;
	
	public C110mH() {
		// TODO Auto-generated constructor stub
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
		points = compute(time);
	}

	public String getPoints() {
		return points;
	}
	
	private String compute(String time) {
		BigDecimal mTime = new BigDecimal(time);
		BigDecimal a = new BigDecimal(PARAM_A);
		BigDecimal b = new BigDecimal(PARAM_B);
		BigDecimal c = new BigDecimal(PARAM_C);
		BigDecimal mPoints = a.multiply(new BigDecimal(Math.pow(b.subtract(mTime).doubleValue(),c.doubleValue())));
		mPoints = mPoints.setScale(0, BigDecimal.ROUND_DOWN);
		return mPoints.toString();
	}
}
