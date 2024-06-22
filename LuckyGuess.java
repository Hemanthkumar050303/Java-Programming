import java.util.Scanner;

public class LuckyGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-5): ");
        int number = scanner.nextInt();
        
        switch (number) {
            case 1:
                System.out.println("You guessed number 1. Lucky guess!");
                break;
            case 2:
                System.out.println("You guessed number 2. Almost there!");
                break;
            case 3:
                System.out.println("You guessed number 3. Keep trying!");
                break;
            case 4:
                System.out.println("You guessed number 4. Better luck next time!");
                break;
            case 5:
                System.out.println("You guessed number 5. Try again!");
                break;
            default:
                System.out.println("Invalid number. Please enter a number between 1 and 5.");
        }
        
        scanner.close();
    }
}
