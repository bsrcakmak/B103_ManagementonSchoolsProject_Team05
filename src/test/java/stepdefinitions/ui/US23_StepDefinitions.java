package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.ViceDeanManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US23_StepDefinitions {
    ViceDeanManagementPage viceDeanManagementPage = new ViceDeanManagementPage();
    public static Faker faker = new Faker();
    public static String rakam = faker.phoneNumber().subscriberNumber(1);
    public static String numberIkiHane = faker.phoneNumber().subscriberNumber(2);
    public static String numberUcHane = faker.phoneNumber().subscriberNumber(3);
    public static String numberDortHane = faker.phoneNumber().subscriberNumber(4);



    @Then("Kullanacı Menu butonuna tıklar.")
    public void kullanacı_menu_butonuna_tıklar() {
        ReusableMethods.waitFor(2);
        viceDeanManagementPage.menuButton.click();
    }

    @Then("Kullancı açılan menüden Vice Dean Management e tıklar.")
    public void kullancı_açılan_menüden_vice_dean_management_e_tıklar() {
        ReusableMethods.waitFor(1);
        viceDeanManagementPage.viceDeanManagementButton.click();
    }

    @When("Kullancı Name alanına isim girer.")
    public void kullancı_name_alanına_isim_girer() {
        ReusableMethods.waitFor(1);
        viceDeanManagementPage.nameBox.sendKeys(ReusableMethods.createName());
    }

    @When("Kullanıcı Surname alanına soyisim girer.")
    public void kullanıcı_surname_alanına_soyisim_girer() {
        ReusableMethods.waitFor(1);
        viceDeanManagementPage.surnameBox.sendKeys(ReusableMethods.createSurname());
    }

    @When("Kullanıcı Birth Place alanına doğum yeri girer.")
    public void kullanıcı_birth_place_alanına_doğum_yeri_girer() {
        viceDeanManagementPage.birthPlaceBox.sendKeys(ReusableMethods.createBirthPlace());
    }

    @When("Kullanıcı Gender alanından cinsiyet seçer.")
    public void kullanıcı_gender_alanından_cinsiyet_seçer() {
        if(Integer.parseInt(rakam)%2==0) {
            viceDeanManagementPage.genderFemale.click();
        }else{
            viceDeanManagementPage.genderMale.click();
        }
    }

    @When("Kulancı Date Of Birth alanına doğum tarihi girer.")
    public void kulancı_date_of_birth_alanına_doğum_tarihi_girer() {
        viceDeanManagementPage.birthdayBox.sendKeys(ReusableMethods.createDateOfBirth());
    }

    @When("Kullanıcı Phone alanına uygun formatta telefon numarası girer.")
    public void kullanıcı_phone_alanına_uygun_formatta_telefon_numarası_girer() {
        viceDeanManagementPage.phoneNumberBox.sendKeys(numberUcHane+"-"+numberUcHane+"-"+numberDortHane);
    }

    @When("Kullanıcı Ssn alanına uygun formatta Ssn numarası girer.")
    public void kullanıcı_ssn_alanına_uygun_formatta_ssn_numarası_girer() {
        viceDeanManagementPage.ssnBox.sendKeys(numberUcHane+"-"+numberIkiHane+"-"+numberDortHane);
    }

    @When("Kullancı User Name alanına user name girer.")
    public void kullancı_user_name_alanına_user_name_girer() {
        viceDeanManagementPage.usernameBox.sendKeys(ReusableMethods.createUserName());
    }

    @When("Kullancı Password alanına uygun formatta şifre girer.")
    public void kullancı_password_alanına_uygun_formatta_şifre_girer() {
        viceDeanManagementPage.passwordBox.sendKeys(ReusableMethods.createPassword());
    }

    @When("Kullanıcı Submit butonuna tıklar.")
    public void kullanıcı_submit_butonuna_tıklar() {
        ReusableMethods.waitFor(2);
        viceDeanManagementPage.submitButton.click();
    }

    @Then("Vice Dean saved mesajı çıkar ve vice dean oluşturulur.")
    public void vice_dean_saved_mesajı_çıkar_ve_vice_dean_oluşturulur() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(viceDeanManagementPage.viceDeanSaved.isDisplayed());
    }

    @Then("Kullanıcı Name alanını boş bırakır.")
    public void kullanıcıNameAlanınıBoşBırakır() {
        viceDeanManagementPage.nameBox.sendKeys("", Keys.TAB);
    }

    @Then("Name kısmının altında Required yazısı çıkar.")
    public void nameKısmınınAltındaRequiredYazısıÇıkar() {
        Assert.assertTrue(viceDeanManagementPage.textofRequired.isDisplayed());
    }

    @And("Kullanıcı Surname alanını boş bırakır.")
    public void kullanıcıSurnameAlanınıBoşBırakır() {
        viceDeanManagementPage.surnameBox.sendKeys("", Keys.TAB);
    }

    @Then("Surname kısmının altında Required yazısı çıkar.")
    public void surnameKısmınınAltındaRequiredYazısıÇıkar() {
        Assert.assertTrue(viceDeanManagementPage.textofRequired.isDisplayed());
    }

    @And("Kullanıcı Birth Place alanını boş bırakır.")
    public void kullanıcıBirthPlaceAlanınıBoşBırakır() {
        viceDeanManagementPage.birthPlaceBox.sendKeys("",Keys.TAB);

    }

    @Then("Birth Place kısmının altında Required yazısı çıkar.")
    public void birthPlaceKısmınınAltındaRequiredYazısıÇıkar() {
        Assert.assertTrue(viceDeanManagementPage.textofRequired.isDisplayed());
    }

    @And("Kullanıcı Birth of Date alanını boş bırakır.")
    public void kullanıcıBirthOfDateAlanınıBoşBırakır() {
        viceDeanManagementPage.birthdayBox.sendKeys("",Keys.TAB);

    }

    @Then("Birth of Date kısmının altında Required yazısı çıkar.")
    public void birthOfDateKısmınınAltındaRequiredYazısıÇıkar() {
        Assert.assertTrue(viceDeanManagementPage.textofRequired.isDisplayed());
    }

    @And("Kullanıcı Phone alanını boş bırakır.")
    public void kullanıcıPhoneAlanınıBoşBırakır() {
        viceDeanManagementPage.phoneNumberBox.sendKeys("",Keys.TAB);
    }

    @Then("Phone kısmının altında Required yazısı çıkar.")
    public void phoneKısmınınAltındaRequiredYazısıÇıkar() {
        Assert.assertTrue(viceDeanManagementPage.textofRequired.isDisplayed());
    }

    @And("Kullanıcı Ssn alanını boş bırakır.")
    public void kullanıcıSsnAlanınıBoşBırakır() {
        viceDeanManagementPage.ssnBox.sendKeys("",Keys.TAB);
    }

    @Then("Ssn kısmının altında Required yazısı çıkar.")
    public void ssnKısmınınAltındaRequiredYazısıÇıkar() {
        Assert.assertTrue(viceDeanManagementPage.textofRequired.isDisplayed());
    }

    @And("Kullanıcı Ssn alanına üçüncü rakamdan sonra - işareti koymadan Ssn numarası girer.")
    public void kullanıcıSsnAlanınaÜçüncüRakamdanSonraIşaretiKoymadanSsnNumarasıGirer() {
        viceDeanManagementPage.ssnBox.sendKeys(numberUcHane+numberIkiHane+"-"+numberDortHane);
    }

    @Then("Ssn kısmının altında Minimum {int} character \\(XXX-XX-XXXX) yazısı çıkar.")
    public void ssnKısmınınAltındaMinimumCharacterXXXXXXXXXYazısıÇıkar(int arg0) {
        Assert.assertTrue(viceDeanManagementPage.textofMinChar.isDisplayed());
    }

    @And("Kullanıcı Ssn alanına beşinci rakamdan sonra - işareti koymadan Ssn numarası girer.")
    public void kullanıcıSsnAlanınaBeşinciRakamdanSonraIşaretiKoymadanSsnNumarasıGirer() {
        viceDeanManagementPage.ssnBox.sendKeys(numberUcHane+"-"+numberIkiHane+numberDortHane);
    }

    @And("Kullanıcı Ssn alanına üçüncü ve beşinci rakamdan sonra - işareti koymadan Ssn numarası girer.")
    public void kullanıcıSsnAlanınaÜçüncüVeBeşinciRakamdanSonraIşaretiKoymadanSsnNumarasıGirer() {
        viceDeanManagementPage.ssnBox.sendKeys(numberUcHane+numberIkiHane+numberDortHane);
    }

    @And("Kullanıcı User Name alanını boş bırakır.")
    public void kullanıcıUserNameAlanınıBoşBırakır() {
        viceDeanManagementPage.usernameBox.sendKeys("",Keys.TAB);
    }

    @Then("User Name kısmının altında Required yazısı çıkar.")
    public void userNameKısmınınAltındaRequiredYazısıÇıkar() {
        Assert.assertTrue(viceDeanManagementPage.textofRequired.isDisplayed());
    }

    @And("Kullanıcı Password alanını boş bırakır.")
    public void kullanıcıPasswordAlanınıBoşBırakır() {
        viceDeanManagementPage.passwordBox.sendKeys("",Keys.TAB);
    }

    @Then("Password kısmının altında Required yazısı çıkar.")
    public void passwordKısmınınAltındaRequiredYazısıÇıkar() {
        Assert.assertTrue(viceDeanManagementPage.textofRequired.isDisplayed());
    }

    @And("Kullanıcı Password kısmına yedi karakterden az karakter girer.")
    public void kullanıcıPasswordKısmınaYediKarakterdenAzKarakterGirer() {
        viceDeanManagementPage.passwordBox.sendKeys(faker.internet().password(1,7));
    }

    @Then("Password kısmının altında Minimum {int} character yazısı çıkar.")
    public void passwordKısmınınAltındaMinimumCharacterYazısıÇıkar(int arg0) {
        Assert.assertTrue(viceDeanManagementPage.textofMinpassword.isDisplayed());
    }

    @And("Kullanıcı Password kısmına yedi karakter girer.")
    public void kullanıcıPasswordKısmınaYediKarakterGirer() {
        viceDeanManagementPage.passwordBox.sendKeys(faker.internet().password(7,8));
    }

    @And("Kullanıcı Gender alanından cinsiyeti boş bırakır.")
    public void kullanıcıGenderAlanındanCinsiyetiBoşBırakır() {
    }

    @Then("Vice Dean hesabı oluşturulmaz.")
    public void viceDeanHesabıOluşturulmaz() {
        Assert.assertEquals(0, Driver.getDriver().findElements(By.xpath("//div[text()='Vice dean Saved']")).size());
    }
}
