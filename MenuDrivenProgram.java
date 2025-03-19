import java.util.Scanner;

public class MenuDrivenProgram {
    
    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
    }
    
    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }
    
    public static void checkEvenOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next(); // Clear invalid input
            System.out.print("Enter an integer: ");
        }
        
        int number = scanner.nextInt();
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(number + " is an " + result + " number.");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            displayMenu();
            System.out.print("Enter your choice (1-3): ");
            
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
                scanner.next(); // Clear invalid input
                System.out.print("Enter your choice (1-3): ");
            }
            
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    greetUser();
                    break;
                case 2:
                    checkEvenOdd();
                    break;
                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        } while (choice != 3);
    }
}
