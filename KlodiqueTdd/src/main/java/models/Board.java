package models;

import java.util.ArrayList;
import java.util.Stack;


public class Board {
	  static final int STACK_OF_FOUNDATIONS = 4;
	  public static final int NUM_CARDS_IN_DECK = 24;
	  static final int STACKS_OF_COVERED__UNCOVERED_CARDS = 7;
	 public static final int NUM_CARDS = 52;
	 public static final int NUM_CARDS_FOR_FOUNDATION = 13;
	
	 
	private Stack<Card> waste = new Stack<Card>();
	private ArrayList<Stack<Card>> sizeFoundations = new ArrayList<Stack<Card>>();
	private Stack<Card> deckCardsStack = new Stack<Card>();
	private ArrayList<Stack<Card>> coveredCardsStackTableaus = new ArrayList<Stack<Card>>();
	private ArrayList<Stack<Card>> uncoveredCardsStackTableaus = new ArrayList<Stack<Card>>();
	
	private Stack<Card> deck = new Stack<Card>();
	
	private Foundation[] listFoundations = {new Foundation(FoundationsType.DIAMOND),
			new Foundation(FoundationsType.HEART),
			new Foundation(FoundationsType.SPADES),
			new Foundation(FoundationsType.CLOVER)
	};
	public void initBoard(){
		initDeck();
		initSizeFoundation();
		initSizeDeck();
		initSizeCoveredCardsTableaus();
		initUncoveredCardsStackTableaus();
	}

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
	public int sizeWaste() {
		return waste.size();
	}

	public ArrayList<Stack<Card>> initSizeFoundation() {
		for(int i = 0;i<Board.STACK_OF_FOUNDATIONS;i++) {
			sizeFoundations.add(new Stack<Card>());
		}
		return sizeFoundations;
	}

	public int initSizeDeck() {
		for (int i = 0;i<Board.NUM_CARDS_IN_DECK;i++){
			Card c = deck.pop();
			c.setUncovered(false);
			deckCardsStack.add(c);
		}
		return deckCardsStack.size();
	}

	public ArrayList<Stack<Card>> initSizeCoveredCardsTableaus() {
		for (int i = 0;i<Board.STACKS_OF_COVERED__UNCOVERED_CARDS;i++){
			coveredCardsStackTableaus.add(new Stack<Card>());
			for(int j =0;j<i;j++){
				coveredCardsStackTableaus.get(i).push(deck.pop());
			}
		}
		return coveredCardsStackTableaus;
	}
	
	public ArrayList<Stack<Card>> initUncoveredCardsStackTableaus() {
		for (int i = 0;i<Board.STACKS_OF_COVERED__UNCOVERED_CARDS;i++){
			uncoveredCardsStackTableaus.add(new Stack<Card>());
			Card c = deck.pop();
			c.setUncovered(true);
			uncoveredCardsStackTableaus.get(i).push(c);
		}
		return uncoveredCardsStackTableaus;
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
