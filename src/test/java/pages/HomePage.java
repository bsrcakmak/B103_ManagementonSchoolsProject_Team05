package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Home Page -> Login Button
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginButton;

    // HomePage -> registerButton
    @FindBy(xpath = "//*[@class='fa fa-registered']")
    public WebElement registerButton;

}
