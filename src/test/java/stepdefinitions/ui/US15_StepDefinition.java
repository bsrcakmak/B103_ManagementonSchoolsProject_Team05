package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.MainMenuPanel;
import pages.StudentManagementPage;
import utilities.ReusableMethods;

public class US15_StepDefinition {

    HomePage homePage = new HomePage();
    MainMenuPanel mainMenuPanel = new MainMenuPanel();
    StudentManagementPage studentManagementPage = new StudentManagementPage();
    String expectedUsername;
    String actualUsername;

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
        ReusableMethods.selectFromDropdownByIndex(studentManagementPage.chooseTeacherDropdown, 0);
    }

    @And("Name kutusuna gecerli bir deger girilir")
    public void name_kutusuna_gecerli_bir_deger_girilir() {
        studentManagementPage.nameBox.sendKeys(ReusableMethods.createName());
    }

    @And("Surname kutusuna gecerli bir deger girilir")
    public void surname_kutusuna_gecerli_bir_deger_girilir() {
        studentManagementPage.nameBox.sendKeys(ReusableMethods.createSurname());
    }

    @And("Birth Place kutusuna gecerli bir deger girilir")
    public void birth_place_kutusuna_gecerli_bir_deger_girilir() {
        studentManagementPage.birthPlaceBox.sendKeys(ReusableMethods.createBirthPlace());
    }

    @And("Email kutusuna gecerli bir deger girilir")
    public void email_kutusuna_gecerli_bir_deger_girilir() {
        studentManagementPage.emailBox.sendKeys(ReusableMethods.createEmail());
    }

    @And("Phone kutusuna gecerli bir deger girilir")
    public void phone_kutusuna_gecerli_bir_deger_girilir() {
        studentManagementPage.phoneBox.sendKeys(ReusableMethods.createPhone());
    }

    @And("Gender bolumunde gecerli bir secim yapilir")
    public void gender_bolumunde_gecerli_bir_secim_yapilir() {
        studentManagementPage.maleButton.click();
    }

//    @And("Date Of Birth kutusuna gecerli bir deger girilir")
//    public void date_of_birth_kutusuna_gecerli_bir_deger_girilir() {
//    }

    @And("Ssn kutusuna gecerli bir deger girilir")
    public void ssn_kutusuna_gecerli_bir_deger_girilir() {
        studentManagementPage.phoneBox.sendKeys(ReusableMethods.createSSN());
    }

    @And("User Name kutusuna gecerli bir deger girilir")
    public void user_name_kutusuna_gecerli_bir_deger_girilir() {
        expectedUsername = ReusableMethods.createUserName();
        studentManagementPage.usernameBox.sendKeys(expectedUsername);
    }

    @And("Father Name kutusuna gecerli bir deger girilir")
    public void father_name_kutusuna_gecerli_bir_deger_girilir() {
        studentManagementPage.fatherNameBox.sendKeys(ReusableMethods.createFatherName());
    }

    @And("Mother Name kutusuna gecerli bir deger girilir")
    public void mother_name_kutusuna_gecerli_bir_deger_girilir() {
        studentManagementPage.motherNameBox.sendKeys(ReusableMethods.createMotherName());
    }

    @And("Password kutusuna gecerli bir deger girilir")
    public void password_kutusuna_gecerli_bir_deger_girilir() {
        studentManagementPage.passwordBox.sendKeys(ReusableMethods.createPassword());
    }

    @When("Submit butonuna tiklanir")
    public void submit_butonuna_tiklanir() {
        studentManagementPage.submitButton.click();
    }

    @When("Sayfanin alt kisminda yer alan Student List adli listenin son sayfasina gidilir")
    public void sayfanin_alt_kisminda_yer_alan_student_list_adli_listenin_son_sayfasina_gidilir() {
        ReusableMethods.scrollIntoViewJS(studentManagementPage.lastPageButton);
        ReusableMethods.waitFor(1);
        ReusableMethods.clickByJS(studentManagementPage.lastPageButton);
        ReusableMethods.waitFor(1);
    }

    @When("Girilen User Name ile olusturulan ogrenci listede bulunur")
    public void girilen_user_name_ile_olusturulan_ogrenci_listede_bulunur() {
        ReusableMethods.waitFor(1);
        ReusableMethods.scrollTopJS();
        ReusableMethods.waitFor(1);
        actualUsername = studentManagementPage.studentsUsernameLastCreated.getText();
    }

    @Then("Girilen degerlerle ogrencinin olusturuldugu dogrulanir")
    public void girilen_Degerlerle_Ogrencinin_Olusturuldugu_Dogrulanir() {
        Assert.assertEquals(expectedUsername, actualUsername);
    }

    @And("Choose Teacher listesinden herhangi bir secim yapilmaz")
    public void choose_Teacher_Listesinden_Herhangi_Bir_Secim_Yapilmaz() {
    }

//    @Then("Danisman ogretmen secilmesi gerektigine dair hata mesajinin alindigi dogrulanir")
//    public void danisman_Ogretmen_Secilmesi_Gerektigine_Dair_Hata_Mesajinin_Alindigi_Dogrulanir() {
//    }

//    @Then("Name kutusunun altinda uyari mesajinin goruntulendigi dogrulanir")
//    public void name_Kutusunun_Altinda_Uyari_Mesajinin_Goruntulendigi_Dogrulanir() {
//    }

//    @Then("Surname kutusunun altinda uyari mesajinin goruntulendigi dogrulanir")
//    public void surname_Kutusunun_Altinda_Uyari_Mesajinin_Goruntulendigi_Dogrulanir() {
//    }

//    @Then("Birth Place kutusunun altinda uyari mesajinin goruntulendigi dogrulanir")
//    public void birth_Place_Kutusunun_Altinda_Uyari_Mesajinin_Goruntulendigi_Dogrulanir() {
//    }

//    @Then("E-mail kutusunun altinda uyari mesajinin goruntulendigi dogrulanir")
//    public void email_Kutusunun_Altinda_Uyari_Mesajinin_Goruntulendigi_Dogrulanir() {
//    }

//    @Then("Phone kutusunun altinda uyari mesajinin goruntulendigi dogrulanir")
//    public void phone_Kutusunun_Altinda_Uyari_Mesajinin_Goruntulendigi_Dogrulanir() {
//    }

//    @Then("Date Of Birth kutusunun altinda uyari mesajinin goruntulendigi dogrulanir")
//    public void dateOfBirthKutusununAltindaUyariMesajininGoruntulendigiDogrulanir() {
//    }

//    @Then("User Name kutusunun altinda uyari mesajinin goruntulendigi dogrulanir")
//    public void userNameKutusununAltindaUyariMesajininGoruntulendigiDogrulanir() {
//    }

//    @Then("Father Name kutusunun altinda uyari mesajinin goruntulendigi dogrulanir")
//    public void fatherNameKutusununAltindaUyariMesajininGoruntulendigiDogrulanir() {
//    }

//    @Then("Mother Name kutusunun altinda uyari mesajinin goruntulendigi dogrulanir")
//    public void motherNameKutusununAltindaUyariMesajininGoruntulendigiDogrulanir() {
//    }

}
