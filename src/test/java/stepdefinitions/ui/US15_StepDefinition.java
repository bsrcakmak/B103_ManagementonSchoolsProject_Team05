package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.MainMenuPanel;

public class US15_StepDefinition {

    HomePage homePage = new HomePage();
    MainMenuPanel mainMenuPanel = new MainMenuPanel();

    @When("Baslikta bulunan Menu butonuna tiklanir")
    public void baslikta_bulunan_menu_butonuna_tiklanir() {
        homePage.menuButton.click();
    }

    @When("Panelde bulunan Student Management butonuna tiklanir")
    public void panelde_bulunan_student_management_butonuna_tiklanir() {
        mainMenuPanel.studentManagementButton.click();
    }

    @And("Choose Teacher listesinden gecerli bir secim yapilir")
    public void choose_teacher_listesinden_gecerli_bir_secim_yapilir() {
    }

    @And("Name kutusuna gecerli bir deger girilir")
    public void name_kutusuna_gecerli_bir_deger_girilir() {
    }

    @And("Surname kutusuna gecerli bir deger girilir")
    public void surname_kutusuna_gecerli_bir_deger_girilir() {
    }

    @And("Birth Place kutusuna gecerli bir deger girilir")
    public void birth_place_kutusuna_gecerli_bir_deger_girilir() {
    }

    @And("Email kutusuna gecerli bir deger girilir")
    public void email_kutusuna_gecerli_bir_deger_girilir() {
    }

    @And("Phone kutusuna gecerli bir deger girilir")
    public void phone_kutusuna_gecerli_bir_deger_girilir() {
    }

    @And("Gender bolumunde gecerli bir secim yapilir")
    public void gender_bolumunde_gecerli_bir_secim_yapilir() {
    }

    @And("Date Of Birth kutusuna gecerli bir deger girilir")
    public void date_of_birth_kutusuna_gecerli_bir_deger_girilir() {
    }

    @And("Ssn kutusuna gecerli bir deger girilir")
    public void ssn_kutusuna_gecerli_bir_deger_girilir() {
    }

    @And("User Name kutusuna gecerli bir deger girilir")
    public void user_name_kutusuna_gecerli_bir_deger_girilir() {
    }

    @And("Father Name kutusuna gecerli bir deger girilir")
    public void father_name_kutusuna_gecerli_bir_deger_girilir() {
    }

    @And("Mother Name kutusuna gecerli bir deger girilir")
    public void mother_name_kutusuna_gecerli_bir_deger_girilir() {
    }

    @And("Password kutusuna gecerli bir deger girilir")
    public void password_kutusuna_gecerli_bir_deger_girilir() {
    }

    @When("Submit butonuna tiklanir")
    public void submit_butonuna_tiklanir() {
    }

    @When("Sayfanin alt kisminda yer alan Student List adli listenin son sayfasina gidilir")
    public void sayfanin_alt_kisminda_yer_alan_student_list_adli_listenin_son_sayfasina_gidilir() {
    }

    @When("Girilen User Name ile olusturulan ogrenci listede bulunur")
    public void girilen_user_name_ile_olusturulan_ogrenci_listede_bulunur() {
    }

    @Then("Girilen degerlerle ogrencinin olusturuldugu dogrulanir")
    public void girilenDegerlerleOgrencininOlusturulduguDogrulanir() {
    }

}
