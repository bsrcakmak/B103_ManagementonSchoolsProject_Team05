package stepdefinitions.ui;


import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DeanManagementPage;
import pages.HomePage;
import pages.MainMenuPanel;
import utilities.ReusableMethods;

public class US06_StepDefinition {
    MainMenuPanel mainMenuPanel = new MainMenuPanel();
    HomePage homePage = new HomePage();
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    Faker faker = new Faker();
    public static String bos = "";


    @Given("Name alani bos birakilir")
    public void nameAlaniBosBirakilir() {
        deanManagementPage.nameBox.sendKeys(bos, Keys.TAB);
        ReusableMethods.waitFor(2);
        assert deanManagementPage.nameRequired.getText().contains("Required");
        ReusableMethods.waitFor(2);
    }
    @Given("Surname alanini bos birakir")
    public void surnameAlaniniBosBirakir() {
        deanManagementPage.surnameBox.sendKeys(bos,Keys.TAB);
        ReusableMethods.waitFor(2);
        assert deanManagementPage.surnameRequired.getText().contains("Required");
        ReusableMethods.waitFor(2);
    }
    @Given("Birth_Place alani  bos birakilir")
    public void birth_placeAlaniBosBirakilir() {
        deanManagementPage.birthPlaceBox.sendKeys(bos,Keys.TAB);
        ReusableMethods.waitFor(2);
        assert deanManagementPage.birthPlaceRequired.getText().contains("Required");
        ReusableMethods.waitFor(2);
    }
    @Given("Date Of Birth alani bos birakilir")
    public void dateOfBirthAlaniBosBirakilir() {
        deanManagementPage.birthdayBox.sendKeys(bos,Keys.TAB);
        ReusableMethods.waitFor(2);
        assert deanManagementPage.birthPlaceRequired.getText().contains("Required");
        ReusableMethods.waitFor(2);
    }
    @Given("Phone_Number alani bos olarak birakilir")
    public void phone_numberAlaniBosOlarakBirakilir() {
        deanManagementPage.phoneNumberBox.sendKeys(bos,Keys.TAB);
        ReusableMethods.waitFor(2);
        assert deanManagementPage.phoneRequired.getText().contains("Required");
        ReusableMethods.waitFor(2);
    }
    @Given("SSN alanini bos birakilir")
    public void ssnAlaniniBosBirakilir() {
        deanManagementPage.ssnBox.sendKeys(bos,Keys.TAB);
        ReusableMethods.waitFor(2);
        assert deanManagementPage.ssnRequired.getText().contains("Required");
        ReusableMethods.waitFor(2);
    }

    @Then("Dean Gender bolumunde gecerli bir secim yapilir")
    public void deanGenderBolumundeGecerliBirSecimYapilir() {
        deanManagementPage.genderMale.click();

    }
    @Then("Date Of Birth kutusuna bir deger girilir")
    public void dateOfBirthKutusunaBirDegerGirilir() {
        deanManagementPage.birthdayBox.sendKeys(ReusableMethods.createDateOfBirth());

    }
    @Given("Ssn alanina ucuncü rakamdan sonra - isareti koymadan Ssn numarasi girer.")
    public void ssn_alanina_ucuncü_rakamdan_sonra_isareti_koymadan_ssn_numarasi_girer() {
        deanManagementPage.phoneNumberBox.sendKeys(faker.number().digits(4));
        ReusableMethods.waitFor(1);
        Assert.assertTrue(deanManagementPage.ssnRequired.isDisplayed());

    }
    @Given("Ssn alanina besinci rakamdan sonra - isareti koymadan Ssn numarasi girer.")
    public void ssn_alanina_besinci_rakamdan_sonra_isareti_koymadan_ssn_numarasi_girer() {
        deanManagementPage.phoneNumberBox.sendKeys(faker.number().digits(6));
        ReusableMethods.waitFor(1);
        Assert.assertTrue(deanManagementPage.ssnRequired.isDisplayed());
    }
    @Given("User name alanini bos birakilir")
    public void userNameAlaniniBosBirakilir() {
        deanManagementPage.usernameBox.sendKeys(bos,Keys.TAB);
        ReusableMethods.waitFor(2);
        assert deanManagementPage.userNameRequired.getText().contains("Required");
        ReusableMethods.waitFor(2);
    }
    @Given("Password alanini bos birakilir")
    public void passwordAlaniniBosBirakilir() {
        deanManagementPage.passwordBox.sendKeys(bos,Keys.TAB);
        ReusableMethods.waitFor(2);
        assert deanManagementPage.passwordRequired.getText().contains("Required");
        ReusableMethods.waitFor(2);
    }

    @Given("Password alanina yedi karakterden az bir deger girer")
    public void password_alanina_yedi_karakterden_az_bir_deger_girer() {
    deanManagementPage.passwordBox.sendKeys(faker.number().digits(6));
        ReusableMethods.waitFor(1);
        Assert.assertTrue(deanManagementPage.passwordAlert.isDisplayed());
    }
    @Given("Password alanina yedi karakterli bir deger girer")
    public void passwordAlaninaYediKarakterliBirDegerGirer() {
        deanManagementPage.passwordBox.sendKeys(faker.number().digits(7));
        ReusableMethods.waitFor(1);
        Assert.assertTrue(deanManagementPage.passwordAlert.isDisplayed());
    }

    @And("Logout islemi gerceklestirilir")
    public void logoutIslemiGerceklestirilir() {
     homePage.menuButton.click();
     mainMenuPanel.logoutButton.click();
    }

}
