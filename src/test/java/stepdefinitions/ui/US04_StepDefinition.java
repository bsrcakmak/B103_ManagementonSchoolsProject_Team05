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
        ReusableMethods.waitFor(1);
    }
    @When("Birthday alanina veri girer")
    public void birthday_alanina_veri_girer() {
        int day = faker.number().numberBetween(1,31);
        int month = faker.number().numberBetween(1,12);
        int year = faker.number().numberBetween(1950,2005);
        String birthDate = day + "." + month + "." + year;
        deanManagementPage.birthdayBox.sendKeys(birthDate);
        ReusableMethods.waitFor(2);
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
        Assert.assertTrue(deanManagementPage.errorMessage.isDisplayed());
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
    // HATA MESAJI VERMELI ->BUG
    @And("Birth Place alanina space karakteri girer")
    public void birthPlaceAlaninaSpaceKarakteriGirer() {
        deanManagementPage.birthPlaceBox.click();
        deanManagementPage.birthPlaceBox.sendKeys("  ");
        ReusableMethods.waitFor(2);
    }


    //  ------------    TC08   ---------------
    @Then("Dogum tarihi icin hata mesaji goruntulendigini dogrular")
    public void dogumTarihiIcinHataMesajiGoruntulendiginiDogrular() {
        Assert.assertTrue(deanManagementPage.birthDateRequired.isDisplayed());
    }


    //  ------------    TC09   ---------------
    @Then("Telefon icin hata mesaji goruntulendigini dogrular")
    public void telefonIcinHataMesajiGoruntulendiginiDogrular() {
        Assert.assertTrue(deanManagementPage.phoneRequired.isDisplayed());
    }


    //  ------------    TC10  ---------------
    @Then("Ssn altinda Required mesaji goruntulendigini dogrular")
    public void ssnAltindaRequiredMesajiGoruntulendiginiDogrular() {
        Assert.assertTrue(deanManagementPage.ssnRequired.isDisplayed());
    }



    //  ------------    TC11   ---------------
    @And("Ssn alaninda {int}. karakteri hatali girer") //123432-2343
    public void ssnAlanindaKarakteriHataliGirer1(int num) { //SSN 3. rakamdan sonra - içermeli
        deanManagementPage.ssnBox.click();
        deanManagementPage.ssnBox.sendKeys(faker.number().digits(num)+
                                            faker.number().digits(3)+"-"+
                                            faker.number().digits(4));
    }
    @Then("Ssn icin Hata mesaji goruntulendigini dogrular")
    public void ssnIcinHataMesajiGoruntulendiginiDogrular() {
        Assert.assertTrue(deanManagementPage.errorMessage.isDisplayed());
    }



    //  ------------    TC12   ---------------
    @And("Ssn alaninda {int}. karakteri hatali  girer") //123-432343
    public void ssnAlanindaKarakteriHataliGirer2(int num) { //SSN 5. rakamdan sonra - içermeli
        deanManagementPage.ssnBox.click();
        deanManagementPage.ssnBox.sendKeys(faker.number().digits(3)+"-"+
                                            faker.number().digits(num+1));
    }


    //  ------------    TC13   ---------------
    @And("Ssn alanina eksik veri girer")
    public void ssnAlaninaEksikVeriGirer() {
        deanManagementPage.ssnBox.sendKeys(faker.number().digits(3)+"-"+
                                            faker.number().digits(2)+"-"+
                                            faker.number().digits(3));
    }
    @Then("Ssn altinda uyari mesaji goruntulendigini dogrular")
    public void ssnAltindaUyariMesajiGoruntulendiginiDogrular() {
        String  expected = "Minimum 11 character (XXX-XX-XXXX)";
        Assert.assertEquals(expected,deanManagementPage.ssnAlert.getText());
    }


    //  ------------    TC14    ---------------
    @Then("Onay mesajinin goruntulendigini dogrular")
    public void onayMesajininGoruntulendiginiDogrular() {
        ReusableMethods.waitFor(2);
        Assert.assertEquals("Dean Saved",deanManagementPage.popUpMessage.getText());
    }


    //  ------------    TC15   ---------------
    @And("User Name alanina tiklar")
    public void userNameAlaninaTiklar() {
        deanManagementPage.usernameBox.click();
    }
    @Then("User Name altinda Required uyarisinin goruntulendigini dogrular")
    public void userNameAltindaRequiredUyarisininGoruntulendiginiDogrular() {
        Assert.assertTrue(deanManagementPage.userNameRequired.isDisplayed());
        ReusableMethods.waitFor(2);
    }


    //  ------------    TC16    ---------------
    // HATA MESAJI VERMELI ->BUG
    @And("User Name alanina space karakteri girer")
    public void userNameAlaninaSpaceKarakteriGirer() {
        deanManagementPage.usernameBox.click();
        deanManagementPage.usernameBox.sendKeys(" ");
        ReusableMethods.waitFor(3);
    }


    //  ------------    TC17   ---------------
    @And("Password alanina {int} karakter girer")
    public void passwordAlaninaKarakterGirer(int num) {
        deanManagementPage.passwordBox.click();
        deanManagementPage.passwordBox.sendKeys(faker.number().digits(num));
    }
    @Then("Password icin hata mesaji goruntulendigini dogrular")
    public void passwordIcinHataMesajiGoruntulendiginiDogrular() {
        String expected = "Minimum 8 character";
        Assert.assertEquals(expected,deanManagementPage.passwordAlert.getText());
        ReusableMethods.waitFor(2);
    }


    //  ------------    TC18   ---------------
    @Then("Password altinda hata mesaji goruntulendigini dogrular")
    public void passwordAltindaHataMesajiGoruntulendiginiDogrular() {
        Assert.assertTrue(deanManagementPage.passwordRequired.isDisplayed());
        ReusableMethods.waitFor(2);
    }
}
