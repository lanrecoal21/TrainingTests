package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CreateMultUsersMethod {
    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    public static WebElement HomePageSignIn;
    @FindBy(how = How.XPATH, using = "//*[@id=\"email_create\"]")
    public static WebElement EmailAddress;
    @FindBy(how = How.XPATH, using = "//*[@id=\"SubmitCreate\"]/span")
    public static WebElement CreateUser;
    @FindBy(how = How.ID, using = "id_gender2")
    public static WebElement Gender;
    @FindBy(how = How.NAME, using = "customer_firstname")
    public static WebElement CustomerFirstName;
    @FindBy(how = How.XPATH, using = "//*[@id=\\\"customer_lastname\\\"]")
    public static WebElement customerLastName;
    @FindBy(how = How.ID, using = "passwd")
    public static WebElement Password;
    @FindBy(how = How.ID, using = "firstname")
    public static WebElement ClearFirstName;
    @FindBy(how = How.ID, using = "firstname")
    public static WebElement AddressFirstName;
    @FindBy(how = How.ID, using = "lastname")
    public static WebElement clearAddressLastName;
    @FindBy(how = How.ID, using = "lastname")
    public static WebElement AddressLastName;
    @FindBy(how = How.ID, using = "address1")
    public static WebElement CustomerAddress;
    @FindBy(how = How.ID, using = "city")
    public static WebElement customerCity;
    @FindBy(how = How.ID, using = "id_state")
    public static WebElement State;
    @FindBy(how = How.NAME, using = "postcode")
    public static WebElement CustomerPostcode;
    @FindBy(how = How.ID, using = "phone_mobile")
    public static WebElement customerPhoneNumber;
    @FindBy(how = How.ID, using = "alias")
    public static WebElement clearCustomerAlias;
    @FindBy(how = How.ID, using = "alias")
    public static WebElement customerAlias;
    @FindBy(how = How.XPATH, using = "//*[@id=\"submitAccount\"]/span")
    public static WebElement CustomerRegister;





    public void clickHomePageSignIn() { HomePageSignIn.click();}
    public void typeEmail(String email){ EmailAddress.sendKeys(email);}
    public void clickCreateUser(){CreateUser.click();}
    public void clickGender(){Gender.click();}
    public void typeFirstName(){CustomerFirstName.sendKeys();}
    public void typeCustomerLastName(){customerLastName.sendKeys();}
    public void enterPassword(){Password.sendKeys();}
    public void clearCustomerFirstName(){ClearFirstName.clear();}
    public void enterFirstNameAddress(){AddressFirstName.sendKeys();}
    public void clearCustomerLastName(){clearAddressLastName.clear();}
    public void enterLastName(){AddressLastName.sendKeys();}
    public void enterCustomerAddress(){CustomerAddress.sendKeys();}
    public void enterCustomerCity(){customerCity.sendKeys();}
    public void CustomerSelectState(){
        Select state = new Select(State);
        state.selectByVisibleText("illinois");}
    public void customerPostcode(){CustomerPostcode.sendKeys();}
    public void EnterCustomerPhoneNumber(){customerPhoneNumber.sendKeys();}
    public void ClearCustomerAlias(){clearCustomerAlias.clear();}
    public void EnterCustomerAlias(){customerAlias.sendKeys();}
    public void CustomerClickRegister(){CustomerRegister.click();}
}




