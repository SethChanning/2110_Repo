import java.util.*;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void Main(String[] args){
        LinkedList<String> Pokemon= new LinkedList<>();
        Scanner keyboard= new Scanner(System.in);
        String pokemon= keyboard.next();;
        while(!keyboard.equals("quit")){
            Pokemon.add(pokemon);
            pokemon= keyboard.next();
        }//creates linkedlist of pokemon
        displayEven(Pokemon);
        displayOdd(Pokemon);
        reverse(Pokemon);
        removeMiddle(Pokemon);

    }





    //method to display even-numbered nodes
    public static void displayEven(LinkedList<String> list){
        int counter=0;
        String curr=list.getFirst();
        while (curr != null) {
            if (counter % 2 == 0) {
                System.out.println(curr);
            }
            counter++;
            curr=curr.getNext();
        }


//continue
    }
    //method to display odd-numbered nodes
    public static void displayOdd(LinkedList<String> list){
//continue
    }
    //method to create a reversed linked list
    public static LinkedList<String> reverse(LinkedList<String> list){
//continue
    }
    //method to remove the middle node in the linked list
    public static void removeMiddle(LinkedList<String> list){
//continue
    }
}
