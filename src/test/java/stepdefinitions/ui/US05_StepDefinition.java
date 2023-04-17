package stepdefinitions.ui;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DeanManagementPage;
import pages.HomePage;
import pages.MainMenuPanel;
import utilities.Driver;
import utilities.ReusableMethods;

public class US05_StepDefinition {
    HomePage homePage = new HomePage();
    MainMenuPanel mainMenuPanel = new MainMenuPanel();
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    Actions actions = new Actions(Driver.getDriver());


    //  ------------    TC01   ---------------
    @Then("Dean'lerin Name bilgilerinin gorunur oldugunu dogrular")
    public void dean_lerin_name_bilgilerinin_gorunur_oldugunu_dogrular() {
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).build().perform();
        Assert.assertTrue(deanManagementPage.firstName.isDisplayed());
        ReusableMethods.waitFor(2);
    }


    //  ------------    TC02   ---------------
    @Then("Dean'lerin Gender bilgilerinin gorunur oldugunu dogrular")
    public void deanLerinGenderBilgilerininGorunurOldugunuDogrular() {
        ReusableMethods.waitForClickablility(deanManagementPage.firstName,5);
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).build().perform();
        Assert.assertTrue(deanManagementPage.firstGender.isDisplayed());
        ReusableMethods.waitFor(2);

    }


    //  ------------    TC03   ---------------
    @Then("Dean'lerin Phone Number bilgilerinin gorunur oldugunu dogrular")
    public void deanLerinPhoneNumberBilgilerininGorunurOldugunuDogrular() {
        ReusableMethods.waitForClickablility(deanManagementPage.firstName,5);
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).build().perform();
        Assert.assertTrue(deanManagementPage.firstPhone.isDisplayed());
        ReusableMethods.waitFor(2);
    }


    //  ------------    TC04   ---------------
    @Then("Dean'lerin SSN bilgilerinin gorunur oldugunu dogrular")
    public void deanLerinSSNBilgilerininGorunurOldugunuDogrular() {
        ReusableMethods.waitForClickablility(deanManagementPage.firstName,5);
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).build().perform();
        Assert.assertTrue(deanManagementPage.firstSsn.isDisplayed());
        ReusableMethods.waitFor(2);

    }


    //  ------------    TC05   ---------------
    @Then("Dean'lerin User Name bilgilerinin gorunur oldugunu dogrular")
    public void deanLerinUserNameBilgilerininGorunurOldugunuDogrular() {
        ReusableMethods.waitForClickablility(deanManagementPage.firstName,5);
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).build().perform();
        Assert.assertTrue(deanManagementPage.firstUserName.isDisplayed());
        ReusableMethods.waitFor(2);

    }
}
