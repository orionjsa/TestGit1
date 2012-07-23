package test;

import org.combinedEvent.cas6.DecathlonEvents;

public class Cas6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (DecathlonEvents d : DecathlonEvents.values()) {
			System.out.println(d);
		}
		
		DecathlonEvents deca100m = DecathlonEvents._100m;
		System.out.println(deca100m.compute("10.50"));
		DecathlonEvents decaLong = DecathlonEvents.LONGJUMP;
		System.out.println(decaLong.compute("750"));
	}

}
