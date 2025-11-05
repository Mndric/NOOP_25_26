package pckg_no_fasade;

public class Fasada {

    //sve komponente sučelja ili apstraktne klase

    private Amplifier amplifier;
    private Player player;
    private Lights lights;
    private Screen screen;
    private Projector projector;

    public Fasada(Amplifier amp, Player pl, Lights lts, Screen sc, Projector pro){
        this.amplifier = amp;
        this.player = pl;
        this.lights = lts;
        this.screen = sc;
        this.projector = pro;

    }

    public void watchMovie(){
        amplifier.turnOnAmp();
        player.turnOnPlayer();
        screen.pullDownScreen();
        projector.turnONProjector();
        lights.turnOffLights();
    }

    public void stopMovie(){
        player.turnOffPlayer();
        lights.turnOffLights();
        screen.pullUpScreen();
        projector.turnOFFProjector();
        amplifier.turnOffAmp();
    }


}
