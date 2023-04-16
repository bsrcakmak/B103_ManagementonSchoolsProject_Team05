package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MeetManagementPage {

    public MeetManagementPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement login;

    @FindBy(xpath = "//*[text()='Menu']")
    public WebElement menu;

    @FindBy(xpath = "//*[@class=' css-19bb58m'] ")
    public WebElement chooseStudent;

    @FindBy(id = "date")
    public WebElement dateOfMeet;

    @FindBy(id = "startTime")
    public WebElement startTime;

    @FindBy(id = "stopTime")
    public WebElement stopTime;

    @FindBy(id = "description")
    public WebElement description;

    @FindBy(xpath = "//*[@class='invalid-feedback'][4]")
    public WebElement requiredDescription;

    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submitButonu;

    @FindBy(xpath = "//*[@class='fw-bold p-3 card-header'][3]")
    public WebElement meetList;

    @FindBy(id = "Date")
    public WebElement date;

    @FindBy(id = "Stop Time")
    public WebElement StopTime;

    @FindBy(id = "Description")
    public WebElement Description;

    @FindBy(xpath = "//*[@class='text-dark btn btn-outline-info']")
    public WebElement editButonu;

    @FindBy(xpath = "//*[@class='btn btn-danger']")
    public WebElement deleteButonu;

}
