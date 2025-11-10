package pckg_VJ_Z3;

public class FlyingStrategy implements AbilityStrategy {
    @Override
    public void applyAbility() {
        System.out.println("Flying...");
    }
    @Override
    public String getAbilityName() {
        return "Flying";
    }
}
