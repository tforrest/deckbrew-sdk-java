package main.java.mtgdata;
import java.util.*;

public class Card {
	/**Card Stats */
	private String name;
	private String id;
	private ArrayList<String> colors;
	private ArrayList<String> types;
	private String cost;
	private String cardText;
	private int cmc;
	
	/** Formats */
	private boolean commanderLegal;
	private boolean legacyLegal;
	private boolean vintageLegal;
	
	/** Deckbrew urls  */
	private String urlDeckBrew;
	private String storeUrlDeckBrew;
	
	public Card() {
		
	}
	
	public String getCardName() {
		return name;
	}
	
	public String getCardId() {
		return id;
	}
	
	public ArrayList<String> getCardColors() {
		return colors;
	}
	
	public ArrayList<String> getCardTypes() {
		return types;
	}
	
	public String getCardCost() {
		return cost;
	}
	
	public String getCardText(){
		return cardText;
	}
	
	public boolean getCommanderLegal() {
		return commanderLegal;
	}
	
	public boolean getLegacyLegal() {
		return legacyLegal;
	}
	
	public boolean vintageLegal() {
		return vintageLegal;
	}
	
	public String getUrlDeckBrew() {
		return urlDeckBrew;
	}
	
	public String getStoreUrl() {
		return storeUrlDeckBrew;
	}

}
