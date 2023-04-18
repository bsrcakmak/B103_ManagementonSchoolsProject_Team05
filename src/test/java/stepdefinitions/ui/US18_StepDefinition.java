package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
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

    @And("teacher Anssente Bolumunu gorur")
    public void teacherAnssenteBolumunuGorur() {
        Assert.assertTrue(studentInfoManagementPage.absenteeGorunur.isDisplayed());
    }

    @And("teacher Midterm Bolumunu gorur")
    public void teacherMidtermBolumunuGorur() {
        Assert.assertTrue(studentInfoManagementPage.midtermExamGorunur.isDisplayed());
    }

    @And("teacher Final Exam Bolumunu gorur")
    public void teacherFinalExamBolumunuGorur() {
        Assert.assertTrue(studentInfoManagementPage.finalExamGorunur.isDisplayed());
    }

    @And("teacher Info Note Bolumunu gorur.")
    public void teacherInfoNoteBolumunuGorur() {
        Assert.assertTrue(studentInfoManagementPage.infonoteGorunur.isDisplayed());
    }

    @And("teacher Average bilgilerinin yer aldigi Bolumu gorur")
    public void teacherAverageBilgilerininYerAldigiBolumuGorur() {
        Assert.assertTrue(studentInfoManagementPage.averageGorunur.isDisplayed());
    }

}
