public class HighScoreGame {
    private Player player1;
    private Player player2;
    private DeckOfCards deck;

    public HighScoreGame(Player player1, Player player2)
    {
        this.player1 = player1;
        this.player2 = player2;

        this.deck = new DeckOfCards();
        this.deck.shuffle();
    }

    public void playGame()
    {
        System.out.println(player1.getName() + " vs " + player2.getName());
        // dealing player 1 - 2 cards
        Card c = deck.dealCard();
        System.out.println(player1.getName() + " receives a " + c);
        player1.addCard(c);
        c = deck.dealCard();
        System.out.println(player1.getName() + " receives a " + c);
        player1.addCard(c);

        // dealing player 2 - 2 cards
        c = deck.dealCard();
        System.out.println(player2.getName() + " receives a " + c);
        player2.addCard(c);
        c = deck.dealCard();
        System.out.println(player2.getName() + " receives a " + c);
        player2.addCard(c);

        // print out player scores
        System.out.println(player1);
        System.out.println(player2);

        // determine a winner
        if(player1.hasHigherTotal(player2))
        {
            System.out.println(this.player1.getName() + " wins!!!!");
        }
        else if(player2.hasHigherTotal(player1))
        {
            System.out.println(this.player2.getName() + " wins!!!!");
        }
        else
        {
            System.out.println("It's a tie!!!!");
        }
    }

}
