package pckg_V6_zad_1;

public class JSONBatchProcessor extends BatchProcessor {
    @Override
    public FileParser createFileParser() {
            return new JSONFileParser();
        }
    }

