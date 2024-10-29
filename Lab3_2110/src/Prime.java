//Full Name: Seth Alexander Channing
//Banner ID: B00956611
import java.util.*;
public class Prime {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        long startTime, endTime, executionTime;
        ArrayList<Long> primeValues = new ArrayList<>();//we need to make this an arrayList because we don't know how many numbers we're taking in every time and LinkedList doesn't work with Long
        long nthPrime= keyboard.nextLong();
        while(nthPrime!=0){
            primeValues.add(nthPrime);
            nthPrime= keyboard.nextLong();;
        }
        for(int i=0;i<primeValues.size();i++){//loop will run for the length of the linked list (whatever the length is)
            startTime = System.currentTimeMillis();
            long thePrime=nthPrime(primeValues.get(i));//this must be between the start+end time
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println(primeValues.get(i)+" "+thePrime+" "+executionTime);
        }
    }
    //sorry to the marker for all the comments this stuff hurt my brain
    public static long nthPrime(long n) {
        long possiblePrime = 2;//we start at 2 because 1 breaks everything
        long possibleFactor;//create the variable here to save some trouble later
        int primeCounter = 0;//we start with 0 and 2 will be the first prime
        while (primeCounter < n) {
            possibleFactor = 2;//we need to reset this for every number
            while (possibleFactor <= Math.sqrt(possiblePrime)) {//we check up to (and including) math.sqrt because every factor above math.sqrt would have already been ruled out
                if (possiblePrime % possibleFactor == 0) {//if this is true, number!=prime. reset the possibleFactor and check the next possiblePrime
                    possiblePrime++;//check the next number
                    possibleFactor = 2;//we reset for the next factor
                    break;//leave the loop (we found a factor and need to check the next number instead)
                }
                possibleFactor++;//even if the possibleFactor doesn't work, we need to check the next one
            }
            if (possibleFactor > Math.sqrt(possiblePrime)) {//we left the loop, and we double-check the number is prime (this line only executes if the factor rules out the last factor(making it prime)
                primeCounter++;
                possiblePrime++;
            }
        }
        return possiblePrime - 1;//needs to subtract 1 from possiblePrime because it will always be off by 1
    }
}