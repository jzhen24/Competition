public class Match {

    IResult teams;
    IContestant team1;
    IContestant team2;

    public Match (IContestant team1, IContestant team2, IResult teams){
        this.team1 = team1;
        this.team2 = team2;
        this.teams = teams;
    }
    // produces contestant that wins the match
    public IContestant winner(){
        if(teams.isValid())
            return teams.getWinner();
        else
            return null;
    }

}
