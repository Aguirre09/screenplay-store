package co.com.store.test.stepdefinitions;

import co.com.store.test.tasks.LoginWeb;
import co.com.store.test.tasks.OpenWeb;
import co.com.store.test.tasks.PqrButton;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.File;

import static co.com.store.test.utils.Constants.ACTOR;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PqrStepDefinitions {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("User needs to open store webpage")
    public void userNeedsToOpenStoreWebpage() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(OpenWeb.openWebStore());
    }

    @When("He goes to PQR process")
    public void heGoesToPQRProcess() {
        theActorInTheSpotlight().attemptsTo(PqrButton.pqrButton());
        File file = new File("src/test/resources/files/pqr.jpg");
        System.out.println("el path es : "+ file.getAbsolutePath());
    }

    @Then("Page shows to shows that he did pqr")
    public void pageShowsToShowsThatHeDidPqr() {
        System.out.println("hello then");
    }

}
