package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
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

        viceDeanPage.chooseLessons.click();

        Actions action=new Actions(Driver.getDriver());
        action.sendKeys(ders+Keys.ENTER).perform();
        ReusableMethods.waitFor(3);

    }

    @When("Name {string} olarak girilir")
    public void name_olarak_girilir(String name) {

        viceDeanPage.nameBox.sendKeys(name+Keys.ENTER);

    }


    @When("Surname {string} olarak girilir")
    public void surname_olarak_girilir(String surname) {

        viceDeanPage.surnameBox.sendKeys(surname+Keys.ENTER);
    }

    @When("Birth Place girilir")
    public void birth_place_girilir() {

    }

    @When("birt place {string} olarak girilir")
    public void birt_place_olarak_girilir(String birthplace) {

        viceDeanPage.birthPlaceBox.sendKeys(birthplace+Keys.ENTER);

    }


    @When("Email girilir")
    public void email_girilir() {



    }

    @When("Email {string} olarak girilir")
    public void email_olarak_girilir(String email) {

        viceDeanPage.emailbox.sendKeys(email);

    }


    @When("Phone number {string} olarak girilir")
    public void phone_number_olarak_girilir(String phonenumber) {

        viceDeanPage.phoneNumberBox.sendKeys(phonenumber);

    }

    @When("Gender female secilir")
    public void gender_female_secilir() {

        viceDeanPage.genderFemale.click();

    }

    @When("Date of Birth {string} olarak girilir")
    public void date_of_birth_olarak_girilir(String dateofbirth) {

        viceDeanPage.birthdayBox.sendKeys(dateofbirth+Keys.ENTER);


    }

    @When("Ssn {string} olarak girilir")
    public void ssn_olarak_girilir(String ssn) {

        viceDeanPage.ssnBox.sendKeys(ssn);

    }

    @When("User Name girer")
    public void user_name_girer() {

        viceDeanPage.usernameBox.sendKeys("senemOzct"+Keys.ENTER);


    }

    @When("User Name {string} olarak  girer")
    public void user_name_olarak_girer(String username) {

        viceDeanPage.usernameBox.sendKeys(username+Keys.ENTER);

    }

    @When("Password {string} olarak girer")
    public void password_olarak_girer(String password) {

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
