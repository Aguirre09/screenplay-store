package co.com.store.test.tasks;

import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PutUserInformation implements Task {
    protected Faker faker = new Faker();
    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println("BANDERA !! ");
        String namePatient = faker.internet().emailAddress().replace(" ","_");
        System.out.println("el nombre del  paciente es : "+ namePatient);

    }

    public static PutUserInformation putInformation(){
        return instrumented(PutUserInformation.class);
    }
}
