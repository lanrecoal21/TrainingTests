package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLogin1 {
    public WebDriver driver;
    @Given("^Homepage is displayed$")
    public void homepageIsDisplayed() {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @When("^I click the sign in button$")
    public void iClickTheSignInButton() {
        driver.findElement(By.linkText("Sign in")).click();
    }

    @And("^I enter Invalid login credentials$")
    public void iEnterInvalidLoginCredentials() {
        driver.findElement(By.name("email")).sendKeys("lanreIwalehin@training.com");
        driver.findElement(By.name("passwd")).sendKeys("Lanre");

    }

    @When("^I Click the login button$")
    public void iClickTheLoginButton() {
        driver.findElement(By.name("SubmitLogin")).click();
    }

    @Then("^Error message should be displayed$")
    public void errorMessageShouldBeDisplayed() {
        String  ExpectedMessage = "There is 1 error";
        String  ActualMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/p")).getText();
        Assert.assertEquals(ExpectedMessage, ActualMessage);
        System.out.println(ActualMessage);
    }


}
