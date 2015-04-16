package controllers;

import static org.junit.Assert.*;

import java.util.Stack;

import models.Board;
import models.Card;
import models.Foundation;
import models.FoundationsType;
import org.junit.Before;
import org.junit.Test;

public class MoveFromWasteToFoundationControllerTest{

	private MoveFromWasteToFoundationController moveFromWasteToFoundationController;
	private Board board;
	private Card card;
	
	@Before
	public void before() {
		board = new Board();
		board.initSizeFoundation();
		card = new Card(false, new Foundation(FoundationsType.DIAMOND), 1);
		moveFromWasteToFoundationController = new MoveFromWasteToFoundationController(board);
	}
	
	@Test
	public void moveFromDeckToFoundationControllerTest() {
		board.getWaste().push(card);
		int foundationindex = 0;
		int oldWasteSize = board.getWaste().size();
		int oldFoundationSize = board.getSizeFoundations().get(foundationindex).size();
		try {
			assertTrue(moveFromWasteToFoundationController.moveFromWasteToFoundation(foundationindex));
			assertEquals(oldWasteSize-1, board.getWaste().size());
			assertEquals(oldFoundationSize+1, board.getSizeFoundations().get(foundationindex).size());
		
			board.getWaste().clear();
			board.getSizeFoundations().get(foundationindex).clear();
			board.getWaste().push(new Card(false, new Foundation(FoundationsType.DIAMOND), 2));
			assertFalse(moveFromWasteToFoundationController.moveFromWasteToFoundation(foundationindex));

			board.getWaste().clear();
			board.getSizeFoundations().get(foundationindex).clear();
			board.getWaste().push(new Card(false, new Foundation(FoundationsType.DIAMOND), 13));
			assertFalse(moveFromWasteToFoundationController.moveFromWasteToFoundation(foundationindex));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		

		
	}
	
	/*@Test(expected = java.lang.Exception.class) 
	public void moveFromDeckToFoundationControllerExceptionTest() throws Exception {
		int foundationindex = 0;
		moveFromWasteToFoundationController.moveFromWasteToFoundation(foundationindex);
	}*/

	@Test
	public void isMoveFromWasteToFoundationMovementOKTest() {
		int foundationindex = 0;
		boolean ok = moveFromWasteToFoundationController.isMoveFromWasteToFoundationMovementOK(foundationindex);
		assertFalse(ok);
		board.getWaste().push(card);
		ok = moveFromWasteToFoundationController.isMoveFromWasteToFoundationMovementOK(foundationindex);
		assertTrue(ok);		
	}
}
