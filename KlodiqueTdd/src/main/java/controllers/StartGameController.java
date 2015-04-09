package controllers;

import java.util.ArrayList;
import java.util.Stack;

import models.Card;

public class StartGameController {

	private static final int STACK_OF_FOUNDATIONS = 4;
	private static final int NUM_CARDS_IN_DECK = 24;
	private static final int STACKS_OF_COVERED__UNCOVERED_CARDS = 7;
	
	private Stack<Card> waste = new Stack<Card>();
	private ArrayList<Stack<Card>> sizeFoundations = new ArrayList<Stack<Card>>();
	private Stack<Card> deckCardsStack = new Stack<Card>();
	private ArrayList<Stack<Card>> coveredCardsStackTableaus = new ArrayList<Stack<Card>>();

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
		ArrayList<Stack<Card>> uncoveredCardsStackTableaus = new ArrayList<Stack<Card>>();
		for (int i = 0;i<STACKS_OF_COVERED__UNCOVERED_CARDS;i++){
			uncoveredCardsStackTableaus.add(new Stack<Card>());
			uncoveredCardsStackTableaus.get(i).push(new Card(true));
		}
		return uncoveredCardsStackTableaus;
	}
	

}
