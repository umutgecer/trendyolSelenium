package base;

import org.junit.Test;
import pages.BasketPage;
import pages.LoginPage;
import pages.SearchPage;

import java.util.concurrent.TimeUnit;

public class


appTest extends baseTest {

    LoginPage loginPage;
    BasketPage basketPage;
    SearchPage searchPage;

    @Test
    public void appTest() throws InterruptedException {
        loginPage = new LoginPage(driver);
        searchPage = new SearchPage(driver);
        basketPage = new BasketPage(driver);
        loginPage.selectGender();
        loginPage.login();
        TimeUnit.SECONDS.sleep(1);
        loginPage.writeLoginText();
        TimeUnit.SECONDS.sleep(1);
        searchPage.writeSearch();
        searchPage.selectProduct();
        searchPage.switchToWindow();
        searchPage.addFavProduct();
        basketPage.addBasketProduct();
        TimeUnit.SECONDS.sleep(1);
        basketPage.goToCard();

    }
}
