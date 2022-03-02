/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		Deck deck1 = new Deck(new String[]{"1", "2", "3", "4", "5"}, new String[]{"spades", "diamonds"}, new int[]{1,2,3,4,5});
		Deck deck2 = new Deck(new String[]{"6", "7", "8", "9", "10"}, new String[]{"clubs", "hearts"}, new int[]{6,7,8,9,10});
		Deck deck3 = new Deck(new String[]{"jack", "queen", "king", "ace"}, new String[]{"face"}, new int[]{10,10,10,1});
		System.out.println(deck1);
		System.out.println(deck2);
		System.out.println(deck3);
	}
}
