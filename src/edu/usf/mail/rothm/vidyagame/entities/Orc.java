package edu.usf.mail.rothm.vidyagame.entities;

public class Orc extends LivingThing {
	public Orc(Player player) {
		super.setName("Orc");
		super.setHealth(player.getLevel() + 5);
	}
}
