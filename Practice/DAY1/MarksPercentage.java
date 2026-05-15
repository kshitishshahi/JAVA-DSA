import java.util.Scanner;
public class MarksPercentage{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of subject 1 : ");
        int m1 = sc.nextInt();
        System.out.println("Enter the marks of subject 2 : ");
        int m2 = sc.nextInt();
        System.out.println("Enter the marks of subject 3 : ");
        int m3 = sc.nextInt();
        System.out.println("Enter the marks of subject 4 : ");
        int m4 = sc.nextInt();
        System.out.println("Enter the marks of subject 5 : ");
        int m5 = sc.nextInt();

        if (m1 >= 0 && m1 <= 100 && m2 >= 0 && m2 <= 100 && m3 >= 0 && m3 <= 100 && m4 >= 0 && m4 <= 100 && m5 >= 0 && m5 <= 100) {
            float total = m1 + m2 + m3 + m4 + m5;
            float percent = (total / 500) * 100;
            System.out.println("Total Marks : " + total);
            System.out.println("Percentage : " + percent + "%");
        } else {
            System.out.println("Enter the marks correctly!!!!");
            System.out.println("Note : 0<= MARKS <= 100");
        }
    }
        }