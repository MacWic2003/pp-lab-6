import company.models.Worker;
import company.models.Manager;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Jan", 30000, 1, "2021-01-15", "Worker");
        Worker worker2 = new Worker("Adam", 32000, 2, "2021-02-20", "Worker");
        Worker worker3 = new Worker("Piotr", 31000, 2, "2021-03-25", "Worker");
        Worker worker4 = new Worker("Tomasz", 33000, 4, "2021-04-30", "Worker");
        Worker worker5 = new Worker("Marek", 34000, 1, "2021-05-15", "Worker");
        Manager manager1 = new Manager("Anna", 50000, 3, "2020-05-10", "Manager");
        Manager manager2 = new Manager("Kasia", 52000, 3, "2020-06-12", "Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(manager1);
        employees.add(manager2);

        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;

        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
            if (employee instanceof Manager) {
                totalManagerSalary += employee.getSalary();
            } else if (employee instanceof Worker) {
                totalWorkerSalary += employee.getSalary();
            }
        }

        System.out.println("Całkowita suma pensji wszystkich pracowników: " + totalSalary);
        System.out.println("Całkowita suma pensji wszystkich Manager: " + totalManagerSalary);
        System.out.println("Całkowita suma pensji wszystkich Worker: " + totalWorkerSalary);

        for (int i = 0; i < employees.size(); i++) {
            for (int j = i + 1; j < employees.size(); j++) {
                if (employees.get(i).equals(employees.get(j))) {
                    System.out.println("Pracownik " + employees.get(i).getName() + " (ID: " + employees.get(i).hashCode() + ") ma odpowiednik w kolekcji: " + employees.get(j).getName());
                }
            }
        }
    }
}