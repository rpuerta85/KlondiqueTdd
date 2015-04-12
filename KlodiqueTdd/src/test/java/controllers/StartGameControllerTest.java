package controllers;

import static org.junit.Assert.*;
import models.Board;


import org.junit.Before;
import org.junit.Test;

import controllers.StartGameController;


public class StartGameControllerTest {

	private StartGameController startGameController;
	
	@Before
	public void before() {
		//SUT
		startGameController = new StartGameController();
	}
	@Test
	public void startGameTest() {
		startGameController.startGame();
		assertEquals(Board.NUM_CARDS,startGameController.getBoard().getDeck().size());
	}
	
	
}
