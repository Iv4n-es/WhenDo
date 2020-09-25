package activity.whenDo;


import appiumControl.*;
import org.openqa.selenium.By;

public class HomeActivity {

    public Button addButton;
    public Button moreOptionsButton;

    public TextBox titleTextBox;
    public TextBox notesTextBox;
    public Button itemReminderButton;

    public Label dueDateLabel;
    public Label selectDateLabel;
    public Button  acceptButton;

    public Label timeLabel;
    public Label selectedTimeLabel;

    public Label repeatLabel;
    public RadioButton dailyRadioButton;
    public Button  saveItemButton;

    public Label homeListItemLabel;

    public Button searchButton;
    public TextBox searchTextBox;

    public Label numberOfResultsLabel;

    public HomeActivity(){

        addButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
        //moreOptionsButton = new Button(By.xpath("//android.widget.ImageView[@content-desc=\"Más opciones\"]"));

        titleTextBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
        notesTextBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
        itemReminderButton = new Button(By.id("com.vrproductiveapps.whendo:id/note_item_reminder"));
        dueDateLabel = new Label(By.id("com.vrproductiveapps.whendo:id/due_date"));
        selectDateLabel = new Label(By.xpath("//android.view.View[@content-desc=\"29 septiembre 2020\"]"));
        acceptButton = new Button(By.id("android:id/button1"));
        timeLabel = new Label(By.id("com.vrproductiveapps.whendo:id/time"));
        selectedTimeLabel = new Label(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"7\"]"));
        repeatLabel = new Label(By.id("com.vrproductiveapps.whendo:id/repeat"));

        dailyRadioButton = new RadioButton(By.xpath("//android.widget.RadioButton[2]"));

        saveItemButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
        homeListItemLabel = new Label(By.id("com.vrproductiveapps.whendo:id/home_list_item_text"));
        searchButton = new Button(By.id("com.vrproductiveapps.whendo:id/search"));
        searchTextBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/search_src_text"));
        numberOfResultsLabel = new Label(By.id("com.vrproductiveapps.whendo:id/search_header2"));

    }
}
