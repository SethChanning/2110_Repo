///think of this as the main class
///
/// to do
/// make a func to add a piece at a pos. (check if the pos. is valid first)
/// display board
public class Board {


    public static void main (String[] args) {
        String[][] GameBoard = new String[8][8];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 8; j++) {
                GameBoard[i][j] = "-";
            }
        }
        ///^closes the for loop that populates the default board
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.println(GameBoard[i][j]);
            }
        }
        ///^prints the board
    }
}
