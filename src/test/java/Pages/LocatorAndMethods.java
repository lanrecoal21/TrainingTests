package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LocatorAndMethods {
    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    public static WebElement SignInLink;
    @FindBy (how = How.XPATH, using = "//*[@id=\"email\"]")
    public static WebElement Username;
    @FindBy (how = How.XPATH, using = "//*[@id=\"passwd\"]")
    public static WebElement loginPassword;
    @FindBy (how = How.XPATH, using = "//*[@id=\"SubmitLogin\"]/span")
    public static WebElement SignIn;
    @FindBy (how = How.XPATH, using = "//*[@id=\"center_column\"]/div[1]")
    public static WebElement ErrorMessage;

    public void ClickSignInLink(){SignInLink.click();}
    public void typeUsername(String email) {Username.sendKeys(email);}
    public void typePassword(String password){loginPassword.sendKeys(password);}
    public void ClickSignIn() {SignIn.click();}
    public void ViewErrorMessage(){ErrorMessage.getText();}

}
