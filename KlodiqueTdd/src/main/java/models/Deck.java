package models;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	private List<Card> deck = new ArrayList<Card>();

	public List<Card> getDeck() {
		return deck;
	}

	public int getSize() {
		return deck.size();
	}

	
}