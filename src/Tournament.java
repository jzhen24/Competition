import java.util.LinkedList;

public class Tournament {

    LinkedList<AbsRound> rounds;

    public Tournament(LinkedList<AbsRound> rounds){
        this.rounds = rounds;
    }
    public boolean finalWinnerIsValid(IContestant winner) {
        int count = 0;
        for (int i = 0; i < rounds.size(); i++) {
                if (rounds.get(i).isWinner(winner)) {
                    count++;
                }
        }
        return count >= rounds.size()/2;
    }
}
