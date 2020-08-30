package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class LocatorAndMethods {
    // Declare Your Locators here
    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    public static WebElement SingInLink;

    @FindBy(how = How.LINK_TEXT, using = "id_state")
    public static WebElement State;






      // Declare you methods here
    public void ClickFirstSignInLink() {SingInLink.click();}
    public void Selectstate() { Select state =new Select(State);
        state.selectByVisibleText("Illinois");

    }
}
