package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.AddStudentPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US25_StepDefinition {
    AddStudentPage addStudent = new AddStudentPage();
    public static Faker faker = new Faker();
    public static String numberUcHane = faker.phoneNumber().subscriberNumber(3);
    public static String numberDortHane = faker.phoneNumber().subscriberNumber(4);
    public static String numberBesHane = faker.phoneNumber().subscriberNumber(5);
    public static int number1 = faker.number().numberBetween(1, 31);
    public static int number2 = faker.number().numberBetween(1, 12);
    public static int number3 = faker.number().numberBetween(1980, 2016);
    public static String araFormat = "-";
    public static String hic = "";
    public static String nokta = ".";
    public static String space = " ";
    Select select;

    @Given("Admin ana sayfada login yapar")
    public void adminAnaSayfadaLoginYapar() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.login("adminUsername", "adminPassword");
    }

    @Given("Menu butonuna tiklar")
    public void menu_butonuna_tiklar() {
        addStudent.menuu.click();
    }

    @Given("Acilan pencereden Student Management secer")
    public void acilan_pencereden_student_management_secer() {
        addStudent.studentManagement.click();
    }

    @Given("Add Student basliginda Choose Advisor Teacher secer")
    public void add_student_basliginda_choose_advisor_teacher_secer() {
        select = new Select(addStudent.chooseAdvisor);
        select.selectByVisibleText(ConfigReader.getProperty("advisor"));
        //ReusableMethods.selectFromDropdownByIndex(addStudent.chooseAdvisor, 6);
    }

    @Given("Name alanina valid deger girer")
    public void name_alanina_valid_deger_girer() {
        ReusableMethods.waitFor(1);
        addStudent.namee.sendKeys(faker.name().firstName());
    }

    @Given("Surname alanina valid deger girer")
    public void surname_alanina_valid_deger_girer() {
        ReusableMethods.waitFor(1);
        addStudent.surName.sendKeys(faker.name().lastName());
    }

    @Given("Birth Place Alanina valid deger girer")
    public void birth_place_alanina_valid_deger_girer() {
        addStudent.birthPlace.sendKeys(faker.country().capital());
    }

    @Given("Email alanina valid email girer")
    public void email_alanina_valid_email_girer() {
        addStudent.eMail.sendKeys(faker.internet().emailAddress());
    }

    @Given("Phone Alanina valid phone number girer")
    public void phone_alanina_valid_phone_number_girer() {
        String str = space + numberUcHane + araFormat + numberUcHane + araFormat + numberDortHane;
        String phoneNumber = str.trim();
        addStudent.phoneNumber.sendKeys(phoneNumber);
    }

    @Given("Gender Secer")
    public void gender_secer() {
        addStudent.genderMale.click();
    }

    @Given("Date Of Birth Alanina dogum tarihini girer")
    public void date_of_birth_alanina_dogum_tarihini_girer() {
        String str = hic + number1 + nokta + number2 + nokta + number3;
        String dateOfBirth = str.trim();
        addStudent.dateOfBirth.sendKeys(dateOfBirth);
    }

    @Given("Ssn alanina valid deger girer")
    public void ssn_alanina_valid_deger_girer() {
        addStudent.snn.sendKeys(faker.idNumber().ssnValid());
    }

    @Given("User Name Alanina valid deger girer")
    public void user_name_alanina_valid_deger_girer() {
        addStudent.userName.sendKeys(faker.name().username());
    }

    @Given("Father Name Alanina valid deger girer")
    public void father_name_alanina_valid_deger_girer() {
        addStudent.fatherName.sendKeys(faker.name().firstName());
    }

    @Given("Mother Name Alanina valid deger girer")
    public void mother_name_alanina_valid_deger_girer() {
        addStudent.motherName.sendKeys(faker.name().firstName());
    }

    @And("Password alanina en az sekiz karakterden olusan valid deger girer")
    public void passwordAlaninaEnAzSekizKarakterdenOlusanValidDegerGirer() {
        addStudent.passwordArea.sendKeys(ConfigReader.getProperty("adminPassword"));
    }

    @Given("Submit butonuna tiklar")
    public void submit_butonuna_tiklar() {
        addStudent.submitButton.click();
    }

    @Then("Student Kaydinin yapildigini dogrular")
    public void student_kaydinin_yapildigini_dogrular() {
        Assert.assertTrue(addStudent.studentSave.isDisplayed());
    }

    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    //tc02
    @Given("Add Student basliginda Choose Advisor Teacher bos birakir")
    public void add_student_basliginda_choose_advisor_teacher_bos_birakir() {
        addStudent.chooseAdvisor.sendKeys(hic, Keys.TAB);
    }

    @Then("Student Kaydinin yapilmadigini dogrular")
    public void student_kaydinin_yapilmadigini_dogrular() {
        Assert.assertTrue(addStudent.selectEdvisor.isDisplayed());
    }

    //tc03
    @Given("Name alanini bos birakir")
    public void name_alanini_bos_birakir() {
        addStudent.namee.sendKeys(hic);
    }

    @Then("{string} yazisinin ciktigini dogrular")
    public void yazisinin_ciktigini_dogrular(String string) {
        addStudent.requiredName.isDisplayed();
    }

    //tc04
    public static String str = faker.regexify("./");

    @Given("Name alanina sembol girer")
    public void name_alanina_sembol_girer() {
        addStudent.namee.sendKeys(str);
    }

    @And("bir saniye bekler")
    public void birSaniyeBekler() {
        ReusableMethods.waitFor(1);
    }

    @Then("Hata mesajinin gorundugunu dogrular")
    public void hata_mesajinin_gorundugunu_dogrular() {
        String expectedValidName = "Please enter valid name";
        Assert.assertTrue(addStudent.validName.getText().contains(expectedValidName));
    }

    //tc05
    @Given("Name alanina space girer")
    public void name_alanina_space_girer() {
        addStudent.namee.sendKeys(space);
    }

    //tc06
    @Given("Name alanina numerik deger girer")
    public void name_alanina_numerik_deger_girer() {
        addStudent.namee.sendKeys(faker.number().digit());
    }

    //tc07
    @When("Surname alanini bos birakir")
    public void surname_alanini_bos_birakir() {
        addStudent.surName.sendKeys(hic);
    }

    @Then("Surname altinda {string} yazisinin ciktigini dogrular")
    public void surnameAltindaYazisininCiktiginiDogrular(String str) {
        Assert.assertTrue(addStudent.requiredSurName.getText().contains(str));
    }

    //tc08
    @Given("Surname alanina sembol girer")
    public void surname_alanina_sembol_girer() {
        addStudent.surName.sendKeys(str);
    }

    @Then("{string} mesajinin gorundugunu dogrular")
    public void mesajinin_gorundugunu_dogrular(String str) {
        Assert.assertTrue(addStudent.surNameSembol.getText().contains(str));

    }

    //tc09
    @Given("Surname alanina space girer")
    public void surname_alanina_space_girer() {
        addStudent.surName.sendKeys(space);
    }

    @Then("Surname altinda{string} mesajinin gorundugunu dogrular")
    public void surnameAltindaMesajininGorundugunuDogrular(String str) {
        Assert.assertTrue(addStudent.errorMessage.isDisplayed());
    }

    //tc10
    @When("Surname alanina numerik deger girer")
    public void surname_alanina_numerik_deger_girer() {
        addStudent.surName.sendKeys(faker.number().digit());
    }

    //tc11
    @When("Birth Place alanini bos birakir")
    public void birth_place_alanini_bos_birakir() {
        addStudent.birthPlace.sendKeys(hic);
    }

    @And("BirthPlace {string} yazisinin ciktigini dogrular")
    public void birthplaceYazisininCiktiginiDogrular(String arg0) {
        Assert.assertTrue(addStudent.birthPlaceRequired.isDisplayed());
    }

    //tc12
    @When("Email alanini bos birakir")
    public void email_alanini_bos_birakir() {
        addStudent.eMail.sendKeys(hic);
    }

    @Then("Email {string} yazisinin ciktigini dogrular")
    public void email_yazisinin_ciktigini_dogrular(String str) {
        Assert.assertTrue(addStudent.eMailRequired.getText().contains(str));
    }

    //tc13
    @And("Email alanina {string} formatta email adresi girer")
    public void emailAlaninaFormattaEmailAdresiGirer(String arg0) {
        String email = "dede@hh";
        addStudent.eMail.sendKeys(email);
    }

    @Then("girilen degerde {string} ve {string} karakterlerinin oldugunu dogrular")
    public void girilen_degerde_ve_karakterlerinin_oldugunu_dogrular(String str1, String str2) {
        Assert.assertTrue(addStudent.eMail.getText().contains(str1) && addStudent.eMail.getText().contains(str2));

    }

    //tc14
    @When("Phone alanini bos birakir")
    public void phone_alanini_bos_birakir() {
        addStudent.phoneNumber.sendKeys(hic);
    }

    @Then("Phone {string} yazisinin ciktigini dogrular")
    public void phone_yazisinin_ciktigini_dogrular(String str) {
        Assert.assertTrue(addStudent.phoneRequired.getText().contains(str));
    }

    //tc15
    String phoneNumber = numberUcHane + araFormat + numberUcHane + araFormat + numberUcHane;

    @When("Phone alanina onbir karakter girer")
    public void phoneAlaninaOnbirKarakterGirer() {
        addStudent.phoneNumber.sendKeys(phoneNumber);
    }

    @Then("Minimum oniki character \\(XXX-XXX-XXXX) yazisinin ciktigini dogrular")
    public void minimumOnikiCharacterXXXXXXXXXXYazisininCiktiginiDogrular() {
        Assert.assertTrue(addStudent.phoneNumberMinKarakter.isDisplayed());
    }
