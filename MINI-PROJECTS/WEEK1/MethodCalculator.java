import java.util.Scanner;
public class MethodCalculator{
    static int add(int a , int b){
        int sum = a+b;
        return sum;
    }

    static int sub(int a , int b){
        int diff = a-b;
        return diff;
    }

    static int product(int a , int b){
        int prod = a*b;
        return prod;
    }

    static double division( double a , double b){
        double div = a/b;
        return div;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("\nChoose the operation to perform :\n1. Addition\n 2. Substraction\n 3. Multiplication\n 4. Division");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("Answer = "+add(x,y));
                break;

            case 2:
                System.out.println("Answer = "+sub(x,y));
                break;

            case 3:
                System.out.println("Answer = "+product(x,y));
                break;

            case 4:
                if(y==0){
                    System.out.println("Division can't be done");
                    return;
                }
                System.out.println("Answer = "+division(x,y));
                break;

            default: System.out.println("Enter Valid choice!!");
        }

    }
}
