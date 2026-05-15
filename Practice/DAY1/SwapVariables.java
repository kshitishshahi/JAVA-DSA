import java.util.Scanner;
public class SwapVariables{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();

        int c1 = num1;//copy for further use
        int c2 = num2;//copy for further use

        //using third variable
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Number 1 after swap : "+num1);
        System.out.println("Numner 2 after swap : "+num2);

        //without using third variable
        c1=c1+c2;
        c2=c1-c2;
        c1=c1-c2;
        System.out.println("Number 1 after swapping without third variable : "+c1);
        System.out.println("Number 2 after swapping without third variable : "+c2);
    }

}