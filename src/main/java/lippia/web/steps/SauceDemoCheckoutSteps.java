package lippia.web.steps;

import io.cucumber.java.en.*;
import lippia.web.services.SauceDemoLoginService;
import lippia.web.services.SauceDemoInventoryService;
import lippia.web.services.SauceDemoCheckoutService;

public class SauceDemoCheckoutSteps {

    @Given("^The user logs in to SauceDemo$")
    public void theUserLogsInToSauceDemo() {
        SauceDemoLoginService.navigateWeb();
        SauceDemoLoginService.enterUsernameAndPassword("standard_user", "secret_sauce");
        SauceDemoLoginService.clickLogin();
    }

    @When("^The user adds two products to the cart$")
    public void theUserAddsTwoProductsToTheCart() {
        SauceDemoInventoryService.storeBackpackPrice();
        SauceDemoInventoryService.storeTshirtPrice();
        SauceDemoInventoryService.addBackpackToCart();
        SauceDemoInventoryService.addTshirtToCart();
        SauceDemoInventoryService.goToCart();
    }

    @And("^The user proceeds through the checkout steps$")
    public void theUserProceedsThroughTheCheckoutSteps() {
        SauceDemoCheckoutService.startCheckout();
        SauceDemoCheckoutService.fillPersonalInformation("Abel", "Godoy", "3400");
    }

    @Then("^The user verifies that the product names and prices are correct in the overview page$")
    public void theUserVerifiesThatTheProductNamesAndPricesAreCorrectInTheOverviewPage() {
        SauceDemoCheckoutService.verifyProductsAndPrices();
    }

    @And("^The user finishes the checkout successfully$")
    public void theUserFinishesTheCheckoutSuccessfully() {
        SauceDemoCheckoutService.finishCheckout();
    }
}
