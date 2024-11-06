public class Score {
    private final int PUZZLE_VALUE=10;
    private int rooms,sovlePuzzle;
    private double score;

    public Score(int startingScore){
        this.score=startingScore;
    }
    public void visitRoom(){
        rooms++;
    }
    public void solvePuzzle(){
        sovlePuzzle++;
    }
    public double getScore(){
        score=score-rooms+sovlePuzzle*PUZZLE_VALUE;
        return score;
    }

    public void addScore(){
        score+=100;
    }

}
