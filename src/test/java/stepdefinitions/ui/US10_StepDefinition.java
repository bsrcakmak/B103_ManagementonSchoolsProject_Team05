package stepdefinitions.ui;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.LessonManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US10_StepDefinition {

    LessonManagementPage lessonManagementPage = new LessonManagementPage();
    Actions actions = new Actions(Driver.getDriver());
    Select select;

    @When("Kullanici Lesson Program tiklar.")
    public void kullanici_lesson_program_tiklar() {
        ReusableMethods.waitFor(2);
        lessonManagementPage.lessonProgramButton.click();
        
    }
    @When("Kullanici ders secimi yapar.")
    public void kullanici_ders_secimi_yapar() {

        lessonManagementPage.selectLesson.click();
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
        
    }
    @When("Kullanici egitim donemi secimi yapar.")
    public void kullanici_egitim_donemi_secimi_yapar() {
        select=new Select(lessonManagementPage.selectEducationTerm);
        ReusableMethods.waitFor(1);
        ReusableMethods.selectRandomTextFromDropdown(select);
    }
    @When("Kullanici ders gunu secer.")
    public void kullanici_ders_gunu_secer() {
        select =new Select(lessonManagementPage.selectDay);
        ReusableMethods.waitFor(1);
        ReusableMethods.selectRandomTextFromDropdown(select);

    }
    @When("Kullanici dersin baslangic saatini girer.")
    public void kullanici_dersin_baslangic_saatini_girer() {
        ReusableMethods.waitFor(1);
        lessonManagementPage.startTime.sendKeys("10","00");

        
    }
    @When("Kullanci dersin bitis saatini baslangic saatinden buyuk girer.")
    public void kullanci_dersin_bitis_saatini_baslangic_saatinden_buyuk_girer() {
        ReusableMethods.waitFor(1);
        lessonManagementPage.stopTime.sendKeys("11","00");
        
    }
    @Then("Kullanici Submit butonuna tiklar.")
    public void kullanici_submit_butonuna_tiklar() {
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20) );
//        wait.until(ExpectedConditions.visibilityOf(lessonManagementPage.submitButtonForLesson));
//        wait.until(ExpectedConditions.elementToBeClickable(lessonManagementPage.submitButtonForLesson));
        ReusableMethods.waitFor(1);
        lessonManagementPage.submitButtonForLesson.click();
    }
    @Then("{string} mesaji cikartigini dogrular.")
    public void mesaji_cikartigini_dogrular(String string) {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(lessonManagementPage.createdLessonProgram.isDisplayed());
        
    }

    @When("Kullanici ders secimi bos birakir.")
    public void kullaniciDersSecimiBosBirakir() {
    }


    @And("Hata mesaji cikar.")
    public void hataMesajiCikar() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(lessonManagementPage.jSONError.isDisplayed());
        
        
    }

    @And("Kullanici egitim donemi secimi yapmaz.")
    public void kullaniciEgitimDonemiSecimiYapmaz() {
    }

    @And("Please select education term mesaji cikartigini dogrular.")
    public void pleaseSelectEducationTermMesajiCikartiginiDogrular() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(lessonManagementPage.peSeEduTerm.isDisplayed());
    }

    @And("Kullanici ders gunu secimini yapmaz.")
    public void kullaniciDersGunuSeciminiYapmaz() {
        
    }

    @And("Kullanci dersin bitis saatini baslangic saatinden esit ve kucuk olacak sekilde girer.")
    public void kullanciDersinBitisSaatiniBaslangicSaatindenEsitVeKucukOlacakSekildeGirer() {
        ReusableMethods.waitFor(1);
        lessonManagementPage.stopTime.sendKeys("09","00");
    }

    @And("Error: start time must not be greater than or equal to stop time mesaji cikartigini dogrular.")
    public void errorStartTimeMustNotBeGreaterThanOrEqualToStopTimeMesajiCikartiginiDogrular() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(lessonManagementPage.timeError.isDisplayed());
    }


}
