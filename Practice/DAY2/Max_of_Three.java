import java.util.Scanner;
public class Max_of_Three{
      static int maxofthree(int a, int b, int c){
          int max;
          if(a>b && a>c){
               max = a;
          }
          else if(b>c && b>a){
               max = b;
          }
          else
              max = c;
          return max;
      }
      public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter three numbers : ");
          int x = sc.nextInt();
          int y = sc.nextInt();
          int z = sc.nextInt();

          int ans = maxofthree(x, y, z);
          System.out.println("The max of three is : "+ans);
          System.out.println("The MAX of three is : "+maxofthree(x, y, z));
      }
}