package com.thoughtworks.business_house.game_entities.cells;

import com.thoughtworks.business_house.game_entities.Cell;
import com.thoughtworks.business_house.player_entities.Player;

public class Treasure implements Cell {

	private final int treasureAmount = 200;

	@Override
	public void updatePlayerWallet(Player player) {
		player.getWallet().addMoney(treasureAmount);

	}

}
