package Student;
import java.util.Comparator;
public class Student {
    //Создайте класс Student с полями name и grade. Реализуйте для него интерфейс Comparable так,
    // чтобы студенты сортировались по оценкам.
    //создайте массив студентов и отсортируйте используя Arrays.sort()
    public String name;
    public int gerade;

    public Student(String name, int gerade) {
        this.name = name;
        this.gerade = gerade;
    }
    public int compareTo(Student other) {
        return this.gerade - other.gerade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGerade() {
        return gerade;
    }

    public void setGerade(int gerade) {
        this.gerade = gerade;
    }

    @Override
    public String toString() {
        System.out.println();
        return "Student{" +
                "name='" + name + '\'' +
                ", gerade=" + gerade +
                '}';

    }
}
