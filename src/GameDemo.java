import java.util.Scanner;
public class GameDemo {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Board placeHolder = new Board();
        Board.BoardMaker();
///IMPORTANT, Y IS LEFT TO RIGHT(ROWS) AND X IS UP AND DOWN (COLUMNS)
        do {
            System.out.println("Enter a command (type help for details):");
            String choice = keyboard.next();
            if (choice.equalsIgnoreCase("print")) {
                Board.BoardPrinter();
            } else if (choice.equals("help")) {
                System.out.println("Possible commands are as follows:\n" +
                        "create location [fast][flexible]: Creates a new piece.\n" +
                        "move location direction [spaces]: Moves a piece.\n" +
                        "print: Displays the board.\n" +
                        "help: Displays help.\n" +
                        "exit: Exits the program.");
            } else if (choice.equals("create"))
            {
                try {
                    int xpos = keyboard.nextInt();
                    int ypos = keyboard.nextInt();
                    if (placeHolder.BoardArray[xpos][ypos].getName().equals(" - ")) {
                        String PieceType = keyboard.nextLine();
                        //checks whether or not the piece of fast at all
                        if (PieceType.contains("fast")) {
                            //check for flex
                            if (PieceType.contains("flexible")) {
                                FastFlexible newPiece = new FastFlexible();
                                placeHolder.BoardArray[xpos][ypos] = newPiece;
                                System.out.println("Input a name for the new piece:");
                                String name = keyboard.next();
                                System.out.println("Input a color for the new piece:");
                                String color = keyboard.next();
                                placeHolder.BoardArray[xpos][ypos].setName(name);
                                placeHolder.BoardArray[xpos][ypos].setColor(color);
                                placeHolder.BoardArray[xpos][ypos].setType("FF");
                                //makes fast flex
                            }
                            //makes a fast piece flexible or not
                            else if (!PieceType.contains("flexible")) {
                                FastPiece newPiece = new FastPiece();
                                placeHolder.BoardArray[xpos][ypos] = newPiece;
                                System.out.println("Input a name for the new piece:");
                                String name = keyboard.next();
                                System.out.println("Input a color for the new piece:");
                                String color = keyboard.next();
                                placeHolder.BoardArray[xpos][ypos].setName(name);
                                placeHolder.BoardArray[xpos][ypos].setColor(color);
                                placeHolder.BoardArray[xpos][ypos].setType("F");
                                //makes fast non flex
                            }
                        }
                        //checks whether or not the piece if flex at all
                        else if (PieceType.contains("flexible") && !PieceType.contains("fast")) {
                            SlowFlexible newPiece = new SlowFlexible();
                            placeHolder.BoardArray[xpos][ypos] = newPiece;
                            System.out.println("Input a name for the new piece:");
                            String name = keyboard.next();
                            System.out.println("Input a color for the new piece:");
                            String color = keyboard.next();
                            placeHolder.BoardArray[xpos][ypos].setName(name);
                            placeHolder.BoardArray[xpos][ypos].setColor(color);
                            placeHolder.BoardArray[xpos][ypos].setType("SF");
                            //makes slow flex piece
                        } else if (!PieceType.contains("flexible") && !PieceType.contains("fast")) {
                            SlowPiece newPiece = new SlowPiece();
                            placeHolder.BoardArray[xpos][ypos] = newPiece;
                            System.out.println("Input a name for the new piece:");
                            String name = keyboard.next();
                            System.out.println("Input a color for the new piece:");
                            String color = keyboard.next();
                            placeHolder.BoardArray[xpos][ypos].setName(name);
                            placeHolder.BoardArray[xpos][ypos].setColor(color);
                            placeHolder.BoardArray[xpos][ypos].setType("S");
                            //makes slow piece (non flex)
                        }
                        else { //gives error message if inputs for piece types arent valid for whatever reason
                            System.out.println(errorMethod());
                        }
                    }
                    else {//this else is checking if a piece already exists or not
                        System.out.println("Cannot create piece here. Try another spot or move the existing piece first");
                    }
                }
                catch(Exception e){ //this should be a try catch to find errors.
                    System.out.println(errorMethod());
                    //gives error if xpos,ypos for creation isnt valid (for whatever reason like not an int)
                }
            } else if (choice.equals("exit")) {//exit code
                System.out.println("Done");
                System.exit(0);
            } else if (choice.equals("move")) {//move code
                try {
                    int xpos = keyboard.nextInt();
                    int ypos = keyboard.nextInt();
                    //^takes in the location for which piece we're moving
                    if (!placeHolder.BoardArray[xpos][ypos].getName().equals(" - ")) { //makes sure the position is empty before executing
                        String Direction = keyboard.next();
                        int Spaces = keyboard.nextInt();
                        placeHolder.BoardArray[xpos][ypos].move(Direction, Spaces, placeHolder, xpos, ypos);
                        //^this fetches the object(object has a type [fast, slow, etc.] and in each class is a unique move method
                    } else {//error message if no piece
                        System.out.println("Error: no piece at (" + xpos + ", " + ypos + ")");
                    }
                }
                catch(Exception e){
                    System.out.println(errorMethod());
                }
            }
            else { //this else if if the user input doesnt match anything(move,quit,create, etc.)
                System.out.println(errorMethod());
            }
        } while (true); //must be while true because the only way to exit is through "exit"
    }
    public static String errorMethod() { //error msg for incorrect inputs
        return "Error with input. Try again.";
    }
}
