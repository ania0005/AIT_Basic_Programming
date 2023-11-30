package ait.enums;

import ait.enums.model.Month;

public class MonthApp {
    public static void main(String[]  args){
        Month month = Month.DEC;
        System.out.println(month);
        System.out.println(month.plustMonth(4));
        System.out.println(Month.OCT.plustMonth(5));
        System.out.println(Month.getName(13));
        System.out.println(Month.JUL.getDays());
    }
}
