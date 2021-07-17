package co.com.devco.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target BUTTON_STAYS = Target.the("select option stays")
           .locatedBy("//span[contains(text(),'Alojamiento')]");

    public static final Target BUTTON_FLIGHTS = Target.the("select option flights")
            .locatedBy("//span[contains(text(),'Vuelos')]");

    public static final Target BUTTON_MAKE_ACCOUNT = Target.the("Button make an account")
            .locatedBy("//span[contains(text(),'una cuenta')]");

    public static final Target LABEL_YOUR_ACCOUNT = Target.the("Label your account")
            .located(By.id("profile-menu-trigger--title"));

    public static final Target BUTTON_TAXIS = Target.the("Button option taxis")
            .locatedBy("//span[contains(text(),'Taxis aeropuerto')]");

    public static final Target BUTTON_NEXT = Target.the("button next")
            .locatedBy("//*[@class='bui-calendar__control bui-calendar__control--next' " +
                    "or @id='stl-jam-cal-nextMonth' or @class='rw-c-date-picker__btn rw-c-date-picker__btn--next gb-u-p' " +
                    "or @class='rw-c-date-picker__btn rw-c-date-picker__btn--next gb-u-p']");




}
