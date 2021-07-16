package co.com.devco.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SearchStaysPage {

    public static final Target BUTTON_POINTS = Target.the("button select filter points {0}")
            .locatedBy("//span[contains(text(),'{0}')]");

    public static final Target BUTTON_STARS = Target.the("button select filter distance {0}")
            .locatedBy("//span[contains(text(),'{0}')]");

    public static final Target LABEL_DETAILS = Target.the("label details the stays found")
            .locatedBy("//div[@class='sr_header--title']");



}
