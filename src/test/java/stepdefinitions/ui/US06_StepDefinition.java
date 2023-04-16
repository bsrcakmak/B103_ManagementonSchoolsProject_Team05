package stepdefinitions.ui;


import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.DeanManagementPage;
import pages.HomePage;
import pages.MainMenuPanel;

public class US06_StepDefinition {
    MainMenuPanel mainMenuPanel = new MainMenuPanel();
    HomePage homePage = new HomePage();
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    Faker faker = new Faker();

    @Then("Dean Gender bolumunde gecerli bir secim yapilir")
    public void deanGenderBolumundeGecerliBirSecimYapilir() {
        deanManagementPage.genderMale.click();

    }
    @Given("Ssn alanina ucuncü rakamdan sonra - isareti koymadan Ssn numarasi girer.")
    public void ssn_alanina_ucuncü_rakamdan_sonra_isareti_koymadan_ssn_numarasi_girer() {


    }
    @Given("Ssn alanina besinci rakamdan sonra - isareti koymadan Ssn numarasi girer.")
    public void ssn_alanina_besinci_rakamdan_sonra_isareti_koymadan_ssn_numarasi_girer() {

    }
    @Given("Ssn alanina ucuncu ve besinci rakamdan sonra - isareti koymadan Ssn numarası girer")
    public void ssn_alanina_ucuncu_ve_besinci_rakamdan_sonra_isareti_koymadan_ssn_numarası_girer() {

    }
    @Given("Password alanina yedi karakterden az bir deger girer")
    public void password_alanina_yedi_karakterden_az_bir_deger_girer() {

    }
    @Then("Kullanici Gender alanından cinsiyeti bos birakir.")
    public void kullanici_gender_alanından_cinsiyeti_bos_birakir() {
    }
    @Then("Logout islemi gerceklestirir.")
    public void logout_islemi_gerceklestirir() {

    }



}
