import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    static class Task {
        int id;
        String name;
        int priority;

        Task(int id, String name, int priority) {
            this.id = id;
            this.name = name;
            this.priority = priority;
        }
    }
    static class TaskScheduler {

        private int nextTaskId = 1;

        // Higher priority value comes first
        PriorityQueue<Task> queue = new PriorityQueue<>(
            (a, b) -> b.priority - a.priority
        );

        public void addTask(String name, int priority) {
            Task task = new Task(nextTaskId++, name, priority);
            queue.add(task);
            System.out.println(
                "Task added successfully. ID: " + task.id
            );
        }

        public void executeTask() {
            if (queue.isEmpty()) {
                System.out.println("No tasks to execute.");
                return;
            }
            Task task = queue.poll();
            System.out.println(
                "Executing Task ID: " + task.id +
                ", Name: " + task.name +
                ", Priority: " + task.priority
            );
        }

        public void printPendingTasks() {
            if (queue.isEmpty()) {
                System.out.println("No pending tasks.");
                return;
            }
            System.out.println("Pending tasks:");
            for (Task task : queue) {
                System.out.println(
                    "ID: " + task.id +
                    ", Name: " + task.name +
                    ", Priority: " + task.priority
                );
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TaskScheduler scheduler = new TaskScheduler();

        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. Execute Task");
            System.out.println("3. Show Pending Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {
                System.out.print("Enter task name: ");
                String name = sc.nextLine();

                System.out.print(
                    "Enter priority (higher number = higher priority): "
                );
                int priority = sc.nextInt();

                scheduler.addTask(name, priority);
            }
            else if (choice == 2) {
                scheduler.executeTask();
            }
            else if (choice == 3) {
                scheduler.printPendingTasks();
            }
            else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            }
            else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
