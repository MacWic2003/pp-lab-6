import company.models.Worker;
import company.models.Manager;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Jan", 30000, 1);
        Worker worker2 = new Worker("Adam", 32000, 2);
        Worker worker3 = new Worker("Piotr", 31000, 3);
        Worker worker4 = new Worker("Tomasz", 33000, 4);
        Manager manager = new Manager("Anna", 50000, 5);

        Worker[] workers = {worker1, worker2, worker3, worker4};
        for (Worker worker : workers) {
            System.out.println(worker.getName() + " ma pensję " + worker.getSalary());
            worker.work();
        }

        System.out.println(manager.getName() + " ma pensję " + manager.getSalary());
        manager.work();
    }
}