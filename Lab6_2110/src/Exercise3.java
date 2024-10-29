import java.util.*;
public class Exercise3 {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Input a number to count down from (by 2):");
        int n= keyboard.nextInt();
        countDown(n);
    }
    public static void countDown(int n){
        if(n<=0){
            System.out.println("BlastOff!");
        }
        else{
            System.out.print(n+" ");
            countDown(n-2);
        }
    }
}
