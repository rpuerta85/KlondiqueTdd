package controllers;

import java.util.Stack;

import models.Board;
import models.Card;

public class MoveFromWasteToTableauxController extends KlondiqueController {

	public MoveFromWasteToTableauxController(Board board) {
		super(board);
	}

	public boolean moveFromWasteToTableaux(int uncoveredCardsStackTableausIndex) throws Exception {
		Stack<Card> uncoveredCardsStackTableau = board.getUncoveredCardsStackTableaus().get(uncoveredCardsStackTableausIndex);
		boolean ok = false;
		 if(!board.getWaste().empty() ){
			 if(!board.getWaste().empty()) {
			 Card card = board.getWaste().peek();
			 ok =
					 (uncoveredCardsStackTableau.empty() && card.getNumber().intValue()==Board.NUM_CARDS_FOR_FOUNDATION ) || 
						(uncoveredCardsStackTableau.peek().getNumber().intValue()==card.getNumber().intValue()+1 && 
								uncoveredCardsStackTableau.peek().getFoundation().getColor()!=card.getFoundation().getColor());
			 }else {
				 throw new Exception("Incorrect movement");
			 	}
			 }
		 else {
			 throw new Exception("There is not cards in waste");
		 }
		
		return ok;		
	}

}