//tc16

    @And("Phone alanina invalid karakter girer")
    public void phoneAlaninaInvalidKarakterGirer() {
        String phoneNumber = numberUcHane + araFormat + numberDortHane + araFormat + numberDortHane;
        addStudent.phoneNumber.sendKeys(phoneNumber);
    }

    @Then("Phone Number Hata mesajinin gorundugunu dogrular")
    public void phoneNumberHataMesajininGorundugunuDogrular() {
        Assert.assertTrue(addStudent.errorMessage.isDisplayed());
    }

    //tc17
    @When("Gender bos birakir")
    public void gender_bos_birakir() {
        addStudent.genderMale.sendKeys(hic);
    }

    @Then("student kaydinin yapilamadigini dogrular")
    public void student_kaydinin_yapilamadigini_dogrular() throws IOException {
        ReusableMethods.waitFor(1);
        addStudent.genderEmpty.isDisplayed();
    }

    //tc18
    @Given("Snn alanina tiklar")
    public void snn_alanina_tiklar() {
        addStudent.snn.click();
    }

    @Then("Snn {string} yazisinin ciktigini dogrular")
    public void snnYazisininCiktiginiDogrular(String str) {
        Assert.assertTrue(addStudent.snnReqired.getText().contains(str));
    }

    //tc19
    public static String numberIkiHane = faker.phoneNumber().subscriberNumber(2);
    public static String yildiz = "*";

    @Given("Uc ve besinci karaktere invalid deger girer")
    public void ucVeBesinciKaraktereInvalidDegerGirer() {
        String snn = numberUcHane + yildiz + numberIkiHane + yildiz + numberDortHane;
        addStudent.snn.sendKeys(snn);
    }

    @Then("Snn Hata mesajinin gorundugunu dogrular")
    public void snn_hata_mesajinin_gorundugunu_dogrular() {
        addStudent.invalidsnn.isDisplayed();
    }
