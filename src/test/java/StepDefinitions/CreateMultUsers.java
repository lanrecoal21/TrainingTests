package StepDefinitions;

import Base.TestBase;
import Pages.LocatorAndMethods;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateMultUsers  extends TestBase {

    @Given("^Im on Homepage$")
    public void imOnHomepage() {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @And("^I press sign in link$")
    public void iPressSignInLink() {
        driver.findElement(By.linkText("Sign in")).click();
    }

    @And("^I enter \"([^\"]*)\" address$")
    public void iEnterAddress(String email) throws Throwable {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window. scrollBy(0,250)", "");
        driver.findElement(By.id("email_create")).sendKeys(email);
    }

    @And("^I enter all mandatory details$")
    public void iEnterAllMandatoryDetails() throws InterruptedException {
        LocatorAndMethods page = PageFactory.initElements(driver, LocatorAndMethods.class);
        driver.findElement(By.name("SubmitCreate")).click();
        Thread.sleep(20000);
        driver.findElement(By.id("id_gender2")).click();
        driver.findElement(By.name("customer_firstname")).sendKeys("Elvia");
        driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("Obanla");
        driver.findElement(By.id("passwd")).sendKeys("training");
        driver.findElement(By.id("firstname")).clear();
        driver.findElement(By.id("firstname")).sendKeys("Elvia");
        driver.findElement(By.id("lastname")).clear();
        driver.findElement(By.id("lastname")).sendKeys("Obanla");
        driver.findElement(By.id("address1")).sendKeys("siilitie 15, ");
        driver.findElement(By.id("city")).sendKeys("chicago");
        page.Selectstate();
//        new Select(driver.findElement(By.id("id_state"))).selectByVisibleText("Illinois");
        driver.findElement(By.name("postcode")).sendKeys("00000");
        driver.findElement(By.id("phone_mobile")).sendKeys("04012345678");
        driver.findElement(By.id("alias")).clear();
        driver.findElement(By.id("alias")).sendKeys("Lion House");
    }

    @When("^I click on the register button$")
    public void iClickOnTheRegisterButton() {
        driver.findElement(By.id("submitAccount")).click();
    }

    @Then("^new user account should be successfully created$")
    public void newUserAccountShouldBeSuccessfullyCreated() {
        String ExpectedMessage = "MY ACCOUNT";
        String ActualMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1")).getText();
        Assert.assertEquals(ExpectedMessage, ActualMessage);
        System.out.println(ActualMessage);
//        driver.quit();
  }




}
