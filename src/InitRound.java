import java.util.LinkedList;

public class InitRound extends AbsRound{

    public InitRound(LinkedList<Match> matches){
        super(matches);
    }

    public boolean isWinner(IContestant contestant){
        for(int i = 0; i < getMatchWinners().size();i++){
            if(getMatchWinners().get(i).equals(contestant))
                return true;
        }
        return false;
    }

}
