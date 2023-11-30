package HwStudent;

public class CollegeStudent {
    public static void main(String[] args) {
        Student CollegeStudent1 = new Student("Ivanov", 17, 4.6);
        Student CollegeStudent2 = new Student("Smirnov", 16,2.5);
        Student CollegeStudent3 = new Student("Sidorov", 15, 3.7);
        Student CollegeStudent4 = new Student("Petrov", 17, 1.3);
        CollegeStudent1.statusStudent(CollegeStudent1);
        CollegeStudent2.statusStudent(CollegeStudent2);
        CollegeStudent3.statusStudent(CollegeStudent3);
        CollegeStudent4.statusStudent(CollegeStudent4);



    }
}
