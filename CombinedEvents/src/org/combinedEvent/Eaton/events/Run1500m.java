package org.combinedEvent.Eaton.events;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Run1500m extends Event implements ITrackEvent {

	private final BigDecimal PARAM_A = new BigDecimal("0.03768");
	private final BigDecimal PARAM_B = new BigDecimal("480.00");
	private final BigDecimal PARAM_C = new BigDecimal("1.85");
	
	private Date internalTime;

	public Run1500m() {
		super();
	}
	
	public Run1500m(String time) {
		this.setTime(time);
	}

	public String getTime() {
		return perf;
	}

	public void setTime(String time) {
		this.perf = time;
		if (time == null || time.equals("")) {
			time = "7:59.99";
		}
		SimpleDateFormat stringToDate = new SimpleDateFormat("hh:mm:ss.SSS");
		try {
			this.internalTime = stringToDate.parse("01:"+time+"0");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		points = compute(new BigDecimal(new Double(internalTime.getTime())/1000), PARAM_A, PARAM_B, PARAM_C, TRACK_EVENT);
	}

	public int getPoints() {
		return points;
	}

	public Double getInternalTime() {
		return new Double(internalTime.getTime())/1000;
	}
	
	public static String internalTime2String(Double value) {
		value = value*1000;
		Date date = new Date(value.longValue());
		SimpleDateFormat dateToString = new SimpleDateFormat("hh:mm:ss.SSS");
		String str = dateToString.format(date);
		return str.substring(4, 11);
	}
}
