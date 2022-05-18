package co.com.store.test.tasks;

import co.com.store.test.userinterface.IndexPage;
import co.com.store.test.utils.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.store.test.userinterface.IndexPage.BUTTON_LOGIN;
import static co.com.store.test.userinterface.IndexPage.SIGNIN;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class LoginWeb implements Task {

    private String email;
    public LoginWeb(String email) {
        this.email = email;
    }
    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(
                Click.on(SIGNIN),
                Enter.theValue(email).into(IndexPage.USER_EMAIL),
                Enter.theValue(Constants.PASS).into(IndexPage.USER_PASSWORD),
                Click.on(BUTTON_LOGIN)
        );
    }

    public  static LoginWeb loginWeb (String email){
        return instrumented(LoginWeb.class,email);
    }
}
