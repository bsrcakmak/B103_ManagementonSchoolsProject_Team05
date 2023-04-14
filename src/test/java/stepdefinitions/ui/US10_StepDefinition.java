package stepdefinitions.ui;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ViceDeanPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class US10_StepDefinition {
    ViceDeanPage viceDeanPage = new ViceDeanPage();
    Actions actions = new Actions(Driver.getDriver());
    Select select;

    @When("Kullanici Lesson Program tiklar.")
    public void kullanici_lesson_program_tiklar() {
        ReusableMethods.waitFor(2);
        viceDeanPage.lessonProgramButton.click();
        
    }
    @When("Kullanici ders secimi yapar.")
    public void kullanici_ders_secimi_yapar() {

        viceDeanPage.selectLesson.click();
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
        
    }
    @When("Kullanici egitim donemi secimi yapar.")
    public void kullanici_egitim_donemi_secimi_yapar() {
        select=new Select(viceDeanPage.selectEducationTerm);
        ReusableMethods.waitFor(1);
        ReusableMethods.selectRandomTextFromDropdown(select);
    }
    @When("Kullanici ders gunu secer.")
    public void kullanici_ders_gunu_secer() {
        select =new Select(viceDeanPage.selectDay);
        ReusableMethods.waitFor(1);
        ReusableMethods.selectRandomTextFromDropdown(select);

    }
    @When("Kullanici dersin baslangic saatini girer.")
    public void kullanici_dersin_baslangic_saatini_girer() {
        ReusableMethods.waitFor(1);
        viceDeanPage.startTime.sendKeys("10","00");

        
    }
    @When("Kullanci dersin bitis saatini baslangic saatinden buyuk girer.")
    public void kullanci_dersin_bitis_saatini_baslangic_saatinden_buyuk_girer() {
        ReusableMethods.waitFor(1);
        viceDeanPage.stopTime.sendKeys("11","00");
        
    }
    @Then("Kullanici Submit butonuna tiklar.")
    public void kullanici_submit_butonuna_tiklar() {
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20) );
//        wait.until(ExpectedConditions.visibilityOf(viceDeanPage.submitButtonForLesson));
//        wait.until(ExpectedConditions.elementToBeClickable(viceDeanPage.submitButtonForLesson));
        ReusableMethods.waitFor(1);
        viceDeanPage.submitButtonForLesson.click();
    }
    @Then("{string} mesaji cikartigini dogrular.")
    public void mesaji_cikartigini_dogrular(String string) {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(viceDeanPage.createdLessonProgram.isDisplayed());
        
    }

    @When("Kullanici ders secimi bos birakir.")
    public void kullaniciDersSecimiBosBirakir() {
    }


    @And("Hata mesaji cikar.")
    public void hataMesajiCikar() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(viceDeanPage.jSONError.isDisplayed());
        
        
    }

    @And("Kullanici egitim donemi secimi yapmaz.")
    public void kullaniciEgitimDonemiSecimiYapmaz() {
    }

    @And("Please select education term mesaji cikartigini dogrular.")
    public void pleaseSelectEducationTermMesajiCikartiginiDogrular() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(viceDeanPage.peSeEduTerm.isDisplayed());
    }

    @And("Kullanici ders gunu secimini yapmaz.")
    public void kullaniciDersGunuSeciminiYapmaz() {
        
    }

    @And("Kullanci dersin bitis saatini baslangic saatinden esit ve kucuk olacak sekilde girer.")
    public void kullanciDersinBitisSaatiniBaslangicSaatindenEsitVeKucukOlacakSekildeGirer() {
        ReusableMethods.waitFor(1);
        viceDeanPage.stopTime.sendKeys("09","00");
    }

    @And("Error: start time must not be greater than or equal to stop time mesaji cikartigini dogrular.")
    public void errorStartTimeMustNotBeGreaterThanOrEqualToStopTimeMesajiCikartiginiDogrular() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(viceDeanPage.timeError.isDisplayed());
    }
}