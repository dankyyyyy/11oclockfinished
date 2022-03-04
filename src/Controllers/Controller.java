package Controllers;

import model.Card;

public class Controller {

	public void createCards() {
		for(int n = 1; n<=13; n++) {
			for(int t = 1; t<=4; t++) {
				Card card = new Card(getNumber(n), getType(t));
				//ADD CARD TO STACK
				System.out.println(card.getNumber() + "   " + card.getType());
			}
		}
	}
	
	private String getNumber(int n) {
		String number = "";
		if(n<=10) {
			number += n;
		}else {
			switch(n) {
			case 11:
				number = "J";
				break;
			case 12:
				number = "K";
				break;
			case 13:
				number = "A";
				break;
			}
		}
		return number;
	}
	
	private String getType(int t) {
		String type = "";
		switch(t) {
		case 1:
			type = "spades";
			break;
		case 2:
			type = "clubs";
			break;
		case 3:
			type = "diamonds";
			break;
		case 4:
			type = "hearts";
			break;
		}
		return type;
	}
}
