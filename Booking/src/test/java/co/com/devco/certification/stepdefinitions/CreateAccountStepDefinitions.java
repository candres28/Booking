package co.com.devco.certification.stepdefinitions;

import co.com.devco.certification.exceptions.CreateAccountException;
import co.com.devco.certification.models.Account;
import co.com.devco.certification.questions.Message;
import co.com.devco.certification.tasks.OpenWeb;
import co.com.devco.certification.tasks.RegisterAccount;
import co.com.devco.certification.utils.constants.ExceptionsConstants;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static co.com.devco.certification.userinterfaces.HomePage.LABEL_YOUR_ACCOUNT;
import static co.com.devco.certification.utils.constants.GeneralConstants.CHROME;
import static co.com.devco.certification.utils.constants.GeneralConstants.USER;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class CreateAccountStepDefinitions {

    @Managed(driver = CHROME)
    private WebDriver hisBrowser;

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(USER);
    }

    @Given("^that the user is on the main page$")
    public void ThatTheUserIsOnTheMainPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenWeb.site());
    }

    @When("^enter the data for registration$")
    public void EnterTheDataForRegistration(List<Account> accountList) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterAccount.withData(accountList.get(0)));
    }

    @Then("^he will be able to see the option (.*)$")
    public void HeWillBeAbleToSeeTheOptionTuCuenta(String message) {
        OnStage.theActorInTheSpotlight().should(seeThat(Message.isTo(LABEL_YOUR_ACCOUNT),
                equalTo(message)).orComplainWith(CreateAccountException.class,
                ExceptionsConstants.CREATE_ACCOUNT_ERROR));
    }

}
