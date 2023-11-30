package Hw1;

public class Main {
    public static void main(String[] args) {

        Documents languageCertificate = new LanguageCertificate("EC-5433", "12.09.2026", "B1");
        Documents schoolCertificate = new SchoolCertificate("MK-4312", "23.05.2027", 2.01);


        LanguageCertificate languageCertificate1 = (LanguageCertificate) languageCertificate;
        languageCertificate1.aboutLCertificat();
        SchoolCertificate schoolCertificate1 = (SchoolCertificate) schoolCertificate;
        schoolCertificate1.aboutSCertificat();
    }
}
