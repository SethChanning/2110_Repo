import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class NHLDemo
{
    public static void main(String[] args) throws IOException
    {
        NHLStats List = new NHLStats();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input file name");
        String fileName= keyboard.next();
        File file = new File(fileName);
        Scanner fileScanner = new Scanner(file);
        while(fileScanner.hasNextLine()){
            String Player = fileScanner.nextLine();
            String[] PlayerArray= Player.split("\\s+");
            PlayerRecord newPlayer= new PlayerRecord(PlayerArray[0],PlayerArray[1],PlayerArray[2],//these are the strings
                    Integer.parseInt(PlayerArray[3]),Integer.parseInt(PlayerArray[4]),Integer.parseInt(PlayerArray[5]),
                    Integer.parseInt(PlayerArray[6]),Integer.parseInt(PlayerArray[7]),Integer.parseInt(PlayerArray[8]));//these are the ints
            List.PlayerList.add(newPlayer);
        }
        PrintWriter output = new PrintWriter("output.txt");

        output.println("Players with highest points and their teams:");
        output.println(List.MostGoalsAssists());
        output.println("Most aggressive players, their teams and their positions:");
        output.println(List.mostPenalty());
        output.println("Most valuable players and their teams:");
        output.println(List.MVP());
        output.println("Most promising players and their teams::");
        output.println(List.shotsOnGoal());
        output.println("Teams that had the most number of penalty minutes:");
        output.println(List.teamPenaltyTime());
        output.println("Teams that had the most number of game winning goals:");
        output.println(List.teamGameWinGoals());
        fileScanner.close();
        output.close();
    }
}
