import java.util.ArrayList;
import java.util.Scanner;

public class TaskList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n1. Add task");
            System.out.println("2. View tasks");
            System.out.println("3. Remove task");
            System.out.println("4. Quit");
            System.out.print("Choose an option: ");
            String choice = input.nextLine();

            if (choice.equals("1")) {
                System.out.print("Enter task: ");
                tasks.add(input.nextLine());
                System.out.println("Task added.");
            } else if (choice.equals("2")) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks yet.");
                } else {
                    int i = 0;
                    while (i < tasks.size()) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                        i++;
                    }
                }
            } else if (choice.equals("3")) {
                System.out.print("Enter task number to remove: ");
                int num = Integer.parseInt(input.nextLine());
                if (num >= 1 && num <= tasks.size()) {
                    System.out.println("Removed: " + tasks.remove(num - 1));
                } else {
                    System.out.println("Invalid number.");
                }
            } else if (choice.equals("4")) {
                running = false;
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid option.");
            }
        }
        input.close();
    }
}