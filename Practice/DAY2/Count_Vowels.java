import java.util.Scanner;
public class Count_Vowels{
    static int countVowel(String s){
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            if( s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
                count++;
                }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String st = sc.nextLine();
        int num = countVowel(st);
        System.out.println("Number of vowels in the String = "+num);
    }

}