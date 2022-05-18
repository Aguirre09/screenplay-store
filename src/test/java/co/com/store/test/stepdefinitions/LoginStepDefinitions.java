package co.com.store.test.stepdefinitions;

import co.com.store.test.questions.ValidatedUser;
import co.com.store.test.tasks.LoginWeb;
import co.com.store.test.tasks.OpenWeb;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static co.com.store.test.utils.Constants.ACTOR;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());

    }
    @Given("User needs to open webpage")
    public void userNeedsToOpenWebpage() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(OpenWeb.openWebStore());
    }

    @When("He does login process  inside the store page with email (.*)")
    public void heDoesLoginProcessInsideTheStorePageWithEmailLaguirresChoucairtestingCom(String email) {
        System.out.println(email);
        theActorInTheSpotlight().attemptsTo(LoginWeb.loginWeb(email));
    }

    @Then("Page shows to him that  he was logged in successfully")
    public void pageShowsToHimThatHeWasLoggedInSuccessfully() {
        System.out.println("then");
      OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidatedUser.validatedUser(), Matchers.is(true)));

    }


}
