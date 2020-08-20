package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserLogin {
    public WebDriver driver;

    @Given("^I successfully navigate to hompage$")
    public void iSuccessfullyNavigateToHompage() {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @When("^I Input my valid credentials$")
    public void iInputMyValidCredentials() {
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.name("email")).sendKeys("lanreikuesanA@gmail.com");
        driver.findElement(By.name("passwd")).sendKeys("training");
    }

    @And("^I click on the login button$")
    public void iClickOnTheLoginButton() {
        driver.findElement(By.name("SubmitLogin")).click();
    }

    @Then("^I should be logged in successfully$")
    public void iShouldBeLoggedInSuccessfully() {
        String  ExpectedloggedInUser = "Elvia Obanla";
        String  ActualLoggedInUSer = driver.findElement(By.linkText("Elvia Obanla")).getText();
        Assert.assertEquals(ExpectedloggedInUser, ActualLoggedInUSer);
        System.out.println(ActualLoggedInUSer);
    }
}
