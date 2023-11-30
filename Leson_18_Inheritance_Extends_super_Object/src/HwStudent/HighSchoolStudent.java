package HwStudent;

public class HighSchoolStudent {
    public static void main(String[] args) {
        Student HighSchoolStudent1 = new Student("Li", 28, 2.6);
        Student HighSchoolStudent2 = new Student("Stalone", 25,  3.5);
        Student HighSchoolStudent3 = new Student("Girr",23,  4.5);
        Student HighSchoolStudent4 = new Student("Hopkins",26, 5);

        HighSchoolStudent1.statusStudent(HighSchoolStudent1);
        HighSchoolStudent2.statusStudent(HighSchoolStudent2);
        HighSchoolStudent3.statusStudent(HighSchoolStudent3);
        HighSchoolStudent4.statusStudent(HighSchoolStudent4);
    }


}
