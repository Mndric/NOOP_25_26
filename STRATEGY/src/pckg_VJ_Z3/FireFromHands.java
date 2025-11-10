package pckg_VJ_Z3;

public class FireFromHands implements AbilityStrategy {

    @Override
    public void applyAbility() {
        System.out.println("Fire in the hands!");
    }

    @Override
    public String getAbilityName() {
        return "Fire From Hands";
    }
}
