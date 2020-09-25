import activity.whenDo.HomeActivity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;
import java.net.MalformedURLException;

/**
 * author: Ivan Ulo Aruquipa
 */
public class whenDoTest {
    HomeActivity homeActivity = new HomeActivity();

    /**
     * Test para verificar la adicion de una Nota
     * @throws MalformedURLException
     */
    @Test
    public void AddItem() throws MalformedURLException {

        homeActivity.addButton.click();
        homeActivity.titleTextBox.type("Diplomado");
        homeActivity.notesTextBox.type("clases software testing - modulo 4");
        homeActivity.itemReminderButton.click();
        // selecionar fecha
        homeActivity.dueDateLabel.click();
        homeActivity.selectDateLabel.click();
        homeActivity.acceptButton.click();
        // selecionar hora
        homeActivity.timeLabel.click();
        homeActivity.selectedTimeLabel.click();
        homeActivity.acceptButton.click();
        // guardarItem
        homeActivity.repeatLabel.click();
        homeActivity.dailyRadioButton.click();
        homeActivity.saveItemButton.click();

        // Verificacion
        String actualResult = homeActivity.homeListItemLabel.getText();
        String expectedResult="Diplomado";
        Assert.assertEquals("ERROR el item \"Diplomado\" no se adiciono!",expectedResult,actualResult);
    }

    /**
     * Test para buscar una Nota
     * @throws MalformedURLException
     */
    @Test
    public void searchItem() throws MalformedURLException {
        AddItem();
        homeActivity.searchButton.click();
        homeActivity.searchTextBox.type("Diplo");
        ((AndroidDriver) Session.getInstance().getDriver()).pressKey(new KeyEvent(AndroidKey.ENTER));

        // Verificacion
        Integer numberOfResults = Integer.valueOf(homeActivity.numberOfResultsLabel.getText());
        Assert.assertTrue("ERROR el item \"Diplomado\" no se encontro!",numberOfResults>0);
    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}