package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.ContactPage;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US03_StepDefinition {

    HomePage homePage = new HomePage();
    ContactPage contactPage = new ContactPage();
    Faker faker = new Faker();



    //public String expectedEmail = ReusableMethods.createEmail();
    public String karakter1 = "@";
    public String karakter2= ".";
    public String invalidEmail1 ="mary@clanen";
    public String invalidEmail2 ="mary.clane";
    public String invalidEmail3 ="mary@clane.";



    // Backgraund
    @When("kullanici Contact butonuna tiklar")
    public void kullaniciContactButonunaTiklar() {
        homePage.contactButton.click();
        ReusableMethods.waitFor(2);
    }


    @And("kullanici Your Name alanina valid bir deger girer")
    public void kullaniciYourNameAlaninaValidBirDegerGirer() {
        contactPage.name.click();
        contactPage.name.sendKeys(ReusableMethods.createName());
        ReusableMethods.waitFor(2);
    }

    @Then("kullanici Your Name alanina bir deger girilebildigini dogrular")
    public void kullaniciYourNameAlaninaBirDegerGirilebildiginiDogrular() {
        //Assert.assertTrue();
    }

    @And("kullanici Your Email alanina valid bir deger girer")
    public void kullaniciYourEmailAlaninaValidBirDegerGirer() {
        contactPage.email.click();
        contactPage.email.sendKeys(ReusableMethods.createEmail());
        ReusableMethods.waitFor(2);
    }

    @Then("kullanici Your Email alanina bir deger girilebildigini dogrular")
    public void kullaniciYourEmailAlaninaBirDegerGirilebildiginiDogrular() {
        contactPage.sendMessage.click();
        Assert.assertTrue(contactPage.successfully.isDisplayed());
    }

    @Then("kullanici girilen degerde {string} karakterinin oldugunu dogrular")
    public void kullaniciGirilenDegerdeKarakterininOldugunuDogrular(String arg0) {
        Assert.assertTrue(contactPage.email.getText().contains(karakter1));
        Assert.assertTrue(contactPage.email.getText().contains(karakter2));
    }


    @And("kullanici Subject alanina valid bir deger girer")
    public void kullaniciSubjectAlaninaValidBirDegerGirer() {
        contactPage.subject.click();
        contactPage.subject.sendKeys(faker.shakespeare().romeoAndJulietQuote());
        ReusableMethods.waitFor(2);
    }

    @Then("kullanici Subject alanina bir deger girilebildigini dogrular")
    public void kullaniciSubjectAlaninaBirDegerGirilebildiginiDogrular() {
    }

    @And("kullanici Message alanina valid bir deger girer")
    public void kullaniciMessageAlaninaValidBirDegerGirer() {
        contactPage.message.click();
        contactPage.message.sendKeys(faker.shakespeare().hamletQuote());
        ReusableMethods.waitFor(2);
    }

    @Then("kullanici Message alanina bir deger girilebildigini dogrular")
    public void kullaniciMessageAlaninaBirDegerGirilebildiginiDogrular() {
    }

    @And("kullanici Send Message butonuna tiklar")
    public void kullaniciSendMessageButonunaTiklar() {
        ReusableMethods.clickByJS(contactPage.sendMessage);
        ReusableMethods.waitFor(2);
    }

    @Then("kullanici Mesajin basarili bir sekilde gonderildigini dogrular")
    public void kullaniciMesajinBasariliBirSekildeGonderildiginiDogrular() {
        Assert.assertTrue(contactPage.successfully.isDisplayed());
    }

    @And("kullanici Your Name alanini bos birakir")
    public void kullaniciYourNameAlaniniBosBirakir() {
        contactPage.name.click();
        contactPage.name.sendKeys(Keys.TAB);
    }

    @Then("kullanici Mesajin gonderilemedigini dogrular")
    public void kullaniciMesajinGonderilemediginiDogrular() {
        Assert.assertTrue(contactPage.unsuccessfully.isDisplayed());
    }

    @And("kullanici Your Name alanina space karakteri girer")
    public void kullaniciYourNameAlaninaSpaceKarakteriGirer() {
        contactPage.name.click();
        contactPage.name.sendKeys(" ");
    }

    @And("kullanici Subject alanini bos birakir")
    public void kullaniciSubjectAlaniniBosBirakir() {
        contactPage.subject.click();
        contactPage.subject.sendKeys(Keys.TAB);
    }

    @And("kullanici Message alanini bos birakir")
    public void kullaniciMessageAlaniniBosBirakir() {
        contactPage.message.click();
        contactPage.message.sendKeys(Keys.TAB);
    }

    @And("kullanici Your Email alanini bos birakir")
    public void kullaniciYourEmailAlaniniBosBirakir() {
        contactPage.email.click();
        contactPage.email.sendKeys(Keys.TAB);
    }

    @And("kullanici Your Email alanina space ile baslayan bir deger girer")
    public void kullaniciYourEmailAlaninaSpaceIleBaslayanBirDegerGirer() {
        contactPage.email.click();
        contactPage.email.sendKeys(" "+ ReusableMethods.createEmail());
    }


    @And("kullanici Your Email alanina . icermeyen bir deger girer")
    public void kullaniciYourEmailAlaninaNoktaIcermeyenBirDegerGirer() {
        contactPage.email.click();
        contactPage.email.sendKeys(invalidEmail1);
    }

    @And("kullanici Your Email alanina @ icermeyen bir deger girer")
    public void kullaniciYourEmailAlaninaIcermeyenBirDegerGirer() {
        contactPage.email.click();
        contactPage.email.sendKeys(invalidEmail2);
    }

    @And("kullanici Your Email alanina {string} sonrasi bos deger girer")
    public void kullaniciYourEmailAlaninaSonrasiBosDegerGirer(String arg0) {
        contactPage.email.click();
        contactPage.email.sendKeys(invalidEmail3);
    }


}
