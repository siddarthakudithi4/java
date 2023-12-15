package one;
import java.util.Scanner;
public class Reverse_A_String_In_Java {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String word=input.nextLine();
        System.out.println(method1(word));
        method2(word);
    }
    static String method1(String name){
        int length=name.length();
        String result="";
        for(int i=length-1;i>=0;i--){
            result+=name.charAt(i);
        }
        return result;
    }
    static void method2(String name){
        int lenght=name.length();
        char[] arr=new char[lenght];
        for(int i=0;i<arr.length;i++){
            arr[i]=name.charAt(i);
        }
        System.out.println("the letters in the array");
        for(char k:arr){
            System.out.print(k);
        }
        System.out.println("the final result in method two");
        for(int i=lenght-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }

}
