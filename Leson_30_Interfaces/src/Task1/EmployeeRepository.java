package Task1;

import java.util.Arrays;

public class EmployeeRepository implements EmployeeRepositoryInterfase {
    Employee[] arrayEmployees = new Employee[10];
static Integer counterId = 156789;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeRepository that = (EmployeeRepository) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(arrayEmployees, that.arrayEmployees);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arrayEmployees);
    }

    @Override
    public boolean add (Employee employee) {

        for (int i = 0; i < arrayEmployees.length; i++) {
            if (arrayEmployees[i] == null) {
                arrayEmployees[i] = employee;
                employee.setId(++counterId);
                System.out.println("Сотрудник принят на работу " + employee.toString());
                return true;
            }

        }
        System.out.println("Сотрудник не принят на работу " + employee);
        return false;
    }

    @Override
    public boolean remove(int id) {
        for (int i = 0; i < arrayEmployees.length; i++) {
            if (arrayEmployees[i].getId() == id) {
                arrayEmployees[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Employee[] getAll() {
        int counter = 0;
        for (int i = 0; i < arrayEmployees.length; i++) {
            if (arrayEmployees[i] != null) {
                counter++;}
        }
        Employee[] currentEmployees = new Employee[counter];
        for (int i = 0; i < arrayEmployees.length; i++) {
            if (arrayEmployees[i] != null){
                currentEmployees[i] = arrayEmployees[i];
            }
        }
        return currentEmployees;
    }
    @Override
    public Employee[] getAllSalary(double minSalary, double maxSalary) {
        int counter = 0;
        Employee[] currentEmployees = new Employee[10];
        for (int i = 0; i < arrayEmployees.length; i++) {
            if (arrayEmployees[i] != null &&
                arrayEmployees[i].getSalary() >= minSalary &&
                    arrayEmployees[i].getSalary() <= maxSalary){
                currentEmployees[i] = arrayEmployees[i];}
        }
        return currentEmployees;
    }

    @Override
    public Employee[] getAllHireYear(int minYear, int maxYear) {
        int counter = 0;
        Employee[] currentEmployees = new Employee[10];
        for (int i = 0; i < arrayEmployees.length; i++) {
            if (arrayEmployees[i] != null &&
                    arrayEmployees[i].getHireYear() >= minYear &&
                    arrayEmployees[i].getHireYear() <= maxYear){
                currentEmployees[i] = arrayEmployees[i];}
        }
        return currentEmployees;
    }

    @Override
    public Employee findById(int id) {
        for (int i = 0; i < arrayEmployees.length; i++) {
            Employee currentEmployee = arrayEmployees[i];
            if (currentEmployee != null && id == currentEmployee.getId()) {
                return currentEmployee;
            }
        }
        return null;
    }

    public Employee[] getArrayEmployees() {
        return arrayEmployees;
    }
}
