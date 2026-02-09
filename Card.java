public class Card {
    // instance variables
    private int rank;
    private String suit;
    private String colour;
    private boolean faceUp;

    // special method - constructor
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


    // Accessor methods / getters
    public String getSuit(){
        return this.suit;
    }

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

    public int getRankValue(){
        return this.rank;
    }

    // special method - determines how to print this to the console
    public String toString(){
        return this.getRank() + " of " + this.suit;
    }

}