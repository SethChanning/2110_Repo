import java.util.Scanner;
public class GameDemo
{
    static Scanner keyboard = new Scanner(System.in);
    public static void main (String[] args) {
            Board placeHolder= new Board();
            Board.BoardMaker();


            do {
            System.out.println("Enter a command (type for details):");
            String choice=keyboard.next();

            if (choice.equalsIgnoreCase("print"))
            {
                Board.BoardPrinter();
            }
             else if (choice.equals("help")) {
                 System.out.println("Possible commands are as follows:\n" +
                         "create location [fast][flexible]: Creates a new piece.\n" +
                         "move location direction [spaces]: Moves a piece.\n" +
                         "print: Displays the board.\n" +
                         "help: Displays help.\n" +
                         "exit: Exits the program.");
            }













             else if(choice.equals("create")){
                int xpos= keyboard.nextInt();
                int ypos= keyboard.nextInt();

                System.out.println("Input a name for the new piece:");
                String name=keyboard.next();
                System.out.println("Input a color for the new piece:");
                String color=keyboard.next();
                placeHolder.BoardArray[xpos][ypos].setName(name);
                placeHolder.BoardArray[xpos][ypos].setColor(color);












             }









             else if(choice.equals("exit")) {
                 System.out.println("Done");
                 System.exit(0);
            }
             else{
                 errorMethod();
            }
        }while(true);
    }
    public static String errorMethod(){
        return "Error: Go fuck yourself";
    }
}
//to do:
//make different piece-types work
//check for wrong inputs
//check to see if piece movement is valid (display error message if invalid)