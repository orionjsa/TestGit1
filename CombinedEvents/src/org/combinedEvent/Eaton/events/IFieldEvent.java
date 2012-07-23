package org.combinedEvent.Eaton.events;

import java.math.BigDecimal;

public interface IFieldEvent extends IEvent {
	
	public static final BigDecimal FIELD_EVENT = new BigDecimal("1");

	public String getDistance();
	public void setDistance(String distance);
}
