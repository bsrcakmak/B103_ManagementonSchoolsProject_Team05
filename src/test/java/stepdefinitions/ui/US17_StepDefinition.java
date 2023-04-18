package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
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
import static junit.framework.TestCase.assertTrue;

public class US17_StepDefinition {

    LoginPage loginPage=new LoginPage();
    HomePage homePage=new HomePage();
    StudentInfoManagementPage studentInfoManagementPage = new StudentInfoManagementPage();
    MeetManagementPage meetManagementPage =new MeetManagementPage();
    Actions actions = new Actions(Driver.getDriver());
    Select select;



    @And("teacher menu butonuna tiklar.")
    public void teacherMenuButonunaTiklar() {
        studentInfoManagementPage.menu.click();
    }

    @And("teacher Student Info Management butonuna tiklar.")
    public void teacherStudentInfoManagementButonunaTiklar() {
        studentInfoManagementPage.studentInfoManagement.click();
    }

    @And("teacher Add Student Info Bolumunu goruntuler.")
    public void teacherAddStudentInfoBolumunuGoruntuler() {
        studentInfoManagementPage.addInfoMangementyazisi.isDisplayed();


    }
//TC_01

    @And("teacher Choose Lesson sekmesinden ders secer.")
    public void teacherChooseLessonSekmesindenDersSecer() {
        studentInfoManagementPage.chooseLesson.click();
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
        select=new Select(studentInfoManagementPage.chooseLesson);
        ReusableMethods.waitFor(1);
        select.selectByVisibleText("Cucumber");


    }

    @Then("teacher ders secebildigini dogrular.")
    public void teacherDersSecebildiginiDogrular() {
        studentInfoManagementPage.chooseLesson.click();


        // Assert.assertTrue(studentInfoManagementPage.chooseLesson.isDisplayed());

        WebElement chooseLesson = studentInfoManagementPage.chooseLesson;
        Select dersSecimi = new Select(chooseLesson);
        String varsayilanDErs = dersSecimi.getFirstSelectedOption().getText();
        String expectedDers = "Cucumber";
        ReusableMethods.waitFor(1);
        Assert.assertEquals(expectedDers,varsayilanDErs);

    }


    //TC_02

    @And("teacher Choose Student sekmesinden ogrenci secer.")
    public void teacherChooseStudentSekmesindenOgrenciSecer() {
        studentInfoManagementPage.chooseStudent.click();
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
        select=new Select(studentInfoManagementPage.chooseStudent);
        select.selectByVisibleText("Sera Jones");
        ReusableMethods.waitFor(1);

    }

    @Then("teacher ogrenci secebildigini dogrular.")
    public void teacherOgrenciSecebildiginiDogrular() {
        studentInfoManagementPage.chooseStudent.click();
        ReusableMethods.waitFor(1);
        WebElement chooseStudent = studentInfoManagementPage.chooseStudent;
        Select ogrenciSecimi = new Select(chooseStudent);
        String varsayilanOgrenci = ogrenciSecimi.getFirstSelectedOption().getText();
        String expectedOgrenci = "Sera Jones";
        Assert.assertEquals(expectedOgrenci,varsayilanOgrenci);

    }

    //TC_03
    @And("teacher Choose Education Term sekmesinden egitim donemi secer.")
    public void teacherChooseEducationTermSekmesindenEgitimDonemiSecer() {
        studentInfoManagementPage.chooseEducationTerm.click();
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
        select=new Select(studentInfoManagementPage.chooseEducationTerm);
        select.selectByVisibleText("SPRING_SEMESTER");
        ReusableMethods.waitFor(1);

    }

    @Then("teacher donem secebildigini dogrular.")
    public void teacherDonemSecebildiginiDogrular() {
        ReusableMethods.waitFor(1);
        // Assert.assertTrue(studentInfoManagementPage.chooseEducationTerm.isDisplayed());
        WebElement chooseEducation = studentInfoManagementPage.chooseEducationTerm;
        Select donemSecimi = new Select(chooseEducation);
        String varsayilanDonem = donemSecimi.getFirstSelectedOption().getText();
        String expecteddonem = "SPRING_SEMESTER";
        ReusableMethods.waitFor(1);
        Assert.assertEquals(expecteddonem,varsayilanDonem);


    }
    //TC_04
    @And("teacher Devamsizlik  girer.")
    public void teacherDevamsizlikGirer() {
        studentInfoManagementPage.absentee.sendKeys("3");
    }

    @Then("teacher devamsizlik  girebildigini dogrular.")
    public void teacherDevamsizlikGirebildiginiDogrular() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(studentInfoManagementPage.absentee.isDisplayed());
    }
    //TC_05
    @And("teacher Midterm notu girer.")
    public void teacherMidtermNotuGirer() {
        studentInfoManagementPage.midtermExam.sendKeys("55");

    }

    @Then("teacher Midterm notu girebildigini dogrular.")
    public void teacherMidtermNotuGirebildiginiDogrular() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(studentInfoManagementPage.midtermExam.isDisplayed());
    }
    //TC_06
    @And("teacher Final notu girer.")
    public void teacherFinalNotuGirer() {
        studentInfoManagementPage.finalExam.sendKeys("80");
    }

    @Then("teacher Final notu girebildigini dogrular.")
    public void teacherFinalNotuGirebildiginiDogrular() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(studentInfoManagementPage.finalExam.isDisplayed());
    }
    //TC_07
    @And("teacher info notuna metin girer.")
    public void teacherInfoNotunaMetinGirer() {
        studentInfoManagementPage.infoNote.sendKeys("Calismasi gerekiyor");
    }

    @Then("teacher info notu girebildigini dogrular.")
    public void teacherInfoNotuGirebildiginiDogrular() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(studentInfoManagementPage.infoNote.isDisplayed());
    }
    //TC_08
    //BUG-Info notu girildigi dogrulanmamalidir.
    @And("kullanici info notuna space girer.")
    public void kullaniciInfoNotunaSpaceGirer() {
        studentInfoManagementPage.infoNote.sendKeys(" ");
    }

    @Then("kullanici info notu girebildigini dogrular.")
    public void kullaniciInfoNotuGirebildiginiDogrular() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(studentInfoManagementPage.infoNote.isDisplayed());
    }
    //TC_09
    @And("teacher Choose Lesson sekmesinden ders secmez")
    public void teacherChooseLessonSekmesindenDersSecmez() {

    }

    @And("teacher Devamsizlik bilgilerini girer.")
    public void teacherDevamsizlikBilgileriniGirer() {
        studentInfoManagementPage.absentee.sendKeys("3");
    }

    @And("teacher Midterm notunu girer.")
    public void teacherMidtermNotunuGirer() {
        studentInfoManagementPage.midtermExam.sendKeys("55");
    }

    @And("teacher Final Exam notunu girer.")
    public void teacherFinalExamNotunuGirer()
    {studentInfoManagementPage.finalExam.sendKeys("80");

    }

    @And("teacher info note alanini bos birakir.")
    public void teacherInfoNoteAlaniniBosBirakir() {
        studentInfoManagementPage.infoNote.click();
    }

    @Then("teacher requared yazisinin ciktigini dogrular.")
    public void teacherRequaredYazisininCiktiginiDogrular() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(studentInfoManagementPage.infoNoteRequaredYazisi.isDisplayed());
    }
}
