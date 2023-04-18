package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.LessonManagementPage;

public class US09_StepDefinition {
    LessonManagementPage lessonManagementPage = new LessonManagementPage();
    @Then("Lesson List bolumunde {string} bilgisini gorur.")
    public void lesson_list_bolumunde_bilgisini_gorur(String string) {


    }


    @Then("Lesson List bolumunde Compulsory bilgisini gorur.")
    public void lessonListBolumundeCompulsoryBilgisiniGorur() {
        
    }

    @Then("Lesson List bolumunde Credit Score bilgisini gorur.")
    public void lessonListBolumundeCreditScoreBilgisiniGorur() {
        
    }

    @Then("Lesson Name alanina ders adi girer.")
    public void lessonNameAlaninaDersAdiGirer() {
        
    }

    @And("create edilen lesson i silme butonuna tiklar")
    public void createEdilenLessonISilmeButonunaTiklar() {
        
    }

    @And("create edilen lesson i edit butonuna tiklar")
    public void createEdilenLessonIEditButonunaTiklar() {
    }
}
