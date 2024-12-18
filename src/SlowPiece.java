public class SlowPiece extends Piece {
    public SlowPiece() {
        super();
    }

    public Board move(String direction, int n, Board placeholder, int xpos, int ypos) {
        //checks to see if the movement is valid
        if(n>1){
            System.out.println("Piece cannot move that much. Try again");
        }
        else {
            if ((direction.equals("left") && (ypos - 1 >= 0)) || (direction.equals("right") && (ypos + 1 <=7)))
            {
            //^checks for bound
            if (!direction.equals("left") && !direction.equals("right")) {//checks if piece can move that way (flex or not)
                System.out.println("Error: Piece cannot move that way");
            }
            else {
                if (direction.equals("left")) {
                    placeholder.BoardArray[xpos][ypos - 1]=placeholder.BoardArray[xpos][ypos];
                    //gives the new position (xpos-1) the piece values
                    placeholder.BoardArray[xpos][ypos]= new Piece();
                    //resets piece at pos. from where the piece WAS
                    System.out.println("Piece at (" + xpos + ", " + ypos + ") moved " + direction + " " + " " + n + " spaces.");
                    return placeholder;
                } else if (direction.equals("right")) {
                    {
                        placeholder.BoardArray[xpos][ypos + 1]=placeholder.BoardArray[xpos][ypos];
                        //gives the new position (xpos-1) the piece values
                        placeholder.BoardArray[xpos][ypos]= new Piece();
                        //^resets piece pos.
                        System.out.println("Piece at (" + xpos + ", " + ypos + ") moved " + direction + " " + " " + n + " spaces.");
                        return placeholder;
                    }
                }
            }
        }
            else{
                System.out.println("Error: cannot move there as it is not on the board.");
            }
        }
    return null;
    }
}

