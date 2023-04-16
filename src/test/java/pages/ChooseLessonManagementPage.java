package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;


public class ChooseLessonManagementPage {

    public ChooseLessonManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//table//thead//tr//th[3]")
    public WebElement teacher;
    @FindBy(xpath = "//table//tbody//tr//td[3]")
    public List<WebElement> teachersSutun;

    @FindBy(xpath = "//table//thead//tr//th[4]")
    public WebElement day;
    @FindBy(xpath = "//table//tbody//tr//td[4]")
    public List<WebElement> daysSutun;

    @FindBy(xpath = "//table//thead//tr//th[5]")
    public WebElement startTime;
    @FindBy(xpath = "//table//tbody//tr//td[5]")
    public List<WebElement> startTimeSutun;

    @FindBy(xpath = "//table//thead//tr//th[5]")
    public WebElement stopTime;
    @FindBy(xpath = "//table//tbody//tr//td[5]")
    public List<WebElement> stopTimeSutun;

    @FindBy(xpath = "//table//tbody//tr")
    public List<WebElement> chooseLessonTabloSatir;

    @FindBy(xpath = "(//*[@class='col'])[1]//tr//td[5]")
    public List<WebElement> chooseLessonTabloDaySutun;
    @FindBy(xpath = "(//*[@class='col'])[1]//tr//td[6]")
    public List<WebElement> chooseLessonTabloStartTimeSutun;

    @FindBy(xpath = "(//*[@class='col'])[2]//tr")
    public List<WebElement> lessonProgramListTabloSatir;
    @FindBy(xpath = "(//*[@class='col'])[2]//tr//td[2]")
    public List<WebElement> lessonProgramListDaySutun;
    @FindBy(xpath = "(//*[@class='col'])[2]//tr//td[3]")
    public List<WebElement> lessonProgramListStartTimeSutun;


    @FindBy(xpath = "//input[@id='lessonProgramId']")
    public List<WebElement> lessonSelectButton;

    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement sumbitButton;

    @FindBy(xpath = "//button[@aria-controls='offcanvasNavbar-expand-false']")
    public WebElement  menuButton ;

    @FindBy(xpath = "//a[.='Grades and Announcements']")
    public WebElement  gradesAndAnnouncements ;

    @FindBy(xpath ="//*[@class='Toastify__toast-body']")
    public WebElement submitAlert;










}
