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
		for(int sizeFoundation : startGameController.sizeFoundation()) {
			assertEquals(0,sizeFoundation);
		}
		
	}
	
	
	
	
	
	@Test
	public void sizeDeckTest() {
			assertEquals(24,startGameController.sizeDeck());
	}
	
	@Test
	public void sizeTableausTest() {
		ArrayList<Stack<Card>> coveredCardsStackTableaus = startGameController.sizeCoveredCardsTableaus();
		ArrayList<Stack<Card>> uncoveredCardsStackTableaus = startGameController.uncoveredCardsStackTableaus();//array de pilas de cartas descubiertas

		
		assertEquals(7,coveredCardsStackTableaus.size());
		assertEquals(7,uncoveredCardsStackTableaus.size());
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
