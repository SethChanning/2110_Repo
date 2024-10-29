import java.util.*;
public class Exercise4 {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Input two integers n,m to print out m multiples of n:");
        int n= keyboard.nextInt();
        int m=keyboard.nextInt();
        multiples(n,m);
    }
    public static void multiples(int n, int m){;
        if(m==1){
            System.out.print(n + " ");
        }
        else {
            multiples(n,m-1);
            System.out.print(n*m+" ");
        }
    }
}
