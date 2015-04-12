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
		//initBoard();
	}

	public void startGame(){
		initBoard();
	}
	private void initBoard(){
		board.initDeck();
		board.initSizeFoundation();
		board.initSizeDeck();
		board.initSizeCoveredCardsTableaus();
		board.initUncoveredCardsStackTableaus();
	}
	
	public Board getBoard() {
		return board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}

	
}
