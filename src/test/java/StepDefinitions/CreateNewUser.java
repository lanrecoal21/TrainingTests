package StepDefinitions;

import Base.TestBase;
import Pages.LocatorAndMethods;
import cucumber.api.java.Before;
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

import static sun.plugin2.main.client.PluginCookieSelector.initialize;

public class CreateNewUser extends TestBase{
    public int random;
    @Before
    public void setup() throws Throwable{
        initialize();
    }

    @Given("^I am on the application homescreen$")
    public void i_am_on_the_application_homescreen() throws Throwable {
    driver.manage().deleteAllCookies();
    driver.get(CONFIG.getProperty("URL"));
    driver.manage().window().maximize();

    }

    @Given("^I click on Sign In$")
    public void i_click_on_Sign_In() throws Throwable {
        driver.findElement(By.linkText("Sign in")).click();
    }

    @Given("^I enter email address in the create account field$")
    public void i_enter_email_address_in_the_create_account_field() throws Throwable {
        random = 100 + (int)(Math.random()*((1000 - 1) + 1));
        driver.findElement(By.id("email_create")).sendKeys("lanre.ikuesan99" + random + "@gmail.com");
        Thread.sleep(2000);
    }

    @Given("^I click the create account button$")
    public void i_click_the_create_account_button() throws Throwable {
        driver.findElement(By.name("SubmitCreate")).click();

    }

    @When("^I select gender$")
    public void i_select_gender() throws Throwable {
        Thread.sleep(20000);
        driver.findElement(By.id("id_gender2")).click();
    }

    @When("^I enter my first name$")
    public void i_enter_my_first_name() throws Throwable {
        driver.findElement(By.name("customer_firstname")).sendKeys("Elvia");

    }

    @When("^I enter my last name$")
    public void i_enter_my_last_name() throws Throwable {
       driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("Obanla");
    }

//    @And("^I enter email in the email field$")
//    public void iEnterEmailInTheEmailField() {
//        driver.findElement(By.name("email")).clear();
//        driver.findElement(By.name("email")).sendKeys("lanre.ikuesan101@gmail.com");
//
//    }

    @When("^I enter my password$")
    public void i_enter_my_password() throws Throwable {
        driver.findElement(By.id("passwd")).sendKeys("training");
    }

    @When("^I enter first name for address$")
    public void i_enter_first_name_for_address() throws Throwable {
        driver.findElement(By.id("firstname")).clear();
        driver.findElement(By.id("firstname")).sendKeys("Elvia");

    }

    @When("^I enter  last name for address$")
    public void i_enter_last_name_for_address() throws Throwable {
        driver.findElement(By.id("lastname")).clear();
        driver.findElement(By.id("lastname")).sendKeys("Obanla");
    }

    @When("^I enter my address$")
    public void i_enter_my_address() throws Throwable {
        driver.findElement(By.id("address1")).sendKeys("siilitie 15, ");

    }

    @When("^I enter my city$")
    public void i_enter_my_city() throws Throwable {
        driver.findElement(By.id("city")).sendKeys("chicago");
    }
    @When("^I choose my state$")
    public void i_choose_my_state() throws Throwable {
        LocatorAndMethods page = PageFactory.initElements(driver, LocatorAndMethods.class);
        page.Selectstate();
//        new Select  (driver.findElement(By.id("id_state"))).selectByVisibleText("Illinois");

    }
    @And("^I enter my postcode$")
    public void iEnterMyPostcode() {
        driver.findElement(By.name("postcode")).sendKeys("00000");
    }

    @When("^I enter my mobile phone number$")
    public void i_enter_my_mobile_phone_number() throws Throwable {
       driver.findElement(By.id("phone_mobile")).sendKeys("04012345678");
    }

    @When("^I enter my alias for address$")
    public void i_enter_my_alias_for_address() throws Throwable {
        driver.findElement(By.id("alias")).clear();
        driver.findElement(By.id("alias")).sendKeys("Lion House");

    }

    @When("^I click the register button$")
    public void i_click_the_register_button() throws Throwable {
        driver.findElement(By.id("submitAccount")).click();
    }

    @Then("^my account should be registered successfully$")
    public void my_account_should_be_registered_successfully() throws Throwable {
        String  ExpectedMessage = "MY ACCOUN";
        String  ActualMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1")).getText();
        Assert.assertEquals(ExpectedMessage, ActualMessage);
        System.out.println(ActualMessage);

    }



}
