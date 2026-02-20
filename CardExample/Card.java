/**
 * Represents a single playing card
 * Contains the suit, rank, colour, and faceUp values
 * @author Mr. Lamont
 * @version 1.0
 */
public class Card {
    // instance variables
    private int rank;
    private String suit;
    private String colour;
    private boolean faceUp;

    /**
     * Creates a single card of the given suit and rank, face up
     * @param suit The suit of the card ("Clubs, Diamonds, Hearts, Spades")
     * @param rank The rank of the card 1 - Ace, 2-10, 11 - Jack, 12 - Queen, 13 - King
     */
    public Card(String suit, int rank){
        // use this.____ to talk about class variables
        this.faceUp = true;
        this.rank = rank;
        this.suit = suit;

        if(suit.equals("Spades") || suit.equals("Clubs")){
            this.colour = "Black";
        }else{
            this.colour = "Red";
        }
    }


    /**
     * Returns the suit of the given card
     * @return String with the suit
     */
    public String getSuit(){
        return this.suit;
    }

    /**
     * Returns the rank of the card
     * @return String with the rank of the card
     */
    public String getRank()
    {
        String rankString = "";
        if(this.rank == 11){
            rankString += "Jack";
        }else if(this.rank == 12){
            rankString += "Queen";
        }else if(this.rank == 13){
            rankString += "King";
        }else if(this.rank == 1){
            rankString += "Ace";
        }else{
            rankString += this.rank;
        }

        return rankString;
    }

    /**
     * Returns the rank of the card in integer form
     * @return int representing the rank 1-ace, 11-jack, 12-queen, 13-king
     */
    public int getRankValue(){
        return this.rank;
    }

    /**
     * The text version of a card
     * @return The full text description of the card
     */
    public String toString(){
        return this.getRank() + " of " + this.suit;
    }

}