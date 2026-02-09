public class DeckOfCards {
    private Card[] cards;
    private int numCards;

    // constructor
    public DeckOfCards(){
        // start the number of cards at 0
        this.numCards = 0;
        // array to store suit names to use in a loop
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        // for each suit
        for(int i = 0; i < suits.length; i++){
            // go through each rank
            for(int j = 1; j <= 13; j++){
                // make a card into the array
                this.cards[this.numCards] = new Card(suits[i], j);
                // increase the card count
                this.numCards++;
            }
        }
    }
}
