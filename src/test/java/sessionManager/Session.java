package sessionManager;

import deviceFactory.FactoryDevice;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

/**
 * @autor : eynar.pari
 * @date : 19/09/2020.
 **/
public class Session {

    private static Session session=null;
    private AppiumDriver driver;//AppiumDriver driver; //import org.openqa.selenium.Keys

    private Session() throws MalformedURLException {
        driver = FactoryDevice.make("android").create();
    }

    public static Session getInstance() throws MalformedURLException {
        if (session==null)
            session=new Session();

        return session;
    }

    public void closeSession() {
        driver.quit();
        session=null;
    }

    public AppiumDriver getDriver(){
        return driver;
    }

}

