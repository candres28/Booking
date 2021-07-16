package co.com.devco.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SearchTaxiPage {

    public static final Target BUTTON_ADD = Target.the("button select add return")
            .locatedBy("(//span[text()='Add your return'])[1]");

    public static final Target BUTTON_OPEN_DATE = Target.the("button open date")
            .locatedBy("(//span[@class='rw-search__date-link'])[1]");

}
