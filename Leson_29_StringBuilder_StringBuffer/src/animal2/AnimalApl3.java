package animal2;

public class AnimalApl3 {

        public static void main(String[] args) {
            Animal animal = new Animal("Без имени", "прозрачный");
            Animal animalDog = new Dog("Снежок", "Черный");
            Animal animalCat = new Cat("Том", "Серый");

            System.out.println("animal: " + animal.getName());
            System.out.println("animalDog: " + animalDog.getName());
            System.out.println("animalCat: " + animalCat.getName());

            System.out.println();
            System.out.println("animal: " + animal.getDetails());
            System.out.println("animalDog: " + animalDog.getDetails());
            System.out.println("animalCat: " + animalCat.getDetails());

            if (animalCat instanceof Cat) {
                Cat cat = (Cat) animalCat;
                cat.hunt();

                String name = ((Cat) animalCat).getName();
            }
        }
    }
}
