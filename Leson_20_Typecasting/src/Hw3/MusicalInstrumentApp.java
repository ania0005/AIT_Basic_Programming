package Hw3;

public class MusicalInstrumentApp {
    public static void main(String[] args) {
        MusicalInstrument stringInstrument1 = new StringInstrument("violin", "Rt-98", 1050.50, 3);
        MusicalInstrument stringInstrument2 = new StringInstrument("cello", "TW-518", 1649.99, 4);

        MusicalInstrument windInstrument1 = new WindInstrument("trumpet", "45-Y", 670, "copper");
        MusicalInstrument windInstrument2 = new WindInstrument("flute", "45-Y", 499.80, "wood");

        stringInstrument1.play();
        stringInstrument2.play();
        windInstrument1.play();
        windInstrument2.play();
        System.out.println();

        MusicalInstrument[] musicalInstrument = new MusicalInstrument[4];
        musicalInstrument[0] = stringInstrument1;
        musicalInstrument[1] = stringInstrument2;
        musicalInstrument[2] = windInstrument1;
        musicalInstrument[3] = windInstrument2;

        for (int i = 0; i < musicalInstrument.length; i++) {
            musicalInstrument[i].play();
            double n = musicalInstrument[i].getPric() - musicalInstrument[i].getPric()*0.1 ;
            System.out.println(musicalInstrument[i].getName() + " - average price on Amazon: " + n);
            musicalInstrument[i].rentalCost();
        }
    }
}
