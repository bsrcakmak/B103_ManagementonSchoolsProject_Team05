package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.ViceDeanManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TeacherManagementStepDefinition {

    ViceDeanManagementPage viceDeanManagementPage = new ViceDeanManagementPage();
    Faker faker;

    @When("Menu butonuna tiklar")
    public void menu_butonuna_tiklar() {
        viceDeanManagementPage.menuButton.click();
    }

    @When("Teacher Management'a tiklar")
    public void teacher_management_a_tiklar() {
        viceDeanManagementPage.teacherManagement.click();
    }

    @When("Ogretmenin girecegi ders {string} olarak secilir")
    public void ogretmenin_girecegi_ders_olarak_secilir(String ders) {
        Driver.waitForPageToLoad(5);
        viceDeanManagementPage.chooseLessons.click();
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN).build().perform();
        ReusableMethods.waitFor(2);
        action.sendKeys(Keys.ENTER).build().perform();
    }

    @When("Name {string} olarak girilir")
    public void name_olarak_girilir(String name) {
        faker = new Faker();
        String firstName = faker.name().firstName();
        viceDeanManagementPage.nameBox.sendKeys(firstName + Keys.ENTER);
    }

    @When("Surname {string} olarak girilir")
    public void surname_olarak_girilir(String arg0) {
        faker = new Faker();
        String surname = faker.name().lastName();
        viceDeanManagementPage.surnameBox.sendKeys(surname + Keys.ENTER);
    }

    @When("birt place {string} olarak girilir")
    public void birt_place_olarak_girilir(String arg0) {
        faker = new Faker();
        String birthPlace = faker.address().city();
        viceDeanManagementPage.birthPlaceBox.sendKeys(birthPlace + Keys.ENTER);
    }

    @When("Email {string} olarak girilir")
    public void email_olarak_girilir(String arg0) {
        faker = new Faker();
        String email = faker.internet().emailAddress();
        viceDeanManagementPage.emailbox.sendKeys(email);
    }

    @When("Phone number {string} olarak girilir")
    public void phone_number_olarak_girilir(String arg0) {
        faker = new Faker();
        String number = faker.number().digits(10);
        String number01 = number.substring(0, 3);
        String number02 = number.substring(3, 6);
        String number03 = number.substring(6);
        String phoneNumber = number01 + "-" + number02 + "-" + number03;
        viceDeanManagementPage.phoneNumberBox.sendKeys(phoneNumber);
    }

    @When("Gender female secilir")
    public void gender_female_secilir() {
        viceDeanManagementPage.genderFemale.click();
    }

    @When("Date of Birth {string} olarak girilir")
    public void date_of_birth_olarak_girilir(String arg0) {
        faker = new Faker();
        int number = faker.number().numberBetween(1, 31);
        int number02 = faker.number().numberBetween(1, 12);
        int number03 = faker.number().numberBetween(1950, 2010);
        String str = " " + number + "." + number02 + "." + number03;
        String dateofbirth = str.trim();
        viceDeanManagementPage.birthdayBox.sendKeys(dateofbirth + Keys.ENTER);
    }

    @When("Ssn {string} olarak girilir")
    public void ssn_olarak_girilir(String arg0) {
        faker = new Faker();
        String ssn = faker.number().digits(9);
        String ssn01 = ssn.substring(0, 3);
        String ssn02 = ssn.substring(3, 5);
        String ssn03 = ssn.substring(5);
        String ssnA = ssn01 + "-" + ssn02 + "-" + ssn03;
        viceDeanManagementPage.ssnBox.sendKeys(ssnA);
    }

    @When("User Name {string} olarak  girer")
    public void user_name_olarak_girer(String arg0) {
        faker = new Faker();
        String username = faker.name().username();
        viceDeanManagementPage.usernameBox.sendKeys(username + Keys.ENTER);
    }

    @When("Password {string} olarak girer")
    public void password_olarak_girer(String arg0) {
        faker = new Faker();
        String password = faker.internet().password();
        viceDeanManagementPage.passwordBox.sendKeys(password);
    }

    @When("Submit tiklanir")
    public void submit_tiklanir() {
        ReusableMethods.waitForClickability(viceDeanManagementPage.submitButton, 5);
        viceDeanManagementPage.submitButton.click();
    }

    @Then("Islemin gerceklestigine dair popUp mesajini goruntuler")
    public void ıslemin_gerceklestigine_dair_pop_up_mesajini_goruntuler() {
        ReusableMethods.waitForVisibility(viceDeanManagementPage.SuccessfullSaving, 15);
        Assert.assertTrue(viceDeanManagementPage.SuccessfullSaving.isDisplayed());
    }

    @Then("Ders secim alani bos birakildigi icin hata mesaji alir")
    public void dersSecimAlaniBosBirakildigiIcinHataMesajiAlir() {
        ReusableMethods.waitForVisibility(viceDeanManagementPage.alertChooseLesson, 15);
        Assert.assertTrue(viceDeanManagementPage.alertChooseLesson.isDisplayed());
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int wait) {
        ReusableMethods.waitFor(wait);
    }

    @And("Choose Lessons kismindan secili dersi siler.")
    public void chooseLessonsKismindanSeciliDersiSiler() {
        viceDeanManagementPage.chooseLessons.click();
        Actions action = new Actions(Driver.getDriver());
        ReusableMethods.waitFor(2);
        action.sendKeys(Keys.DELETE).build().perform();
    }

    @And("Ogretmenin girecegi ders  tekrar {string} olarak secilir")
    public void ogretmeninGirecegiDersTekrarOlarakSecilir(String ders) {
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(ders).build().perform();
        ReusableMethods.waitFor(2);
        action.sendKeys(Keys.ENTER).build().perform();
    }

    @And("Name bos olarak birakilir")
    public void nameBosOlarakBirakilir() {
        viceDeanManagementPage.nameBox.click();
    }

    @Then("Name_bolumunun_altinda_{string}_yazisinin_oldugunu_dogrular")
    public void _bolumunun_altinda__yazisinin_oldugunu_dogrular(String arg0) {
        String expecteddata = arg0;
        String actualdata = viceDeanManagementPage.RequiredTextforName.getText();
        Assert.assertEquals(expecteddata, actualdata);
    }

    @And("Sayfayi Submit butonu gorulecek sekilde asagi kaydirir.")
    public void sayfayiAsagiKaydirir() {
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).build().perform();
    }

    @Then("Hata mesajini goruntuler.")
    public void hataMesajiniGoruntuler() {
        ReusableMethods.waitForVisibility(viceDeanManagementPage.alertChooseLesson, 15);
        Assert.assertTrue(viceDeanManagementPage.alertChooseLesson.isDisplayed());
    }

    @And("Name alanina {string} karakteri girilir.")
    public void nameAlaninaKarakteriGirilir(String arg0) {
        viceDeanManagementPage.nameBox.click();
        viceDeanManagementPage.nameBox.sendKeys(arg0 + Keys.ENTER);
    }

    @And("Surname bos olarak birakilir")
    public void surnameBosOlarakBirakilir() {
        viceDeanManagementPage.surnameBox.click();
    }

    @Then("Surname_bolumunun_altinda_{string}_yazisinin_oldugunu_dogrular")
    public void surname_bolumunun_altinda__yazisinin_oldugunu_dogrular(String arg0) {
        String expecteddata = arg0;
        String actualdata = viceDeanManagementPage.RequiredTextforSurname.getText();
        Assert.assertEquals(expecteddata, actualdata);
    }

    @And("Surname alanina {string} karakteri girilir.")
    public void surnameAlaninaKarakteriGirilir(String arg0) {
        viceDeanManagementPage.surnameBox.click();
        viceDeanManagementPage.surnameBox.sendKeys(arg0 + Keys.ENTER);
    }

    @And("Birth_Place bos olarak birakilir")
    public void birth_placeBosOlarakBirakilir() {
        viceDeanManagementPage.birthPlaceBox.click();
    }

    @Then("Birth_Place_bolumunun_altinda_{string}_yazisinin_oldugunu_dogrular")
    public void birth_place_bolumunun_altinda__yazisinin_oldugunu_dogrular(String arg0) {
        String expecteddata = arg0;
        String actualdata = viceDeanManagementPage.RequiredTextforBirthPlace.getText();
        Assert.assertEquals(expecteddata, actualdata);
    }

    @And("BirthPlace alanina {string} karakteri girilir")
    public void birthPlaceAlaninaKarakteriGirilir(String arg0) {
        viceDeanManagementPage.birthPlaceBox.click();
        viceDeanManagementPage.birthPlaceBox.sendKeys(arg0 + Keys.ENTER);
    }

    @And("Email bos olarak birakilir")
    public void emailBosOlarakBirakilir() {
        viceDeanManagementPage.emailbox.click();
    }

    @Then("Email_bolumunun_altinda_{string}_yazisinin_oldugunu_dogrular")
    public void email_bolumunun_altinda__yazisinin_oldugunu_dogrular(String arg0) {
        String expecteddata = arg0;
        String actualdata = viceDeanManagementPage.RequiredTextforEmail.getText();
        Assert.assertEquals(expecteddata, actualdata);
    }

    @And("Email alanina _abc_ formatinda email karakteri girilir")
    public void emailAlanina_Abc_FormatindaEmailKarakteriGirilir() {
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.TAB).build().perform();
        ReusableMethods.waitFor(2);
        Faker faker = new Faker();
        String name = faker.name().firstName();
        viceDeanManagementPage.emailbox.click();
        viceDeanManagementPage.emailbox.sendKeys(name);
    }

    @And("Email alanina _abc@_ formatinda email karakteri girilir")
    public void emailAlanina_abc_FormatindaEmailKarakteriGirilir() {
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.TAB).build().perform();
        ReusableMethods.waitFor(2);
        Faker faker = new Faker();
        String str = faker.name().firstName();
        String name = str + "@";
        ReusableMethods.waitForClickability(viceDeanManagementPage.emailbox, 5);
        viceDeanManagementPage.emailbox.click();
        viceDeanManagementPage.emailbox.sendKeys(name);
    }

    @And("Email alanina _abc@gmail_ formatinda email karakteri girilir")
    public void emailAlanina_abcGmail_FormatindaEmailKarakteriGirilir() {
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.TAB).build().perform();
        ReusableMethods.waitFor(2);
        Faker faker = new Faker();
        String str = faker.name().firstName();
        String name = str + "@" + "gmail";
        ReusableMethods.waitForClickability(viceDeanManagementPage.emailbox, 5);
        viceDeanManagementPage.emailbox.click();
        viceDeanManagementPage.emailbox.sendKeys(name);
    }

    @And("Email alanina _abc.com_ formatinda email karakteri girilir")
    public void emailAlanina_abcCom_FormatindaEmailKarakteriGirilir() {
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.TAB).build().perform();
        ReusableMethods.waitFor(2);
        Faker faker = new Faker();
        String str = faker.name().firstName();
        String name = str + "." + "com";
        ReusableMethods.waitForClickability(viceDeanManagementPage.emailbox, 5);
        viceDeanManagementPage.emailbox.click();
        viceDeanManagementPage.emailbox.sendKeys(name);
    }

    @And("Email alanina _abc@abc_ formatinda email karakteri girilir")
    public void emailAlanina_abcAbc_FormatindaEmailKarakteriGirilir() {
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.TAB).build().perform();
        ReusableMethods.waitFor(2);
        Faker faker = new Faker();
        String str = faker.name().firstName();
        String str02 = faker.name().lastName();
        String name = str + "@" + str02;
        ReusableMethods.waitForClickability(viceDeanManagementPage.emailbox, 5);
        viceDeanManagementPage.emailbox.click();
        viceDeanManagementPage.emailbox.sendKeys(name);
    }

    @And("Email alanina _abc@com_ formatinda email karakteri girilir")
    public void EmailAlanina_abcCom_FormatindaEmailKarakteriGirilir() {
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.TAB).build().perform();
        ReusableMethods.waitFor(2);
        Faker faker = new Faker();
        String str = faker.name().firstName();
        String str02 = faker.name().lastName();
        String name = str + "@" + "com";
        ReusableMethods.waitForClickability(viceDeanManagementPage.emailbox, 5);
        viceDeanManagementPage.emailbox.click();
        viceDeanManagementPage.emailbox.sendKeys(name);
    }

    @And("Email alanina _sembollervesayilar_ formatinda email karakteri girilir")
    public void emailAlanina_sembollervesayilar_FormatindaEmailKarakteriGirilir() {
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.TAB).build().perform();
        String str = "7-=*+785///}{458/*";
        ReusableMethods.waitForClickability(viceDeanManagementPage.emailbox, 5);
        viceDeanManagementPage.emailbox.click();
        viceDeanManagementPage.emailbox.sendKeys(str);
    }

    @And("Phone_Number bos olarak birakilir")
    public void phone_numberBosOlarakBirakilir() {
        viceDeanManagementPage.phoneNumberBox.click();
    }

    @Then("Phone_Number_bolumunun_altinda_{string}_yazisinin_oldugunu_dogrular")
    public void phone_number_bolumunun_altinda__yazisinin_oldugunu_dogrular(String arg0) {
        String expecteddata = arg0;
        String actualdata = viceDeanManagementPage.RequiredTextforPhoneNumber.getText();
        Assert.assertEquals(expecteddata, actualdata);

    }

    @And("Phone number alanina formata uygun {string} girer")
    public void phoneNumberAlaninaFormataUygunGirer(String arg0) {
        viceDeanManagementPage.phoneNumberBox.click();
        viceDeanManagementPage.phoneNumberBox.sendKeys(arg0);
    }

    @Then("Phone number bolumunun_altinda_{string}_yazisinin_oldugunu_dogrular")
    public void phoneNumberBolumunun_altinda__yazisinin_oldugunu_dogrular(String arg0) {
        String expectedData = arg0;
        String actualData = viceDeanManagementPage.MinimumCharacterTextforPhoneNumber.getText();
        Assert.assertTrue(actualData.contains(expectedData));
    }

    @And("{string} secenegini isaretler")
    public void isAdvisorTeacherSeceneginiIsaretler(String arg0) {
        viceDeanManagementPage.isAdvisorTeacherCheckBox.click();
    }

}