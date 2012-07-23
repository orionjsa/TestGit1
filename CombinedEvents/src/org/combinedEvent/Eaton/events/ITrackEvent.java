package org.combinedEvent.Eaton.events;

import java.math.BigDecimal;


public interface ITrackEvent extends IEvent {
	
	public static final BigDecimal TRACK_EVENT = new BigDecimal("-1");

	public String getTime();
	public void setTime(String time);
	
}
