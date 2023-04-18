package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ContactMessagePage;
import pages.HomePage;
import pages.MainMenuPanel;

public class US16_StepDefinition {

    HomePage homePage = new HomePage();
    MainMenuPanel mainMenuPanel = new MainMenuPanel();
    ContactMessagePage contactMessagePage = new ContactMessagePage();

    public String expectedName = "Name";
    public String expectedEmail = "Email";
    public String expectedDate = "Date";
    public String expectedSubject = "Subject";
    public String expectedMessage = "Message";
    public String nameFirst = contactMessagePage.nameFirstCreated.getText();

    @And("Vice Dean Menu butonuna tiklar")
    public void viceDeanMenuButonunaTiklar() {
        homePage.menuButton.click();
    }

    @And("Vice Dean Contact Get All yazisina tiklar")
    public void viceDeanContactGetAllYazisinaTiklar() {
        mainMenuPanel.contactGetAllButton.click();
    }

    @Then("Vice Dean sayfada mesaj yazarlarinin goruntulendigini dogrular")
    public void viceDeanSayfadaMesajYazarlarininGoruntulendiginiDogrular() {
        Assert.assertEquals(expectedName,contactMessagePage.name.getText());
    }

    @Then("Vice Dean sayfada mesaj yazarlarina ait emaillerin goruntulendigini dogrular")
    public void viceDeanSayfadaMesajYazarlarinaAitEmaillerinGoruntulendiginiDogrular() {
        Assert.assertEquals(expectedEmail,contactMessagePage.email.getText());
    }

    @Then("Vice Dean sayfada mesajlarin gonderilme tarihinin goruntulendigini dogrular")
    public void viceDeanSayfadaMesajlarinGonderilmeTarihininGoruntulendiginiDogrular() {
        Assert.assertEquals(expectedDate,contactMessagePage.date.getText());
    }

    @Then("Vice Dean sayfada mesajlarin subject bilgisinin goruntulendigini dogrular")
    public void viceDeanSayfadaMesajlarinSubjectBilgisininGoruntulendiginiDogrular() {
        Assert.assertEquals(expectedSubject,contactMessagePage.subject.getText());
    }

    @Then("Vice Dean sayfada mesajlarin goruntulendigini dogrular")
    public void viceDeanSayfadaMesajlarinGoruntulendiginiDogrular() {
        Assert.assertEquals(expectedMessage,contactMessagePage.message.getText());
    }

    @And("Vice Dean Delete butonuna tiklar")
    public void viceDeanDeleteButonunaTiklar() {
        contactMessagePage.deleteButton.click();
    }

    @Then("Vice Dean sayfada istedigi mesajin silindigini dogrular")
    public void viceDeanSayfadaIstedigiMesajinSilindiginiDogrular() {
        Assert.assertEquals(nameFirst,contactMessagePage.nameFirstCreated.getText());
    }
}
