package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class LocatorAndMethods {
    // Define Your locators here
    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    public static WebElement SingInLink;

    @FindBy(how = How.ID, using = "id_state")
    public static WebElement State;






    public void ClickFirstSignInLink() {SingInLink.click();}
    public void Selectstate() {
        Select state = new Select(State);
        state.selectByVisibleText("Illinois");
    }

}
