public class Team implements Comparable<Team> {
    // instance vars
    private String teamName;
    private Integer numWins;
    private Integer numLosses;
    private Integer pointDifferential;

    //constructor
    // The constructor will need to change if the tournament allows for teams to be added after initiation.
    public Team(String name){
        this(name, 0, 0,0);
    }
    public Team(String name, Integer numWins, Integer numLosses, Integer pointDifferential){
        teamName = name;
        this.numWins = numWins;
        this.numLosses = numLosses;
        this.pointDifferential = pointDifferential;
    }


    // mutator methods
    public void addWin(){
        numWins+=1;
    }
    public void addLoss(){
        numLosses+=1;
    }
    public void addPointDifferential(Integer tempPointDifferential){
        pointDifferential+= tempPointDifferential;
    }


    //accessor methods
    public Integer getNumWins(){
        return numWins;
    }
    public Integer getNumLosses(){
        return numLosses;
    }
    public String getWinLossRecord(){
        return numWins + "-" + numLosses;
    }
    public Integer getPointDifferential(){
        return pointDifferential;
    }
    public String getName(){
        return teamName;
    }

    // comparer method
    @Override
    public int compareTo(Team other) {
        if (this.numWins != other.numWins) {
            return Integer.compare(other.numWins, this.numWins);
        }
        return Integer.compare(other.pointDifferential, this.pointDifferential);
    }
    //toString
    @Override
    public String toString(){
        return "Name: " + teamName + ", Record: " + getWinLossRecord();

    }
}
