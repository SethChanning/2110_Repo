import java.util.Scanner;
public class Board {
    static Scanner keyboard= new Scanner(System.in);
    static Piece[][] BoardArray = new Piece[8][8];
    public static void BoardMaker()
    {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                BoardArray[i][j] = new Piece();
            }
        }
    }
    public static void BoardPrinter(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(BoardArray[i][j]);
            }
            System.out.println();
        }
    }
    public Board move(){
        return null;
    }
}
