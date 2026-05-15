import java.util.Scanner;
public class Running_Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Elements : ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            System.out.println("Index = "+i);
            sum+=arr[i];
            System.out.println("Running sum = "+sum);
        }
    }
}