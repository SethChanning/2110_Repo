import java.util.*;
public class Exercise6 {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number to find the squares from 1 to n:");
        int n = keyboard.nextInt();
        System.out.println(squares(n));
    }

    public static int squares(int n) {
        if (n==1) {
            return 1;
        }
        else {
            int total=n*n;
            return total+=squares(n-1);
            //decrements through n (and find the sqaure of that number each time)
        }
    }
}
