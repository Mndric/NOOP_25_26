package pckg_VJ_Z3;

public class DoubleStrength implements AbilityStrategy {
    @Override
    public void applyAbility() {
        System.out.println("DoubleStrength, muscles...");
    }
    @Override
    public String getAbilityName() {
        return "Double Strength";
    }
}
