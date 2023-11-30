
//В стране XYZ население 14 миллионов человек. Рождаемость составляет 14 человек на 1000 человек, смертность - 8 человек.
//Рассчитайте, какая численность населения будет через 10 лет, принимая во внимание, что показатели рождаемости и
// смертности постоянны.
public class L10Hw1 {
    public static void main(String[] args) {

        demography(14000000, 14, 8, 10);
    }

    public static void demography(long population, int numberAdd, int numberMinus, int numberYears) {
               for (numberYears = 1; numberYears <= 10; numberYears++) {
            population = population + numberAdd - numberMinus;
        }
        System.out.println();
        System.out.println("The population in " +(numberYears - 1)+" years will be " + population);
    }

}



