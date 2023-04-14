package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DeanManagementPage {

    public DeanManagementPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "name")
    public WebElement nameBox;

    @FindBy(id = "surname")
    public WebElement surnameBox;

    @FindBy(id = "birthPlace")
    public WebElement birthPlaceBox;

    @FindBy(xpath = "(//*[@name='gender'])[1]")
    public WebElement genderFemale;

    @FindBy(id = "birthDay")
    public WebElement birthdayBox;

    @FindBy(id = "phoneNumber")
    public WebElement phoneNumberBox;

    @FindBy(id = "ssn")
    public WebElement ssnBox;

    @FindBy(id = "username")
    public WebElement usernameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[1]")
    public WebElement nameRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[2]")
    public WebElement surnameRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[3]")
    public WebElement birthPlaceRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[4]")
    public WebElement birthDateRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[5]")
    public WebElement phoneRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[6]")
    public WebElement ssnRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[7]")
    public WebElement userNameRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[8]")
    public WebElement passwordRequired;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement popUpMessage;

}
