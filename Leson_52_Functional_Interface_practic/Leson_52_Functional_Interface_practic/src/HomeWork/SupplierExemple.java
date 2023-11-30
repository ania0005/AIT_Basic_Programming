package HomeWork;

import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierExemple {
    public static void main(String[] args) {

        //Exemple 1
        Supplier<String> myName  = ()-> "Tania - cohort 34-2";
        System.out.println(myName.get());

        //Exemple 2
        ArrayList<String> studentList = new ArrayList<>();
        studentList .add("Ivan D.");
        studentList .add("Semen V.");
        studentList .add("Max M.");
        studentList .add("Olga B.");
        studentList .add("Sara J.");

        Supplier<String> randomStudent = () -> {
            int value = (int)(Math.random() * studentList.size());
            return studentList.get(value);
        };
        System.out.println(randomStudent.get());
    }

    }

