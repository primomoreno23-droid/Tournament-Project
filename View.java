import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

/*
Current version made by: Max on 10/4/2025
The View class handles initializing the PageView class, and allows for communication between
the model and controller. At the moment I am unsure how this code will change, as the majority
of the mess of it will be in PageView.
 */
public class View extends BorderPane {

    private final Button doneButton = new Button("Done");
    private final PageView pageView = new PageView();


    public View() {
        setBottom(buildButtonBox());
        setCenter(pageView);
    }

    private HBox buildButtonBox() {
        HBox buttonBox = new HBox(this.doneButton);
        buttonBox.setAlignment(Pos.CENTER);
        return buttonBox;
    }


    //PageView accessor
    public TextField getTeam1Field() {return pageView.getTeam1Field();}
    public TextField getTeam2Field() {return pageView.getTeam2Field();}
    public TextField getTeam3Field() {return pageView.getTeam3Field();}
    public TextField getTeam4Field() {return pageView.getTeam4Field();}

    public TextField getTeam5Field() {return pageView.getTeam5Field();}
    public TextField getTeam6Field() {return pageView.getTeam6Field();}
    public TextField getTeam7Field() {return pageView.getTeam7Field();}
    public TextField getTeam8Field() {return pageView.getTeam8Field();}

    public TextField getTeam9Field() {return pageView.getTeam9Field();}
    public TextField getTeam10Field() {return pageView.getTeam10Field();}
    public TextField getTeam11Field() {return pageView.getTeam11Field();}
    public TextField getTeam12Field() {return pageView.getTeam12Field();}

    public TextField getTeam13Field() {return pageView.getTeam13Field();}
    public TextField getTeam14Field() {return pageView.getTeam14Field();}
    public TextField getTeam15Field() {return pageView.getTeam15Field();}
    public TextField getTeam16Field() {return pageView.getTeam16Field();}

    public Button getDoneButton() {
        return doneButton;
    }
}