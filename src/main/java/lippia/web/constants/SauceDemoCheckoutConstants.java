package lippia.web.constants;

public class SauceDemoCheckoutConstants {
    public static final String INPUT_FIRSTNAME_XPATH = "xpath://input[@id='first-name']";
    public static final String INPUT_LASTNAME_XPATH = "xpath://input[@id='last-name']";
    public static final String INPUT_ZIPCODE_XPATH = "xpath://input[@id='postal-code']";
    public static final String CHECKOUT_BUTTON = "name:checkout";
    public static final String BACKPACK_FINAL_PRICE = "xpath://div[@class='inventory_item_name' and text()='Sauce Labs Backpack']/ancestor::div[contains(@class,'cart_item_label')]//div[@class='inventory_item_price']";
    public static final String TSHIRT_FINAL_PRICE = "xpath://div[@class='inventory_item_name' and text()='Sauce Labs Bolt T-Shirt']/ancestor::div[contains(@class,'cart_item_label')]//div[@class='inventory_item_price']";
    public static final String CONTINUE_CHECKOUT_BUTTON = "name:continue";
    public static final String CHECKOUT_ERROR_MESSAGE = "xpath:/html/body/div/div/div/div[2]/div/form/div[1]/div[4]/h3";
    public static final String FINISH_BUTTON = "name:finish";
}
