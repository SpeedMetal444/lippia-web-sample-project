package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.SauceDemoConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.SauceDemoConstants.*;

public class SauceDemoCartService extends ActionManager {
    public static void navigateWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void enterUsernameAndPassword(String user, String password) {
        setInput(SauceDemoConstants.INPUT_USER_XPATH, user);
        setInput(SauceDemoConstants.INPUT_PASS_XPATH, password);
    }


}
