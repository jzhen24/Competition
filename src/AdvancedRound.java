import java.util.LinkedList;

public class AdvancedRound extends AbsRound{

    LinkedList<IContestant> contestants;

    public AdvancedRound(LinkedList<Match> matches,LinkedList<IContestant> contestants){
        super(matches);
        this.contestants = contestants;
    }

   public boolean isWinner(IContestant contestant){
        for(int i = 0; i < contestants.size(); i++){
            if(contestants.get(i).equals(contestant))
                return true;
        }
        return false;
   }
}
