package pages;


import base.Selectors;
import org.openqa.selenium.WebDriver;

public class BasketPage {

    WebDriver driver;

    public BasketPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToCard() {
        driver.findElement(Selectors.CLICK_CARD).click();
    }

    public void addBasketProduct() {
        driver.findElement(Selectors.ADD_BASKET).click();
    }


}
