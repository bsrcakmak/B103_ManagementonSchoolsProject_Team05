package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.LessonManagementPage;
import pages.LessonProgramManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US12_StepDefinition {
    HomePage homePage=new HomePage();
    LessonManagementPage lessonManagementPage = new LessonManagementPage();
    LessonProgramManagementPage lessonProgramManagementPage = new LessonProgramManagementPage();
    @Then("açılan sayfadan{string} tıklar")
    public void açılanSayfadanTıklar(String arg0) {
        lessonManagementPage.clickLessonProgram();
        ReusableMethods.waitFor(5);
    }

    @Then("kullanıcı choose lessons tıklar")
    public void kullanıcıChooseLessonsTıklar() {

    }

    @Then("kullanıcı ders seçmelidir")
    public void kullanıcıDersSeçmelidir() {
    }

    @And("dersin seçili olduğunu doğrular")
    public void dersinSeçiliOlduğunuDoğrular() {
        Assert.assertTrue("Selected lesson is not displayed.",lessonProgramManagementPage.selectedLesson.isDisplayed());
    }

    @Then("ana menüden Lesson Management ders seçimine tıklar")
    public void anaMenüdenLessonManagementDersSeçimineTıklar() {
        homePage.clickLessonManagement();
    }

    @Then("kullanıcı choose lessons tıklar ,ders seçimini yapar")
    public void kullanıcıChooseLessonsTıklarDersSeçiminiYapar() {
        lessonProgramManagementPage.selectLessonFromDropdown();
    }

    @Then("kullanıcı seçilen dersi silebilmelidir")
    public void kullanıcıSeçilenDersiSilebilmelidir() {
        lessonProgramManagementPage.removeSelectedLesson();
    }

    @And("dersin silindiğini doğrular")
    public void dersinSilindiğiniDoğrular() {
        Assert.assertFalse("Selected lesson is displayed incorrectly.",lessonProgramManagementPage.isLessonExist());
    }

    @Then("close browser")
    public void closeBrowser() {
        Driver.closeDriver();
    }

    @Then("kullanıcı homepagede menü ye tıklar")
    public void kullanıcıHomepagedeMenüYeTıklar() {
        homePage.clickMenu();
    }
    //comment
    @Then("Error alert görünür.")
    public void errorAlertGörünür() {
        Assert.assertTrue("Error alert is not displayed.",lessonProgramManagementPage.submitButton.isDisplayed());
    }

    @Then("egitim donemi secimini dogrular.")
    public void egitimDonemiSeciminiDogrular() {

    }
}
