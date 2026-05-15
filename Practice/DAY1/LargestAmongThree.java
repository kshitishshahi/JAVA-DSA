import java.util.Scanner;
public class LargestAmongThree{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter the Second Number : ");
        int n2 = sc.nextInt();
        System.out.println("Enter the Third Number : ");
        int n3 = sc.nextInt();
        if(n1>n2 && n1>n3) {
            System.out.println(n1 + " is the largest among three");
        }
        else if (n2>n1 && n2>n3){
            System.out.println(n2+" is the largest among three");
            }
        else System.out.println(n3+" is the largest among three");
    }
}