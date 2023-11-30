package Task1;

public interface EmployeeRepositoryInterfase {

    //Включает методы для добавления, удаления, поиска, получения списка всех работников
    // и получения количества работников.
   boolean add(Employee employee);
   boolean remove(int id);
   Employee [] getAll();
   Employee[] getAllSalary(double minSalary, double maxSalary);

   Employee[] getAllHireYear(int minYear, int maxYear);

   Employee findById(int id);

}
