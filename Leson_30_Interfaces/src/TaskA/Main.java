import entity.BaseEmployee;
import entity.Developer;
import entity.Manager;
import entity.Salesperson;
import repo.EmployeeRepository;

public class Main {
    public static void main(String[] args) {
        EmployeeRepository repository = new EmployeeRepository();

        BaseEmployee developer1 = new Developer("John", 25.0, 160, 2022);
        BaseEmployee developer2 = new Developer("Alice", 30.0, 150, 2020);
        BaseEmployee manager1 = new Manager("Bob", 3000.0, 5, 2019);
        BaseEmployee salesperson1 = new Salesperson("Eve", 2000.0, 10, 2021);

        repository.addEmployee(developer1);
        repository.addEmployee(developer2);
        repository.removeEmployee(46987);
        repository.addEmployee(manager1);
        repository.addEmployee(salesperson1);


//        // Повысить зарплату для работников с опытом от 2 до 5 лет на 10%
//        BaseEmployee[] allEmployees = repository.getAllEmployees();
//        for (int i = 0; i < allEmployees.length; i++) {
//            Employee employee = allEmployees[i];
//            if (employee instanceof BaseEmployee) {
//                BaseEmployee baseEmployee = (BaseEmployee) employee;
//                baseEmployee.adjustSalaryByExperience(2, 5, 10);
//            }
//        }

        // Вывести информацию о работниках
        BaseEmployee[] allEmployees = repository.getAllEmployees();
        for (BaseEmployee employee : allEmployees) {
            System.out.println(employee);
        }
    }
}
