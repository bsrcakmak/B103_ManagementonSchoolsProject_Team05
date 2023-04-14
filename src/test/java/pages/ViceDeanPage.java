package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViceDeanPage {

    public ViceDeanPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menuButton;

    @FindBy(xpath = "//a[text()='Teacher Management']")
    public WebElement teacherManagement;

    @FindBy(xpath = "//div[@class=' css-1xc3v61-indicatorContainer']")
    public WebElement chooseLessons;

    @FindBy(xpath = "//div[@id='react-select-2-placeholder']")
    public WebElement getChooseLessons02;

    @FindBy(id = "name")
    public WebElement nameBox;

    @FindBy(id = "surname")
    public WebElement surnameBox;

    @FindBy(id = "birthPlace")
    public WebElement birthPlaceBox;

    @FindBy(id = "email")
    public WebElement emailbox;

    @FindBy(id = "phoneNumber")
    public WebElement phoneNumberBox;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement genderFemale;

    @FindBy(id = "birthDay")
    public WebElement birthdayBox;

    @FindBy(id = "ssn")
    public WebElement ssnBox;

    @FindBy(id = "username")
    public WebElement usernameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement alertChooseLesson;

    @FindBy(xpath = "//div[text()='Teacher saved successfully']")
    public WebElement SuccessfullSaving;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement RequiredTextforName;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement RequiredTextforSurname;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement RequiredTextforBirthPlace;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement RequiredTextforEmail;

}
