package controllers;

import static org.junit.Assert.*;
import models.Board;


import org.junit.Before;
import org.junit.Test;

import controllers.StartGameController;



public class StartGameControllerTest{

	private StartGameController startGameController;
	
	@Before
	public void before() {
		//SUT
		startGameController = new StartGameController(new Board());
	}
	
	@Test
	public void startGameTest() {
		startGameController.startGame();
		assertEquals(0,startGameController.getBoard().getDeck().size());
		assertEquals(Board.NUM_CARDS_IN_DECK,startGameController.getBoard().getDeckCardsStack().size());
	}
	
	
	
}
