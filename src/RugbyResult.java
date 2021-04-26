public class RugbyResult implements IResult {

    RugbyTeam team1;
    RugbyTeam team2;
    double team1points;
    double team2points;

    RugbyResult(RugbyTeam team1, RugbyTeam team2, double team1points, double team2points) {

        this.team1 = team1;
        this.team2 = team2;
        this.team1points = team1points;
        this.team2points = team2points;

    }
    //checks if team1 and team2 have valid scores for a rugby game
    public boolean isValid(){
        return ((team1points<150)&&(team2points<150));
    }
    //returns winner between two teams
    public IContestant getWinner() {
        if (team1points > team2points)
            return team1;
        return team2;
    }

}
