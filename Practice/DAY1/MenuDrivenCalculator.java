import java.util.Scanner;
public class MenuDrivenCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        float n1 = sc.nextFloat();
        System.out.println("Enter the second number : ");
        float n2 = sc.nextFloat();
        System.out.println("\nChoose the required operation : \n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");
        int c = sc.nextInt();
        if(c == 1)
            System.out.println("Solution = "+(n1+n2));
        else if(c == 2)
            System.out.println("Solution = "+(n1-n2));
        else if(c == 3)
            System.out.println("Solution = "+(n1*n2));
        else if(c == 4)
            System.out.println("Solution = "+(n1/n2));
        else
            System.out.println("Enter correct option");
    }
}