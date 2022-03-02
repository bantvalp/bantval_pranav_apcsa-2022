/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 * 
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("ace", "spades", 1);
		Card card2 = new Card("king", "hearts", 10);
		Card card3 = new Card("3", "clubs", 3);
		System.out.println(card1);
		System.out.println(card2);
		System.out.println(card3);
	}
}
