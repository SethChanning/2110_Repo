import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Queue;

public class TopSort {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/RandomNames.txt");//creates the file object (so we can read it)
        Scanner fileScanner = new Scanner(file);
        int n = fileScanner.nextInt();
        int[][] adj = new int[n][n];

        String nodeEdge = fileScanner.nextLine();
        String[] PlayerArray = nodeEdge.split("\t");

        while(fileScanner.hasNextLine()) {
            adj[indexFinder(PlayerArray[0])][indexFinder(PlayerArray[1])] = 1;

        }

        //PRINTING
        PrintWriter output = new PrintWriter("output.txt");
        System.out.println("A B C D E");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(adj[i][j]);
            }//rows
        }//columns
        output.close();
    }


    /**
     * This method takes in the String (the vertex) and converts it into the
     * int index for the adj matrix
     */
    public static int indexFinder(String vertex) {
        if (vertex.equalsIgnoreCase("a")) {
            return 0;
        } else if (vertex.equalsIgnoreCase("b")) {
            return 1;
        } else if (vertex.equalsIgnoreCase("c")) {
            return 2;
        } else if (vertex.equalsIgnoreCase("d")) {
            return 3;
        } else if (vertex.equalsIgnoreCase("e")) {
            return 4;
        }
        else{
            return -1;
        }
    }
}