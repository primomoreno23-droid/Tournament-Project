import java.util.Arrays;
import java.util.Comparator;

public class Tournament {
    // instance vars
    private Team[] teamsleftInTourmanent = new Team[16];
    private Integer round = 0;

    public Tournament(Team[] teams){
        this.teamsleftInTourmanent = teams;
    }

    public void createBracket(){
        round+=1;
        Arrays.sort(teamsleftInTourmanent);
        for(int i = 0; i < teamsleftInTourmanent.length / 2; i++){
            System.out.println(teamsleftInTourmanent[i].getName() + " vs " + teamsleftInTourmanent[teamsleftInTourmanent.length - 1 - i].getName());
        }
    }

    //public void runRound(int currentRound, ){


    //}
}
