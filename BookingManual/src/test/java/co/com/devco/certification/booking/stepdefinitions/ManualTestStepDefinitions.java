package co.com.devco.certification.booking.stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

import static co.com.devco.certification.booking.utils.ManualTest.validate;

public class ManualTestStepDefinitions {

    private Scenario scenario;

    @Before
    public void getScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("^(.*)$")
    public void manualTest(String step) {
        validate(step, scenario.getName());
    }

}
