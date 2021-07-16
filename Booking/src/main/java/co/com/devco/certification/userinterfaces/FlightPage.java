package co.com.devco.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FlightPage {

    public static final Target OPEN_ROUNDTRIP = Target.the("Open option roundtrip")
            .locatedBy("//div[@data-value='roundtrip']");

    public static final Target SELECT_ROUNDTRIP  = Target.the("select roundtrip {0}")
            .locatedBy("//li[@data-title='{0}']");

    public static final Target OPEN_CLASS = Target.the("Open option class")
            .locatedBy("(//*[@class='_j97 _irr _ipQ _iep _ikq _h-7'])[2]");

    public static final Target SELECT_CLASS  = Target.the("select roundtrip {0}")
            .locatedBy("//li[@data-title='{0}']");

    public static final Target OPEN_FROM  = Target.the("open option from")
            .locatedBy("(//div[@class='_id7 _ijM _ii0 _iir _kaB _io5'])[1]");

    public static final Target INPUT_FROM  = Target.the("input from origin")
            .located(By.name("origin"));

    public static final Target OPEN_TO  = Target.the("open option to")
            .locatedBy("(//div[@class='_id7 _ijM _ii0 _iir _kaB _io5'])[2]");

    public static final Target INPUT_TO = Target.the("input from to")
            .located(By.name("destination"));

    public static final Target OPEN_DATE  = Target.the("open option date")
            .locatedBy("//div[@class='Common-Widgets-Datepicker-DateModal _ibU _ibV _iaf _idE _h-Y _im4 _iai _ihz _j0g _jy1 _iDB']");

    public static final Target INPUT_DATE  = Target.the("input date {0}")
            .locatedBy("//div[@aria-label='{0}']");

    public static final Target INPUT_YEAR_FLIGHT = Target.the("input year")
            .locatedBy("(//div[@class='_ijM _iAr _iaB _idE _iXr'])[2]");

    public static final Target INPUT_DAY_FLIGHT = Target.the("input day flight {0}")
            .locatedBy("(//*[text()='{0}'])[2]");

    public static final Target BUTTON_SEARCH = Target.the("button search flights")
            .locatedBy("//div[@class='col _iac _iad _iae _iaa _iab _iys _iyv _iyq _iAU _iAV _izh _iaR _h-8 _63 centre']");



}
