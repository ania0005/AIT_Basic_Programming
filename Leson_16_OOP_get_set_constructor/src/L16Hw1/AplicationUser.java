package L16Hw1;

public class AplicationUser {
    public static void main(String[] args) {
        User userIvanov = new User("Ivanov", 25, "afd@gmail.com");
        User userSmirnov = new User("Smirnov", 45, "wafd@gmail.com");
        User userPetrov = new User("Petrov", 65, "fad@gmail.com");

        System.out.println(userIvanov.getName());
        System.out.println(userIvanov.getAge());
        System.out.println(userIvanov.getEmail());
        System.out.println();

        System.out.println(userSmirnov.getName());
        System.out.println(userSmirnov.getAge());
        System.out.println(userSmirnov.getEmail());
        System.out.println();

        System.out.println(userPetrov.getName());
        System.out.println(userPetrov.getAge());
        System.out.println(userPetrov.getEmail());
        System.out.println();

        userIvanov.setName("Sidorov");
        userIvanov.setAge("33");
        userIvanov.setEmail("rd4445@gmail.com");

        System.out.println(userIvanov.getName());
        System.out.println(userIvanov.getAge());
        System.out.println(userIvanov.getEmail());
    }
}
