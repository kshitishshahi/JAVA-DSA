import java.util.Scanner;
public class Stocks{

    static int Max_Profit(int[] arr){
        int min_price = arr[0];
        int profits = 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min_price){
                min_price = arr[i];
            }
            else{
                int gain = arr[i] - min_price;
                if(gain > profits){
                    profits = gain;
                }
            }
        }

        return profits;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] prices = new int[n];

        System.out.println("Enter the stock prices : ");
        for (int i=0; i< prices.length; i++){
            prices[i] = sc.nextInt();
        }
        int maximum_profit = Max_Profit(prices);
        System.out.println("Maximum possible profit = "+maximum_profit);
    }
}