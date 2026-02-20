public class DeckOfCards {
    private Card[] cards;
    private int numCards;

    // constructor
    public DeckOfCards(){
        // initialize the deck of cards
        this.cards = new Card[52];
        // start the number of cards at 0
        this.numCards = 0;
        // array to store suit names to use in a loop
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        // for each suit
        for(int i = 0; i < suits.length; i++){
            // go through each rank 1 through 13
            for(int j = 1; j <= 13; j++){
                // make a card into the array
                this.cards[this.numCards] = new Card(suits[i], j);
                // increase the card count
                this.numCards++;
            }
        }
    }

    public Card dealCard()
    {
        // lower the card count
        this.numCards--;
        // get the card
        Card c = this.cards[this.numCards];
        // set the array position to null
        this.cards[this.numCards] = null;
        // return the top card (end of the array)
        return c;
    }

    public void shuffle()
    {
        // go through each card
        for(int i = 0; i < this.numCards - 1; i++)
        {
            // generate the card position to swap with i
            int spot = (int)(Math.random()*(this.numCards-i)) + i;
            // swap the cards
            Card c = this.cards[i];
            this.cards[i] = this.cards[spot];
            this.cards[spot] = c;

            
        }
    }
}
