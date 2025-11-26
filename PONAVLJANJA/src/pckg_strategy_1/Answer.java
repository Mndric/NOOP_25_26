package pckg_strategy_1;

public class Answer {

    private boolean correct;
    private int time;

    public Answer(boolean correct, int time) {
        this.correct = correct;
        this.time = time;
    }
    public boolean isCorrect() {
        return correct;
    }
    public int secTime() {
        return time;
    }
}
