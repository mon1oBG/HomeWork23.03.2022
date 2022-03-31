import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter parameter X");
        double parameterX = scanner.nextDouble();
        System.out.println("Enter parameter Y");
        double parameterY = scanner.nextDouble();
        System.out.println("Enter parameter Z");
        double parameterZ = scanner.nextDouble();

        if(parameterX == parameterY && parameterY == parameterZ && parameterY == parameterX){
            System.out.println(" Ravnostranen");
        } else if(parameterX == parameterY && parameterX != parameterZ && parameterX != parameterZ){
            System.out.println("Ravnobedren");
        } else{
            System.out.println("Raznostranen");
        }
    }
}


//X = Y = Z  Ravnostranen
//X = Y или X = Z или Y = Z ravnobedren
//else raznostranen