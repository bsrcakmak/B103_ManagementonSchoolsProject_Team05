package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ContactMessagePage;
import pages.HomePage;
import pages.MainMenuPanel;

public class US07_StepDefinition {

    HomePage homePage = new HomePage();
    MainMenuPanel mainMenuPanel = new MainMenuPanel();
    ContactMessagePage contactMessagePage = new ContactMessagePage();

    public String expectedName = "Name";
    public String expectedEmail = "Email";
    public String expectedDate = "Date";
    public String expectedSubject = "Subject";
    public String expectedMessage = "Message";
    public String nameFirst = contactMessagePage.nameFirstCreated.getText();

    @And("Dean Menu butonuna tiklar")
    public void deanMenuButonunaTiklar() {
        homePage.menuButton.click();
    }

    @And("Dean Contact Get All yazisina tiklar")
    public void deanContactGetAllYazisinaTiklar() {
        mainMenuPanel.contactGetAllButton.click();
    }

    @Then("Dean sayfada mesaj yazarlarinin goruntulendigini dogrular")
    public void deanSayfadaMesajYazarlarininGoruntulendiginiDogrular() {
        Assert.assertEquals(expectedName,contactMessagePage.name.getText());
    }

    @Then("Dean sayfada mesaj yazarlarina ait emaillerin goruntulendigini dogrular")
    public void deanSayfadaMesajYazarlarinaAitEmaillerinGoruntulendiginiDogrular() {
        Assert.assertEquals(expectedEmail,contactMessagePage.email.getText());
    }

    @Then("Dean sayfada mesajlarin gonderilme tarihinin goruntulendigini dogrular")
    public void deanSayfadaMesajlarinGonderilmeTarihininGoruntulendiginiDogrular() {
        Assert.assertEquals(expectedDate,contactMessagePage.date.getText());
    }

    @Then("Dean sayfada mesajlarin subject bilgisinin goruntulendigini dogrular")
    public void deanSayfadaMesajlarinSubjectBilgisininGoruntulendiginiDogrular() {
        Assert.assertEquals(expectedSubject,contactMessagePage.subject.getText());
    }

    @Then("Dean sayfada mesajlarin goruntulendigini dogrular")
    public void deanSayfadaMesajlarinGoruntulendiginiDogrular() {
        Assert.assertEquals(expectedMessage,contactMessagePage.message.getText());
    }

    @And("Dean Delete butonuna tiklar")
    public void deanDeleteButonunaTiklar() {
        contactMessagePage.deleteButton.click();
    }

    @Then("Dean sayfada istedigi mesajin silindigini dogrular")
    public void deanSayfadaIstedigiMesajinSilindiginiDogrular() {
        Assert.assertEquals(nameFirst,contactMessagePage.nameFirstCreated.getText());
    }
}
