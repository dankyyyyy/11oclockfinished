package model;

public class Card {

	private String number;
	private String type;
	
	public Card(String number, String type) {
		this.number = number;
		this.type = type;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
}
