public class Main {



        public static void main(String[] args) {
            String[] ingredients = {"картошка", "огурцы", "яйца", "колбаса", "горошек", "майонез"};
            Olivier olivier = new Olivier(ingredients);

            for (String string : olivier) {
                System.out.println("Нарезаем: " + string);
            }

            System.out.println("Салат Оливье готов!");
        }

}
