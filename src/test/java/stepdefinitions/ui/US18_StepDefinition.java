package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.LoginPage;
import pages.MeetManagementPage;
import pages.StudentInfoManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US18_StepDefinition {

    LoginPage loginPage=new LoginPage();
    HomePage homePage=new HomePage();
    StudentInfoManagementPage studentInfoManagementPage = new StudentInfoManagementPage();
    MeetManagementPage meetManagementPage =new MeetManagementPage();
    Actions actions = new Actions(Driver.getDriver());
    Select select;


    @And("teacher Student Info List Bolumunu gorur")
    public void teacherStudentInfoListBolumunuGorur() {
        Assert.assertTrue(studentInfoManagementPage.studentInfoList.isDisplayed());
    }
    //TC_01
    @And("teacher Name Surname Bolumunu gorur")
    public void teacherNameSurnameBolumunuGorur() {
        Assert.assertTrue(studentInfoManagementPage.nameSurnameGorunur.isDisplayed());
    }
    //TC_02
    @And("teacher Lesson Name Bolumunu gorur")
    public void teacherLessonNameBolumunuGorur() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(studentInfoManagementPage.lessonNameGorunur.isDisplayed());

    }
    //TC_03
    @And("teacher Anssente Bolumunu gorur")
    public void teacherAnssenteBolumunuGorur() {
        Assert.assertTrue(studentInfoManagementPage.absenteeGorunur.isDisplayed());
    }
    //TC_04
    @And("teacher Midterm Bolumunu gorur")
    public void teacherMidtermBolumunuGorur() {
        Assert.assertTrue(studentInfoManagementPage.midtermExamGorunur.isDisplayed());
    }
    //TC_05
    @And("teacher Final Exam Bolumunu gorur")
    public void teacherFinalExamBolumunuGorur() {
        Assert.assertTrue(studentInfoManagementPage.finalExamGorunur.isDisplayed());
    }
    //TC_06
    @And("teacher Info Note Bolumunu gorur.")
    public void teacherInfoNoteBolumunuGorur() {
        Assert.assertTrue(studentInfoManagementPage.infonoteGorunur.isDisplayed());
    }
    //TC_07
    @And("teacher Average bilgilerinin yer aldigi Bolumu gorur")
    public void teacherAverageBilgilerininYerAldigiBolumuGorur() {

        studentInfoManagementPage.averageGorunur.isDisplayed();
    }

    //TC_08
    @And("teacher Add Student Info Bolumu goruntuler.")
    public void teacherAddStudentInfoBolumuGoruntuler() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(studentInfoManagementPage.studentInfoList.isDisplayed());
    }

    @And("teacher Choose Lesson bolumunden ders  secer.")
    public void teacherChooseLessonBolumundenDersSecer() {
        studentInfoManagementPage.chooseLesson.click();
        // ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
        select=new Select(studentInfoManagementPage.chooseLesson);
        ReusableMethods.waitFor(1);
        ReusableMethods.selectRandomTextFromDropdown(select);
    }

    @And("teacher Choose Student bolumunden ogrenci secer.")
    public void teacherChooseStudentBolumundenOgrenciSecer() {
        studentInfoManagementPage.chooseStudent.click();
        //ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
        select=new Select(studentInfoManagementPage.chooseStudent);
        ReusableMethods.waitFor(1);
        ReusableMethods.selectRandomTextFromDropdown(select);
    }


    @And("teacher Choose Education Term bolumunden egitim donemi secer.")
    public void teacherChooseEducationTermBolumundenEgitimDonemiSecer() {

        studentInfoManagementPage.chooseEducationTerm.click();
        // ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
        select=new Select(studentInfoManagementPage.chooseEducationTerm);
        ReusableMethods.waitFor(1);
        ReusableMethods.selectRandomTextFromDropdown(select);

    }

    @And("teacher Devamsizlik bilgisi girer.")
    public void teacherDevamsizlikBilgisiGirer() {
        studentInfoManagementPage.absentee.sendKeys("3");
    }

    @And("teacher Midterm not girer.")
    public void teacherMidtermNotGirer() {
        studentInfoManagementPage.midtermExam.sendKeys("55");
    }

    @And("teacher Final notunu girer.")
    public void teacherFinalNotunuGirer() {
        studentInfoManagementPage.finalExam.sendKeys("80");
    }

    @And("teacher info notunu girer.")
    public void teacherInfoNotunuGirer() {
        studentInfoManagementPage.infoNote.sendKeys("Calismasi gerekiyor");
    }

    @And("teacher Submit butonuna tiklar.")
    public void teacherSubmitButonunaTiklar() {
        ReusableMethods.clickByJS(studentInfoManagementPage.submitButonu);
        ReusableMethods.waitFor(2);
        //studentInfoManagementPage.submitButonu.click();

    }

    @And("teacher Edit Butonuna tiklar.")
    public void teacherEditButonunaTiklar() {
        ReusableMethods.scrollIntoViewJS(studentInfoManagementPage.editButonu);
        ReusableMethods.waitForClickablility(studentInfoManagementPage.editButonu,5);
        ReusableMethods.clickByJS(studentInfoManagementPage.editButonu);
    }

    @And("teacher Choose Lesson secer.")
    public void teacherChooseLessonSecer() {
        ReusableMethods.waitForVisibility(studentInfoManagementPage.selectLesson,2);
        studentInfoManagementPage.selectLesson.click();
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
        select=new Select(studentInfoManagementPage.selectLesson);
        ReusableMethods.waitFor(1);
        ReusableMethods.selectFromDropdownByIndex(studentInfoManagementPage.selectLesson,1);

    }

    @And("teacher Choose Education Term secer.")
    public void teacherChooseEducationTermSecer() {
        studentInfoManagementPage.egitimDonemi.click();
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
        select=new Select(studentInfoManagementPage.egitimDonemi);
        ReusableMethods.selectFromDropdownByIndex(studentInfoManagementPage.egitimDonemi,1);

    }

    @And("teacher ogrenci not bilgisine yeni bir deger girer.")
    public void teacherOgrenciNotBilgisineYeniBirDegerGirer() {
        studentInfoManagementPage.egitimDonemi.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,"Gayret gostermeli",Keys.TAB,Keys.ENTER);


    }

    @Then("Teacher updated Successful\" popUp mesajini goruntuler.")
    public void teacherUpdatedSuccessfulPopUpMesajiniGoruntuler() {
        studentInfoManagementPage.successfullymessage.isDisplayed();
        ReusableMethods.waitFor(2);
    }

    //TC_09
    @And("teacher Delete Butonuna tiklar.")
    public void teacherDeleteButonunaTiklar() {
        ReusableMethods.clickByJS(studentInfoManagementPage.deleteButonu);
        ReusableMethods.waitFor(2);
    }

    @Then("teacher ogrenci bilgilerinin silindigini dogrular.")
    public void teacherOgrenciBilgilerininSilindiginiDogrular() {
        ReusableMethods.waitForVisibility(studentInfoManagementPage.basariliDelete,5);
        Assert.assertTrue(studentInfoManagementPage.basariliDelete.isDisplayed());
    }
}