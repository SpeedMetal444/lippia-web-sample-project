package lippia.web.steps;

import io.cucumber.java.en.*;
import org.testng.Assert;
import lippia.web.services.SauceDemoLoginService;
import lippia.web.services.SauceDemoInventoryService;

public class SauceDemoInventorySteps {

    @Given("The client is logged in and on the inventory page")
    public void theClientIsLoggedInAndOnTheInventoryPage() {
        SauceDemoLoginService.navigateWeb();
        SauceDemoLoginService.enterUsernameAndPassword("standard_user", "secret_sauce");
        SauceDemoLoginService.clickLogin();
    }

    @When("The client adds the first product Sauce Labs Backpack to the cart")
    public void theClientAddsTheFirstProductToTheCart() {
        SauceDemoInventoryService.addBackpackToCart();
    }

    @Then("The cart badge should show {int}")
    public void theCartBadgeShouldShow(int expectedCount) {
        int actualCount = SauceDemoInventoryService.getCartBadgeCount();
        Assert.assertEquals(actualCount, expectedCount);
    }

    @When("The client removes the same product from the cart")
    public void theClientRemovesTheSameProductFromTheCart() {
        SauceDemoInventoryService.removeBackpackFromCart();
    }

    @Then("The cart badge should be 0 or not visible")
    public void theCartBadgeShouldBe0OrNotVisible() {
        boolean isBadgeVisible = SauceDemoInventoryService.isCartBadgeVisible();
        int count = isBadgeVisible ? SauceDemoInventoryService.getCartBadgeCount() : 0;
        Assert.assertEquals(count, 0);
    }

}
