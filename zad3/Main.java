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
        Manager manager = new Manager("Anna", 50000, 3, "2020-05-10", "Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(manager);

        for (Employee employee : employees) {
            System.out.println(employee.getName() + " has code: " + employee.hashCode());
        }

        System.out.println("worker2.equals(worker1): " + worker2.equals(worker1));
        System.out.println("worker2.equals(worker3): " + worker2.equals(worker3));
        System.out.println("worker2.equals(manager): " + worker2.equals(manager));
    }
}