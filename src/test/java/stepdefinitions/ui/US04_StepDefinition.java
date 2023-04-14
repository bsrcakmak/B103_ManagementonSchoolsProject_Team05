package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.DeanManagementPage;
import pages.HomePage;
import pages.MainMenuPanel;
import utilities.Driver;
import utilities.ReusableMethods;


public class US04_StepDefinition {
    HomePage homePage = new HomePage();
    MainMenuPanel mainMenuPanel = new MainMenuPanel();
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    Faker faker = new Faker();

//    @And("Menu butonuna tiklar")
//    public void menu_butonuna_tiklar() {
//        homePage.menuButton.click();
//    }

    @Then("Acilan bolumden Dean Management'a tiklar")
    public void acilan_bolumden_dean_management_a_tiklar() {
        mainMenuPanel.deanManagementButton.click();
    }

    //  ------------    TC01   ---------------
    @Then("Name alanina tiklar")
    public void name_alanina_tiklar() {
        deanManagementPage.nameBox.click();
    }
    @Then("Name altinda Required uyarisinin goruntulendigini dogrular")
    public void nameAltindaRequiredUyarisininGoruntulendiginiDogrular() {
        Assert.assertTrue(deanManagementPage.nameRequired.isDisplayed());
    }
    @And("{int} sn bekler")
    public void snBekler(int sn) {
        ReusableMethods.waitFor(sn);
    }
    @And("Surname alanina tiklar")
    public void surnameAlaninaTiklar() {
        deanManagementPage.surnameBox.click();
    }

    //  ------------    TC02   ---------------
    // HATA MESAJI VERMEDI ->BUG
    @When("Name alanina space karakteri girer")
    public void name_alanina_space_karakteri_girer() {
        deanManagementPage.nameBox.click();
        deanManagementPage.nameBox.sendKeys(" ");
    }
    @When("Surname alanina veri girer")
    public void surname_alanina_veri_girer() {
        deanManagementPage.surnameBox.click();
        deanManagementPage.surnameBox.sendKeys(faker.name().firstName());
    }
    @When("Birth Place alanina veri girer")
    public void birth_place_alanina_veri_girer() {
        deanManagementPage.birthPlaceBox.click();
        deanManagementPage.birthPlaceBox.sendKeys(faker.address().city());
    }
    @When("Cinsiyet secer")
    public void cinsiyet_secer() {
        deanManagementPage.genderFemale.click();
    }
    @When("Birthday alanina veri girer")
    public void birthday_alanina_veri_girer() {
        int birthDate = faker.number().numberBetween(1,31)+
                        faker.number().numberBetween(1,12)+
                        faker.number().numberBetween(1930,2005);
        String birthDateString = Integer.toString(birthDate);

        deanManagementPage.birthdayBox.sendKeys(birthDateString);
    }
    @When("Phone alanina veri girer")
    public void phone_alanina_veri_girer() {
        deanManagementPage.phoneNumberBox.sendKeys(faker.number().digits(3)+"-"+
                                                    faker.number().digits(3)+"-"+
                                                    faker.number().digits(4));
    }
    @When("Ssn alanina veri girer")
    public void ssn_alanina_veri_girer() {
        deanManagementPage.ssnBox.sendKeys(faker.number().digits(3)+"-"+
                                            faker.number().digits(2)+"-"+
                                            faker.number().digits(4));
    }
    @When("User Name alanina veri girer")
    public void user_name_alanina_veri_girer() {
        deanManagementPage.usernameBox.sendKeys(faker.name().username());
    }
    @When("Password alanina veri girer")
    public void password_alanina_veri_girer() {
        deanManagementPage.passwordBox.sendKeys(faker.number().digits(8));
    }
    @When("Submit butonuna tiklar")
    public void submit_butonuna_tiklar() {
        deanManagementPage.submitButton.click();
    }
    @Then("Hata mesaji goruntulendigini dogrular")
    public void hata_mesaji_goruntulendigini_dogrular() {
        String actual = deanManagementPage.popUpMessage.getText();
        Assert.assertEquals("Error",actual);
    }

    //  ------------    TC03   ---------------
    @Then("Surname altinda Required uyarisinin goruntulendigini dogrular")
    public void surnameAltindaRequiredUyarisininGoruntulendiginiDogrular() {
        Assert.assertTrue(deanManagementPage.surnameRequired.isDisplayed());
    }

    //  ------------    TC04   ---------------
    // HATA MESAJI VERMEDI ->BUG

    @And("Name alanina veri girer")
    public void nameAlaninaVeriGirer() {
        deanManagementPage.nameBox.click();
        deanManagementPage.nameBox.sendKeys(faker.name().firstName());
    }
    @And("Surname alanina space karakteri girer")
    public void surnameAlaninaSpaceKarakteriGirer() {
        deanManagementPage.surnameBox.click();
        deanManagementPage.surnameBox.sendKeys(" ");

    }

    //  ------------    TC05   ---------------
    @And("Birth Place alanina tiklar")
    public void birthPlaceAlaninaTiklar() {
        deanManagementPage.birthPlaceBox.click();

    }
    @Then("Birth Place altinda Required uyarisinin goruntulendigini dogrular")
    public void birthPlaceAltindaRequiredUyarisininGoruntulendiginiDogrular() {
        Assert.assertTrue(deanManagementPage.birthPlaceRequired.isDisplayed());
    }

    //  ------------    TC06   ---------------
    // HATA MESAJI VERMEDI ->BUG
    @And("Birth Place alanina space karakteri girer")
    public void birthPlaceAlaninaSpaceKarakteriGirer() {
        deanManagementPage.birthPlaceRequired.sendKeys(" ");
    }



}
