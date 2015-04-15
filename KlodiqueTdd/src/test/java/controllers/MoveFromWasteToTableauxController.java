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
		 if(board.getWaste().size()!=0 ){
			 if(board.getWaste().size()!=0) {
			 Card card = board.getWaste().peek();
			 ok =
					 (uncoveredCardsStackTableau.size()==0 && card.getNumber().intValue()==13 ) || 
						(uncoveredCardsStackTableau.peek().getNumber().intValue()==card.getNumber().intValue()+1 && 
								uncoveredCardsStackTableau.peek().getFoundation().getColor()!=card.getFoundation().getColor());
			 }else {
				 throw new Exception("Incorrect movement");
			 	}
			 }
		 else {
			 throw new Exception("Incorrect movement");
		 }
		
		return ok;		
	}

}
