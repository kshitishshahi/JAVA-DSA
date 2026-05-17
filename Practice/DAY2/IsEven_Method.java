public class IsEven_Method{
    static boolean isEven(int n){
        return n%2==0;
    }

    static boolean isPositive(int n){
        return n> 0;
    }
    public static void main(String[] args){
    System.out.println(isEven(4));
    System.out.println(isEven(9));
    System.out.println(isPositive(4));
    System.out.println(isPositive(-9));
    }
}