import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Height  - for example: 1,87 :");
        double height = scanner.nextDouble();
        System.out.println("Enter your kg  - for example 102 :");
        double kg = scanner.nextDouble();

        double heightForFormula = height * 2;
        double BMI = kg / heightForFormula;

        if((BMI >= 16) && (BMI <= 18.4)) {
            System.out.println(" Your BMI index is Underweight");
        } else if((BMI >= 18.5) && (BMI <= 24.9)) {
        System.out.println(" Your BMI index is Normal");
        }else if((BMI>= 25) && (BMI <=40)) {
            System.out.println(" Your BMI Index is Overweight");
        }
    }
}


//16 - 18.4 Underweight
//18.5 - 24.9 Normal
//25 - 40 Overweight