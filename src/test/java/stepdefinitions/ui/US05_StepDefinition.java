package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DeanManagementPage;
import pages.HomePage;
import pages.MainMenuPanel;
import utilities.Driver;
import utilities.ReusableMethods;

public class US05_StepDefinition {
    HomePage homePage = new HomePage();
    MainMenuPanel mainMenuPanel = new MainMenuPanel();
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();


    //  ------------    TC01   ---------------
    @Then("Dean'lerin Name bilgilerinin gorunur oldugunu dogrular")
    public void dean_lerin_name_bilgilerinin_gorunur_oldugunu_dogrular() {
        ReusableMethods.scrollIntoViewJS(deanManagementPage.editButton);
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).build().perform();
        Assert.assertTrue(deanManagementPage.firstName.isDisplayed());
        ReusableMethods.waitFor(2);
    }


    //  ------------    TC02   ---------------
    @Then("Dean'lerin Gender bilgilerinin gorunur oldugunu dogrular")
    public void deanLerinGenderBilgilerininGorunurOldugunuDogrular() {
        ReusableMethods.waitForClickablility(deanManagementPage.firstName,5);
        ReusableMethods.scrollIntoViewJS(deanManagementPage.editButton);
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).build().perform();
        Assert.assertTrue(deanManagementPage.firstGender.isDisplayed());
        ReusableMethods.waitFor(2);

    }


    //  ------------    TC03   ---------------
    @Then("Dean'lerin Phone Number bilgilerinin gorunur oldugunu dogrular")
    public void deanLerinPhoneNumberBilgilerininGorunurOldugunuDogrular() {
        ReusableMethods.waitForClickablility(deanManagementPage.firstName,5);
        ReusableMethods.scrollIntoViewJS(deanManagementPage.editButton);
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).build().perform();
        Assert.assertTrue(deanManagementPage.firstPhone.isDisplayed());
        ReusableMethods.waitFor(2);
    }


    //  ------------    TC04   ---------------
    @Then("Dean'lerin SSN bilgilerinin gorunur oldugunu dogrular")
    public void deanLerinSSNBilgilerininGorunurOldugunuDogrular() {
        ReusableMethods.waitForClickablility(deanManagementPage.firstName,5);
        ReusableMethods.scrollIntoViewJS(deanManagementPage.editButton);
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).build().perform();
        Assert.assertTrue(deanManagementPage.firstSsn.isDisplayed());
        ReusableMethods.waitFor(2);

    }


    //  ------------    TC05   ---------------
    @Then("Dean'lerin User Name bilgilerinin gorunur oldugunu dogrular")
    public void deanLerinUserNameBilgilerininGorunurOldugunuDogrular() {
        ReusableMethods.waitForClickablility(deanManagementPage.firstName,5);
        ReusableMethods.scrollIntoViewJS(deanManagementPage.editButton);
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).build().perform();
        Assert.assertTrue(deanManagementPage.firstUserName.isDisplayed());
        ReusableMethods.waitFor(2);

    }


    //  ------------    TC06   ---------------

    @And("Silme butonuna tiklar")
    public void silmeButonunaTiklar() {
        ReusableMethods.waitForClickablility(deanManagementPage.firstName,5);
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).build().perform();
        Assert.assertTrue(deanManagementPage.deleteButton.isDisplayed());
        deanManagementPage.deleteButton.click();
        ReusableMethods.waitFor(2);
    }
    @Then("Dean'in silindigini dogrular")
    public void deanInSilindiginiDogrular() {
        //delete butonu yok onceki step hata verecegi icin calismaz
    }


    //  ------------    TC07   --------------- //hatali
    @And("Guncellemek istenen Dean'nin Edit butonuna tiklar")
    public void guncellemekIstenenDeanNinEditButonunaTiklar() {
        ReusableMethods.waitForClickablility(deanManagementPage.firstName,5);
        ReusableMethods.scrollIntoViewJS(deanManagementPage.editButton);
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).build().perform();
        ReusableMethods.waitForClickablility(deanManagementPage.editButton,10);
        deanManagementPage.editButton.click();
        ReusableMethods.waitFor(2);
    }
    @And("Edit penceresindeki Name alanina veri girer")
    public void editPenceresindekiNameAlaninaVeriGirer() {
        ReusableMethods.waitForClickablility(deanManagementPage.editNameBox,5);
        deanManagementPage.editNameBox.click();
        deanManagementPage.editNameBox.sendKeys(faker.name().firstName());
    }

    @And("Edit penceresindeki Submit butonuna tiklar")
    public void editPenceresindekiSubmitButonunaTiklar() {
        ReusableMethods.waitForClickablility(deanManagementPage.editSubmitButton,10);
        deanManagementPage.editSubmitButton.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(deanManagementPage.popUpMessage.isDisplayed());
    }
    @And("Edit penceresini kapatir")
    public void editPenceresiniKapatir() {
        deanManagementPage.closeButton.click();
        ReusableMethods.waitFor(2);
    }
    @Then("Dean'in Name bilgisinin guncellendigini dogrular")
    public void deanInNameBilgisininGuncellendiginiDogrular() {
        //onceki step hata verecegi icin calismaz
    }


}
