package controllers;

import static org.junit.Assert.*;
import models.Board;
import models.Card;
import models.Foundation;
import models.FoundationsType;

import org.junit.Before;
import org.junit.Test;

import controllers.StartGameController;


public class MoveFromWasteToTableauxControllerTest{

	private MoveFromWasteToTableauxController moveFromWasteToTableauxController;
	private StartGameController startGameController;
	private Board board;
	private static final int FOUNDATION_INDEX_TEST = 1;
	
	@Before
	public void before() {
		board = new Board();
		startGameController = new StartGameController(board);
		startGameController.startGame();
		board = startGameController.getBoard();
		moveFromWasteToTableauxController = new MoveFromWasteToTableauxController(board);

	}
	
	
	@Test
	public void moveFromWasteToTableauxTest() {
		Card card = board.getDeckCardsStack().pop();
		card.setUncovered(true);
		card.setNumber(new Integer("12"));
		board.getUncoveredCardsStackTableaus().get(FOUNDATION_INDEX_TEST).peek().setNumber(Board.NUM_CARDS_FOR_FOUNDATION);
		board.getWaste().push(card);
			
		
		
		try {
			assertTrue(moveFromWasteToTableauxController.moveFromWasteToTableaux(FOUNDATION_INDEX_TEST));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
