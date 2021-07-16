package co.com.devco.certification.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/create_account.feature",
        glue = "co.com.devco.certification.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class CreateAccountRunner {
}