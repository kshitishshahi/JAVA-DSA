import java.util.Scanner;
public class TemperatureConverter{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celcius : ");
        double ctemp= sc.nextDouble();
        double ftemp = ((9*ctemp/5)+32);
        System.out.println("Temperature in Fahreneit : "+ftemp);
    }
}