package one;
import java.util.Scanner;
import java.util.*;
class one{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter any number");
        int number=input.nextInt();
        String num=String.valueOf(number);
        int length=num.length();
        int ten=10;
        double lastnumber=0;
        double finalanswer=0;
        for(int i=0;i<length;i++){
            lastnumber=number%10;
            lastnumber=Math.pow(lastnumber,length);
            number=number/10;
            finalanswer+=lastnumber;
        }
        System.out.println(finalanswer);
    }
}