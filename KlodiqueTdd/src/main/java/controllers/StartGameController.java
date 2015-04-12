package controllers;

import java.util.ArrayList;
import java.util.Stack;
import models.Board;
import models.Card;


public class StartGameController {
	private Board board;
	
	public StartGameController() {
		super();
		board = new Board();
		
	}

	public void startGame(){
		board.initDeck();
	}
	
	public Board getBoard() {
		return board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
	
	
}
