public class SlowFlexible extends SlowPiece{
    public SlowFlexible(){
        super();
    }
    public Board move(String direction, int n, Board placeholder, int xpos, int ypos) {
        //checks to see if the movement is valid
        if(n>1){
            System.out.println("Piece cannot move that much. Try again");
        }
        else {
            if ((direction.equals("left") && (ypos - n >= 0)) ||
                    (direction.equals("right") && (ypos + n <=7)) ||
                    (direction.equals("up") && (xpos - n >=0)) ||
                    (direction.equals("down") && (xpos + n <=7)))
            //checks for bounds of board
            {
                //^checks for bound
                if (!direction.equals("left") && !direction.equals("right") &&! direction.equals("up") && !direction.equals("down")) {//checks for valid direction
                    System.out.println("Error: Input direction for movement");
                }
                else {
                    if (direction.equals("left")) {
                        placeholder.BoardArray[xpos][ypos - 1]=placeholder.BoardArray[xpos][ypos];
                        //gives the new position (xpos-1) the piece values
                        placeholder.BoardArray[xpos][ypos]= new Piece();
                        //resets piece at pos. from where the piece WAS
                        System.out.println("Piece at (" + xpos + ", " + ypos + ") moved " + direction + " " + " " + n + " spaces.");
                        return placeholder;
                    } else if (direction.equals("right"))
                        {
                            placeholder.BoardArray[xpos][ypos + 1]=placeholder.BoardArray[xpos][ypos];
                            //gives the new position (xpos-1) the piece values
                            placeholder.BoardArray[xpos][ypos]= new Piece();
                            //^resets piece pos.
                            System.out.println("Piece at (" + xpos + ", " + ypos + ") moved " + direction + " " + " " + n + " spaces.");
                            return placeholder;
                        }
                    else if (direction.equals("up"))
                    {
                        placeholder.BoardArray[xpos-1][ypos]=placeholder.BoardArray[xpos][ypos];
                        //gives the new position (xpos-1) the piece values
                        placeholder.BoardArray[xpos][ypos]= new Piece();
                        //^resets piece pos.
                        System.out.println("Piece at (" + xpos + ", " + ypos + ") moved " + direction + " " + " " + n + " spaces.");
                        return placeholder;
                    }
                    else if (direction.equals("down"))
                    {
                        placeholder.BoardArray[xpos+1][ypos]=placeholder.BoardArray[xpos][ypos];
                        //gives the new position (xpos-1) the piece values
                        placeholder.BoardArray[xpos][ypos]= new Piece();
                        //^resets piece pos.
                        System.out.println("Piece at (" + xpos + ", " + ypos + ") moved " + direction + " " + " " + n + " spaces.");
                        return placeholder;
                    }
                }
            }
            else{
                System.out.println("Error: cannot move there as it is not on the board.1");
            }
        }
        return null;
    }
}
