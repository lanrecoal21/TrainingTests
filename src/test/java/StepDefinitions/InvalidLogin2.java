package StepDefinitions;

import Pages.LocatorAndMethods;
import cucumber.api.java.en.*;
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
        driver.manage().window().maximize();
    }


        @And("^I press the SignIn link$")
        public void iPressTheSignInLink() {
        LocatorAndMethods page = PageFactory.initElements(driver, LocatorAndMethods.class);
        page.ClickSignInLink();

        //  driver.findElement(By.linkText("Sign in")).click();
    }

    @When("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String email)  {
        // JavascriptExecutor js = (JavascriptExecutor) driver;
        // js.executeScript("window.scrollBy(0,250)", "");
        LocatorAndMethods page = PageFactory.initElements(driver, LocatorAndMethods.class);
        page.typeUsername(email);
        // driver.findElement(By.id("email")).sendKeys(email);
    }

    @And("^I enter \"([^\"]*)\"$")
    public void iEnter(String password) {
        // JavascriptExecutor js = (JavascriptExecutor) driver;
        // js.executeScript("window.scrollBy(0,250)", "");
        LocatorAndMethods page = PageFactory.initElements(driver, LocatorAndMethods.class);
        page.typePassword(password);
        // driver.findElement(By.id("passwd")).sendKeys(password);

    }
    @When("^I press login$")
    public void iPressLogin() {
        LocatorAndMethods page = PageFactory.initElements(driver, LocatorAndMethods.class);
        page.ClickSignIn();
        // driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));

    }

    @Then("^I should get \"([^\"]*)\"$")
    public void iShouldGet(String ErrorMessage){
        LocatorAndMethods page = PageFactory.initElements(driver, LocatorAndMethods.class);
        page.ViewErrorMessage();
        String ActualErrorMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]")).getText();
        Assert.assertTrue("ActualErrorMessage", ErrorMessage.contains("There is 1 error"));
        System.out.println(ActualErrorMessage);

        //String  ExpectedErrorMessage = "ErrorMessage";
        //String  ActualErrorMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]")).getText();
        //Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
        //System.out.println(ActualLoggedInUSer);

        driver.close();
    }

}
