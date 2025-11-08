package pckg_VJ_Z1_a;

public class Calculator {
    private Kalkulacija strategy;

    public Calculator(){
        this.strategy = null;
    }
    public void setStrategy(Kalkulacija strategy){
        this.strategy = strategy;
    }

    public float kalkulacija (float first, float second){
        if(strategy == null){
            System.out.println("Kalkulacija strategy null");
            return 0;
        }
        return strategy.performCalculation(first, second);
    }

    public void display(float result){
        if(result == 0){
            System.out.println("Result is zero");
        }else{
            System.out.println("Result is " + result);
        }
    }
}
