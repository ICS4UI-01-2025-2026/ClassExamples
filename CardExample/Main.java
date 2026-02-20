public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Bob");
        Player player2 = new Player("Alice");
        HighScoreGame game = new HighScoreGame(player1, player2);
        game.playGame();
    }
}
