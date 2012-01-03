package test;

import org.combinedEvent.cas3.C100m;
import org.combinedEvent.cas3.C110mH;
import org.combinedEvent.cas3.C400m;
import org.combinedEvent.cas3.CDiscusThrow;
import org.combinedEvent.cas3.CHighJump;
import org.combinedEvent.cas3.CJavelinThrow;
import org.combinedEvent.cas3.CLongJump;
import org.combinedEvent.cas3.CPoleVault;
import org.combinedEvent.cas3.CShotPut;

public class Cas3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		C100m event01 = new C100m();
		event01.setTime("10.50");
		System.out.println("100m "+event01.getPoints());
		CLongJump event02 = new CLongJump();
		event02.setMeasurement("750");
		System.out.println("LJ "+event02.getPoints());
		CShotPut event03 = new CShotPut();
		event03.setDistance("15.50");
		System.out.println("SP "+event03.getPoints());
		CHighJump event04 = new CHighJump();
		event04.setMeasurement("203");
		System.out.println("HJ "+event04.getPoints());
		C400m event05 = new C400m();
		event05.setTime("49.75");
		System.out.println("400m "+event05.getPoints());
		C110mH event06 = new C110mH();
		event06.setTime("14.50");
		System.out.println("110mH "+event06.getPoints());
		CDiscusThrow event07 = new CDiscusThrow();
		event07.setDistance("45.50");
		System.out.println("DT "+event07.getPoints());
		CPoleVault event08 = new CPoleVault();
		event08.setMeasurement("510");
		System.out.println("PV "+event08.getPoints());
		CJavelinThrow event09 = new CJavelinThrow();
		event09.setDistance("65.50");
		System.out.println("JT "+event09.getPoints());
		
	}

}
