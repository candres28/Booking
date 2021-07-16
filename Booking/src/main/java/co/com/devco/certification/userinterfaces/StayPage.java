package co.com.devco.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StayPage {

    public static final Target INPUT_DESTINATION = Target.the("input destination")
            .located(By.name("ss"));

    public static final Target BUTTON_DATEPICKER = Target.the("button open datepicker")
            .locatedBy("//div[@class='xp__dates-inner']");

    public static final Target INPUT_YEAR = Target.the("input year")
            .locatedBy("//div[@class='bui-calendar__month']");

    public static final Target INPUT_DAY = Target.the("input day {0}")
            .locatedBy("//span[text()='{0}']");

    public static final Target MESSAGE_ALERT = Target.the("message alert")
            .locatedBy("(//div[@class='fe_banner__message '])[2]");

    public static final Target BUTTON_SEARCH = Target.the("button search stays")
            .locatedBy("//span[contains(text(),'Buscar')]");
}
