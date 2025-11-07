package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.SauceDemoConstants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.SauceDemoConstants.*;

public class SauceDemoLoginService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void enterUsername(String username) {
        setInput(INPUT_USER_XPATH, username);
    }

    public static void enterPassword(String password) {
        setInput(INPUT_PASS_XPATH, password);
    }

    public static void clickLogin() {
        click(LOGIN_BUTTON);
    }

    public static boolean loginSuccess() {
        return isVisible(INVENTORY_TITLE);
    }

    public static String getErrorMessage() {
        if (isVisible(ERROR_MESSAGE)) {
            return getText(ERROR_MESSAGE);
        }
        return "";
    }

    public static void enterUsernameAndPassword(String user, String password) {
        setInput(SauceDemoConstants.INPUT_USER_XPATH, user);
        setInput(SauceDemoConstants.INPUT_PASS_XPATH, password);
    }
}

