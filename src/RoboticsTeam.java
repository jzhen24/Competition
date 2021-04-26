public class RoboticsTeam implements IContestant{

    String school;
    String specialFeature;
    int previousScore;

    public RoboticsTeam(String school, String specialFeature, int previousScore) {
        this.school = school;
        this.specialFeature = specialFeature;
        this.previousScore = previousScore;

    }
    //checks if team is likely to win against team given
    public boolean expectToBeat(RoboticsTeam team){
        return this.previousScore > team.previousScore;
    }



}
