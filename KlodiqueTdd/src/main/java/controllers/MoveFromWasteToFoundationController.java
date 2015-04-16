package controllers;

import java.util.Stack;

import models.Board;
import models.Card;

public class MoveFromWasteToFoundationController extends KlondiqueController {
	
	public MoveFromWasteToFoundationController(Board board) {
		super(board);
	}

	
	public boolean moveFromWasteToFoundation(int foundationIndex ) {
		Stack<Card> foundation = board.getSizeFoundations().get(foundationIndex);
		boolean ok = isMoveFromWasteToFoundationMovementOK(foundationIndex);
		if(ok){
				Card card = board.getWaste().pop();
				foundation.push(card);
		}
		return ok;
	}
	
	
	 boolean  isMoveFromWasteToFoundationMovementOK(int foundationIndex ) {
		 boolean ok = false;
		 if(!board.getWaste().empty()){
			 Card card = board.getWaste().peek();
			 Stack<Card> foundation = board.getSizeFoundations().get(foundationIndex);			
			 ok = 
						(foundation.empty() && card.getNumber().intValue()==1) || 
						(!foundation.empty() && foundation.peek().getNumber().intValue()==card.getNumber().intValue()-1 && 
						 foundation.peek().getFoundation().getFoundationType()==card.getFoundation().getFoundationType());
		 }
		 return ok;
	
	 }
	
	
}
