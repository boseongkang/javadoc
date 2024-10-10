package assignment1;

/**
 * Represent a playing card.
 */
public class MyCard
{
    private String shorthand; // optional for this questions
    private final String suit;

    /**
     * Construct a playing card by its shorthand.
     *
     * @param shorthand sharthand of a playing card in format of RankSuit
     */
    public MyCard(String shorthand)
    {
        this.shorthand = shorthand; // optional
        // the code to "calculate" the suit should be in constructor
        // since constructor is only called once for each object
        // bu getter may be called more than once

        // "calculate" suit(get shorthand of suit first)
        // exmaples 10s, QC, KH, etc..
        char shortSuit = shorthand.charAt(shorthand.length()-1);
        suit = switch(shortSuit)
        {
            case 'H' -> "Hearts";
            case 'C' -> "Clubs";
            case 'D' -> "Diamonds";
            case 'S' -> "Spades";
            default -> "Unknown";
        };
    }

    /**
     * Get the full suit of the playing card.
     * @return suit: Hearts, Clubs, Spades, Diamonds, Unkonw.
     */

    public String getSuit() {
        return suit;
    }

}
