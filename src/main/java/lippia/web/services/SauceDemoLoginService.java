package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;

import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.SauceDemoConstants.*;

public class SauceDemoLoginService extends ActionManager {

    public static void navigateWeb(){
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
        setInput(INPUT_USER_XPATH, user);
        setInput(INPUT_PASS_XPATH, password);
    }
}

