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
	//private Foundation foundationDiamond = new Foundation(FoundationsType.DIAMOND, )
	
	@Before
	public void before() {
		board = new Board();
		//board.getUncoveredCardsStackTableaus().get(0).add(new Card(true, new F ., number));
		
		
		
		
		
		
		
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
		board.getUncoveredCardsStackTableaus().get(1).peek().setNumber(13);
		board.getWaste().push(card);
			
		
		
		try {
			assertTrue(moveFromWasteToTableauxController.moveFromWasteToTableaux(1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
