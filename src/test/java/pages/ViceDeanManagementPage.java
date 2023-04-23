package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViceDeanManagementPage {

    public ViceDeanManagementPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menuButton;

    @FindBy(xpath = "//a[text()='Teacher Management']")
    public WebElement teacherManagement;

    @FindBy(xpath = "//div[@class=' css-1xc3v61-indicatorContainer']")
    public WebElement chooseLessons;

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

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement RequiredTextforPhoneNumber;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement MinimumCharacterTextforPhoneNumber;

    @FindBy(id = "isAdvisorTeacher")
    public WebElement isAdvisorTeacherCheckBox;

    @FindBy(xpath = "//a[text()='Vice Dean Management']")
    public WebElement viceDeanManagementButton;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement genderMale;

    @FindBy(xpath = "//div[text()='Vice dean Saved']")
    public WebElement viceDeanSaved;

    @FindBy(xpath = "//div[text()='Required']")
    public WebElement textofRequired;

    @FindBy(xpath = "//div[text()='Minimum 11 character (XXX-XX-XXXX)']")
    public WebElement textofMinChar;

    @FindBy(xpath = "//div[text()='Minimum 8 character']")
    public WebElement textofMinpassword;

}
