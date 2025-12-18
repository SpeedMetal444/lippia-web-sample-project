package lippia.web.steps;

import io.cucumber.java.en.*;
import lippia.web.services.SauceDemoLoginService;
import lippia.web.services.SauceDemoInventoryService;

public class SauceDemoInventorySteps {

    @Given("^The user is logged in and on the inventory page$")
    public void theClientIsLoggedInAndOnTheInventoryPage() {
        SauceDemoLoginService.navigateWeb();
        SauceDemoLoginService.enterUsernameAndPassword("standard_user", "secret_sauce");
        SauceDemoLoginService.clickLogin();
    }

    @When("^The user adds the product Sauce Labs Backpack to the cart$")
    public void theClientAddsTheFirstProductToTheCart() {
        SauceDemoInventoryService.addBackpackToCart();
    }

    @Then("^The cart badge should show {int}$")
    public void theCartBadgeShouldShow(int expectedCount) {
        SauceDemoInventoryService.cartBadgeCount(expectedCount);
    }

    @When("^The user removes the Sauce Labs Backpack from the cart$")
    public void theClientRemovesTheSauceLabsBackpackFromTheCart() {
        SauceDemoInventoryService.removeBackpackFromCart();
    }

    @Then("^The cart badge should be 0 or not visible$")
    public void theCartBadgeShouldBe0OrNotVisible() {
        SauceDemoInventoryService.cartBadge0OrNotVisible();
    }

    @When("^The user adds the product Sauce Labs Bolt T-Shirt to the cart$")
    public void theClientAddsTheProductToTheCart() {
        SauceDemoInventoryService.addTshirtToCart();
    }

    @When("^The user removes the Sauce Labs Bolt T-Shirt from the cart$")
    public void theClientRemovesTheSauceLabsBoltTShirtFromTheCart() {
        SauceDemoInventoryService.removeTshirtFromCart();
    }
}
