package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GuestUserPage {

    @FindBy(xpath = "//tbody/tr[1]/td[1]")
    public WebElement nameSurnameColumn;

    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    public WebElement phoneNumberColumn;

    @FindBy(xpath = "//tbody/tr[1]/td[3]")
    public WebElement ssnColumn;

    @FindBy(xpath = "//tbody/tr[1]/td[4]")
    public WebElement usernameColumn;

    @FindBy(xpath = "(//*[@class='btn btn-danger'])[1]")
    public WebElement trashBin;

    @FindBy(xpath = "//tbody/tr[1]/td[1]")
    public WebElement firstTableData;


}
