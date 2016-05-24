package main.java.mtgdata;
import java.util.*;

public class Card {
	/**Card Stats */
	private String name;
	private String id;
	private ArrayList colors;
	private ArrayList types;
	private String cost;
	private String cardText;
	private int cmc;
	
	/**Formats */
	private boolean commanderLegal;
	private boolean legacyLegal;
	private boolean vintageLegal;
	
	/**Deckbrew urls  */
	private String urlDeckBrew;
	private String storeUrlDeckBrew;
	
	public Card() {
		
	}

}
