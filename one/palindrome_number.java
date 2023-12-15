package one;
import java.util.Scanner;
public class palindrome_number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        method1(number);
    }
    static void method1(int number){
        String nums=String.valueOf(number);
        int lenght=nums.length();
        String num1="";
        int reversednumber=0;
        for(int i=lenght-1;i>=0;i--){
            num1+=nums.charAt(i);
        }
        reversednumber=Integer.parseInt(num1);
        if(reversednumber==number){
            System.out.println(number+"is a palindrome number");
        }
        else{
            System.out.println(number+"is not a palindrome number");
        }
    }
}
