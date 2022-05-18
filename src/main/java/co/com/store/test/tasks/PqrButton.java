package co.com.store.test.tasks;

import co.com.store.test.userinterface.IndexPage;
import co.com.store.test.utils.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.store.test.userinterface.IndexPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PqrButton implements Task {

    String path = "C:\\Users\\laguirres\\Desktop\\reto-DREZZ\\store\\src\\test\\resources\\files\\pqr.jpg";
    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(
                Click.on(CONTACT_PQR),
                Scroll.to(CONTACT_PQR_FILE),
                SendKeys.of("Customer service").into(CONTACT_ID),
                SendKeys.of("Customer service, tengo una queja, esto no está funcionando !!!!!").into(CONTACT_MESSAGE),
                SendKeys.of("HOLA ES UNA PRUEBAAAAA").into(CONTACT_PQR_REFERENCE),
                SendKeys.of(path).into(CONTACT_PQR_FILE)
        );

    }

    public static PqrButton pqrButton(){
        return instrumented(PqrButton.class);
    }
}
