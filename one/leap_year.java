package one;
import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ENTER ANY YEAR");
        int year=input.nextInt();
        method1(year);
    }
    public static void method1(int number){
        if(number%400==0 && number%100==0 || number%4==0){
            System.out.println("leap year");
        }
    }
}
