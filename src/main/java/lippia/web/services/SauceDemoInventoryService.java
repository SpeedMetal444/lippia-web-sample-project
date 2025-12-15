package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.SauceDemoLoginConstants;

import static lippia.web.constants.SauceDemoInventoryConstants.*;

public class SauceDemoInventoryService extends ActionManager {

    private static String backpackPrice;
    private static String tshirtPrice;

    public static void addBackpackToCart() {
        click(ADD_BUTTON_BACKPACK);
    }

    public static void addTshirtToCart() {
        click(ADD_BUTTON_TSHIRT);
    }

    public static void removeBackpackFromCart() {
        click(REMOVE_BUTTON_BACKPACK);
    }

    public static void removeTshirtFromCart() {
        click(REMOVE_BUTTON_TSHIRT);
    }

    public static void storeBackpackPrice() {
        backpackPrice = getText(BACKPACK_PRICE).replace("$", "").trim();
    }

    public static void storeTshirtPrice() {
        tshirtPrice = getText(TSHIRT_PRICE).replace("$", "").trim();
    }

    public static String getBackpackPrice() {
        return backpackPrice;
    }

    public static String getTshirtPrice() {
        return tshirtPrice;
    }

    public static int getCartBadgeCount() {
        if (isVisible(CART_BADGE_COUNT)) {
            String countText = getText(CART_BADGE_COUNT);
            return Integer.parseInt(countText);
        }
        return 0;
    }

    public static void goToCart() {
        click(CART_LINK);
    }

    public static boolean isCartBadgeVisible() {
        try {
            return isVisible(CART_BADGE_COUNT);
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
}

