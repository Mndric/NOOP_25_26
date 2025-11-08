package zad_1_vjezbe;

public class TestApp {

    public static void main(String[] args) {

        NovelWriter novelWriter = new NovelWriter();
        WritingOffice writingOffice = new WritingOffice(novelWriter);
        writingOffice.writeNovel(3);
        writingOffice.setSomeNovelWriter(new AdaptSF2WriterInt(new SFNovelist()));
        writingOffice.writeNovel(0);
    }
}
