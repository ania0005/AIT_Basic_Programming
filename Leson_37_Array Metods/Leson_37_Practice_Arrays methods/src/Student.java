import java.util.Arrays;
import java.util.Comparator;


//Сортировка и поиск в массиве студентов: Создайте класс Student с полями id, name и GPA (средний балл).
        //Реализуйте метод, который сортирует массив студентов по GPA и использует System.arraycopy() для создания
        //нового массива с топ-5 студентами.
        //Напишите метод, который принимает средний балл и находит студента с ближайшим средним баллом к данному,
        //используя бинарный поиск
    public class Student <T> {
            private static Student[] students = new Student[10];
        //private static int studentCount = 0;
        public String name;
        public int id;
        public int gpa;

        public Student(String name, int id, int gpa) {
            this.name = name;
            this.id = id;
            this.gpa = gpa;
        }
     public T [] sortStudentGpa (T [] array){
         Comparator<Student> studentComparatorByGpa = (st1, st2) -> st1.getGpa() - st2.getGpa();
         Arrays.sort(students, studentComparatorByGpa);
         System.out.println(Arrays.toString(students));
         Arrays.sort(array);
         int [] sortarray = new int [5];
         System.arraycopy(array, array.length - 5, sortarray, 0, 5 );
            return (T[]) students;
        }

            public int getGpa() {
                return gpa;
            }
        }


