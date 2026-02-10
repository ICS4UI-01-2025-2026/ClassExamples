public class Player {
    private String name;
    private Card[] cards;
    private int numCards;

    public Player(String name)
    {
        this.name = name;
        this.cards = new Card[2];
        this.numCards = 0;
    }

    public void addCard(Card c)
    {
        // prevent adding more than 2 cards
        if(this.numCards < 2)
        {
            this.cards[this.numCards] = c;
            this.numCards++;
        }
        
    }

    public boolean hasHigherTotal(Player p)
    {
        int myScore = this.getTotal();
        int oppScore = p.getTotal();

        // check if I am bigger
        return myScore > oppScore;
    }

    private int getTotal()
    {
        int sum = 0;
        for(int i = 0; i < this.numCards; i++)
        {
            // ask each card for its value and add to the sum
            sum += this.cards[i].getRankValue();
        }
        return sum;
    }

    public String getName()
    {
        return this.name;
    }

    public String toString()
    {
        return this.name + ": " + this.getTotal();
    }
}
