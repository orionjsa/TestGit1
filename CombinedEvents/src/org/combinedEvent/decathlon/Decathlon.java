package org.combinedEvent.decathlon;

import org.combinedEvent.decathlon.events.Discus;
import org.combinedEvent.decathlon.events.HighJump;
import org.combinedEvent.decathlon.events.Javelin;
import org.combinedEvent.decathlon.events.LongJump;
import org.combinedEvent.decathlon.events.PoleVault;
import org.combinedEvent.decathlon.events.Run100m;
import org.combinedEvent.decathlon.events.Run110mH;
import org.combinedEvent.decathlon.events.Run1500m;
import org.combinedEvent.decathlon.events.Run400m;
import org.combinedEvent.decathlon.events.Shotput;

public class Decathlon {

	String name;
	
	Run100m run100m = new Run100m();
	LongJump longJump = new LongJump();
	Shotput shotput = new Shotput();
	HighJump highJump = new HighJump();
	Run400m run400m = new Run400m();
	Run110mH run110mH = new Run110mH();
	Discus discus = new Discus();
	PoleVault poleVault = new PoleVault();
	Javelin javelin = new Javelin();
	Run1500m run1500m = new Run1500m();
	
	public Decathlon () {
		
	}
	
	public Decathlon(String name, String time100m, String measureLongJump, String measureShotput, String measureHighJump, String time400m, 
			String time110mH, String measureDiscus, String measurePoleVault, String measureJavelin, String time1500) {
		this.name = name;
		this.run100m = new Run100m(time100m);
		this.longJump = new LongJump(measureLongJump);
		this.shotput = new Shotput(measureShotput);
		this.highJump = new HighJump(measureHighJump);
		this.run400m = new Run400m(time400m);
		this.run110mH = new Run110mH(time110mH);
		this.discus = new Discus(measureDiscus);
		this.poleVault = new PoleVault(measurePoleVault);
		this.javelin = new Javelin(measureJavelin);
		this.run1500m = new Run1500m(time1500);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("** ").append(name).append("\n>>> ").append(getTotal()).append("\n");
		sb.append(run100m.getTime()).append("\t");
		sb.append(longJump.getDistance()).append("\t");
		sb.append(shotput.getDistance()).append("\t");
		sb.append(highJump.getDistance()).append("\t");
		sb.append(run400m.getTime()).append("\t");
		sb.append(run110mH.getTime()).append("\t");
		sb.append(discus.getDistance()).append("\t");
		sb.append(poleVault.getDistance()).append("\t");
		sb.append(javelin.getDistance()).append("\t");
		sb.append(run1500m.getTime()).append("\t");
		sb.append("\n");
		sb.append(run100m.getPoints()).append("\t");
		sb.append(longJump.getPoints()).append("\t");
		sb.append(shotput.getPoints()).append("\t");
		sb.append(highJump.getPoints()).append("\t");
		sb.append(run400m.getPoints()).append("\t");
		sb.append(run110mH.getPoints()).append("\t");
		sb.append(discus.getPoints()).append("\t");
		sb.append(poleVault.getPoints()).append("\t");
		sb.append(javelin.getPoints()).append("\t");
		sb.append(run1500m.getPoints()).append("\t");
		
		return sb.toString();
	}
	
	public int getTotal() {
		return run100m.getPoints()+longJump.getPoints()+shotput.getPoints()+highJump.getPoints()+run400m.getPoints()
				+run110mH.getPoints()+discus.getPoints()+poleVault.getPoints()+javelin.getPoints()+run1500m.getPoints();
	}

	public String getName() {
		return name;
	}

	public Run100m getRun100m() {
		return run100m;
	}

	public LongJump getLongJump() {
		return longJump;
	}

	public Shotput getShotput() {
		return shotput;
	}

	public HighJump getHighJump() {
		return highJump;
	}

	public Run400m getRun400m() {
		return run400m;
	}

	public Run110mH getRun110mH() {
		return run110mH;
	}

	public Discus getDiscus() {
		return discus;
	}

	public PoleVault getPoleVault() {
		return poleVault;
	}

	public Javelin getJavelin() {
		return javelin;
	}

	public Run1500m getRun1500m() {
		return run1500m;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRun100m(Run100m run100m) {
		this.run100m = run100m;
	}

	public void setLongJump(LongJump longJump) {
		this.longJump = longJump;
	}

	public void setShotput(Shotput shotput) {
		this.shotput = shotput;
	}

	public void setHighJump(HighJump highJump) {
		this.highJump = highJump;
	}

	public void setRun400m(Run400m run400m) {
		this.run400m = run400m;
	}

	public void setRun110mH(Run110mH run110mH) {
		this.run110mH = run110mH;
	}

	public void setDiscus(Discus discus) {
		this.discus = discus;
	}

	public void setPoleVault(PoleVault poleVault) {
		this.poleVault = poleVault;
	}

	public void setJavelin(Javelin javelin) {
		this.javelin = javelin;
	}

	public void setRun1500m(Run1500m run1500m) {
		this.run1500m = run1500m;
	}
}
