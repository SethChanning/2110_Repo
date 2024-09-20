import java.util.Scanner;
public class GameDemo
{
    static Scanner keyboard = new Scanner(System.in);
    public static void main (String[] args) {
        do {
            System.out.println("Enter a command (type for details):");
            String choice=keyboard.next();

            if (choice.equalsIgnoreCase("print"))
            {
                Board.BoardMaker();
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
                 PieceCreation();
            }
             else if(choice.equals("exit")) {
                 System.exit(0);
            }
             else{
                 goFuckYourself();
            }
        }while(true);
    }
    public static String goFuckYourself(){
        return "Error: Go fuck yourself";
    }
    public static void PieceCreation(){
        int xpos= keyboard.nextInt();
        int ypos= keyboard.nextInt();
        System.out.println("Input a name for the new piece:");
        String name=keyboard.next();
        System.out.println("Input a color for the new piece:");
        String color=keyboard.next();

        Piece newPiece=new Piece(name, color);
        newPiece= BoardArray[xpos][ypos];

}
}