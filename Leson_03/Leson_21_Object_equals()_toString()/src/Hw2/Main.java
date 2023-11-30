package Hw2;


public class Main {

    public static void main(String[] args) {

        DataTime[] dataTimes = new DataTime[3];

        dataTimes[0] = new DataTime(2022, 9, 03, 12, 00);
        dataTimes[1] = new DataTime(2021, 8, 10, 14, 00);
        dataTimes[2] = new DataTime(2023, 10, 4, 16, 35);

        System.out.println(dataTimes[0].toString());
        System.out.println(dataTimes[1].toString());
        System.out.println(dataTimes[2].toString());
        System.out.println();

        DataTime dataTime = new DataTime(2023, 10, 4, 16, 35);

        for (int i = 0; i < dataTimes.length; i++) {
            if (dataTimes[i].equals(dataTime)) {
                System.out.println("dataTimes[" + i + "] = dataTimes");
                System.out.println(dataTimes[i].toString() + " There is a coincidence  " + dataTime.toString());
            }
        }
    }
}
