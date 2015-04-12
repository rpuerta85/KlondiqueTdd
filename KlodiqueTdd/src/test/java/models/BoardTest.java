package models;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Stack;
import models.Board;
import models.Card;

import org.junit.Before;
import org.junit.Test;

import controllers.StartGameController;


public class BoardTest {

	private Board board;
	@Before
	public void before() {
		//SUT
		board = new Board();
		board.initDeck();
	}
	

	@Test
	public void initDeckTest() {
		
		assertEquals(Board.NUM_CARDS,board.getDeck().size());
	}
	


	
	@Test
	public void sizeWasteTest() {
		assertEquals(0,board.sizeWaste()); 
	}
	@Test
	public void sizeFoundationTest() {
		for(Stack<Card> sizeFoundation : board.initSizeFoundation()) {
			assertEquals(0,sizeFoundation.size());
		}
	}
	@Test
	public void sizeDeckTest() {
			assertEquals(Board.NUM_CARDS_IN_DECK,board.initSizeDeck());
	}
	
	@Test
	public void sizeTableausTest() {
		ArrayList<Stack<Card>> coveredCardsStackTableaus = board.initSizeCoveredCardsTableaus();
		ArrayList<Stack<Card>> uncoveredCardsStackTableaus = board.initUncoveredCardsStackTableaus();//array de pilas de cartas descubiertas
		assertEquals(Board.STACKS_OF_COVERED__UNCOVERED_CARDS,coveredCardsStackTableaus.size());
		assertEquals(Board.STACKS_OF_COVERED__UNCOVERED_CARDS,uncoveredCardsStackTableaus.size());
		//comprobamos cada pila de cartas cubiertas
		for(int i = 0; i< coveredCardsStackTableaus.size();i++) {
			assertEquals(new Integer(i).intValue(),coveredCardsStackTableaus.get(i).size());
		}
		
		//comprobamos cada pila de cartas descubiertas
		for(Stack<Card> uncoveredCardsStack : uncoveredCardsStackTableaus) {
			assertEquals(1,uncoveredCardsStack.size());
			assertTrue(uncoveredCardsStack.peek().isUncovered());
		}
		
	}
	
}
