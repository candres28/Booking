package co.com.devco.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SearchStaysPage {

    public static final Target BUTTON_FILTER = Target.the("button select filter distance {0}")
            .locatedBy("//a[text()='{0}']");

    public static final Target LABEL_DETAILS = Target.the("label details the stays found")
            .locatedBy("//div[@class='sr_header--title']");

}
