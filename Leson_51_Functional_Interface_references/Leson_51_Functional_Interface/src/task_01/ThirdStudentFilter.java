package task_01;

public class ThirdStudentFilter implements Filter {

    @Override
    public boolean test(Student student) {
        return student.getAge() > 25 && student.getDegree().equals(Degree.MASTER) && student.getCourse() >= 3;
    }
}
