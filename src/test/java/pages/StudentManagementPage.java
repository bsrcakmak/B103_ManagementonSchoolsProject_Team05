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

    @FindBy(id = "surname")
    public WebElement surnameBox;

    @FindBy(id = "birthPlace")
    public WebElement birthPlaceBox;

    @FindBy(id = "email")
    public WebElement emailBox;

    @FindBy(id = "phoneNumber")
    public WebElement phoneBox;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement femaleButton;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement maleButton;

    @FindBy(id = "birthDay")
    public WebElement dateOfBirthBox;

    @FindBy(id = "ssn")
    public WebElement ssnBox;

    @FindBy(id = "username")
    public WebElement usernameBox;

    @FindBy(id = "fatherName")
    public WebElement fatherNameBox;

    @FindBy(id = "motherName")
    public WebElement motherNameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "(//a[@class='page-link'])[4]")
    public WebElement lastPageButton;

    @FindBy(xpath = "(//table[1]/tbody/tr)[last()]//td[5]//span")
    public WebElement studentsUsernameLastCreated;

}
