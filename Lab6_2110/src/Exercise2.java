import java.util.*;
public class Exercise2 {
    static Scanner keyboard=new Scanner(System.in);
        public static void main(String[] args){
            System.out.println("Input an integer to count down from:");
            int n= keyboard.nextInt();
            countDown(n);
    }
    public static void countDown(int n){
            if(n<=0){
                System.out.println("BlastOff!");
            }
            else{
                System.out.print(n+" ");
                countDown(n-1);
            }
    }
}
