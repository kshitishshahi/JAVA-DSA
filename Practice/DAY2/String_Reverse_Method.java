import java.util.Scanner;
public class String_Reverse_Method{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        System.out.println("Original String : "+s);
        String rev ="";
        for (int i=s.length()-1; i>=0; i--){
            rev += s.charAt(i);
        }
        System.out.println("Reversed String : "+rev);
        sc.close();
    }
}