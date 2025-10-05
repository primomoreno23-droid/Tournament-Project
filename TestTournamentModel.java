import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.TextField;

/*
Current version made by: Max on 10/4/2025
A  Model class that works directly with the View and TestTournamentController Classes
I made. This is Test for now as I don't know if we will want multiple Model classes or
just this one. currently only stores the List of Team objects that are v=collected from
 the first page of the view.
 */
public class TestTournamentModel {
    private Team[] teams = new Team[16];

    public void updateTeams(Team[] tempTeams){
        teams = tempTeams;
    }

    public Team[] getTeams() { //returns the list of Team objects inputted in the first page
        return teams;
    }

    public void printTeams(){  // test to double-check teams are going in right
        for (Team team : teams) {
            System.out.println(team);
        }
    }


}
