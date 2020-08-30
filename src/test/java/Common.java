import Base.TestBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class Common extends TestBase {

    @Before
    public void setup() throws Throwable{
        initialize();
    }

    @Given("^I am on application page$")
    public void iAmOnApplicationPage() {
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();
    }

    @When("^I click on signin link$")
    public void iClickOnSigninLink() {
        driver.findElement(By.linkText("Sign in")).click();
    }
}
