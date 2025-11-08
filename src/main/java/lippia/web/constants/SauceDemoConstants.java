package lippia.web.constants;

public class SauceDemoConstants {
    public static final String INPUT_USER_XPATH = "xpath://input[@id='user-name']";
    public static final String INPUT_PASS_XPATH = "xpath://input[@id='password']";
    public static final String INPUT_FIRSTNAME_XPATH = "xpath://input[@id='first-name']";
    public static final String INPUT_LASTNAME_XPATH = "xpath://input[@id='last-name']";
    public static final String INPUT_ZIPCODE_XPATH = "xpath://input[@id='postal-code']";
    public static final String LOGIN_BUTTON = "name:login-button";
    public static final String CHECKOUT_BUTTON = "name:checkout";
    public static final String ERROR_MESSAGE = "xpath:/html/body/div/div/div[2]/div[1]/div/div/form/div[3]/h3";
    public static final String INVENTORY_TITLE = "xpath:/html/body/div[1]/div/div/div[1]/div[2]/span";
    public static final String ADD_BUTTON_BACKPACK = "id:add-to-cart-sauce-labs-backpack";
    public static final String BACKPACK_PRICE = "xpath:/html/body/div[1]/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/div";
    public static final String ADD_BUTTON_TSHIRT = "id:add-to-cart-sauce-labs-bolt-t-shirt";
    public static final String TSHIRT_PRICE = "xpath:/html/body/div/div/div/div[2]/div/div/div/div[3]/div[2]/div[2]/div";
    public static final String REMOVE_BUTTON_BACKPACK = "id:remove-sauce-labs-backpack";
    public static final String REMOVE_BUTTON_TSHIRT = "id:remove-sauce-labs-bolt-t-shirt";
    public static final String CART_BADGE_COUNT = "xpath:/html/body/div/div/div/div[1]/div[1]/div[3]/a/span";
    public static final String CART_LINK = "xpath://a[@class='shopping_cart_link']";
    public static final String CONTINUE_CHECKOUT_BUTTON = "name:continue";
    public static final String BACKPACK_FINAL_PRICE = "xpath://div[@class='inventory_item_name' and text()='Sauce Labs Backpack']/ancestor::div[contains(@class,'cart_item_label')]//div[@class='inventory_item_price']";
    public static final String TSHIRT_FINAL_PRICE = "xpath://div[@class='inventory_item_name' and text()='Sauce Labs Bolt T-Shirt']/ancestor::div[contains(@class,'cart_item_label')]//div[@class='inventory_item_price']";
    public static final String ITEM_FINAL_PRICE_BY_NAME_XPATH = "xpath://div[@class='inventory_item_name' and text()='%s']/following-sibling::div[@class='inventory_item_price']";
    public static final String FINISH_BUTTON = "name:finish";

}