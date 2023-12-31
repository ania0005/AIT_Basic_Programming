package TaskA.repo;

//import entity.BaseEmployee;
//import entity.Employee;

import TaskA.entity.BaseEmployee;

/**
 * Интерфейс для репозитория работников.
 */
public interface EmployeeRepositoryInterface {

    /**
     * Добавляет работника в репозиторий.
     *
     * @param employee Добавляемый работник.
     */
    boolean addEmployee(BaseEmployee employee);

    /**
     * Удаляет работника из репозитория по его ID.
     *
     * @param id ID работника, которого необходимо удалить.
     */
    boolean removeEmployee(int id);

    /**
     * Ищет работника в репозитории по его ID.
     *
     * @param id ID работника, которого необходимо найти.
     * @return Найденный работник или null, если работник не найден.
     */
    BaseEmployee findEmployeeById(int id);

    /**
     * Получает массив всех работников в репозитории.
     *
     * @return Массив всех работников в репозитории.
     */
    BaseEmployee[] getAllEmployees();

    /**
     * Возвращает количество работников в репозитории.
     *
     * @return Количество работников в репозитории.
     */
    int countEmployees();
}
