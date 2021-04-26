import org.junit.Test;
import static org.junit.Assert.*;

public class Examples {

    RugbyTeam China = new RugbyTeam("China", "red", true, 100, 50);
    RugbyTeam Japan = new RugbyTeam("Japan", "white", false, 50, 100);
    RugbyTeam Korea = new RugbyTeam("South Korea", "black", false, 0, 10);
    RugbyTeam USA = new RugbyTeam("USA", "blue", false, 10, 0);
    RugbyTeam Canada = new RugbyTeam("Canada","brown",true,200,0);

    @Test
    public void RugbyTeamConstructorTest() {
        assertEquals(China.country, "China");
        assertEquals(China.jerseyColor, "red");
        assertEquals(China.intimidationRitual, true);
        assertEquals(China.wins, 100);
        assertEquals(China.losses, 50);
    }

    RugbyResult Rugby1 = new RugbyResult(China, Japan, 200, 175);
    RugbyResult Rugby2 = new RugbyResult(China, Japan, 100, 50);
    RugbyResult Rugby3 = new RugbyResult(China, Japan, 10, 50);
    RugbyResult Rugby4 = new RugbyResult(China, Japan, 1100, 100);
    RugbyResult Rugby5 = new RugbyResult(China, Japan, 100, 120);

    @Test
    public void isValidTestRugby1() {
        assertFalse(Rugby1.isValid());
    }

    @Test
    public void isValidTestRugby2() {
        assertTrue(Rugby2.isValid());
    }

    @Test
    public void isValidTestRugby3() {
        assertTrue(Rugby3.isValid());
    }

    @Test
    public void isValidTestRugby4() {
        assertFalse(Rugby4.isValid());
    }

    @Test
    public void isValidTestRugby5() {
        assertTrue(Rugby5.isValid());
    }

    RoboticsTeam WPI = new RoboticsTeam("WPI", "hide", 500);
    RoboticsTeam UMA = new RoboticsTeam("UMA", "kick", 1000);

    @Test
    public void RoboticsTeamConstructorTest() {
        assertEquals(WPI.school, "WPI");
        assertEquals(WPI.specialFeature, "hide");
        assertEquals(WPI.previousScore, 500);
    }

    RoboticsResult Robotics1 = new RoboticsResult(WPI, UMA, 8.0, 7, true, 4.0, 5, false);
    RoboticsResult Robotics2 = new RoboticsResult(WPI, UMA, 100.0, 3, false, 5.0, 5, true);
    RoboticsResult Robotics3 = new RoboticsResult(WPI, UMA, 10.0, 9, true, 14.0, 1, true);
    RoboticsResult Robotics4 = new RoboticsResult(WPI, UMA, 6.0, 5, true, 200.0, 3, false);
    RoboticsResult Robotics5 = new RoboticsResult(WPI, UMA, 4.0, 6, true, 12.0, 20, false);
    RoboticsResult Robotics6 = new RoboticsResult(WPI, UMA, 2.0,4,true,6.0,7,true);

    @Test
    public void isValidRobotics1() {
        assertTrue(Robotics1.isValid());
    }

    @Test
    public void isValidRobotics2() {
        assertFalse(Robotics2.isValid());
    }

    @Test
    public void isValidRobotics3() {
        assertFalse(Robotics3.isValid());
    }

    @Test
    public void isValidRobotics4() {
        assertFalse(Robotics4.isValid());
    }

    @Test
    public void isValidRobotics5() {
        assertFalse(Robotics5.isValid());
    }

    @Test
    public void getScoreRobotics1() {
        assertTrue((Robotics1.getScore(Robotics1.team1points, Robotics1.team1tasks, Robotics1.team1fell)) == 10.0);
        assertTrue((Robotics1.getScore(Robotics1.team2points, Robotics1.team2tasks, Robotics1.team2fell)) == 9.0);
    }

    @Test
    public void getScoreRobotics2() {
        assertTrue((Robotics2.getScore(Robotics2.team1points, Robotics2.team1tasks, Robotics2.team1fell)) == 103.0);
        assertTrue((Robotics2.getScore(Robotics2.team2points, Robotics2.team2tasks, Robotics2.team2fell)) == 5.0);
    }

    @Test
    public void getScoreRobotics3() {
        assertTrue((Robotics3.getScore(Robotics3.team1points, Robotics3.team1tasks, Robotics3.team1fell)) == 14.0);
        assertTrue((Robotics3.getScore(Robotics3.team2points, Robotics3.team2tasks, Robotics3.team2fell)) == 10.0);
    }

    @Test
    public void getScoreRobotics4() {
        assertTrue((Robotics4.getScore(Robotics4.team1points, Robotics4.team1tasks, Robotics4.team1fell)) == 6.0);
        assertTrue((Robotics4.getScore(Robotics4.team2points, Robotics4.team2tasks, Robotics4.team2fell)) == 203.0);
    }

