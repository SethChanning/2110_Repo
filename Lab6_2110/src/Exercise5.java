import java.util.*;
public class Exercise5 {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Input a number to count down from:");
        int n= keyboard.nextInt();
        writeVertical(n);
    }
    public static void writeVertical(int n){
        if(n==0){
            return;
        }
        else{
            writeVertical(n/10);
            System.out.println(n%10);
            //print line itself prints the last digit (always)
            //writeVertical call gets ride of the last number every time
        }
    }
}
