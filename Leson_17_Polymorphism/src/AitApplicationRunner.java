import entiti.Student;

public class AitApplicationRunner {

    public static void main(String[] args) {
        Student student = new Student(14,"Marina","Bobkova");
        Student student1 = new Student(15, "Nastya", "Chalova");
        Student student2 = new Student(16,"Samoilenko");

        student2.setId(20);

        System.out.print(student2.getId());
        System.out.print(student2.getName());
        System.out.print(student2.getLastName());

        student.setPresent(true);
        student1.setPresent(false);
        student2.setPresent(true);

        System.out.println();
        Student[] students = new Student[3];
        students [0] = student;
        students[1] = student1;
        students[2] = student2;
        for (int i = 0; i < students.length; i++) {
            Student currentStudent = students[i];
            System.out.println("id: "+ currentStudent.getId()
                    + "  Name " + currentStudent.getName()
                    + "  Last Name: " + currentStudent.getLastName());
        }
    }
}
