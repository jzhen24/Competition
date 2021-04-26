public class RugbyTeam implements IContestant {

    String country;
    String jerseyColor;
    boolean intimidationRitual;
    int wins;
    int losses;

    public RugbyTeam(String country, String jerseyColor, boolean intimidationRitual, int wins, int losses) {
        this.country = country;
        this.jerseyColor = jerseyColor;
        this.intimidationRitual = intimidationRitual;
        this.wins = wins;
        this.losses = losses;
    }
    //checks if team is likely to win against team given
    public boolean expectToBeat(RugbyTeam team){
        if((this.intimidationRitual)&&(!(team.intimidationRitual)))
            return true;
        else
            return((this.wins-this.losses)>(team.wins-team.losses));
    }

}