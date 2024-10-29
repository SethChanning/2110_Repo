public class PlayerRecord {
    private String Name;
    private String Pos;
    private String Team;
    private int gamesPlayed;
    private int goalsScored;
    private int Assists;
    private int penaltyMinutes;
    private int shotsOnGoal;
    private int gameWinGoals;
    public PlayerRecord(String Name,String Pos, String Team, int gamesPlayed, int goalsScored, int Assists, int penaltyMinutes, int shotsOnGoal, int gameWinGoals){
        this.Name=Name;
        this.Pos=Pos;
        this.Team=Team;
        this.gamesPlayed=gamesPlayed;
        this.goalsScored=goalsScored;
        this.Assists=Assists;
        this.penaltyMinutes=penaltyMinutes;
        this.shotsOnGoal=shotsOnGoal;
        this.gameWinGoals=gameWinGoals;
    }
    public String getName(){
        return this.Name;
    }
    public String getPos(){
        return this.Pos;
    }
    public String getTeam(){
        return this.Team;
    }
    public int getGamesPlayed(){
        return this.gamesPlayed;
    }
    public int getGoalsScored(){
        return this.goalsScored;
    }
    public int getAssists(){
        return this.Assists;
    }
    public int getPenaltyMinutes(){
        return this.penaltyMinutes;
    }
    public int getShotsOnGoal(){
        return this.shotsOnGoal;
    }
    public int getGameWinGoals(){
        return this.gameWinGoals;
    }
    public String toString(){
        return this.Name+" "+this.Pos+" "+this.Team+" "+this.gamesPlayed+" "+this.goalsScored+" "+this.Assists+" "+this.penaltyMinutes+" "+this.shotsOnGoal+" "+ this.gameWinGoals+"\n";
    }//returns all details with whitespace in between and \n at end
}