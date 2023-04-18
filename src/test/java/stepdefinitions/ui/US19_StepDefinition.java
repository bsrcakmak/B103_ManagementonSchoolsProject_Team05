package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.LoginPage;
import pages.MeetManagementPage;
import pages.StudentInfoManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US19_StepDefinition {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    StudentInfoManagementPage studentInfoManagementPage = new StudentInfoManagementPage();
    MeetManagementPage meetManagementPage = new MeetManagementPage();
    Actions actions = new Actions(Driver.getDriver());
    Select select;

    @And("teacher menu butonuna tiklar")
    public void teacherMenuButonunaTiklar() {
        meetManagementPage.menu.click();
    }

    @And("teacher Meet Management butonuna tiklar")
    public void teacherMeetManagementButonunaTiklar() {
        meetManagementPage.meetManagement.click();
    }

    @And("teacher Meet List bolumunu gorur.")
    public void teacherMeetListBolumunuGorur() {
        Assert.assertTrue(meetManagementPage.addMeet.isDisplayed());
    }

    //TC_01
    @And("teacher choose student alanindan ogrenci secer")
    public void teacherChooseStudentAlanindanOgrenciSecer() {

        ReusableMethods.clickByJS(meetManagementPage.chooseStudent);
        ReusableMethods.waitFor(2);
        new Actions(Driver.getDriver()).moveByOffset(300, 500).click().build().perform();
        // ReusableMethods.selectFromDropdownByIndex(meetManagementPage.chooseStudent,1);

    }

    @Then("teacher choose student alanindan ogrenci secilebildigini dogrular")
    public void teacherChooseStudentAlanindanOgrenciSecilebildiginiDogrular() {

        meetManagementPage.chooseStudent.isDisplayed();

    }

    //TC_02
    @And("teacher Date Of Meet alanina gelecek bir tarih girer")
    public void teacherDateOfMeetAlaninaGelecekBirTarihGirer() {

        meetManagementPage.dateOfMeet.sendKeys("30.04.2023");
        ReusableMethods.waitFor(2);
    }

    @Then("teacher Date Of Meet alanina gelecek bir tarih girildigini dogrular.")
    public void teacherDateOfMeetAlaninaGelecekBirTarihGirildiginiDogrular() {
        Assert.assertTrue(meetManagementPage.dateOfMeet.isDisplayed());
    }

    //TC_03
    @And("teacher Date Of Meet alanina gecmis bir tarih girer")
    public void teacherDateOfMeetAlaninaGecmisBirTarihGirer() {
        meetManagementPage.dateOfMeet.sendKeys("15.04.2023");
    }

    @Then("teacher Date Of Meet alanina gecmis bir tarih girildigini dogrular.")
    public void teacherDateOfMeetAlaninaGecmisBirTarihGirildiginiDogrular() {
        Assert.assertTrue(meetManagementPage.dateOfMeet.isDisplayed());
    }

    //TC_04
    @And("teacher Start Time alanina valid bir deger girer")
    public void teacherStartTimeAlaninaValidBirDegerGirer() {
        meetManagementPage.startTime.sendKeys("11","00");
    }

    @Then("teacher Start Time alanina valid bir deger girildigini dogrular.")
    public void teacherStartTimeAlaninaValidBirDegerGirildiginiDogrular() {
        meetManagementPage.startTime.isDisplayed();
    }

    //TC_05
    @And("teacher Stop Time alanina valid bir deger girer")
    public void teacherStopTimeAlaninaValidBirDegerGirer() {
        meetManagementPage.stopTime.sendKeys("12","00");
    }

    @Then("teacher Stop Time alanina valid bir deger girildigini dogrular.")
    public void teacherStopTimeAlaninaValidBirDegerGirildiginiDogrular() {
        meetManagementPage.stopTime.isDisplayed();
    }

    //TC_06
    @And("teacher choose student bolumunden ogrenci secer")
    public void teacherChooseStudentBolumundenOgrenciSecer() {
        ReusableMethods.clickByJS(meetManagementPage.chooseStudent);
        ReusableMethods.waitFor(2);
        new Actions(Driver.getDriver()).moveByOffset(300, 500).click().build().perform();
    }

    @And("teacher Date Of Meet alanina gecmis tarih girer")
    public void teacherDateOfMeetAlaninaGecmisTarihGirer() {
        meetManagementPage.dateOfMeet.sendKeys("15.04.2023");
    }

    @And("teacher Start Time alanina gecerli deger girer")
    public void teacherStartTimeAlaniniBosBirakir() {
        meetManagementPage.startTime.sendKeys("11","00");
    }

    @And("teacher Stop Time alanina gecerli deger girer")
    public void teacherStopTimeAlaniniBosBirakir() {
        meetManagementPage.stopTime.sendKeys("12","00");
    }

    @And("teacher Description alanina valid bir deger girer")
    public void teacherDescriptionAlaninaValidBirDegerGirer() {
        meetManagementPage.description.sendKeys("veli gorusmesi");
    }

    @And("teacher submit butonuna tiklar")
    public void teacherSubmitButonunaTiklar() {
        meetManagementPage.submitButonu.click();
    }

    @Then("teacher hata mesaji gorur ve toplanti olusturamaz")
    public void teacherHataMesajiGorurVeToplantiOlusturamaz() {

        meetManagementPage.hataMesaji.isDisplayed();
    }

    //TC_07
    @And("teacher description alanina gecer bir deger girer")
    public void teacherDescriptionAlaninaGecerBirDegerGirer() {
        meetManagementPage.description.sendKeys("Kayit haftasi gorusmesi");
    }

    @Then("teacher description alanina gecer deger girilebildigini dogrular")
    public void teacherDescriptionAlaninaGecerDegerGirilebildiginiDogrular() {
        meetManagementPage.description.isDisplayed();
    }



    //TC_08
//BUG
    @And("teacher description alanina space karakteri girer")
    public void teacherDescriptionAlaninaSpaceKarakteriGirer() {
        meetManagementPage.description.sendKeys(" ");
    }



    @Then("teacher description alanina deger girilebildigini dogrular")
    public void teacherDescriptionAlaninaDegerGirilebildiginiDogrular() {
        meetManagementPage.description.isDisplayed();
    }


}

