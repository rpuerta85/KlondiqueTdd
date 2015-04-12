package models;

import java.util.ArrayList;
import java.util.Stack;


public class Board {
	  static final int STACK_OF_FOUNDATIONS = 4;
	  static final int NUM_CARDS_IN_DECK = 24;
	  static final int STACKS_OF_COVERED__UNCOVERED_CARDS = 7;
	 public static final int NUM_CARDS = 52;
	 static final int NUM_CARDS_FOR_FOUNDATION = 13;
	
	private Stack<Card> waste = new Stack<Card>();
	private ArrayList<Stack<Card>> sizeFoundations = new ArrayList<Stack<Card>>();
	private Stack<Card> deckCardsStack = new Stack<Card>();
	private ArrayList<Stack<Card>> coveredCardsStackTableaus = new ArrayList<Stack<Card>>();
	private ArrayList<Stack<Card>> uncoveredCardsStackTableaus = new ArrayList<Stack<Card>>();
	
	private Stack<Card> deck = new Stack<Card>();
	
	private Foundation[] listFoundations = {new Foundation(FoundationsType.DIAMOND, ColorType.RED),
			new Foundation(FoundationsType.HEART, ColorType.RED),
			new Foundation(FoundationsType.SPADES, ColorType.BLACK),
			new Foundation(FoundationsType.CLOVER, ColorType.BLACK)
	};
	
	
	public void initDeck(){
		for(int j=0;j<STACK_OF_FOUNDATIONS;j++){
			for(int i=0;i<Board.NUM_CARDS_FOR_FOUNDATION;i++){
				Card card = new Card(false);
				card.setFoundation(listFoundations[j]);
				card.setNumber(new Integer(i+1));
				deck.add(card);
				
			}
			
			
		}

	}


	public Stack<Card> getWaste() {
		return waste;
	}


	public void setWaste(Stack<Card> waste) {
		this.waste = waste;
	}


	public ArrayList<Stack<Card>> getSizeFoundations() {
		return sizeFoundations;
	}


	public void setSizeFoundations(ArrayList<Stack<Card>> sizeFoundations) {
		this.sizeFoundations = sizeFoundations;
	}


	public Stack<Card> getDeckCardsStack() {
		return deckCardsStack;
	}


	public void setDeckCardsStack(Stack<Card> deckCardsStack) {
		this.deckCardsStack = deckCardsStack;
	}


	public ArrayList<Stack<Card>> getCoveredCardsStackTableaus() {
		return coveredCardsStackTableaus;
	}


	public void setCoveredCardsStackTableaus(
			ArrayList<Stack<Card>> coveredCardsStackTableaus) {
		this.coveredCardsStackTableaus = coveredCardsStackTableaus;
	}


	public ArrayList<Stack<Card>> getUncoveredCardsStackTableaus() {
		return uncoveredCardsStackTableaus;
	}


	public void setUncoveredCardsStackTableaus(
			ArrayList<Stack<Card>> uncoveredCardsStackTableaus) {
		this.uncoveredCardsStackTableaus = uncoveredCardsStackTableaus;
	}


	public Stack<Card> getDeck() {
		return deck;
	}


	public void setDeck(Stack<Card> deck) {
		this.deck = deck;
	}


	public Foundation[] getListFoundations() {
		return listFoundations;
	}


	public void setListFoundations(Foundation[] listFoundations) {
		this.listFoundations = listFoundations;
	}
	
	
	
	
}
