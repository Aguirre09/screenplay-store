package co.com.store.test.stepdefinitions;

import co.com.store.test.tasks.OpenWeb;
import co.com.store.test.tasks.PutUserInformation;
import com.github.javafaker.Faker;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.store.test.utils.Constants.ACTOR;

public class RegisterStepDefinitions {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());

    }

    @Given("Alejandro needs to open webpage")
    public void alejandroNeedsToOpenWebpage() {

//        System.out.println("given");
//        System.out.println("BANDERA !! ");
//        String namePatient = faker.internet().emailAddress().replace(" ","_");
//        String contra= faker.internet().password();
//
//        System.out.println("la contra es : "+contra);
//        System.out.println("el correo nuevo es : "+ namePatient);
        System.out.println("hello given");
        OnStage.theActorCalled(ACTOR).wasAbleTo(OpenWeb.openWebStore());

    }

}
