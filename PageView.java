import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/*
Current version made by: Max on 10/4/2025
Currently this is the basic form of creating the main page of the wireframe, the one that
collects the team names. Currently, THIS CODE WORKS!!! Through the View class this sends
the fields to the controller and stores the information in the model.
 */
public class PageView extends BorderPane {

    //Stupid block of "necessary" Instantiated Objects, currently one is needed for each team.
    private final TextField team1Field = new TextField();
    private final TextField team2Field = new TextField();
    private final TextField team3Field = new TextField();
    private final TextField team4Field = new TextField();
    private final TextField team5Field = new TextField();
    private final TextField team6Field = new TextField();
    private final TextField team7Field = new TextField();
    private final TextField team8Field = new TextField();
    private final TextField team9Field = new TextField();
    private final TextField team10Field = new TextField();
    private final TextField team11Field = new TextField();
    private final TextField team12Field = new TextField();
    private final TextField team13Field = new TextField();
    private final TextField team14Field = new TextField();
    private final TextField team15Field = new TextField();
    private final TextField team16Field = new TextField();

    public PageView() { // this will contain the methods to open and move through each window. Methods are split for ease.

        EnterTeamNamesView();


    }

    public void EnterTeamNamesView() { //Instantiates the team name entry view.
        VBox mainContainer = new VBox(); //Main VBox housing the title of the page and the organizing HBox for the columns
        mainContainer.setAlignment(Pos.TOP_CENTER);
        mainContainer.setPrefSize(500, 500);

        HBox columnOrganizer = new HBox(); // Holds the columns so they are next to each other horizontally
        columnOrganizer.setSpacing(2);

        VBox column1 = new VBox(); //contains Labels for teams 1 - 8
        column1.setSpacing(15);

        VBox column2 = new VBox(); //contains Fields for teams 1 - 8
        column2.setSpacing(6);

        VBox column3 = new VBox(); //contains Labels for teams 9 - 16
        column3.setSpacing(15);

        VBox column4 = new VBox(); //contains Fields for teams 9 - 16
        column4.setSpacing(6);

        mainContainer.getChildren().addAll(new Label("Please Enter Team Names:"), columnOrganizer);

        columnOrganizer.getChildren().addAll(column1, column2, new Label("    "), column3, column4);

        column1.getChildren().addAll(new Label("Team 1:"), new Label("Team 2:"), new Label("Team 3:"),
                new Label("Team 4:"), new Label("Team 5:"), new Label("Team 6:"), new Label("Team 7:"), new Label("Team 8:"));

        column2.getChildren().addAll(team1Field, team2Field, team3Field, team4Field, team5Field, team6Field, team7Field, team8Field);

        column3.getChildren().addAll(new Label("Team 9:"), new Label("Team 10:"), new Label("Team 11:"),
                new Label("Team 12:"), new Label("Team 13:"), new Label("Team 14:"), new Label("Team 15:"), new Label("Team 16:"));

        column4.getChildren().addAll(team9Field, team10Field, team11Field, team12Field, team13Field, team14Field, team15Field, team16Field);

        setCenter(mainContainer);



    }


    //Accessor Methods
    public TextField getTeam1Field(){return team1Field;}
    public TextField getTeam2Field() {return team2Field;}
    public TextField getTeam3Field() {return team3Field;}
    public TextField getTeam4Field() {return team4Field;}

    public TextField getTeam5Field() {return team5Field;}
    public TextField getTeam6Field() {return team6Field;}
    public TextField getTeam7Field() {return team7Field;}
    public TextField getTeam8Field() {return team8Field;}

    public TextField getTeam9Field() {return team9Field;}
    public TextField getTeam10Field() {return team10Field;}
    public TextField getTeam11Field() {return team11Field;}
    public TextField getTeam12Field() {return team12Field;}

    public TextField getTeam13Field() {return team13Field;}
    public TextField getTeam14Field() {return team14Field;}
    public TextField getTeam15Field() {return team15Field;}
    public TextField getTeam16Field() {return team16Field;}
}
