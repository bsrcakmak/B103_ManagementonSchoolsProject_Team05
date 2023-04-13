package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {

    public RegisterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='mb-4 fw-semibold shadow-sm bg-body-tertiary card-title h5']")
    public WebElement registerBolumu;

    @FindBy(id ="name" )
    public WebElement name;

    @FindBy(xpath ="(//*[@class='invalid-feedback'])[1]" )
    public WebElement nameUyari;

    @FindBy(id ="surname" )
    public WebElement surname;
    @FindBy(xpath ="(//*[@class='invalid-feedback'])[2]" )
    public WebElement surnameUyari;

    @FindBy(id ="birthPlace" )
    public WebElement birthPlace;
    @FindBy(xpath ="(//*[@class='invalid-feedback'])[3]" )
    public WebElement birthPlaceUyari;

    @FindBy(id ="phoneNumber" )
    public WebElement phoneNumber;
    @FindBy(xpath ="(//*[@class='invalid-feedback'])[4]" )
    public WebElement phoneNumberUyari;

    @FindBy(xpath ="//*[@value='FEMALE']" )
    public WebElement female;

    @FindBy(xpath ="//*[@value='MALE']" )
    public WebElement male;

    @FindBy(id ="birthDay" )
    public WebElement birthDay;
    @FindBy(xpath ="(//*[@class='invalid-feedback'])[5]" )
    public WebElement birthDayUyari;

    @FindBy(id ="ssn" )
    public WebElement ssn;
    @FindBy(xpath ="(//*[@class='invalid-feedback'])[6]" )
    public WebElement ssnUyari;

    @FindBy(id ="username" )
    public WebElement username;
    @FindBy(xpath ="(//*[@class='invalid-feedback'])[7]" )
    public WebElement usernameUyari;

    @FindBy(id ="password" )
    public WebElement password;
    @FindBy(xpath ="(//*[@class='invalid-feedback'])[8]" )
    public WebElement passwordUyari;

    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary']")
    public WebElement  registerButton;


    @FindBy(xpath = "//*[@class='Toastify']")
    public WebElement  guestUserRegisteredUyari;





}
