//Full Name: Seth Alexander Channing
//Banner ID: B00956611
import java.util.*;
public class Binary {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a positive integer: ");
        int n= keyboard.nextInt();
        long startTime, endTime, executionTime;
        startTime = System.currentTimeMillis();
        generateBinary(n);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        double numberTo=(Math.pow(2,n))-1;
        System.out.println("The execution time to generate binary numbers from 0 to " + numberTo + " is " + executionTime + " ms");
    }
    public static void generateBinary(int n) {
        for(int i=0; i<(Math.pow(2,n)-1); i++){
            Integer.toBinaryString(i);//println is to test it works properly
        }
    }
}