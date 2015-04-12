package controllers;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Stack;

import models.Board;
import models.BoardTest;
import models.Card;

import org.junit.Before;
import org.junit.Test;

import controllers.StartGameController;


public class MoveFromWasteToFoundationControllerTest {

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
		Card card = board.getDeck().pop();
		card.setUncovered(true);
		board.getWaste().push(card);
		
	}
	
	
	@Test
	public void moveFromDeckToFoundationControllerTest() {
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
	
	
	
	
}
