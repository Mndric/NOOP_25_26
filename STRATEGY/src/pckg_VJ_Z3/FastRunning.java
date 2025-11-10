package pckg_VJ_Z3;

public class FastRunning implements AbilityStrategy {
    @Override
    public void applyAbility() {
        System.out.println("Running fast!");
    }
    @Override
    public String getAbilityName() {
        return "FastRunning";
    }
}
