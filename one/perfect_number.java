package one;
import java.util.Scanner;
public class perfect_number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        fn(number);
    }
    static void fn(int number){
        int sum=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum=sum+i;
            }
        }
        System.out.println("the result is");
        if(number==sum){
            System.out.println(number+" is a perfect number");
        }
        else{
            System.out.println(number+" is not a perfect number");
        }
    }
}
