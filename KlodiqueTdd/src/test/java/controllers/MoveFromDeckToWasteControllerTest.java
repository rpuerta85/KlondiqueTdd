package controllers;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import models.Board;
import models.Card;

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
		int oldWasteSize = board.getWaste().size();
		int oldDeckSize = board.getDeck().size();
		try{
		assertTrue(moveFromDeckToWasteController.moveFromDeckToWasteController());
		assertEquals(oldWasteSize+1, board.getWaste().size());
		assertEquals(oldDeckSize-1, board.getDeck().size());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(expected = java.lang.Exception.class) 
	public void moveFromDeckToWasteControllerExceptionTest() throws Exception {
		board.getDeck().clear();
		moveFromDeckToWasteController.moveFromDeckToWasteController();
	}
	
	
}
