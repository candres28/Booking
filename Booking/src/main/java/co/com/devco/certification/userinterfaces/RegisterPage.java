package co.com.devco.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPage {

    public static final Target LABEL_EMAIL = Target.the("label email")
            .located(By.id("username"));

    public static final Target LABEL_PASSWORD = Target.the("label password")
            .located(By.id("new_password"));

    public static final Target LABEL_CONFIRMED_PASSWORD = Target.the("label confirmed password")
            .located(By.id("confirmed_password"));
}
