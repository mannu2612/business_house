package com.thoughtworks.business_house.player_entities;

import com.thoughtworks.business_house.exception.InsufficientAmountException;

public class Wallet {

	private int money;
	
	public Wallet(int money) {
		this.money = money;
	}
	
	public int addMoney(int money) {
		this.money +=money;
		return this.money;
	}
	
	public int takeMoney(int money) {
		if(this.money - money >=0) {
			this.money -=money;
		}else {
			throw new InsufficientAmountException(this.money);
		}
		
		return this.money;
	}
	public int takeMoneyOnCredit(int money) {
		this.money -=money;
		return this.money;
	}
}
