package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentManagementPage {

    public StudentManagementPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "advisorTeacherId")
    public WebElement chooseTeacherDropdown;

    @FindBy(id = "name")
    public WebElement nameBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement nameRequiredWarning;

    @FindBy(id = "surname")
    public WebElement surnameBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement surnameRequiredWarning;

    @FindBy(id = "birthPlace")
    public WebElement birthPlaceBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement birthPlaceRequiredWarning;

    @FindBy(id = "email")
    public WebElement emailBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement emailRequiredWarning;

    @FindBy(id = "phoneNumber")
    public WebElement phoneBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement phoneRequiredWarning;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement femaleButton;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement maleButton;

    @FindBy(id = "birthDay")
    public WebElement dateOfBirthBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[6]")
    public WebElement dateOfBirthRequiredWarning;

    @FindBy(id = "ssn")
    public WebElement ssnBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[7]")
    public WebElement ssnRequiredWarning;

    @FindBy(id = "username")
    public WebElement userNameBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[8]")
    public WebElement usernameRequiredWarning;

    @FindBy(id = "fatherName")
    public WebElement fatherNameBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[9]")
    public WebElement fatherNameRequiredWarning;

    @FindBy(id = "motherName")
    public WebElement motherNameBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[10]")
    public WebElement motherNameRequiredWarning;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[11]")
    public WebElement passwordRequiredWarning;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "(//a[@class='page-link'])[4]")
    public WebElement lastPageButton;

    @FindBy(xpath = "(//table[1]/tbody/tr)[last()]//td[5]//span")
    public WebElement studentsUsernameLastCreated;

}
