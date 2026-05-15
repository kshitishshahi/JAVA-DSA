import java.util.Scanner;
public class BasicCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first nummber :");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number :");
        int num2 = sc.nextInt();
        System.out.println("Sum = "+(num1+num2));
        System.out.println("Difference = "+(num1-num2));
        System.out.println("Product = "+(num1*num2));
        System.out.println("Divison = "+(num1/num2));
    }
}