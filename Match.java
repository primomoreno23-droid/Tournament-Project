public class Match {

    private final Team[] teams;
    private Pool poolLetter;
    private int teamAScore;
    private int teamBScore;
    private boolean decidedYet;
    private String referee;      // maybe later
    private String currentCourt; // maybe later


    // team a corresponds to teams[0], and vice versa
    public Match(Team[] teams) {
        this.teams = teams;
        teamAScore = 0;
        teamBScore = 0;
        decidedYet = false;
    }

    public Match(Team[] teams, Pool pool) {
        this(teams);
        this.poolLetter = pool;
    }

    public void decideMatch(int teamAFinalScore, int teamBFinalScore) {
        teamAScore = teamAFinalScore;
        teamBScore = teamBFinalScore;
        decidedYet = true;
        if (teamAScore > teamBScore) {
            teams[0].addWin();
            teams[1].addLoss();
        } else {
            teams[1].addWin();
            teams[0].addLoss();
        }

    }



    public Pool getPool() {
        return poolLetter;
    }

    public Team[] getTeams() {
        return teams;
    }

    public String getMatch() {
        if (decidedYet) {
            if (teamAScore > teamBScore) {
                return teams[0].getName() + " wins with " + teamAScore + " points, and " +
                        teams[1].getName() + " loses with " + teamBScore + " points.";
            }
            return teams[1].getName() + " wins with " + teamBScore + " points, and " +
                    teams[0].getName() + " loses with " + teamAScore + " points.";
        }
        return "Match hasn't been decided yet.";
    }
}
