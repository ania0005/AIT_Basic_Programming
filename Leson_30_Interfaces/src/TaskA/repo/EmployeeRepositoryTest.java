package TaskA.repo;

//import entity.BaseEmployee;
//import entity.Developer;
import TaskA.entity.BaseEmployee;
import TaskA.entity.Developer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Andrej Reutow
 * created on 18.10.2023
 */
class EmployeeRepositoryTest {

    private EmployeeRepository repository;

    @BeforeAll
    public static void init() {
        System.out.println("@BeforeAll");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("@BeforeEach");
        repository = new EmployeeRepository();
    }

    @Test
    void test_countEmployees() {

        int result = repository.countEmployees();

        Assertions.assertEquals(0, result);
    }

    @Test
    void test_removeEmployee_() {
        //Дано
        BaseEmployee developer1 = new Developer("dev1", 100, 180, 2023);
        BaseEmployee developer2 = new Developer("dev2", 200, 150, 2023);
        BaseEmployee developer3 = new Developer("dev3", 300, 200, 2023);

        repository.addEmployee(developer1);
        repository.addEmployee(developer2);
        repository.addEmployee(developer3);

        BaseEmployee[] employees = repository.getAll();
        Assertions.assertEquals(developer2.getName(), employees[1].getName());

        // Когда
        boolean isRemoved = repository.removeEmployee(developer2.getId());

        // Тогда
        Assertions.assertTrue(isRemoved);
        Assertions.assertEquals(2, repository.countEmployees());

        Assertions.assertEquals(developer1.getName(), employees[0].getName());
        Assertions.assertEquals(developer3.getName(), employees[1].getName());
        for (int i = 2; i < employees.length; i++) {
            Assertions.assertNull(employees[i]);
        }
    }
}
