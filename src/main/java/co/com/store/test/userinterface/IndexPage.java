package co.com.store.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IndexPage {

    public static final Target USER_EMAIL = Target.the("Email address")
            .located(By.id("email"));

    public static final Target USER_PASSWORD = Target.the("Password value")
            .located(By.id("passwd"));

    public static final Target SIGNIN = Target.the("Sign in")
            .located(By.xpath("//a[contains(text(), 'Sign in')]"));

    public static final Target BUTTON_LOGIN = Target.the("Login button")
            .located(By.id("SubmitLogin"));

    public static final Target CONTACT_PQR = Target.the("Contact us button")
            .located(By.xpath("//a[contains(text(), 'Contact us')]"));

    public static final Target CONTACT_PQR_FILE = Target.the("Contact us button")
            .located(By.id("fileUpload"));

    public static final Target CONTACT_ID = Target.the("Id Contact")
            .located(By.id("id_contact"));

    public static final Target CONTACT_MESSAGE = Target.the("Campo mensaje")
            .located(By.id("message"));


    public static final Target CONTACT_PQR_REFERENCE = Target.the("Contact us button")
            .located(By.id("id_order"));

}
