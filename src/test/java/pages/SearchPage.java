package pages;

import base.Selectors;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class SearchPage {

    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void writeSearch() {
        WebElement element = driver.findElement(Selectors.SELECT_BOX);
        element.sendKeys("Kazak" + Keys.ENTER);
    }

    public void selectProduct() {
        driver.findElement(By.id("container")).click();
        List<WebElement> PRODUCT = driver.findElements(Selectors.PRODUCT_LIST);
        PRODUCT.get(9).click();

    }

    public void switchToWindow() {

        String currentWindows = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windows : windowHandles) {
            if (!currentWindows.equals(windows)) {
                driver.switchTo().window(windows);
            }
        }
    }

    public void addFavProduct() {
        driver.findElement(Selectors.ADD_FAV).click();
    }

    //  public String checkProductInfo = driver.findElement(PRODUCT_PRICE_CHECK).getText();

}
