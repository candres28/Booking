package co.com.devco.certification.stepdefinitions;

import co.com.devco.certification.models.Account;
import co.com.devco.certification.questions.Message;
import co.com.devco.certification.tasks.OpenWeb;
import co.com.devco.certification.tasks.RegisterAccount;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static co.com.devco.certification.userinterfaces.HomePage.LABEL_YOUR_ACCOUNT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class CreateAccountStepDefinitions {

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
        OnStage.theActorInTheSpotlight().should(seeThat(Message.isTo(LABEL_YOUR_ACCOUNT), equalTo(message)));
    }

}
