package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword {
    public WebDriver driver;

    @Given("^I am on the app homepage$")
    public void iAmOnTheAppHomepage() {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @And("^I click on the sign in link$")
    public void iClickOnTheSignInLink() {
        driver.findElement(By.linkText("Sign in")).click();
    }

    @When("^I click on the Forgot your password link$")
    public void iClickOnTheForgotYourPasswordLink() {
        driver.findElement(By.linkText("Forgot your password?")).click();
    }

    @And("^I enter my email address$")
    public void iEnterMyEmailAddress() {
        driver.findElement(By.id("email")).sendKeys("lanreikuesanA@gmail.com");
    }

    @When("^I click on the retrieve password button$")
    public void iClickOnTheRetrievePasswordButton() {
        driver.findElement(By.xpath("//*[@id=\"form_forgotpassword\"]/fieldset/p/button/span")).click();
    }

    @Then("^i should get a success message$")
    public void iShouldGetASuccessMessage() {
        String  ExpectedMessage = "A confirmation email has been sent to your address: lanreikuesanA@gmail.com";
        String  ActualMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p")).getText();
        Assert.assertEquals(ExpectedMessage, ActualMessage);
        System.out.println(ActualMessage);
    }
}
