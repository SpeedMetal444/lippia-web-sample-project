package lippia.web.steps;

import com.crowdar.core.PageSteps;
import cucumber.api.PendingException;
import io.cucumber.java.en.*;
import lippia.web.services.SauceDemoLoginService;
import org.testng.Assert;

public class SauceDemoLoginSteps extends PageSteps {

    @Given("^The client is on SauceDemo page$")
    public void home() {
        SauceDemoLoginService.navigateWeb();
    }

    @Given("^The client logs in with user (.*) and password (.*)$")
    public void loginWithParameters(String user, String password) {
        SauceDemoLoginService.enterUsernameAndPassword(user, password);
    }

    @When("^The client use a correct password$")
    public void theClientUseACorrectPassword() {
        SauceDemoLoginService.enterPassword("secret_sauce");
    }

    @When("^The client use a correct user$")
    public void theClientUseACorrectUser() {
        SauceDemoLoginService.enterUsername("standard_user");
    }

    @When("^The client clicks on the Login button$")
    public void theClientClicksOnTheLoginButton() {
        SauceDemoLoginService.clickLogin();
    }

    @When("^The client use an incorrect user$")
    public void theClientUseAnIncorrectUser() {
        SauceDemoLoginService.enterUsername("locked_out_user");
    }

    @Then("^The client verify that he logs in correctly$")
    public void theClientVerifyThatHeLogsInCorrectly() {
        Assert.assertTrue(SauceDemoLoginService.loginSuccess());
    }

    @Then("^The client can read an error message$")
    public void theClientCanReadAnErrorMessage() {
        String expectedMessage = "Epic sadface: Sorry, this user has been locked out.";
        Assert.assertEquals(SauceDemoLoginService.getErrorMessage(), expectedMessage);
    }
}
