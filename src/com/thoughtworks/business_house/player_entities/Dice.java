package com.thoughtworks.business_house.player_entities;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
	
	public int rollDice() {
		return ThreadLocalRandom.current().nextInt(2, 12 + 1);
	}

}
