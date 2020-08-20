package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LocatorAndMethods {
    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    public static WebElement SingInLink;





    public void ClickFirstSignInLink() {SingInLink.click();}
}
