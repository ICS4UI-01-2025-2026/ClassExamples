public class DartPlayer {
    private int score;
    private int throwCounter;
    private int currentRoundScore;

    public DartPlayer(){
        this.score = 501;
        resetRound();
    }

    private void resetRound(){
        this.currentRoundScore = 0;
        this.throwCounter = 0;
    }

    public int getScore(){
        return this.score - this.currentRoundScore;
    }

    public void throwDart(int value, int multiplier){
        // score -= value*multiplier;
        this.currentRoundScore += value*multiplier;
        this.throwCounter++;

        if(throwCounter == 3){
            if(validRound(multiplier)){
                this.score -= this.currentRoundScore;
            }
            resetRound();
        }
    }

    private boolean validRound(int multiplier){
        if(this.score - this.currentRoundScore < 0){
            return false;
        }else if(this.score - this.currentRoundScore == 1){
            return false;
        }else if(this.score - this.currentRoundScore == 0 
            && multiplier != 2){
            return false;
        }
        return true;
    }
}
