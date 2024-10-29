//Full name: Seth Alexander Channing
//Banner ID: B00956611
import java.util.*;
public class Exercise2 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        long startTime, endTime, executionTime;
        LinkedList<Integer> sequenceValues = new LinkedList<>();//we make this an arraylist just in case the user wants to input more values than just the examples
        int n= keyboard.nextInt();
        while(n!=0){
            sequenceValues.add(n);
            n= keyboard.nextInt();
        }
        for(int i=0;i<sequenceValues.size();i++) {
            startTime = System.currentTimeMillis();
            System.out.println(sequenceValues.get(i) + " " + collatzSequence(sequenceValues.get(i)) + " " + (System.currentTimeMillis()-startTime));//this is basically just a toString line
        }
    }
    public static String collatzSequence(int n) {
        long sequenceLength;
        long longestSequence=0;
        long longestNumber=0;//number with the longest sequence
        for (int j = 1; j <= n; j++) {//this for loop runs through all numbers up to n
            sequenceLength = 1; //this needs to be 1, so it counts the first step
            long currentNumber = j;//we need i and currentNumber to be separate variables, so we can do the sequence and change the number currentNumber but save i (if it's a longer sequence)
            while (currentNumber != 1) {
                //the sequence itself
                if (currentNumber % 2 == 0) {//if even
                    currentNumber = currentNumber / 2;
                }
                else {//if odd
                    if(currentNumber % 4 ==1){
                        currentNumber= (currentNumber*7)+1;
                    }
                    else if(currentNumber % 4 == 3){
                        currentNumber= (currentNumber*7)-1;
                    }
                }
                sequenceLength++;//increments for each step in the sequence
            }
            if (sequenceLength > longestSequence) {//this should only run if it is the longest sequence
                longestSequence = sequenceLength;
                longestNumber = j;//saves the number with the most steps
            }
        }
        return longestNumber+" "+longestSequence;//these print lines need to be in the outer for loop so they print the info for each given n value
    }
}