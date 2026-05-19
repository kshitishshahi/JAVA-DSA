import java.util.Scanner;
public class Frequency_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        System.out.println("Enter the number to be counted : ");
        int target = sc.nextInt();
        for(int i=0; i<arr.length; i++){
            if (arr[i] == target)
            count++;
        }
        System.out.println("The number of occurence of " + (target) + " is : " + (count));
    }
}