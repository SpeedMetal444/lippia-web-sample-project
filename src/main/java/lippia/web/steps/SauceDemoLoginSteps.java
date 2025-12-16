package lippia.web.steps;

import com.crowdar.core.PageSteps;
import cucumber.api.PendingException;
import io.cucumber.java.en.*;
import lippia.web.services.SauceDemoLoginService;
import org.testng.Assert;

public class SauceDemoLoginSteps extends PageSteps {

    @Given("^The user is on SauceDemo page$")
    public void home() {
        SauceDemoLoginService.navigateWeb();
    }

    @Given("^The user logs in with user (.*) and password (.*)$")
    public void loginWithParameters(String user, String password) {
        SauceDemoLoginService.enterUsernameAndPassword(user, password);
    }

    @When("^The user use a correct password$")
    public void theClientUseACorrectPassword() {
        SauceDemoLoginService.enterPassword("secret_sauce");
    }

    @When("^The user use a correct user$")
    public void theClientUseACorrectUser() {
        SauceDemoLoginService.enterUsername("standard_user");
    }

    @When("^The user clicks on the Login button$")
    public void theClientClicksOnTheLoginButton() {
        SauceDemoLoginService.clickLogin();
    }

    @When("^The user use an incorrect user$")
    public void theClientUseAnIncorrectUser() {
        SauceDemoLoginService.enterUsername("locked_out_user");
    }

    @Then("^The user verify that he logs in correctly$")
    public void theClientVerifyThatHeLogsInCorrectly() {
        SauceDemoLoginService.loginSuccess();
    }

    @Then("^The user can read an error message$")
    public void theClientCanReadAnErrorMessage() {
        SauceDemoLoginService.validateErrorMessage();
    }
}
