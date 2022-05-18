package co.com.store.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AccountPage {
    public static final Target SECURITY = Target.the("Sign in")
            .located(By.className("account"));
}
