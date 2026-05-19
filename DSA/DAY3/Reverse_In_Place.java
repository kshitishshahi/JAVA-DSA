import java.util.Scanner;
public class Reverse_In_Place{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Elements : ");
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array : ");
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int temp =0;
        for(int i=0; i< arr.length/2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println("Reversed Array : ");
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}