package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExistingEmail {
    public WebDriver driver;

    @Given("^I am on the application homespage$")
    public void iAmOnTheApplicationHomespage() {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @And("^I click on Sign in linktext$")
    public void iClickOnSignInLinktext() {
        driver.findElement(By.linkText("Sign in")).click();
    }

    @And("^I enter  existing email address in the create account field$")
    public void iEnterExistingEmailAddressInTheCreateAccountField() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js. executeScript("window. scrollBy(0,250)", "");
        driver.findElement(By.id("email_create")).sendKeys("semiu.k007294@gmail.com");
    }

    @When("^I click the create on account button$")
    public void iClickTheCreateOnAccountButton() {
        driver.findElement(By.name("SubmitCreate")).click();
    }

    @Then("^I should get an error message$")
    public void iShouldGetAnErrorMessage() {
        driver.findElement(By.xpath("//*[@id=\"create_account_error\"]")).isDisplayed();

    }
}
