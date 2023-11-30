package Student;
import java.util.Arrays;
import java.util.Comparator;

public class StudentApp {
    public static void main(String[] args) {
        Student[] students = {new Student("Ivanov", 2),
                new Student("Smirnov", 4),
                new Student("Zuev", 3),
                new Student("Volin", 5),
                new Student("Grant", 4)
        };
        Comparator<Student> studentComparator = new StudentsGeradeComparator();
        Arrays.sort(students, studentComparator);

        System.out.println("Sort students Array by Gerade:");
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + " ");
        }
        System.out.println();
    }
}


