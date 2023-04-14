package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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

    @FindBy(xpath = "//label[text()='Female']")
    public WebElement genderFemale;

    @FindBy(xpath = "//label[text()='Male']")
    public WebElement genderMale;

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

}
