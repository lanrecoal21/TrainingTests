package StepDefinitions;

import Pages.LocatorAndMethods;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class InvalidLogin2 {
    public WebDriver driver;
    @Given("^I am on the landing page$")
    public void iAmOnTheLandingPage() {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @And("^I press the SignIn link$")
    public void iPressTheSignInLink() {
        LocatorAndMethods Page = PageFactory.initElements(driver, LocatorAndMethods.class);
        Page.ClickFirstSignInLink();

//    }
//
//    @When("^I enter username \"([^\"]*)\"$")
//    public void iEnterUsername(String email) throws Throwable {
//        driver.findElement(By.name("email")).sendKeys(email);
//
//    }
//
//    @And("^I enter \"([^\"]*)\"$")
//    public void iEnter(String password) throws Throwable {
//        driver.findElement(By.name("passwd")).sendKeys(password);
//    }
//
//    @When("^I press login$")
//    public void iPressLogin() {
//        driver.findElement(By.name("SubmitLogin")).click();
//    }
//
//    @Then("^I should get \"([^\"]*)\"$")
//    public void iShouldGet(String ErrorMessages) throws Throwable {
//        String ExpectedErrorMessage = ErrorMessages;
//        String ActualErrorMessage = driver.findElement(By.xpath("//*[@id=\'center_column\']/div[1]/ol/li")).getText();
//        Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
//        System.out.println(ErrorMessages);
    }
}
