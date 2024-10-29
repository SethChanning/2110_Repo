public class NHLStats {
    List<PlayerRecord> PlayerList = new List<>();
    String Output="";
    public String MostGoalsAssists(){
        PlayerRecord curr = PlayerList.first();
        curr=PlayerList.next();
        int MostPoints=0;
        while(curr!=null) {
            int GoalsAssists = curr.getGoalsScored() + curr.getAssists();
            if (GoalsAssists > MostPoints) {
                MostPoints = GoalsAssists;
            }
                curr = PlayerList.next();
        }//when this loop is done, the highest point value is found
        PlayerRecord curr2 = PlayerList.first();
        curr2=PlayerList.next();
        while(curr2!=null){
            int PlayerPoints=curr2.getGoalsScored() + curr2.getAssists();
            if(PlayerPoints>=MostPoints){
                Output+=curr2.getName()+" "+curr2.getTeam()+" ";
            }
            curr2=PlayerList.next();
        }
        return Output;
    }//display string of player(s) with most mostgoals+assists
    public String mostPenalty(){
        Output="";
        PlayerRecord curr = PlayerList.first();
        curr=PlayerList.next();
        int MostPenalty=0;
        while(curr!=null) {
            if (curr.getPenaltyMinutes() > MostPenalty) {
                MostPenalty = curr.getPenaltyMinutes();
            }
            curr = PlayerList.next();
        }//this loop finds the highest amount of penalty minutes
        PlayerRecord curr2 = PlayerList.first();
        curr2=PlayerList.next();
        while(curr2!=null) {
            if (curr2.getPenaltyMinutes() == MostPenalty) {
                Output+= curr2.getName()+" "+curr2.getTeam()+" "+curr2.getPos()+" ";
            }
            curr2 = PlayerList.next();
        }//this loop outputs the player(s)
        return Output;
    }//display string of player with most penaltytime
    public String MVP(){
        Output="";
        PlayerRecord curr = PlayerList.first();
        curr=PlayerList.next();
        int MostWinGoals=0;
        while(curr!=null) {
            if (curr.getGameWinGoals() > MostWinGoals) {
                MostWinGoals = curr.getGameWinGoals();
            }
            curr = PlayerList.next();
        }//when this loop is done, the highest point value is found
        PlayerRecord curr2 = PlayerList.first();
        curr2=PlayerList.next();
        while(curr2!=null){
            if(curr2.getGameWinGoals()>=MostWinGoals){
                Output+=curr2.getName()+" "+curr2.getTeam()+" ";
            }
            curr2=PlayerList.next();
        }
        return Output;
    }//display string of player with mose gamewinninggoals
    public String shotsOnGoal(){
        Output="";
        PlayerRecord curr = PlayerList.first();
        curr=PlayerList.next();
        int MostShots=0;
        while(curr!=null) {
            if (curr.getShotsOnGoal() > MostShots) {
                MostShots = curr.getShotsOnGoal();
            }
            curr = PlayerList.next();
        }//when this loop is done, the highest point value is found
        PlayerRecord curr2 = PlayerList.first();
        curr2=PlayerList.next();
        while(curr2!=null){
            if(curr2.getShotsOnGoal()>=MostShots){
                Output+=curr2.getName()+" "+curr2.getTeam()+" ";
            }
            curr2=PlayerList.next();
        }
        return Output;
    }//display string of player with most shotsongoal
    public String teamPenaltyTime(){
        //my general strategy for this is as follows:
        //find how many teams there are and add them to a linkedlist (because we dont know how many we cant use an array)
        //make a 2d array where the first row is teamnames and the second row is the corresponding penaltyminutes
        //compare the values of the 2nd row of the 2d array with some sort of sorting algorithm and return it
        Output="";
        List<String> teamNames= new List<>();//this will store the teamnames
        PlayerRecord curr = PlayerList.first();
        while(curr!=null){
            String teamName=curr.getTeam();
            if(!teamNames.contains(teamName)){
                    teamNames.add(teamName);
                }//adds teamname to the list of teams if its a new team
            curr=PlayerList.next();
        }//finds+creates list of all unique teams
        String[][] penaltyMinutes=new String[2][teamNames.size()];//creates the array
        String teamCurr=teamNames.first();
        int j = 0;
        for(int i=0;i<teamNames.size();i++){
            penaltyMinutes[0][i]=teamCurr;//assigns column to team name
            int tempTotal=0;
            PlayerRecord curr3 = PlayerList.first();
            while(curr3 != null) {
                if(curr3.getTeam().equals(teamCurr)) {
                    tempTotal += curr3.getPenaltyMinutes();
                }
                curr3 = PlayerList.next();
            }
            penaltyMinutes[1][j] = Integer.toString(tempTotal);
            j++;
            teamCurr=teamNames.next();//inner loop populates second row (penaltyminutes) of 2d array
        }//outer loop populates the top row (names) of 2d array
        int largest=0;
        for(int i=0;i<teamNames.size();i++){
            if(Integer.parseInt(penaltyMinutes[1][i])>largest){
                largest=Integer.parseInt(penaltyMinutes[1][i]);
            }
        }//finding max value(s) of the times
        for(int i=0;i<teamNames.size();i++){
            if(Integer.parseInt(penaltyMinutes[1][i])>=largest){
                Output+=penaltyMinutes[0][i];
            }
        }//finds the teamname with max value
        return Output;
        }//displays name of team with most penalty across all players
    public String teamGameWinGoals(){
        Output="";
        List<String> teamNames= new List<>();//this will store the teamnames
        PlayerRecord curr = PlayerList.first();
        while(curr!=null){
            String teamName=curr.getTeam();
            if(!teamNames.contains(teamName)){
                teamNames.add(teamName);
            }//adds teamname to the list of teams if its a new team
            curr=PlayerList.next();
        }//finds+creates list of all unique teams
        String[][] gameWinGoalsArr=new String[2][teamNames.size()];//creates the array
        String teamCurr=teamNames.first();
        int j = 0;
        for(int i=0;i<teamNames.size();i++){
            gameWinGoalsArr[0][i]=teamCurr;//assigns column to team name
            int tempTotal=0;
            PlayerRecord curr3 = PlayerList.first();
            while(curr3 != null) {
                if(curr3.getTeam().equals(teamCurr)) {
                    tempTotal += curr3.getGameWinGoals();
                }
                curr3 = PlayerList.next();
            }
            gameWinGoalsArr[1][j] = Integer.toString(tempTotal);
            j++;
            teamCurr=teamNames.next();//inner loop populates second row (penaltyminutes) of 2d array
        }//outer loop populates the top row (names) of 2d array
        int largest=0;
        for(int i=0;i<teamNames.size();i++){
            if(Integer.parseInt(gameWinGoalsArr[1][i])>largest){
                largest=Integer.parseInt(gameWinGoalsArr[1][i]);
            }
        }//finding max value(s) of the times
        for(int i=0;i<teamNames.size();i++){
            if(Integer.parseInt(gameWinGoalsArr[1][i])>=largest){
                Output+=gameWinGoalsArr[0][i];
            }
        }//finds the teamname with max value
        return Output;
    }//displays name of team with most gamewinninggoals
}
