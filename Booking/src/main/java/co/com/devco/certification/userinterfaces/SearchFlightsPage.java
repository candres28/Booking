package co.com.devco.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SearchFlightsPage {

    public static final Target BUTTON_SELECT_OPTION  = Target.the("button select option {0}")
            .locatedBy("//span[contains(text(),'{0}')]");

    public static final Target LABEL_OFFER  = Target.the("label offer")
            .locatedBy("(//span[contains(text(),'Ver oferta')])[1]");

}
