package com.thoughtworks.business_house.game_entities.cells;

import com.thoughtworks.business_house.exception.InsufficientAmountException;
import com.thoughtworks.business_house.game_entities.Cell;
import com.thoughtworks.business_house.player_entities.Player;

public class Hotel implements Cell {

	final private int hotelPrice = 200;
	final private int hotelRent = 50;
	private Player owner;
	@Override
	public void updatePlayerWallet(Player player) {
		if(this.owner != null) {
			owner.getWallet().addMoney(hotelRent);
			player.getWallet().takeMoneyOnCredit(hotelRent);
		}else {
			try {
				player.getWallet().takeMoney(hotelPrice);
				this.owner = player;
			}catch(InsufficientAmountException e) {
				
			}
			this.owner = player;
		}

	}

}
