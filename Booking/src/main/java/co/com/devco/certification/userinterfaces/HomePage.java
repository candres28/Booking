package co.com.devco.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target BUTTON_STAYS = Target.the("select option stays")
           .locatedBy("//span[contains(text(),'Alojamiento')]");
}
