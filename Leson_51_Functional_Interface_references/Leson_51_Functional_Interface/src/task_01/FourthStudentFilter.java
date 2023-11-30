package task_01;

public class FourthStudentFilter implements Filter{

    @Override
    public boolean test(Student student) {
        return student.getName().endsWith("a") && student.getAge() >= 23 && student.getDegree().equals(Degree.BACHELOR);

    }
}
