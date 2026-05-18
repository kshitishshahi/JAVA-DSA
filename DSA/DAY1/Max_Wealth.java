import java.util.Scanner;

public class Max_Wealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of people : ");
        int m = sc.nextInt();

        System.out.println("Enter no. of accounts everyone has : ");
        int n = sc.nextInt();

        int arr[][] = new int[m][n];

        System.out.println("Enter the amount in each account : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max_wealth = 0;
        int person = -1;

        for (int i = 0; i < m; i++) {
            int sum = 0;

            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }

            if (sum > max_wealth) {
                max_wealth = sum;
                person = i+1;
            }
        }

        System.out.println("The person with most money in account is : " + person + " with max wealth of : " + max_wealth);

        sc.close();
    }
}