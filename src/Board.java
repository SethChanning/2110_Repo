public class Board {
    public static void BoardMaker()
    {
        Piece[][] BoardArray = new Piece[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                BoardArray[i][j] = new Piece();
                System.out.print(BoardArray[i][j]);
            }
            System.out.println();
        }
    }
}
