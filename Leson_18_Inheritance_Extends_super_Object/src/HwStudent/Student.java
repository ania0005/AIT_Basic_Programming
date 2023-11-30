package HwStudent;
//Создайте базовый класс Student.Student (Студент) с атрибутами имя, возраст и средний балл. Затем создайте два подкласса:
// HwStudent.HighSchoolStudent (Старшеклассник) и HwStudent.CollegeStudent (Студент колледжа).
//
//Добавьте методы в базовый класс для вычисления статуса студента на основе среднего балла. Например, если средний
// балл больше или равен 4.5, студент считается "отличником", если между 3.0 и 4.49 - "хорошистом", и так далее.
//
//Создайте несколько объектов разных классов студентов и вызовите методы для определения их статуса.

public class Student {
    private String name;
    private int age;
    private double averageScore;

    public Student (String name,int age,double averageScore){
        this.name = name;
        this.age = age;
        this.averageScore = averageScore;
    }
    public Student (String name,double averageScore) {
        this.name = name;
        this.averageScore = averageScore;

    }
public void statusStudent(Student averageScore){
    String status = null;
    if(this.averageScore >= 4.5){
            status = "Excellent";}
        else if (this.averageScore <= 4.49 && this.averageScore >= 3) {
            status = "Good";}
        else if (this.averageScore <= 2.99 && this.averageScore >= 1.5) {
            status = "Satisfactorily";}
        else {status = "Satisfactorily";}
    System.out.println(name+ "   "+this.averageScore+"  - "+ status);
}






    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

}
