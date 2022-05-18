package co.com.store.test.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( features = "src/test/resources/features/register_store.feature",
        tags="@register",
        glue = "co.com.store.test",
        snippets = SnippetType.CAMELCASE)

public class RegisterRunner {
}
