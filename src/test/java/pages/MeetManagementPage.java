package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MeetManagementPage {

    public MeetManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="username")
    public WebElement username;

    @FindBy (id="password")
    public WebElement password;

    @FindBy (xpath = "//button[@class='fw-semibold btn btn-primary']")
    public  WebElement login;

    @FindBy(xpath = "//*[text()='Menu']")
    public WebElement menu;

    @FindBy(xpath = "//a[text()='Meet Management']")
    public WebElement meetManagement;

    @FindBy(xpath = "(//*[@class='fw-bold p-3 card-header'])[2]")
    public WebElement addMeet;

    @FindBy(xpath = "//*[@class=' css-19bb58m']")
    public WebElement chooseStudent;

    @FindBy(xpath= "//*[contains(@class,'css-19bb58m')]")
    public WebElement selectStudent;

    @FindBy(xpath = "(//table[1]/tbody/tr)[last()]//td[4])")
    public WebElement descriptionYazisi;

    @FindBy(id="date")
    public WebElement dateOfMeet;

    @FindBy(id="startTime")
    public WebElement startTime;

    @FindBy(id="stopTime")
    public WebElement stopTime;

    @FindBy(id="description")
    public WebElement description;

    @FindBy(xpath = "//*[@class='invalid-feedback'][4]")
    public WebElement requiredDescription;

    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submitButonu;

    @FindBy(xpath = " //div[@role='alert']")
    public WebElement hataMesaji;


    ///Gorunur dogrulama
    @FindBy(xpath = "(//*[@class='fw-bold p-3 card-header'])[3]")
    public WebElement meetList;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/thead/tr/th[1]")
    public WebElement date;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/thead/tr/th[2] ")
    public WebElement StartTime;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/thead/tr/th[3]")
    public WebElement StopTime;


    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/thead/tr/th[4]")
    public WebElement Description;

    @FindBy(xpath = "(//*[@class='text-dark btn btn-outline-info'])[1]")
    public WebElement editButonu;

    @FindBy(xpath = "//*[text()='Meet Updated Successfully']")
    public WebElement basariliEditYazisi;

    @FindBy(xpath = "//*[@class='btn btn-danger']")
    public WebElement deleteButonu;



}


