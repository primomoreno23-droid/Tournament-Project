/*
Current version made by: Max on 10/4/2025
A separated controller class that works directly with the View and TestTournamentModel Classes
I made. theis is Test for now as there will probably be way to move it into a general
Controller class, rather than the hyper specific form it's currently in.
 */

public class TestTournamentController {

    private final TestTournamentModel model = new TestTournamentModel();
    private final View view = new View();

    public View getView() {
        return this.view;
    }

    private void updateTeamList() {
        Team[] teams = { //Instantiates the List of Team objects for model.updateTeams() method
                new Team(view.getTeam1Field().getText()),
                new Team(view.getTeam2Field().getText()),
                new Team(view.getTeam3Field().getText()),
                new Team(view.getTeam4Field().getText()),

                new Team(view.getTeam5Field().getText()),
                new Team(view.getTeam6Field().getText()),
                new Team(view.getTeam7Field().getText()),
                new Team(view.getTeam8Field().getText()),

                new Team(view.getTeam9Field().getText()),
                new Team(view.getTeam10Field().getText()),
                new Team(view.getTeam11Field().getText()),
                new Team(view.getTeam12Field().getText()),

                new Team(view.getTeam13Field().getText()),
                new Team(view.getTeam14Field().getText()),
                new Team(view.getTeam15Field().getText()),
                new Team(view.getTeam16Field().getText()),
        };
        model.updateTeams(teams);

        //model.printTeams();

    }


    public TestTournamentController() {

        view.getDoneButton().setOnAction(event -> //updates the team list when the buttons pressed. eventually need to move to next screen also.
                updateTeamList()
        );
    }
}
