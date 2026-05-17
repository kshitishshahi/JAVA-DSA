import java.util.Scanner;
public class LinearSearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("ENter the elements of the Array : ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the Element to be searched : ");
        int find = sc.nextInt();

        int pos = -1;
        for (int i=0; i< arr.length; i++){
            if (arr[i] == find) {
                pos = i;
                break;
            }
        }
        System.out.println("Position of the required element : "+pos);
    }
}