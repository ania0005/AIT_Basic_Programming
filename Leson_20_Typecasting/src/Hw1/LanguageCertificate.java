package Hw1;

public class LanguageCertificate extends Documents {
    private String categories;

    public LanguageCertificate(String nummer,String validity, String categories) {
        super(nummer, validity);
        this.categories = categories;
    }


    public void aboutLCertificat() {
        System.out.println("Language Certificate");
        super.aboutDocument();
        System.out.println("\t" + categories);
    }
}
