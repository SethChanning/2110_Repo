import java.lang.reflect.Array;
import java.util.Scanner;
import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class Huffman {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<BinaryTree<Pair>> S = new ArrayList<>();;
        ArrayList<BinaryTree<Pair>> T = new ArrayList<>();

        System.out.println("Enter the name of the file with letters and probability: ");
        String filename = keyboard.nextLine();
        System.out.println("Building the Huffman tree ...\nHuffman coding completed.");
        File file = new File(filename);
        Scanner fileScanner = new Scanner(file);
        //everything above here takes in the letters and their probabilities

        while (fileScanner.hasNextLine()) {
            String letter = fileScanner.next();
            float prob = fileScanner.nextFloat();
            Pair pair = new Pair(letter, prob);
            BinaryTree<Pair> tree = new BinaryTree<>();
            S.add(tree);
        }//makes the pairs of letters and probabilities

    }
}