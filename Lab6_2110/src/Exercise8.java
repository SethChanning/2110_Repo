import java.util.*;
public class Exercise8 {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Input amount of stairs");
        int n= keyboard.nextInt();
        System.out.println(countWays(n));
    }
    public static int countWays(int n){
        if(n==0){
            return 1;
        }
        else if(n<0){
            return 0;
        }
        else{
            return countWays(n-1)+countWays(n-2)+countWays(n-3);
            //n-1 tells you how many ways to do 1 steps
            //n-2 tells you how many ways to do 2 steps (and 1 steps because of the recursive call)
            //n-3 tells you how many ways to do 3 steps (and 2 steps (and 1 steps) because of the recursive call)
        }
    }
}
