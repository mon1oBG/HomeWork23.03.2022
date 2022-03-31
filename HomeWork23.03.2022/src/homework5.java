import java.util.Scanner;

public class homework5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 12 to see which month is it");
        int month = scanner.nextInt();
        switch (month){
            case 1:
                System.out.println("You have entered 1 and this is January");
                break;
            case 2:
                System.out.println("You have entered 2 and this is February");
                break;
            case 3:
                System.out.println("You have entered 3 and this is March");
                break;
            case 4:
                System.out.println("You have entered 4 and this is April");
                break;
            case 5:
                System.out.println("You have entered 5 and this is May");
                break;
            case 6:
                System.out.println("You have entered 6 and this is June");
                break;
            case 7:
                System.out.println("You have entered 7 and this is July");
                break;
            case 8:
                System.out.println("You have entered 8 and this is August");
                break;
            case 9:
                System.out.println("You have entered 9 and this is September");
                break;
            case 10:
                System.out.println("You have entered 10 and this is October");
                break;
            case 11:
                System.out.println("You have entered 11 and this is November");
                break;
            case 12:
                System.out.println("You have entered 12 and this is December");
                break;
            default:
                System.out.println("invalid! Enter a number from 1 to 12");
        }
    }
}
