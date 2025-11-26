package pckg_strategy_1;

public class StandardScoring implements ScoringStrategy {
    @Override
    public int calculate(Answer answer) {
        if(answer.isCorrect()){
            return 10;
        }else{
            return 0;
        }
    }
}
