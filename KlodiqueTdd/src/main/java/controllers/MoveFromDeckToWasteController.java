package controllers;

import models.Board;
import models.Card;

public class MoveFromDeckToWasteController extends KlondiqueController {

	public MoveFromDeckToWasteController(Board board) {
		super(board);
	}

	
	public boolean moveFromDeckToWaste() throws Exception {
		boolean ret = false;
		if(board.getDeck().size()!=0){
			Card card = board.getDeck().pop();
			card.setUncovered(true);
			board.getWaste().push(card);
			ret = true;
		}else {
			throw new Exception("Incorrect movement");
		}
		return ret;
	}

}
