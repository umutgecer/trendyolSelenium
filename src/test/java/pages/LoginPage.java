package pages;

import base.Selectors;
import base.baseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage extends baseTest {

    WebDriver driver;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public void selectGender() {
        WebElement gender = driver.findElement(Selectors.SELECT_GENDER);
        gender.click();

    }

    public void login() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Selectors.SIGN_IN_HOVER)).build().perform();
        driver.findElement(Selectors.SIGN_IN).click();
    }

    public void writeLoginText() {

        driver.findElement(Selectors.EMAIL_AREA).sendKeys(Selectors.EMAIL);
        driver.findElement(Selectors.PASSWORD_AREA).sendKeys(Selectors.PASSWORD);
        driver.findElement(Selectors.LOGIN_BUTTON).click();
    }


}
