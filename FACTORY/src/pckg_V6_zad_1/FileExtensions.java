package pckg_V6_zad_1;

public class FileExtensions {

    private String FileExtensions;
    public String getFileExtensions(String fileExtensions){
        if(fileExtensions.contains(".")){
            String ext = fileExtensions.substring(fileExtensions.lastIndexOf("." + 1));
            return ext;
        }else{
            return null;
        }
    }
}
