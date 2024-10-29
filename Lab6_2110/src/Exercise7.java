import java.sql.SQLOutput;
import java.util.*;
public class Exercise7 {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter a string to reverse:");
        String str= keyboard.next();
        System.out.println(reverseString(str));
    }
    public static String reverseString(String str){
        if (str.length() <= 1) {
            return str;
        } else {
            return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
            //this does a bunch of calls until it hits the last case (str.length()<=1). at this point
            //it starts going back of the call list, adding the letter it looked in the last call (the last char)
            //it adds this to the end of the new word, which makes the new letter
            //str.charAt(str.length() - 1) gets the last character
            //reverseString(str.substring(0, str.length() - 1)) recursively finds the rest of the words
        }
    }
}
