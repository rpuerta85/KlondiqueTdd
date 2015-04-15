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
		startGameController = new StartGameController(board);
		startGameController.startGame();
		board = startGameController.getBoard();
		moveFromWasteToFoundationController = new MoveFromWasteToFoundationController(board);
		
		
	}
	
	@Test
	public void moveFromDeckToFoundationControllerTest() {
		Card card = board.getDeck().pop();
		card.setUncovered(true);
		board.getWaste().push(card);
		card.setNumber(1);
		int foundationindex = 0;
		int oldWasteSize = board.getWaste().size();
		int oldFoundationSize = board.getSizeFoundations().get(foundationindex).size();
		
		try {
			moveFromWasteToFoundationController.moveFromWasteToFoundation(foundationindex);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(oldWasteSize-1, board.getWaste().size());
		assertEquals(oldFoundationSize+1, board.getSizeFoundations().get(foundationindex).size());
	}
	
	@Test(expected = java.lang.Exception.class) 
	public void moveFromDeckToFoundationControllerExceptionTest() throws Exception {
		int foundationindex = 0;
		moveFromWasteToFoundationController.moveFromWasteToFoundation(foundationindex);
	}

	@Test
	public void isMoveFromWasteToFoundationMovementOKTest() {
		int foundationindex = 0;
		boolean ok = moveFromWasteToFoundationController.isMoveFromWasteToFoundationMovementOK(foundationindex);
		assertFalse(ok);
		
		Card card = board.getDeck().pop();
		card.setNumber(1);
		card.setUncovered(true);
		board.getWaste().push(card);
		
		ok = moveFromWasteToFoundationController.isMoveFromWasteToFoundationMovementOK(foundationindex);
		assertTrue(ok);


		
	}
}
