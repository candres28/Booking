package co.com.devco.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SearchTaxiPage {

    public static final Target BUTTON_ADD = Target.the("button select add return")
            .locatedBy("(//span[text()='Añade la vuelta'])[2]");

    public static final Target BUTTON_OPEN_DATE = Target.the("button open date")
            .locatedBy("(//span[@class='rw-search__date-link'])[1]");

    public static final Target INPUT_DATE_SEARCH_TAXI = Target.the("input search taxi details")
            .locatedBy("//*[@class='rw-c-date-picker__calendar-caption']");

    public static final Target SELECT_DATE_SEARCH_TAXI = Target.the("input search taxi day {0}")
            .locatedBy("//*[text()='{0}']");

    public static final Target BUTTON_SEARCH = Target.the("button save travel")
            .locatedBy("//span[text()='Buscar mi viaje de vuelta']");

    public static final Target LABEL_PRICE = Target.the("label price")
            .locatedBy("//p[@class='rw-ajax-search-result__highlight']");




}
