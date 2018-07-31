package com.thoughtworks.business_house.game_entities;

import java.util.HashMap;

import com.thoughtworks.business_house.game_entities.cells.EmptyCell;
import com.thoughtworks.business_house.game_entities.cells.Hotel;
import com.thoughtworks.business_house.game_entities.cells.Jail;
import com.thoughtworks.business_house.game_entities.cells.Treasure;

public class Board {

	private HashMap<Integer, Cell> board;
	
	public Board() {
		
	}
	public Board(HashMap<Integer, Cell> board) {
		this.board = board;
	}
	
	public void createBoard(String input) {
		this.board = new HashMap<>();
		String cells [] = input.split(",");
		for(int i = 1; i < cells.length; i++) {
			Cell cell = null;
			if(cells[i].equalsIgnoreCase("E")) {
				cell = new EmptyCell();
			}else if(cells[i].equalsIgnoreCase("J")) {
				cell = new Jail();
			}else if(cells[i].equalsIgnoreCase("T")) {
				cell = new Treasure();
			}else if(cells[i].equalsIgnoreCase("H")) {
				cell = new Hotel();
			}
			this.board.put(i, cell);
		}
		
	}
}
