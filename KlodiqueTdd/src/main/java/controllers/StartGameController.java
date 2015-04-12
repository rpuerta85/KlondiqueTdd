package controllers;

import java.util.ArrayList;
import java.util.Stack;

import models.Card;
import models.ColorType;
import models.Foundation;
import models.FoundationsType;

public class StartGameController {

	private static final int STACK_OF_FOUNDATIONS = 4;
	 static final int NUM_CARDS_IN_DECK = 24;
	 static final int STACKS_OF_COVERED__UNCOVERED_CARDS = 7;
	
	private Stack<Card> waste = new Stack<Card>();
	private ArrayList<Stack<Card>> sizeFoundations = new ArrayList<Stack<Card>>();
	private Stack<Card> deckCardsStack = new Stack<Card>();
	private ArrayList<Stack<Card>> coveredCardsStackTableaus = new ArrayList<Stack<Card>>();
	private ArrayList<Stack<Card>> uncoveredCardsStackTableaus = new ArrayList<Stack<Card>>();
	
	private Foundation[] listFoundations = {new Foundation(FoundationsType.DIAMOND, ColorType.RED),
			new Foundation(FoundationsType.HEART, ColorType.RED),
			new Foundation(FoundationsType.SPADES, ColorType.BLACK),
			new Foundation(FoundationsType.CLOVER, ColorType.BLACK)
	};
	
	private Stack<Card> deck = new Stack<Card>();
	public void initDeck(){
		for(int j=0;j<4;j++){
			for(int i=0;i<13;i++){
				Card card = new Card(false);
				card.setFoundation(listFoundations[j]);
				card.setNumber(new Integer(i+1));
				deck.add(card);
			}
			
			
		}
		
		
		
		
	}
	public int sizeWaste() {
		return waste.size();
	}

	public ArrayList<Stack<Card>> sizeFoundation() {
		for(int i = 0;i<STACK_OF_FOUNDATIONS;i++) {
			sizeFoundations.add(new Stack<Card>());
		}
		return sizeFoundations;
	}

	public int sizeDeck() {
		for (int i = 0;i<NUM_CARDS_IN_DECK;i++){
			deckCardsStack.add(new Card(false));
		}
		return deckCardsStack.size();
	}

	public ArrayList<Stack<Card>> sizeCoveredCardsTableaus() {
		for (int i = 0;i<STACKS_OF_COVERED__UNCOVERED_CARDS;i++){
			coveredCardsStackTableaus.add(new Stack<Card>());
			for(int j =0;j<i;j++){
				coveredCardsStackTableaus.get(i).push(new Card(false));
			}
		}
		return coveredCardsStackTableaus;
	}
	
	public ArrayList<Stack<Card>> uncoveredCardsStackTableaus() {
		for (int i = 0;i<STACKS_OF_COVERED__UNCOVERED_CARDS;i++){
			uncoveredCardsStackTableaus.add(new Stack<Card>());
			uncoveredCardsStackTableaus.get(i).push(new Card(true));
		}
		return uncoveredCardsStackTableaus;
	}

	public Stack<Card> getDeck() {
		return deck;
	}

	
	public Stack<Card> getWaste() {
		return waste;
	}

	public ArrayList<Stack<Card>> getSizeFoundations() {
		return sizeFoundations;
	}

	public Stack<Card> getDeckCardsStack() {
		return deckCardsStack;
	}

	public ArrayList<Stack<Card>> getCoveredCardsStackTableaus() {
		return coveredCardsStackTableaus;
	}

	public ArrayList<Stack<Card>> getUncoveredCardsStackTableaus() {
		return uncoveredCardsStackTableaus;
	}
	
	
}
