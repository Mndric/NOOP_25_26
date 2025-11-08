package zad_1_vjezbe;

public class AdaptSF2WriterInt implements WriterInt{

    private SFNovelist sfNovelist;

    public AdaptSF2WriterInt(SFNovelist sf) {
        this.sfNovelist = sf;
    }

    @Override
    public void writeNovel(int novelType) {
        sfNovelist.writeNovelOldFashionStyle();
    }

    @Override
    public String toString() {
        return "AdaptSF2WritterInt{" +
                "sfNovelist=" + sfNovelist +
                '}';
    }
}
