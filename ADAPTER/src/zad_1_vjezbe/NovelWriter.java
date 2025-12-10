package zad_1_vjezbe;

public class NovelWriter implements WriterInt{

    @Override
    public void writeNovel(int novelType) {
        switch (novelType) {
            case 1:
                System.out.println("Writing a romantic type novel!");
                System.out.println(toString());
                break;
            case 2:
                System.out.println("Writing a drama type novel!");
                System.out.println(toString());
                break;
            case 3:
                System.out.println("Writing a history type novel!");
                System.out.println(toString());
                break;
            default:
                throw new IllegalArgumentException("Not possible!");
        }
    }

    @Override
    public String toString() {
        return "NovelWriter";
    }
}
