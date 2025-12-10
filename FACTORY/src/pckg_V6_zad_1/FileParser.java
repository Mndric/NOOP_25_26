package pckg_V6_zad_1;

import java.io.File;
import java.util.List;

public interface FileParser {
    List<Record> parse(File file);
}
