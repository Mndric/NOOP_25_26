package pckg_V6_zad_1;

import java.io.File;
import java.util.List;

public abstract class BatchProcessor {
    protected abstract FileParser createFileParser();

    public final void processBatch(File file){
        final FileParser fileParser = createFileParser();
        List<Record> records = fileParser.parse(file);

        processRecords(records);
        writeSummmary();
        closeFile(file);
    }
    private void  processRecords(List<Record> records){
            System.out.println("Processing all records...");
    }
    private void writeSummmary(){
        System.out.printf("Writing summary...");
    }
    private void closeFile(File file){
        System.out.println("Closing file..." + file.toString());
    }
}
