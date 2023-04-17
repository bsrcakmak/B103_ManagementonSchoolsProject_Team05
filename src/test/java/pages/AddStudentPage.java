package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AddStudentPage {
    public AddStudentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menuu;

    @FindBy(xpath = "//a[text()='Student Management']")
    public WebElement studentManagement;

    @FindBy(xpath = "//select[@id='advisorTeacherId']")
    public WebElement chooseAdvisor;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement namee;
    @FindBy(xpath = "//input[@class='Please enter valid name.']")
    public WebElement validName;
    @FindBy(xpath = "(//div[text()='Required'])[1]")
    public WebElement requiredName;

    @FindBy(xpath = "//input[@id='surname']")
    public WebElement surName;
    @FindBy(xpath = "//input[@id='Please enter valid surname']")
    public WebElement surNameSembol;
    @FindBy(xpath = "(//div[text()='Required'])[2]")
    public WebElement requiredSurName;

    @FindBy(xpath = "//input[@id='birthPlace']")
    public WebElement birthPlace;
    @FindBy(xpath = "(//div[text()='Required'])[3]")
    public WebElement birthPlaceRequired;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement eMail;
    @FindBy(xpath = "(//div[text()='Required'])[4]")
    public WebElement eMailRequired;

    @FindBy(xpath = "//input[@id='phoneNumber']")
    public WebElement phoneNumber;
    @FindBy(xpath = "//div[text()='Minimum 12 character (XXX-XXX-XXXX)']")
    public WebElement phoneNumberMinKarakter;


    @FindBy(xpath = "//div[contains(text(),'Please enter valid phone number')]")
    public WebElement phoneNumberMaxKarakter;
    @FindBy(xpath = "//div[.='Phone number should be exact 12 characters']")
    public WebElement popUpPhoneNumber;

    @FindBy(xpath = "(//div[text()='Required'])[5]")
    public WebElement phoneRequired;
    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement genderFemale;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement genderMale;
    @FindBy(xpath = "//div[contains(text(),'JSON parse error: Cannot coerce empty String (\"\") ')]")
    public WebElement genderEmpty;
    @FindBy(xpath = "//input[@id='birthDay']")
    public WebElement dateOfBirth;
    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement snn;
    @FindBy(xpath = "//div[(text()='Please enter valid SSN number')]")
    public WebElement invalidsnn;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName;
    @FindBy(xpath = "(//div[text()='Required'])[1]")
    public WebElement snnReqired;
    @FindBy(xpath = "(//div[text()='Required'])[8]")
    public WebElement userNameReqired;
    @FindBy(xpath = "//input[@id='fatherName']")
    public WebElement fatherName;
    @FindBy(xpath = "//div[text()='Please enter valid father name']")
    public WebElement fatherNamePopUp;
    @FindBy(xpath = "//input[@id='motherName']")
    public WebElement motherName;
    @FindBy(xpath = "(//div[text()='Required'])[10])")
    public WebElement motherNameRequired;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordArea;
    @FindBy(xpath = "//div[text()='Minimum 8 character']")
    public WebElement passwordMinKarakter;
    @FindBy(xpath = "(//div[text()='Required'])[11]")
    public WebElement userPasswordReqired;
    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[.='Please select advisor teacher']")
    public WebElement selectEdvisor;

    @FindBy(xpath = "//div[.='Student saved Successfully']")
    public WebElement studentSave;


}
