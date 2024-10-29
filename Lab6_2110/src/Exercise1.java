import java.util.*;
public class Exercise1 {
    static Scanner keyboard= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Input a positive integer to find the factorial of:");
        int a= keyboard.nextInt();
        System.out.println("Factorial: "+recFact(a));
        System.out.println("Input how many Fibonacci numbers to find:");
        int b= keyboard.nextInt();
        System.out.println("The first "+b+" numbers of the Fibonacci sequence are:");
        for(int i=0;i<b;i++) {
            System.out.print(recFib(i)+" ");
        }
        System.out.println("\nInput two numbers, x and n, where x is raised to the power n:");
        int c= keyboard.nextInt();
        int d= keyboard.nextInt();
        System.out.println(c+" to the power of "+d+" is: "+recExp(c,d));
        }
        public static int recFact(int n){
        if(n==0){
            return 1;
        }//when the number reaches 0, return
        else{
            return n*recFact(n-1);
        }//multiplies n by n-1
        }//needs to return long because of big numbers
        public static int recFib(int n) {
            if (n == 0) {
                return 0;
            }
            else if (n == 1) {
                return 1;
            } else {
                return  (recFib(n - 1) + recFib(n - 2));
            }
        }//must print out every number in sequence
        public static int recExp(int c, int d){
        if(d==0){
            return 1;
        }
        else{
            return c*recExp(c, d-1);
        }
        }
    }