package controllers;


import models.Board;

import org.junit.Before;
import org.junit.Test;

import controllers.StartGameController;


public class MoveFromDeckToWasteControllerTest{

	private MoveFromDeckToWasteController moveFromDeckToWasteController;
	private StartGameController startGameController;
	private Board board;
	
	
	@Before
	public void before() {
		board = new Board();
		startGameController = new StartGameController(board);
		startGameController.startGame();
		board = startGameController.getBoard();
		moveFromDeckToWasteController = new MoveFromDeckToWasteController(board);
		
		
	}
	
	@Test
	public void moveFromDeckToWasteControllerTest() {
		
	}
	
	
}
