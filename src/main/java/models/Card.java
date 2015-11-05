package models;

public abstract class Card {
	protected String name;
	protected String setNumber;
	protected String rarity;
	protected String condition;
	boolean forSale;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSetNumber() {
		return setNumber;
	}
	public void setSetNumber(String setNumber) {
		this.setNumber = setNumber;
	}
	public String getRarity() {
		return rarity;
	}
	public void setRarity(String rarity) {
		this.rarity = rarity;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public boolean isForSale() {
		return forSale;
	}
	public void setForSale(boolean forSale) {
		this.forSale = forSale;
	}
}
