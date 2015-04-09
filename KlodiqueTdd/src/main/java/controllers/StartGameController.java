package controllers;

import java.util.ArrayList;
import java.util.Stack;

import models.Card;

public class StartGameController {

	public int sizeWaste() {
		return 0;
	}

	public ArrayList<Integer> sizeFoundation() {
		ArrayList<Integer> sizeFoundations = new ArrayList<Integer>();
		for(int i = 0;i<4;i++) {
			sizeFoundations.add(0);
		}
		return sizeFoundations;
	}

	public int sizeDeck() {
		return 24;
	}

	public ArrayList<Stack<Card>> sizeCoveredCardsTableaus() {
		ArrayList<Stack<Card>> coveredCardsStackTableaus = new ArrayList<Stack<Card>>();
		for (int i = 0;i<7;i++){
			coveredCardsStackTableaus.add(new Stack<Card>());
			for(int j =0;j<i;j++){
				coveredCardsStackTableaus.get(i).push(new Card(false));
			}
		}
		return coveredCardsStackTableaus;
	}

	
	
	public ArrayList<Stack<Card>> uncoveredCardsStackTableaus() {
		ArrayList<Stack<Card>> uncoveredCardsStackTableaus = new ArrayList<Stack<Card>>();
		for (int i = 0;i<7;i++){
			uncoveredCardsStackTableaus.add(new Stack<Card>());
			uncoveredCardsStackTableaus.get(i).push(new Card(true));
		}
		return uncoveredCardsStackTableaus;
	}

}