    @Test
    public void getScoreRobotics5() {
        assertTrue((Robotics5.getScore(Robotics5.team1points, Robotics5.team1tasks, Robotics5.team1fell)) == 5.0);
        assertTrue((Robotics5.getScore(Robotics5.team2points, Robotics5.team2tasks, Robotics5.team2fell)) == 32.0);
    }

    @Test
    public void getWinnerRugby1() {
        assertEquals(Rugby1.getWinner(), Rugby1.team1);
    }

    @Test
    public void getWinnerRugby2() {
        assertEquals(Rugby2.getWinner(), Rugby2.team1);
    }

    @Test
    public void getWinnerRugby3() {
        assertEquals(Rugby3.getWinner(), Rugby3.team2);
    }

    @Test
    public void getWinnerRugby4() {
        assertEquals(Rugby4.getWinner(), Rugby4.team1);
    }

    @Test
    public void getWinnerRugby5() {
        assertEquals(Rugby5.getWinner(), Rugby5.team2);
    }

    @Test
    public void getWinnerRobotics1() {
        assertEquals(Robotics1.getWinner(), Robotics1.team1);
    }

    @Test
    public void getWinnerRobotics2() {
        assertEquals(Robotics2.getWinner(), Robotics2.team1);
    }

    @Test
    public void getWinnerRobotics3() {
        assertEquals(Robotics3.getWinner(), Robotics3.team1);
    }

    @Test
    public void getWinnerRobotics4() {
        assertEquals(Robotics4.getWinner(), Robotics4.team2);
    }

    @Test
    public void getWinnerRobotics5() {
        assertEquals(Robotics5.getWinner(), Robotics5.team2);
    }

    @Test
    public void expectToBeatRugby1() {
        assertTrue(China.expectToBeat(Japan));
    }

    @Test
    public void expectToBeatRugby2() {
        assertFalse(Japan.expectToBeat(China));
    }

    @Test
    public void expectToBeatRugby3() {
        assertFalse(Korea.expectToBeat(USA));
    }

    @Test
    public void expectToBeatRugby4(){
        assertTrue(USA.expectToBeat(Korea));
    }

    @Test
    public void expectToBeatRugby5(){
        assertFalse(China.expectToBeat(Canada));
    }

    @Test
    public void expectToBeatRobotics1(){
        assertFalse(WPI.expectToBeat(UMA));
    }

    @Test
    public void expectToBeatRobotics2(){
        assertTrue(UMA.expectToBeat(WPI));
    }

    Match rugbyMatch1 = new Match(China, Japan, Rugby1);
    Match rugbyMatch2 = new Match(China, Japan, Rugby2);
    Match rugbyMatch3 = new Match(China, Japan, Rugby3);
    Match rugbyMatch4 = new Match(China,Japan, Rugby4);
    Match rugbyMatch5 = new Match(China, Japan, Rugby5);


    @Test
    public void winnerTestRugby1(){
        assertEquals(rugbyMatch1.winner(),null);
    }

    @Test
    public void winnerTestRugby2(){
        assertEquals(rugbyMatch2.winner(),China);
    }

    @Test
    public void winnerTestRugby3(){
        assertEquals(rugbyMatch3.winner(),Japan);
    }

    @Test
    public void winnerTestRugby4(){
        assertEquals(rugbyMatch4.winner(), null);
    }

    @Test
    public void winnerTestRugby5(){
        assertEquals(rugbyMatch5.winner(),Japan);
    }

    Match roboticsMatch1 = new Match (WPI, UMA, Robotics1);
    Match roboticsMatch2 = new Match (WPI, UMA, Robotics2);
    Match roboticsMatch3 = new Match (WPI, UMA, Robotics3);
    Match roboticsMatch4 = new Match (WPI, UMA, Robotics4);
    Match roboticsMatch5 = new Match (WPI, UMA, Robotics5);
    Match roboticsMatch6 = new Match (WPI, UMA, Robotics6);

    @Test
    public void winnerTestRobotics1(){
        assertEquals(roboticsMatch1.winner(), roboticsMatch1.team1);
    }

    @Test
    public void winnerTestRobotics2(){
        assertEquals(roboticsMatch2.winner(), null);
    }

    @Test
    public void winnerTestRobotics3(){
        assertEquals(roboticsMatch3.winner(), null);
    }

    @Test
    public void winnerTestRobotics4(){
        assertEquals(roboticsMatch4.winner(), null);
    }

    @Test
    public void winnerTestRobotics5(){
        assertEquals(roboticsMatch5.winner(), null);
    }

    @Test
    public void winnerTestRobotics6(){
        assertEquals(roboticsMatch6.winner(), roboticsMatch6.team2);
    }
    @Test
    public void MatchConstructorTest(){
        assertEquals(roboticsMatch1.team1, WPI);
        assertEquals(roboticsMatch1.team2, UMA);
        assertEquals(roboticsMatch1.teams, Robotics1);
    }
}



