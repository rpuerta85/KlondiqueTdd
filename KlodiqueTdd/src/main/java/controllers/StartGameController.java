package controllers;

import java.util.ArrayList;
import java.util.Stack;
import models.Board;
import models.Card;


public class StartGameController {
	private Board board;
	
	public StartGameController() {
		super();
		board = new Board();
		board.initDeck();
	}

	public int sizeWaste() {
		return board.getWaste().size();
	}

	public ArrayList<Stack<Card>> sizeFoundation() {
		for(int i = 0;i<Board.STACK_OF_FOUNDATIONS;i++) {
			board.getSizeFoundations().add(new Stack<Card>());
		}
		return board.getSizeFoundations();
	}

	public int sizeDeck() {
		for (int i = 0;i<Board.NUM_CARDS_IN_DECK;i++){
			Card c = board.getDeck().peek();
			c.setUncovered(false);
			board.getDeckCardsStack().add(c);
		}
		return board.getDeckCardsStack().size();
	}

	public ArrayList<Stack<Card>> sizeCoveredCardsTableaus() {
		for (int i = 0;i<Board.STACKS_OF_COVERED__UNCOVERED_CARDS;i++){
			board.getCoveredCardsStackTableaus().add(new Stack<Card>());
			for(int j =0;j<i;j++){
				board.getCoveredCardsStackTableaus().get(i).push(board.getDeck().peek());
			}
		}
		return board.getCoveredCardsStackTableaus();
	}
	
	public ArrayList<Stack<Card>> uncoveredCardsStackTableaus() {
		for (int i = 0;i<Board.STACKS_OF_COVERED__UNCOVERED_CARDS;i++){
			board.getUncoveredCardsStackTableaus().add(new Stack<Card>());
			Card c = board.getDeck().peek();
			c.setUncovered(true);
			board.getUncoveredCardsStackTableaus().get(i).push(c);
		}
		return board.getUncoveredCardsStackTableaus();
	}

	
	public Board getBoard() {
		return board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
	
	
}
