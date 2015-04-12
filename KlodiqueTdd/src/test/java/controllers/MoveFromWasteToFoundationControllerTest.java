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
	private Board board;
	
	@Before
	public void before() {
		board = new Board();
		board.initDeck(); 
		moveFromWasteToFoundationController = new MoveFromWasteToFoundationController(board);
	}
	
	@Test
	public void moveFromDeckToFoundationControllerTest() {
		int foundationindex = 0;
		int oldWasteSize = board.getWaste().size();
		int oldFoundationSize = board.getSizeFoundations().get(foundationindex).size();
		
		Card card = board.getWaste().pop();
		moveFromWasteToFoundationController.moveFromWasteToFoundationController(card,foundationindex);
		assertEquals(oldWasteSize, board.getWaste().size()-1);
		assertEquals(oldFoundationSize+1, board.getSizeFoundations().get(foundationindex).size());

		
	}
	
	
	
	
}
