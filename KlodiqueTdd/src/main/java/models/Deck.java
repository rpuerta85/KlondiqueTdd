package models;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	private List<Card> deck = new ArrayList<Card>();

	
	public Deck() {
		for (int i =0;i<52;i++){
			deck.add(new Card(false));
		}
	}

	public List<Card> getDeck() {
		return deck;
	}

	public int getSize() {
		return deck.size();
	}

	
}
