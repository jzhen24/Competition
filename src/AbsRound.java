import java.util.LinkedList;

public abstract class AbsRound {

    LinkedList<Match> matches;

    public AbsRound(LinkedList<Match> matches) {
        this.matches = matches;
    }

    public LinkedList<IContestant> getMatchWinners() {
        LinkedList<IContestant> winners = new LinkedList<IContestant>();
        for (int i = 0; i < matches.size(); i++) {
            winners.add(matches.get(i).winner());
        }
        return winners;
    }
    public int getNumWinners(){
        return getMatchWinners().size();
    }

    public abstract boolean isWinner(IContestant contestant);

}
