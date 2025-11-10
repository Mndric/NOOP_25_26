package pckg_VJ_Z3;

public class ZeroStrategy implements AbilityStrategy {
    @Override
    public void applyAbility() {
        System.out.println("Normal walking and running...");
    }

    @Override
    public String getAbilityName() {
        return "Normal human abilities...";
    }
}
