import java.util.Scanner;
public class Two_Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Elements : ");
        for(int i=0; i< arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Array Elements : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the target sum : ");
        int target = sc.nextInt();
        int lock = -1;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if (arr[i]+arr[j] == target){
                    System.out.println("The two numbers are : " + arr[i] + " and " + arr[j]);
                    lock++;
                    return;
                }

            }

        }
        if(lock == -1){
            System.out.println("No 2 numbers in the Array lead to this sum");
        }

    }
}