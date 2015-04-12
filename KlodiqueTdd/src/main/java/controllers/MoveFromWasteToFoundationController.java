package controllers;

import java.util.Stack;

import models.Board;
import models.Card;

public class MoveFromWasteToFoundationController extends KlondiqueController {
	
	public MoveFromWasteToFoundationController(Board board) {
		super(board);
	}

	
	public void moveFromWasteToFoundationController(int foundationIndex ) throws Exception {
		Stack<Card> foundation = board.getSizeFoundations().get(foundationIndex);
		boolean ok = isMoveFromWasteToFoundationMovementOK(foundationIndex);
		if(ok){
				Card card = board.getWaste().pop();
				foundation.push(card);
		}else {
			throw new Exception("Incorrect movement");
		}
	}
	
	 boolean  isMoveFromWasteToFoundationMovementOK(int foundationIndex ) {
		 boolean ok = false;
		 if(board.getWaste().size()!=0){
			 Card card = board.getWaste().peek();
			 Stack<Card> foundation = board.getSizeFoundations().get(foundationIndex);
			 ok =
						foundation.size()==0 || 
						(foundation.peek().getNumber().intValue()==card.getNumber().intValue()-1 && 
						 foundation.peek().getFoundation().getFoundation()==card.getFoundation().getFoundation());
			 }
		 return ok;
	
	 }
	
	
}
