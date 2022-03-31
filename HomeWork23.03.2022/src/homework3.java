import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double NumberFromConsole = scanner.nextInt();

     //   boolean result = NumberFromConsole % 2 == 0;

        if (NumberFromConsole %2 ==0) {
            System.out.println("Your number is EVEN");
        } else {
            System.out.println("Your number is ODD");
        }
    }
}