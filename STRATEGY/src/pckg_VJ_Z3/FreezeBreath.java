package pckg_VJ_Z3;

public class FreezeBreath implements AbilityStrategy {
    @Override
    public void applyAbility() {
        System.out.println("Freezing breath! ");
    }
    @Override
    public String getAbilityName() {
        return "Freeze Breath";
    }
}
