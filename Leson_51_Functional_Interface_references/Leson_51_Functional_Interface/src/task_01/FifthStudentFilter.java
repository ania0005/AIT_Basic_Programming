package task_01;

public class FifthStudentFilter implements  Filter{

    @Override
    public boolean test(Student student) {
        return student.getName().length() == 5 && student.getAge() >= 20 && student.getCourse() > 2 && student.getDegree().equals(Degree.BACHELOR);
    }
}
