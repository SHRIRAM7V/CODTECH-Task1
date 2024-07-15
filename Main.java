import java.util.*;
public class Main{
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        int choice;
        Calculator calc = new Calculator();
        String option;
        while(true){
            System.out.println("Enter your operation to perform : \n1.Addition\n2.Subtraction\n3.Multiplication \n4.Division");
            choice = scanner.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("Enter the first number : ");
                    a = scanner.nextDouble();
                    System.out.println("Enter the second number : ");
                    b = scanner.nextDouble();
                    calc.add(a,b);
                    break;
                case 2 :
                    System.out.println("Enter the first number : ");
                    a = scanner.nextDouble();
                    System.out.println("Enter the second number : ");
                    b = scanner.nextDouble();
                    calc.subtract(a,b);
                    break;
                case 3:
                    System.out.println("Enter the first number : ");
                    a = scanner.nextDouble();
                    System.out.println("Enter the second number : ");
                    b = scanner.nextDouble();
                    calc.multiplication(a,b);
                    break;
                case 4:
                    System.out.println("Enter the first number : ");
                    a = scanner.nextDouble();
                    System.out.println("Enter the second number : ");
                    b = scanner.nextDouble();
                    calc.division(a,b);
                    break;
                default:
                    System.out.println("You have given a wrong input, please try again");
                    continue;
            }
            System.out.println("Do you want to perform another calculation enter Y/y to continue or n/N to quit");
            option = scanner.next();
            if( !option.equals("y") && !option.equals("Y")){
                break;
            }
        }
    }
}
class Calculator{
    double result;
    void add(double num1, double num2)
    {
        result = num1 + num2;
        System.out.println("The addition of the given two numbers is " + result);
    }
    void subtract(double num1, double num2){
        result = num1 - num2;
        System.out.println("The subtraction of the given two numbers is "+ result);
    }
    void multiplication(double num1, double num2){
        result = num1 * num2;
        System.out.println("The multiplication of the given two numbers is "+ result);
    }
    void division(double num1, double num2){
        result = num1/num2;
        System.out.println("The division of the given two numbers is " + result);
    }
}
