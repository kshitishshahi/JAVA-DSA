import java.util.Scanner;
public class Array_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int rev[] = new int[n];

        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array : ");
        for ( int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        for ( int i = 0; i < arr.length; i++) {
            rev[arr.length - 1 - i] = arr[i];
        }

            System.out.println("Reversed array : ");
            for ( int i = 0; i < rev.length; i++) {
                System.out.println(rev[i]);
            }
        }
    }
