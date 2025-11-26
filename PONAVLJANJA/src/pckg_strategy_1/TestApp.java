package pckg_strategy_1;

public class TestApp {

    public static void main(String[] args) {
        Answer answer1 = new Answer(true, 3);
        Answer answer2 = new Answer(false, 4);
        Answer answer3 = new Answer(true, 6);

        ScoringStrategy strategy = new StandardScoring();
        ScoringStrategy strategy2 = new PenaltyScoring();
        ScoringStrategy strategy3 = new TimeBonusScoring();

        System.out.println("Answer 1: "  + strategy3.calculate(answer1));
        System.out.println("Answer 2: "  + strategy2.calculate(answer2));
        System.out.println("Answer 3: "  + strategy.calculate(answer3));

    }

}
