package pckg_VJ_Z3;

public class SuperHero {
    private String name;
    private int level;
    private AbilityStrategy strategy;

    public SuperHero (String name){
        this.name = name;
        this.level = 1;
        this.strategy = new ZeroStrategy();

    }
    public void setAbilityStrategy (AbilityStrategy strategy){
        this.strategy = strategy;
    }

    public void currentAbility(){
        System.out.println("\n=== " + name + " using ability");
        strategy.applyAbility();
    }

    public void levelUp() {
        level++;
        System.out.println(name + " , leveled up to level " + level + " !");

        switch(level){
            case 1:
                setAbilityStrategy(new ZeroStrategy());
                break;
            case 2:
                setAbilityStrategy(new FastRunning());
                break;
            case 3:
                setAbilityStrategy(new HighJump());
                break;
            case 4:
                setAbilityStrategy(new FlyingStrategy());
                break;
            case 5:
                setAbilityStrategy(new DoubleStrength());
                break;
            case 6:
                setAbilityStrategy(new FireFromHands());
                break;
            case 7:
                setAbilityStrategy(new FreezeBreath());
                break;
            case 8:
                setAbilityStrategy(new LongDistanceVision());
                break;
        }
        System.out.println("New abillity unlocked: " + strategy.getAbilityName());
    }
    public void displayStatus(){
        System.out.println("=== SuperHero status === ");
        System.out.println("Name: " + name);
        System.out.println("Level: " + level);
        System.out.println("Current ability: " + strategy.getAbilityName());
    }
}
