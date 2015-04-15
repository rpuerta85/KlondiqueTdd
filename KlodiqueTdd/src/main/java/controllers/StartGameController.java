package controllers;

import java.util.ArrayList;
import java.util.Stack;
import models.Board;
import models.Card;


public class StartGameController extends KlondiqueController {
	
	public StartGameController(Board board) {
		super(board);
	}

	public void startGame(){
		board.initBoard();
	}
	
	public Board getBoard() {
		return board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}

	
}
