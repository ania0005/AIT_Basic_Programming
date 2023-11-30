package ArryLisr;

public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyArryList<>();

        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");
        list.add("EEE");
        list.add("AAA");
        list.add("BBB");
//
//        System.out.println(list);
//        System.out.println("Лист пустой? - " + list.isEmpty());
//        System.out.println("Размер листа - " + list.size());
//
//        list.add("CCC");
//        list.add("AAA");
//        list.add("BBB");
//        list.add("CCC");
//
//        System.out.println(list);
//        System.out.println("Лист пустой? - " + list.isEmpty());
//        System.out.println("Размер листа - " + list.size());
//
//        list.add("CCC");
//        list.add("AAA");
//        list.add("BBB");
//        list.add("CCC");
//
//        System.out.println(list);
//        System.out.println("Лист пустой? - " + list.isEmpty());
//        System.out.println("Размер листа - " + list.size());

        System.out.println("Есть ли в листе FFF? - " + list.contains("FFF"));
        System.out.println("Есть ли в листе MMM? - " + list.contains("MMM"));
        System.out.println("Есть ли в листе null? - " + list.contains(null));

        list.set(4, null);

        System.out.println(list);

        System.out.println("Есть ли в листе FFF? - " + list.contains("FFF"));
        System.out.println("Есть ли в листе MMM? - " + list.contains("MMM"));
        System.out.println("Есть ли в листе null? - " + list.contains(null));

        System.out.println("---------------------");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

    }

}
