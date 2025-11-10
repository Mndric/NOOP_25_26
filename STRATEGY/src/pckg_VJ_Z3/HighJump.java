package pckg_VJ_Z3;

public class HighJump implements AbilityStrategy{
    @Override
    public void applyAbility() {
        System.out.println("Jumping like rabbit...");
    }

    @Override
    public String getAbilityName() {
        return "High Jump";
    }
}
