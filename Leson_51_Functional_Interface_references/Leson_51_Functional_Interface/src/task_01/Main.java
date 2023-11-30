package task_01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Ivan", 25, 4, 4.94, Degree.MASTER));
        students.add(new Student("Sveta", 23, 3, 4.6, Degree.MASTER));
        students.add(new Student("Diana", 21, 1, 1.98, Degree.MASTER));
        students.add(new Student("Vasja", 25, 5, 4.81, Degree.MASTER));
        students.add(new Student("Petja", 26, 3, 4.74, Degree.BACHELOR));
        students.add(new Student("Max", 23, 2, 2.05, Degree.MASTER));
        students.add(new Student("Ivan", 25, 4, 4.94, Degree.BACHELOR));
        students.add(new Student("Sveta", 23, 3, 4.6, Degree.BACHELOR));
        students.add(new Student("Diana", 21, 1, 1.98, Degree.BACHELOR));
        students.add(new Student("Egor", 22, 5, 4.81, Degree.BACHELOR));
        students.add(new Student("Katia", 26, 3, 4.74, Degree.MASTER));
        students.add(new Student("Max", 21, 2, 2.05, Degree.MASTER));
        students.add(new Student("Ivan", 25, 4, 4.94, Degree.MASTER));
        students.add(new Student("Sveta", 23, 3, 4.6, Degree.MASTER));
        students.add(new Student("Diana", 21, 1, 1.98, Degree.MASTER));
        students.add(new Student("Vasja", 20, 5, 4.81, Degree.MASTER));
        students.add(new Student("Tania", 26, 3, 4.74, Degree.BACHELOR));
        students.add(new Student("Olga", 23, 2, 2.05, Degree.MASTER));
        students.add(new Student("Yana", 24, 4, 4.94, Degree.BACHELOR));
        students.add(new Student("Pavel", 24, 3, 4.6, Degree.BACHELOR));
        students.add(new Student("Semen", 21, 1, 1.98, Degree.BACHELOR));
        students.add(new Student("David", 25, 5, 4.81, Degree.BACHELOR));
        students.add(new Student("Nastia", 26, 3, 4.74, Degree.MASTER));
        students.add(new Student("Maxim", 23, 2, 2.05, Degree.MASTER));

        // Klass Work
//        System.out.println("Students list");
//        for (Student student : students) {
//            System.out.println(student);
//        }
//
//        System.out.println();
//        System.out.println("Filtr students -> course (>= 3) / averageRate (>= 4.5)");
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//        StudentService.printStudents(students, new FirstStudentFilter());
//
//        System.out.println();
//        System.out.println("Filtr -  age (23) / degree (MAGISTR)");
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//        StudentService.printStudents(students, new SecondStudentFilter());
//
//        System.out.println();
//        System.out.println("Filtr - name lengh >4 / cours % 2 != 0");
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//        StudentService.printStudents(students, new Filter() {
//            @Override
//            public boolean test(Student student) {
//                return student.getName().length() > 4 && student.getCourse() % 2 != 0;
//            }
//        });
//        System.out.println();
//        System.out.println("Filtr  name starts with M && age >=23");
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//        StudentService.printStudents(students, x -> x.getName().startsWith("M") && x.getAge() >= 23);


        System.out.println("Home Work");
        System.out.println("Filtr 3");
        System.out.println("Filtr: age >=23 && course >= 3 && degree MAGISTR");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        StudentService.printStudents(students, new ThirdStudentFilter());

        System.out.println();
        System.out.println("Filtr: age >=23 && course >= 3 && degree MAGISTR");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        StudentService.printStudents(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return student.getAge() > 25 && student.getDegree().equals(Degree.MASTER) && student.getCourse() >= 3;
            }
        });
        System.out.println();
        System.out.println("Filtr: age >=23 && course >= 3 && degree MAGISTR");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        StudentService.printStudents(students, x -> x.getAge() > 25 && x.getDegree().equals(Degree.MASTER) && x.getCourse() >= 3);

        System.out.println();
        System.out.println("Filtr 4");
        System.out.println("Filtr: name end with a && age >=23 && BACHELOR");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        StudentService.printStudents(students, new FourthStudentFilter());

        System.out.println();
        System.out.println("Filtr: name end with a && age >=23 && BACHELOR");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        StudentService.printStudents(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return student.getName().endsWith("a") && student.getAge() >= 23 && student.getDegree().equals(Degree.BACHELOR);
            }
        });
        System.out.println();
        System.out.println("Filtr: name end with a && age >=23 && BACHELOR");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        StudentService.printStudents(students, x -> x.getName().endsWith("a") && x.getAge() >= 23 && x.getDegree().equals(Degree.BACHELOR));

        System.out.println();
        System.out.println("Filtr 5");
        System.out.println("Filtr: name lengh = 5 && age >= 20 && cource > 2 && BACHELOR");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        StudentService.printStudents(students, new FifthStudentFilter());

        System.out.println();
        System.out.println("Filtr: name lengh = 5 && age >= 20 && cource > 2 && BACHELOR");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        StudentService.printStudents(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return student.getName().length() == 5 && student.getAge() >= 20 && student.getCourse() > 2 && student.getDegree().equals(Degree.BACHELOR);
            }
        });
        System.out.println();
        System.out.println("Filtr: name lengh = 5 && age >= 20 && cource > 2 && BACHELOR");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        StudentService.printStudents(students, x -> x.getName().length() == 5 && x.getAge() >= 20 && x.getCourse() > 2 && x.getDegree().equals(Degree.BACHELOR));
    }

}