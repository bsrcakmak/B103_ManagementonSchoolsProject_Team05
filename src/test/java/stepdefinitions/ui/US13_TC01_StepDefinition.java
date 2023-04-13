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


        viceDeanPage.chooseLessons.click();

        Actions action=new Actions(Driver.getDriver());
        action.sendKeys(ders).build().perform();
        ReusableMethods.waitFor(3);


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
}
