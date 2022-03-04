package model;

public class Card {

	private String number;
	private String suit;
	
	public Card(String number, String suit) {
		this.number = number;
		this.suit = suit;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public String getSuit() {
		return suit;
	}
}
