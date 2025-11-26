package pckg_strategy_1;

public class TimeBonusScoring implements ScoringStrategy {
    @Override
    public int calculate(Answer answer) {
        if(answer.isCorrect() && answer.secTime() < 5){
            return 10 + 10;
        }if(answer.isCorrect() && answer.secTime() > 5){
            return 10;
        }else{
            return 0;
        }
    }
}
