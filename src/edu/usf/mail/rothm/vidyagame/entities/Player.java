package edu.usf.mail.rothm.vidyagame.entities;

public class Player extends LivingThing {
	private int xp;

	public int getLevel() {
		return xp / 5;
	}

	public int getXp() {
		return xp;
	}

	public void addXp(int xp) {
		this.xp += xp;
	}
}
