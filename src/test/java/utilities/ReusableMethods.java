package utilities;

import com.github.javafaker.Faker;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import pages.HomePage;
import pages.LoginPage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;
import java.util.function.Function;
public class ReusableMethods {
    /*HOW DO YOU GET SCREENSHOT?
     * I use getScreenShotAs method to take a screenshot in selenium in my framework
     * I actually store the screenshot with unique name in my framework*/
    public static String getScreenshot(String name) throws IOException {
//        THIS METHOD TAKES SCREENSHOT AND STORE IN /test-output FOLDER
//        NAME OF THE SCREEN IS BASED ON THE CURRENT TIME
//        SO THAN WE CAN HAVE UNIQUE NAME
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
//        public static final String path = date.toString();
        // TakesScreenshot is an interface of selenium that takes the screenshot. SAME IS IN THE HOOKS
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }
    //========Switching Window=====//
    public static void switchToWindow(int windowNumber) {
        List<String> list = new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(list.get(windowNumber));
    }
    //========Hover Over=====//
    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }
    //==========Return a list of string given a list of Web Element====////
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }
    //========Returns the Text of the element given an element locator==//
    public static List<String> getElementsText(By locator) {
        List<WebElement> elems = Driver.getDriver().findElements(locator);
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : elems) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }
    //   HARD WAIT WITH THREAD.SLEEP
//   waitFor(5);  => waits for 5 second
    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //===============Explicit Wait==============//
    public static WebElement waitForVisibility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static WebElement waitForVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static WebElement waitForClickablility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public static void clickWithTimeOut(WebElement element, int timeout) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            } catch (WebDriverException e) {
                waitFor(1);
            }
        }
    }
    public static void waitForPageToLoad(long timeout) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        try {
            System.out.println("Waiting for page to load...");
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
            wait.until(expectation);
        } catch (Throwable error) {
            System.out.println(
                    "Timeout waiting for Page Load Request to complete after " + timeout + " seconds");
        }
    }
    //======Fluent Wait====//
    public static WebElement fluentWait(final WebElement webElement, int timeout) {
        //FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver()).withTimeout(timeinsec, TimeUnit.SECONDS).pollingEvery(timeinsec, TimeUnit.SECONDS);
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver())
                .withTimeout(Duration.ofSeconds(3))//Wait 3 second each time
                .pollingEvery(Duration.ofSeconds(1));//Check for the element every 1 second
        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return webElement;
            }
        });
        return element;
    }
    /**
     * Performs double click action on an element
     * @param element
     */
    public static void doubleClick(WebElement element) {
        new Actions(Driver.getDriver()).doubleClick(element).build().perform();
    }
    /**
     * @param element
     * @param check
     */
    public static void selectCheckBox(WebElement element, boolean check) {
        if (check) {
            if (!element.isSelected()) {
                element.click();
            }
        } else {
            if (element.isSelected()) {
                element.click();
            }
        }
    }
    /**
     * Selects a random value from a dropdown list and returns the selected Web Element
     * @param select
     * @return
     */
    public static WebElement selectRandomTextFromDropdown(Select select) {
        Random random = new Random();
        List<WebElement> weblist = select.getOptions();
        int optionIndex = 1 + random.nextInt(weblist.size() - 1);
        select.selectByIndex(optionIndex);
        return select.getFirstSelectedOption();
    }

    public static void scrollIntoViewJS(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",element);
    }

    public static void scrollEndJS(){
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    public static void scrollTopJS(){
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
    }

    public static void clickByJS(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].click();",element);
    }


    public static void typeWithJS(WebElement element, String metin){
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].setAttribute('value','"+metin+"')",element);
    }

    public static void getValueByJS(String idOfElement) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String text = js.executeScript("return document.getElementById('" + idOfElement + "').value").toString();
        System.out.println("Kutudaki value: " + text);
//        NOT: document.querySelector("p").value;  -> TAG KULLANILABILIR
//             document.querySelector(".example").value; -> CSS DEGERI KULLANILABILIR
//             document.querySelector("#example").value; -> CSS DEGERI KULLANILABILIR
    }

    public static void login(String username, String password) {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        homePage.loginButton.click();
        loginPage.username.sendKeys(ConfigReader.getProperty(username));
        loginPage.password.sendKeys(ConfigReader.getProperty(password));
        loginPage.loginButton.click();
    }

    public static void selectFromDropdownByIndex(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public static String createName() {
        Faker faker = new Faker();
        return faker.name().firstName();
    }

    public static String createSurname() {
        Faker faker = new Faker();
        return faker.name().lastName();
    }

    public static String createBirthPlace() {
        Faker faker = new Faker();
        return faker.address().cityName();
    }

    public static String createEmail() {
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }

    public static String createPhone() {
        Faker faker = new Faker();
        int firstNumberOfThePhone = faker.number().randomDigit();
        int secondNumberOfThePhone = faker.number().randomDigit();
        int thirdNumberOfThePhone = faker.number().randomDigit();
        int fourthNumberOfThePhone = faker.number().randomDigit();
        int fifthNumberOfThePhone = faker.number().randomDigit();
        int sixthNumberOfThePhone = faker.number().randomDigit();
        int seventhNumberOfThePhone = faker.number().randomDigit();
        int eighthNumberOfThePhone = faker.number().randomDigit();
        int ninthNumberOfThePhone = faker.number().randomDigit();
        int tenthNumberOfThePhone = faker.number().randomDigit();
        String phone = firstNumberOfThePhone +
                        secondNumberOfThePhone +
                        thirdNumberOfThePhone +
                        "-" +
                        fourthNumberOfThePhone +
                        fifthNumberOfThePhone +
                        sixthNumberOfThePhone +
                        "-" +
                        seventhNumberOfThePhone +
                        eighthNumberOfThePhone +
                        ninthNumberOfThePhone +
                        tenthNumberOfThePhone;
        return phone;
    }

    public static String createDateOfBirth() {
        Faker faker = new Faker();
        int year = faker.number().numberBetween(1958, 2023);
        int month = faker.number().numberBetween(1, 12);
        int day = faker.number().numberBetween(1, 28);
        String dateOfBirth = day + "." + month + "." + year;
        return dateOfBirth;
    }

    public static String createSSN() {
        Faker faker = new Faker();
        int firstNumberOfThePhone = faker.number().randomDigit();
        int secondNumberOfThePhone = faker.number().randomDigit();
        int thirdNumberOfThePhone = faker.number().randomDigit();
        int fourthNumberOfThePhone = faker.number().randomDigit();
        int fifthNumberOfThePhone = faker.number().randomDigit();
        int sixthNumberOfThePhone = faker.number().randomDigit();
        int seventhNumberOfThePhone = faker.number().randomDigit();
        int eighthNumberOfThePhone = faker.number().randomDigit();
        int ninthNumberOfThePhone = faker.number().randomDigit();
        String phone = firstNumberOfThePhone +
                secondNumberOfThePhone +
                thirdNumberOfThePhone +
                "-" +
                fourthNumberOfThePhone +
                fifthNumberOfThePhone +
                "-" +
                sixthNumberOfThePhone +
                seventhNumberOfThePhone +
                eighthNumberOfThePhone +
                ninthNumberOfThePhone;
        return phone;
    }

    public static String createUserName() {
        Faker faker = new Faker();
        return faker.name().username();
    }

    public static String createFatherName() {
        Faker faker = new Faker();
        return faker.name().firstName();
    }

    public static String createMotherName() {
        Faker faker = new Faker();
        return faker.name().firstName();
    }

    public static String createPassword() {
        Faker faker = new Faker();
        return faker.internet().password();
    }

}