import java.util.Scanner;

public class Recursion {

    static void printNumbers(int n) {
        if (n == 0)
            return;

        System.out.println(n);
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        printNumbers(n);
    }
}