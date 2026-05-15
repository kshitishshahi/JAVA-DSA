import java.util.Scanner;
public class Max_Wealth{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people : ");
        int m = sc.nextInt();
        System.out.println("Enter no. of accouts everyone has : ");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];

        System.out.println("Enter the amount in each accounts : ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }

    }
}