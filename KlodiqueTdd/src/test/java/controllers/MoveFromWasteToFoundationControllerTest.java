package controllers;

import static org.junit.Assert.*;

import models.Board;
import models.Card;

import org.junit.Before;
import org.junit.Test;

import controllers.StartGameController;


public class MoveFromWasteToFoundationControllerTest{

	private MoveFromWasteToFoundationController moveFromWasteToFoundationController;
	private StartGameController startGameController;
	private Board board;
	
	
	@Before
	public void before() {
		board = new Board();
		startGameController = new StartGameController();
		startGameController.startGame();
		board = startGameController.getBoard();
		moveFromWasteToFoundationController = new MoveFromWasteToFoundationController(board);
		
		
	}
	
	@Test
	public void moveFromDeckToFoundationControllerTest() {
		Card card = board.getDeck().pop();
		card.setUncovered(true);
		board.getWaste().push(card);
		
		int foundationindex = 0;
		int oldWasteSize = board.getWaste().size();
		int oldFoundationSize = board.getSizeFoundations().get(foundationindex).size();
		
		try {
			moveFromWasteToFoundationController.moveFromWasteToFoundationController(foundationindex);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(oldWasteSize-1, board.getWaste().size());
		assertEquals(oldFoundationSize+1, board.getSizeFoundations().get(foundationindex).size());
	}
	
	@Test(expected = java.lang.Exception.class) 
	public void moveFromDeckToFoundationControllerExceptionTest() throws Exception {
		int foundationindex = 0;
		moveFromWasteToFoundationController.moveFromWasteToFoundationController(foundationindex);
	}

	
}
