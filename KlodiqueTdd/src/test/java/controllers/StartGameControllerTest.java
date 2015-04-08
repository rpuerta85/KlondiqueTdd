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
		ArrayList<Integer> sizeFoundations = new  ArrayList<Integer>();
		
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
		ArrayList<Integer> sizeTableaus = startGameController.sizeCoveredCardsTableaus();
		ArrayList<Stack<Card>> uncoveredCardsStackTableaus = startGameController.uncoveredCardsStackTableaus();//array de pilas de cartas descubiertas

		
		assertEquals(7,sizeTableaus.size());
		assertEquals(7,uncoveredCardsStackTableaus.size());
		for(int i = 0; i< sizeTableaus.size();i++) {
			assertEquals(new Integer(i+1),sizeTableaus.get(i));
		}
		for(Stack<Card> uncoveredCardsStack : uncoveredCardsStackTableaus) {
			assertEquals(1,uncoveredCardsStack.size());
			assertTrue(uncoveredCardsStack.peek().uncovered());
			
			
		}
		
	}
	
	
	
	
	

}
