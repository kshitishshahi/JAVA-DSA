import java.util.Scanner;
public class PalindromeCheck{

        static boolean isPalindrome(String s){
            s = s.toLowerCase();
            for(int i = 0; i < s.length()/2; i++){
                if(s.charAt(i) != s.charAt(s.length()-1-i)){
                    return false;
                }
            }
            return true;
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String st = sc.nextLine();
        boolean value = isPalindrome(st);
        System.out.println("Whether the given case insenitive string is Palindrome : "+value);

    }
}