package controllers;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Stack;

import junit.framework.Assert;
import models.Card;

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
	public void sizeWasteTest() {
		assertEquals(0,startGameController.sizeWaste()); 
	}
	@Test
	public void sizeFoundationTest() {
		for(Stack<Card> sizeFoundation : startGameController.sizeFoundation()) {
			assertEquals(0,sizeFoundation.size());
		}
	}
	@Test
	public void sizeDeckTest() {
			assertEquals(StartGameController.NUM_CARDS_IN_DECK,startGameController.sizeDeck());
	}
	
	
	
	@Test
	public void sizeTableausTest() {
		ArrayList<Stack<Card>> coveredCardsStackTableaus = startGameController.sizeCoveredCardsTableaus();
		ArrayList<Stack<Card>> uncoveredCardsStackTableaus = startGameController.uncoveredCardsStackTableaus();//array de pilas de cartas descubiertas
		assertEquals(StartGameController.STACKS_OF_COVERED__UNCOVERED_CARDS,coveredCardsStackTableaus.size());
		assertEquals(StartGameController.STACKS_OF_COVERED__UNCOVERED_CARDS,uncoveredCardsStackTableaus.size());
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
	
	@Test
	public void initDeckTest() {
		startGameController.initDeck();
		assertEquals(52,startGameController.getDeck().size());

	}
	
	
	

}
