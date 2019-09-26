package login;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin="pretty",
features="src/test/resources/Login",
glue= {"src/test/java/login"})
public class TestLoginRunner {

}
