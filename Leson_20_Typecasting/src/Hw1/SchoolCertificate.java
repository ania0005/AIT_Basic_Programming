package Hw1;

public class SchoolCertificate extends Documents {
    private double averageScore;

    public SchoolCertificate(String nummer, String validity, double averageScore) {
        super(nummer, validity);
        this.averageScore = averageScore;
    }

    public void aboutSCertificat() {
        System.out.println("School Certificate");
        super.aboutDocument();
        System.out.println("\t" + averageScore);
    }


}
