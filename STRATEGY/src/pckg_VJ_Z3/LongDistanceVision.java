package pckg_VJ_Z3;

public class LongDistanceVision implements AbilityStrategy{

    @Override
    public void applyAbility() {
        System.out.println("Seeing through objects!");
    }

    @Override
    public String getAbilityName() {
        return "Long Distance Vision";
    }
}
