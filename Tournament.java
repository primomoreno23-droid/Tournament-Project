import java.util.Arrays;
import java.util.Comparator;


public class Tournament {
    // instance vars
    private Team[] teamsLeftInTournament = new Team[16];
    private Team[] teamsToBracket = new Team[31]; //Max- Intended store teams in a way that they can be put into a bracket by running through the List once

    private Integer round = 0;

    public Tournament(Team[] teams){
        this.teamsLeftInTournament = teams;
    }

    public void createBracket(){
        round+=1;
        Arrays.sort(teamsLeftInTournament);
        int pos = 0;
        for(int i = 0; i < teamsLeftInTournament.length / 2; i++){
            System.out.println(teamsLeftInTournament[i].getName() + " vs " + teamsLeftInTournament[teamsLeftInTournament.length - 1 - i].getName());
            teamsToBracket[pos] = teamsLeftInTournament[i];
            pos++;
            teamsToBracket[pos] = teamsLeftInTournament[teamsLeftInTournament.length - 1 - i];
            pos++;
        }

    }

    //public void runRound(int currentRound, ){


    //}
}
