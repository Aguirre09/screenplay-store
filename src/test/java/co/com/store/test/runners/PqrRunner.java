package co.com.store.test.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( features = "src/test/resources/features/pqr_store.feature",
        tags="@pqr",
        glue = "co.com.store.test",
        snippets = SnippetType.CAMELCASE)

public class PqrRunner {
}
