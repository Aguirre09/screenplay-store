package co.com.store.test.questions;

import co.com.store.test.userinterface.AccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidatedUser implements Question {

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean user = AccountPage.SECURITY.resolveFor(actor).getText().equals("alejandro aguirre");
        return user;
    }

    public static ValidatedUser validatedUser(){
        return new ValidatedUser();
    }
}
