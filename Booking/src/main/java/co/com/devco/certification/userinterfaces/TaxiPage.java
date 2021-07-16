package co.com.devco.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TaxiPage {

    public static final Target INPUT_PICKUP_LOCATION = Target.the("input pickup location")
            .located(By.id("pickupLocation"));

    public static final Target SELECT_LOCATION = Target.the("input select {0}")
            .locatedBy("//*[text()='{0}']");

    public static final Target INPUT_DROP_LOCATION = Target.the("input drop location")
            .located(By.id("dropoffLocation"));

    public static final Target BUTTON_PICKUP = Target.the("Button pickup date")
            .locatedBy("//button[@aria-label='pickup date input field']");

    public static final Target INPUT_DATE_TAXI = Target.the("Button pickup date")
            .locatedBy("//*[@class='rw-c-date-picker__calendar-caption']");

    public static final Target SELECT_DAY = Target.the("select pickup date {0}")
            .locatedBy("//a[text()='{0}']");

    public static final Target BUTTON_HOUR = Target.the("Button option hour")
            .locatedBy("//button[@aria-label='pickup time input field']");

    public static final Target INPUT_HOUR = Target.the("input hour")
            .located(By.name("pickupHour"));

    public static final Target BUTTON_CONFIRM = Target.the("button confirm")
            .locatedBy("//span[text()='Confirmar']");

    public static final Target INPUT_PASSENGERS = Target.the("input passengers")
            .located(By.id("passengers"));

    public static final Target BUTTON_SEARCH = Target.the("button search")
            .locatedBy("(//span[@class='gb-o-btn__content ui-bui-medium' and text()='Buscar'])[1]");


}
