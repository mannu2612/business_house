package com.thoughtworks.business_house.game_entities.cells;

import com.thoughtworks.business_house.game_entities.Cell;
import com.thoughtworks.business_house.player_entities.Player;

public class Jail implements Cell {
	
	private final int fine = 150;

	@Override
	public void updatePlayerWallet(Player player) {
		player.getWallet().takeMoneyOnCredit(fine);

	}

}
