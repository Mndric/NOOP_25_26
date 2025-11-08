package zad_1_vjezbe;

public class SFNovelist implements OldWriterInt{

    public SFNovelist() {
        System.out.println("SF Novelist created!");
    }

    @Override
    public String toString() {
        return "SFNovelist{";
    }

    @Override
    public void writeNovelOldFashionStyle() {
        System.out.println("Writing a science fiction novel!");
    }
}
