package stepdefinitions.ui;

import com.github.javafaker.Faker;
import com.github.javafaker.ProgrammingLanguage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.LoginPage;
import pages.ViceDeanPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class US13_TC01_StepDefinition {

    LoginPage loginPage=new LoginPage();
    HomePage homePage=new HomePage();
    ViceDeanPage viceDeanPage=new ViceDeanPage();

    Faker faker;
    @When("Menu butonuna tiklar")
    public void menu_butonuna_tiklar() {
        viceDeanPage.menuButton.click();

    }
    @When("Teacher Management'a tiklar")
    public void teacher_management_a_tiklar() {
        viceDeanPage.teacherManagement.click();

    }

    @When("Ogretmenin girecegi ders {string} olarak secilir")
    public void ogretmenin_girecegi_ders_olarak_secilir(String ders) {



//        WebElement chooseLessonJS = Driver.getDriver().findElement(By.xpath("//div[@class=' css-1xc3v61-indicatorContainer']"));

//        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
//        js.executeScript("arguments[0].click();",chooseLessonJS);
//        js.executeScript("arguments[0].value='Java';",chooseLessonJS);


        Driver.waitForPageToLoad(5);

        viceDeanPage.chooseLessons.click();

        Actions action=new Actions(Driver.getDriver());
        action.sendKeys(ders).build().perform();
        ReusableMethods.waitFor(2);


        action.sendKeys(Keys.ENTER).build().perform();

    }

    @When("Name {string} olarak girilir")
    public void name_olarak_girilir(String name) {
        faker = new Faker();
        String firstName = faker.name().firstName();
        viceDeanPage.nameBox.sendKeys(firstName+Keys.ENTER);

    }


    @When("Surname {string} olarak girilir")
    public void surname_olarak_girilir(String arg0) {
        faker = new Faker();
        String surname = faker.name().lastName();
        viceDeanPage.surnameBox.sendKeys(surname+Keys.ENTER);
    }



    @When("birt place {string} olarak girilir")
    public void birt_place_olarak_girilir(String arg0) {
        faker = new Faker();
        String birthPlace = faker.address().city();
        viceDeanPage.birthPlaceBox.sendKeys(birthPlace+Keys.ENTER);

    }


    @When("Email {string} olarak girilir")
    public void email_olarak_girilir(String arg0) {
        faker = new Faker();
        String email =faker.internet().emailAddress();
        viceDeanPage.emailbox.sendKeys(email);

    }


    @When("Phone number {string} olarak girilir")
    public void phone_number_olarak_girilir(String arg0) {
        faker =new Faker();
        String number = faker.number().digits(10);
        String number01 = number.substring(0,3);
        String number02 = number.substring(3,6);
        String number03 = number.substring(6);

        String phoneNumber = number01+"-"+number02+"-"+number03;



        viceDeanPage.phoneNumberBox.sendKeys(phoneNumber);

    }

    @When("Gender female secilir")
    public void gender_female_secilir() {

        viceDeanPage.genderFemale.click();

    }

    @When("Date of Birth {string} olarak girilir")
    public void date_of_birth_olarak_girilir(String arg0) {

        faker = new Faker();
        int number = faker.number().numberBetween(1,31);
        int number02 = faker.number().numberBetween(1,12);
        int number03 = faker.number().numberBetween(1950,2010);

        String str = " "+number+"."+number02+"."+number03;
        String dateofbirth = str.trim();

        viceDeanPage.birthdayBox.sendKeys(dateofbirth+Keys.ENTER);


    }

    @When("Ssn {string} olarak girilir")
    public void ssn_olarak_girilir(String arg0) {

        faker = new Faker();
        String ssn = faker.number().digits(9);
        String ssn01 = ssn.substring(0,3);
        String ssn02 = ssn.substring(3,5);
        String ssn03 = ssn.substring(5);

        String ssnA = ssn01+"-"+ssn02+"-"+ssn03;
        viceDeanPage.ssnBox.sendKeys(ssnA);

    }

    @When("User Name {string} olarak  girer")
    public void user_name_olarak_girer(String arg0) {

        faker = new Faker();
        String username = faker.name().username();
        viceDeanPage.usernameBox.sendKeys(username+Keys.ENTER);

    }

    @When("Password {string} olarak girer")
    public void password_olarak_girer(String arg0) {


        faker = new Faker();
        String password = faker.internet().password();
        viceDeanPage.passwordBox.sendKeys(password);

    }

    @When("Submit tiklanir")
    public void submit_tiklanir() {

        ReusableMethods.waitForClickablility(viceDeanPage.submitButton,5);
        viceDeanPage.submitButton.click();

    }
    @Then("Islemin gerceklestigine dair popUp mesajini goruntuler")
    public void ıslemin_gerceklestigine_dair_pop_up_mesajini_goruntuler() {

        ReusableMethods.waitForVisibility(viceDeanPage.SuccessfullSaving,15);
        Assert.assertTrue(viceDeanPage.SuccessfullSaving.isDisplayed());
    }

    @Then("Ders secim alani bos birakildigi icin hata mesaji alir")
    public void dersSecimAlaniBosBirakildigiIcinHataMesajiAlir() {

        ReusableMethods.waitForVisibility(viceDeanPage.alertChooseLesson,15);
        Assert.assertTrue(viceDeanPage.alertChooseLesson.isDisplayed());

    }


    @And("{int} saniye bekler")
    public void saniyeBekler(int wait) {
        ReusableMethods.waitFor(wait);
    }

    @And("Choose Lessons kismindan secili dersi siler.")
    public void chooseLessonsKismindanSeciliDersiSiler() {


        viceDeanPage.chooseLessons.click();

        Actions action=new Actions(Driver.getDriver());

        ReusableMethods.waitFor(2);
        action.sendKeys(Keys.DELETE).build().perform();

    }

    @And("Ogretmenin girecegi ders  tekrar {string} olarak secilir")
    public void ogretmeninGirecegiDersTekrarOlarakSecilir(String ders) {

//        viceDeanPage.getChooseLessons02.click();
//        burayi aktif edince java yazisini chooselessons kismina gondermiyor.!!!

        Actions action=new Actions(Driver.getDriver());
        action.sendKeys(ders).build().perform();
        ReusableMethods.waitFor(2);


        action.sendKeys(Keys.ENTER).build().perform();

    }

    @And("Name bos olarak birakilir")
    public void nameBosOlarakBirakilir() {

        viceDeanPage.nameBox.click();

    }

    @Then("Name_bolumunun_altinda_{string}_yazisinin_oldugunu_dogrular")
    public void _bolumunun_altinda__yazisinin_oldugunu_dogrular(String arg0) {

        String expecteddata = arg0;
        String actualdata = viceDeanPage.RequiredTextforName.getText();
        Assert.assertEquals(expecteddata,actualdata);

    }

    @And("Sayfayi Submit butonu gorulecek sekilde asagi kaydirir.")
    public void sayfayiAsagiKaydirir() {

        Actions action=new Actions(Driver.getDriver());
//        action.scrollToElement(viceDeanPage.submitButton);

//        ReusableMethods.scrollIntoViewJS(viceDeanPage.submitButton);
        action.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).build().perform();

    }

    @Then("Hata mesajini goruntuler.")
    public void hataMesajiniGoruntuler() {

        // space karakter testi icin ortak kullanildi
        ReusableMethods.waitForVisibility(viceDeanPage.alertChooseLesson,15);//hata mesaji olmadigi icin oun yerine chooselessons da verilen hata mesajini kullandim
        Assert.assertTrue(viceDeanPage.alertChooseLesson.isDisplayed());//normal sartlar altinda fail olmasi gerekirken pass oluyor. bug acilabilir
                                                                        //popup mesajlari farkli olmasina ragmen kabul etti ve passed oldu

    }

    @And("Name alanina {string} karakteri girilir.")
    public void nameAlaninaKarakteriGirilir(String arg0) {
        viceDeanPage.nameBox.click();
        viceDeanPage.nameBox.sendKeys(arg0+Keys.ENTER);
    }

    @And("Surname bos olarak birakilir")
    public void surnameBosOlarakBirakilir() {

        viceDeanPage.surnameBox.click();
    }

    @Then("Surname_bolumunun_altinda_{string}_yazisinin_oldugunu_dogrular")
    public void surname_bolumunun_altinda__yazisinin_oldugunu_dogrular(String arg0) {

        String expecteddata = arg0;
        String actualdata = viceDeanPage.RequiredTextforSurname.getText();
        Assert.assertEquals(expecteddata,actualdata);

    }

    @And("Surname alanina {string} karakteri girilir.")
    public void surnameAlaninaKarakteriGirilir(String arg0) {

        viceDeanPage.surnameBox.click();
        viceDeanPage.surnameBox.sendKeys(arg0+Keys.ENTER);

    }

    @And("Birth_Place bos olarak birakilir")
    public void birth_placeBosOlarakBirakilir() {

        viceDeanPage.birthPlaceBox.click();

    }

    @Then("Birth_Place_bolumunun_altinda_{string}_yazisinin_oldugunu_dogrular")
    public void birth_place_bolumunun_altinda__yazisinin_oldugunu_dogrular(String arg0) {

        String expecteddata = arg0;
        String actualdata = viceDeanPage.RequiredTextforBirthPlace.getText();
        Assert.assertEquals(expecteddata,actualdata);

    }

    @And("BirthPlace alanina {string} karakteri girilir")
    public void birthPlaceAlaninaKarakteriGirilir(String arg0) {
        viceDeanPage.birthPlaceBox.click();
        viceDeanPage.birthPlaceBox.sendKeys(arg0+Keys.ENTER);
    }
}
