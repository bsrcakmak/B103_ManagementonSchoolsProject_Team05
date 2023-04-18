package stepdefinitions.ui;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LessonManagementPage;
import pages.MainMenuPanel;

public class US08_StepDefinition {
    LessonManagementPage lessonManagementPage = new LessonManagementPage();
    MainMenuPanel menuPanel = new MainMenuPanel();


    @Then("Kullanici acilan menuden Lesson Management e tiklar.")
    public void kullanici_acilan_menuden_lesson_management_e_tiklar() {
    menuPanel.lessonManagementButton.click();

    }
    @Then("Acilan sayfada Lessons menüsünü secer.")
    public void acilan_sayfada_lessons_menüsünü_secer() {
        lessonManagementPage.lessonsButton.click();


    }
    @Then("Lesson Management sayfasini acildigini dogrular.")
    public void lesson_management_sayfasini_acildigini_dogrular() {


    }
    @Given("Lesson Name alanina {string}  girer.")
    public void lesson_name_alanina_girer(String string) {
        lessonManagementPage.lessonName.sendKeys(string);

    }
    @Then("Compulsory Checkbox ini isaretler.")
    public void compulsory_checkbox_ini_isaretler() {

    }
    @Then("Credit Score alanina {string} girer.")
    public void credit_score_alanina_girer(String string) {

    }
}
