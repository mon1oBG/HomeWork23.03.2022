import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Day:");
        int day = scanner.nextInt();

        System.out.println("Enter Month:");
        int month = scanner.nextInt();

        boolean isMonthGreaterThan3 = month >= 3;
        boolean isMonthLessThan6 = month <= 6;
        boolean isDayGreaterThan20 = day >= 20;
        boolean isDayLessThan20 = day <= 20;


        if ((isMonthGreaterThan3) && (isMonthLessThan6) && (isDayGreaterThan20) || (isDayLessThan20) && (isMonthLessThan6) && (isMonthGreaterThan3)) {
            System.out.print("SpringSeason");}
            //     else if ((isMonthLessThan6) && (isDayLessThan20)) {
            //        System.out.print("SpringSeason");
            //   }
        else{
                System.out.print("out of scope");
            }
        }}