//tc20


    @Given("SSN alanina \\(-) iceren oniki karakter girer")
    public void ssn_alanina_iceren_oniki_karakter_girer() {
        String snn = numberUcHane + yildiz + numberUcHane + yildiz + numberDortHane;
        addStudent.snn.sendKeys(snn);
    }

    //tc21

    @Given("SSN alanina \\(-) iceren {int} karakter girer")
    public void ssnAlaninaIcerenKarakterGirer(int arg0) {
        String snn = numberUcHane + araFormat + numberIkiHane + araFormat + numberUcHane;
        addStudent.snn.sendKeys(snn);
    }

    @Then("snn Hata mesajinin gorundugunu dogrular")
    public void snnHataMesajininGorundugunuDogrular() {
        addStudent.ssnAlert.isDisplayed();
    }

    //tc22
    @When("User Name alanini bos birakir")
    public void user_name_alanini_bos_birakir() {
        addStudent.userName.sendKeys(hic);
    }

    @Then("UserName {string} yazisinin ciktigini dogrular")
    public void user_name_yazisinin_ciktigini_dogrular(String string) {
        Assert.assertTrue(addStudent.userNameReqired.isDisplayed());
    }

    //tc23
    @Given("Father Name alanini bos birakir")
    public void fatherNameAlaniniBosBirakir() {
        addStudent.fatherName.sendKeys(space);
    }

    //tc24
    @Given("Father Name Alanina space girer")
    public void fatherNameAlaninaSpaceGirer() {
        addStudent.fatherName.sendKeys(space);
    }

    @Then("Father name Hata mesajinin gorundugunu dogrular")
    public void fatherNameHataMesajininGorundugunuDogrular() {
        addStudent.fatherNamePopUp.isDisplayed();
    }


    //tc25
    @Given("Mother Name alanini bos birakir")
    public void motherNameAlaniniBosBirakir() {
        addStudent.motherName.sendKeys(hic);
    }

    //tc26
    @Given("Mother Name alanini space girer")
    public void motherNameAlaniniSpaceGirer() {
        addStudent.motherName.sendKeys(space);
    }


    @Then("MotherName {string} yazisinin ciktigini dogrular")
    public void mothernameYazisininCiktiginiDogrular(String arg0) {
        addStudent.motherNameRequired.isDisplayed();
    }

    //tc27
    @Given("Password alanina yedi Karakter girer")
    public void passwordAlaninaYediKarakterGirer() {
        String phoneNumber = faker.phoneNumber().subscriberNumber(7);
        addStudent.passwordArea.sendKeys(phoneNumber);
    }
    @Then("Password Hata mesajinin gorundugunu dogrular")
    public void password_hata_mesajinin_gorundugunu_dogrular() {
        Assert.assertTrue(addStudent.passwordMinKarakter.isDisplayed());
    }

    //tc28
    @Given("Password alanina space girer")
    public void password_alanina_space_girer() {
        String space = "        ";
        addStudent.passwordArea.sendKeys(space);
    }

    @Then("Password {string} yazisinin ciktigini dogrular")
    public void passwordYazisininCiktiginiDogrular(String arg0) {
        Assert.assertTrue(addStudent.errorMessage.isDisplayed());
    }







}
