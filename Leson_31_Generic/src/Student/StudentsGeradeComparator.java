package Student;
import java.util.Comparator;
public class StudentsGeradeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
              return s1.getGerade() - s2.getGerade();
    }



}

