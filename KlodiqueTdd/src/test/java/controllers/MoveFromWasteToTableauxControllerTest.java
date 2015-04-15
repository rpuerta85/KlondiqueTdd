package controllers;

import static org.junit.Assert.*;
import models.Board;
import models.Card;

import org.junit.Before;
import org.junit.Test;

import controllers.StartGameController;


public class MoveFromWasteToTableauxControllerTest{

	private MoveFromWasteToTableauxController moveFromWasteToTableauxController;
	private StartGameController startGameController;
	private Board board;
	
	
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
		try {
			assertTrue(moveFromWasteToTableauxController.moveFromWasteToTableaux(1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
