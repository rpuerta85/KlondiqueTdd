package controllers;

import java.util.Stack;

import models.Board;
import models.Card;

public class MoveFromWasteToFoundationController {
	
	private Board board;
	
	public MoveFromWasteToFoundationController(Board board) {
		super();
		this.board = board;
	}

	public void moveFromWasteToFoundationController(int foundationIndex ) throws Exception {
		Card card = board.getWaste().peek();
		Stack<Card> foundation = board.getSizeFoundations().get(foundationIndex);
		boolean ok =
				foundation.size()==0 || 
				(foundation.peek().getNumber().intValue()==card.getNumber().intValue()-1 && 
				 foundation.peek().getFoundation().getFoundation()==card.getFoundation().getFoundation());
		if(ok){
				card = board.getWaste().pop();
				foundation.push(card);
		}else {
			throw new Exception("Incorrect movement");
		}
	}
	
	
}
