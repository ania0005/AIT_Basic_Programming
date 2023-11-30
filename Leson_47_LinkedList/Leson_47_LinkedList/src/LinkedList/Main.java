package LinkedList;

public class Main {
    public static void main(String[] args) {

        MyList<String> list = new MyLinkedList<>();

        System.out.println("empty? - " + list.isEmpty());
        System.out.println("size? - " + list.size());
        System.out.println(list);

        list.add("AAA");
        list.add("BBB");
        list.add("CCC");

        System.out.println("empty? - " + list.isEmpty());
        System.out.println("size? - " + list.size());
        System.out.println(list);

        list.set(1, "JJJ");
        System.out.println(list);
        System.out.println(" Conteins AAA? -  " + list.contains("AAA"));
        System.out.println(" Conteins PPP? -  " + list.contains("PPP"));
        System.out.println("_______________________");
        list.remove(1);
        System.out.println(list);
        System.out.println("Delele - " + list.remove(1));

//        list.remove(0);
//        System.out.println(list);


    }

}
