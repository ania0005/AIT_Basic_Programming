package Hw2;

import Hw1.LanguageCertificate;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee intern1 = new Intern("Ivanov", 1500, "Humbolt");
        Employee intern2 = new Intern("Petrov", 1200, "RUB");
        Employee intern3 = new Intern("Li", 1450, "Humbolt");

        Employee engineer1 = new Engineer("Chan", 3000, "Industrial");
        Employee engineer2 = new Engineer("Zuev", 3750, "Chemical");
        Employee engineer3 = new Engineer("Volin",3200, "Electrical");

        Employee manager1 = new Manager("Vasin",2800, 15);
        Employee manager2 = new Manager("King", 2650, 10);
        Employee manager3 = new Manager("Schulz",2300, 8);

//        intern1.work();
//        intern2.work();
//        intern3.work();
//
//        engineer1.work();
//        engineer2.work();
//        engineer3.work();
//
//        manager1.work();
//        manager2.work();
//        manager3.work();

Employee [] listEmployee = new Employee [9];
        listEmployee[0] = intern1;
        listEmployee[1] = intern2;
        listEmployee[2] = intern3;
        listEmployee[3] = engineer1;
        listEmployee[4] = engineer2;
        listEmployee[5] = engineer3;
        listEmployee[6] = manager1;
        listEmployee[7] = manager2;
        listEmployee[8] = manager3;

        for (int i = 0; i < listEmployee.length; i++) {
            listEmployee[i].work();
        }

    }
}
