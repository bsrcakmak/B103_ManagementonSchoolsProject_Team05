package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.DeanManagementPage;
import pages.HomePage;
import pages.MainMenuPanel;
import utilities.Driver;


public class US04_StepDefinition {
    HomePage homePage = new HomePage();
    MainMenuPanel mainMenuPanel = new MainMenuPanel();
    DeanManagementPage deanManagementPage = new DeanManagementPage();

    @When("Menu butonuna tiklar")
    public void menu_butonuna_tiklar() {
        homePage.menuButton.click();
    }

    @Then("Acilan bolumden Dean Management'a tiklar")
    public void acilan_bolumden_dean_management_a_tiklar() {
        mainMenuPanel.deanManagementButton.click();
    }

//    TC01
    @Then("Name alanina tiklar")
    public void name_alanina_tiklar() {
        deanManagementPage.nameBox.click();
    }
    @Then("Required uyarisinin goruntulendigini dogrular")
    public void required_uyarisinin_goruntulendigini_dogrular() {
        Assert.assertTrue(deanManagementPage.nameRequired.isDisplayed());
    }

}
