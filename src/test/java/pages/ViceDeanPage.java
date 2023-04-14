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

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement alertChooseLesson;

    @FindBy(xpath = "//div[text()='Teacher saved successfully']")
    public WebElement SuccessfullSaving;

    @FindBy (xpath="//button[.='Lesson Program']")
    public WebElement lessonProgramButton;

    @FindBy (xpath="//div[.='Select lesson']")
    public WebElement selectLesson;

    @FindBy (xpath = "//*[@class='mb-3 form-select']")
    public WebElement selectDay;

    @FindBy (xpath ="//*[@class='mt-5 form-select']" )
    public WebElement selectEducationTerm;

    @FindBy (id = "startTime")
    public WebElement startTime;

    @FindBy (id ="stopTime")
    public WebElement stopTime;

    @FindBy (xpath = "//div[@role='alert'")
    public WebElement createdLessonProgram;

    @FindBy (xpath = "//*[.='Please select education term']")
    public WebElement peSeEduTerm;

    @FindBy (xpath = "//div[contains(text(),'Error: start time')]")
    public  WebElement timeError;

    @FindBy (xpath = "//div[contains(text(),'JSON parse error:')]")
    public  WebElement jSONError;





}
