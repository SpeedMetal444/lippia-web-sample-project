package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import org.testng.Assert;
import static lippia.web.constants.SauceDemoCheckoutConstants.*;
import static lippia.web.constants.SauceDemoLoginConstants.ERROR_MESSAGE;

public class SauceDemoCheckoutService extends ActionManager {

    public static void startCheckout() {
        click(CHECKOUT_BUTTON);
    }

    public static void fillPersonalInformation(String firstName, String lastName, String zipCode) {
        setInput(INPUT_FIRSTNAME_XPATH, firstName);
        setInput(INPUT_LASTNAME_XPATH, lastName);
        setInput(INPUT_ZIPCODE_XPATH, zipCode);
        click(CONTINUE_CHECKOUT_BUTTON);
    }

    public static void verifyProductsAndPrices() {
        String backpackCheckoutPrice = getText(BACKPACK_FINAL_PRICE).replace("$", "").trim();
        String tshirtCheckoutPrice = getText(TSHIRT_FINAL_PRICE).replace("$", "").trim();

        String backpackInventoryPrice = SauceDemoInventoryService.getBackpackPrice();
        String tshirtInventoryPrice = SauceDemoInventoryService.getTshirtPrice();

        Assert.assertEquals(backpackCheckoutPrice, backpackInventoryPrice);
        Assert.assertEquals(tshirtCheckoutPrice, tshirtInventoryPrice);
    }

    public static void finishCheckout() {
        click(FINISH_BUTTON);
    }

    public static String getCheckoutErrorMessage() {
        if (isVisible(CHECKOUT_ERROR_MESSAGE)) {
            return getText(CHECKOUT_ERROR_MESSAGE);
        }
        return "";
    }
    public static void validateErrorMessage(String expectedMessage) {
        Assert.assertEquals(getCheckoutErrorMessage(), expectedMessage);
    }
}

