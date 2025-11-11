package pckg_VJ_Z2;

public class Subscriber implements ObserverInt{
    private String name;
    private String email;

    public Subscriber(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void update(String magazinName, String issue, String pdfContent) {
        System.out.println("Subscriber: "+name + " , email: "+email);
        System.out.println("New issue: " + magazinName + " - " + issue);
        System.out.println("New pdfContent: " + pdfContent);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
