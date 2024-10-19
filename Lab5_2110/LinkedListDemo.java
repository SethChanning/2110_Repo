//Full Name: Seth Alexander Channing
//Banner ID: B00956611
import java.util.Scanner;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> Pokemon = new LinkedList<>();
        Scanner keyboard = new Scanner(System.in);
        String pokemon = keyboard.next();
        while (!pokemon.equals("quit")) {
            Pokemon.add(pokemon);
            pokemon = keyboard.next();
        }//creates linkedlist of pokemon
        displayEven(Pokemon);
        System.out.println("");
        displayOdd(Pokemon);
        System.out.println("");
        LinkedList<String> reversedPokemon = reverse(Pokemon);
        for (int i = 0; i < reversedPokemon.size(); i++) {
            System.out.print(reversedPokemon.getAt(i) + " ");
        }
        System.out.println("");
        removeMiddle(Pokemon);
    }
    //method to display even-numbered nodes
    public static void displayEven(LinkedList<String> list) {
        int index = 0;
        String curr = list.getAt(index);
        while (index<list.size()) {
            curr=list.getAt(index);
            if (index % 2 == 0) {
                System.out.print(curr+" ");
            }
            index++;
        }
    }
//method to display odd-numbered nodes
    public static void displayOdd(LinkedList<String> list){
        int index = 0;
        String curr = list.getAt(index);
        while (index<list.size()) {
            curr=list.getAt(index);
            if (index % 2 != 0) {
                System.out.print(curr+" ");
            }
            index++;
        }
    }
    //method to create a reversed linked list
    public static LinkedList<String> reverse(LinkedList<String> list1) {
        LinkedList<String> list2 = new LinkedList<>();
        for (int i = 0; i < list1.size(); i++) {
            list2.add(list1.getAt(i));
        }
        return list2;
    }
//    //method to remove the middle node in the linked list
    public static void removeMiddle(LinkedList<String> list) {
        int middle=list.size()/2;
        int index=0;
        String curr=list.getAt(index);
        list.removeAt(middle);
        while (index<list.size()) {
            curr=list.getAt(index);
            System.out.print(curr+" ");
            index++;
        }
    }

}
