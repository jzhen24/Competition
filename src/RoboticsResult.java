public class RoboticsResult implements IResult {

    RoboticsTeam team1;
    RoboticsTeam team2;
    double team1points;
    int team1tasks;
    boolean team1fell;
    double team2points;
    int team2tasks;
    boolean team2fell;


    RoboticsResult(RoboticsTeam team1, RoboticsTeam team2, double team1points, int team1tasks, boolean team1fell, double team2points, int team2tasks, boolean team2fell) {

        this.team1 = team1;
        this.team2 = team2;
        this.team1points = team1points;
        this.team1tasks = team1tasks;
        this.team1fell = team1fell;
        this.team2points = team2points;
        this.team2tasks = team2tasks;
        this.team2fell = team2fell;

    }
    //checks if team1 and team2 have valid scores for a robotics match
    public boolean isValid(){
        return (((team1tasks<8)&&(team1points<=16))&&((team2tasks<8)&&(team2points<=16)));

    }
    //gives score of team
    public double getScore (double teampoints, int teamtasks, boolean teamfell){
        if(teamfell){
            return (teampoints+(double)teamtasks-5.0);
        }
        return (teampoints+(double)teamtasks);
    }
    //returns winner between two teams
    public IContestant getWinner(){
        if((getScore(team1points, team1tasks, team1fell))>(getScore(team2points, team2tasks, team2fell)))
            return team1;
        else
            return team2;
    }
}

