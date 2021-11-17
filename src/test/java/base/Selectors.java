package base;

import org.openqa.selenium.By;

public class Selectors {

    public static final By ADD_BASKET = By.cssSelector(".add-to-basket");
    public static final By CLICK_CARD = By.cssSelector(".goBasket");

    public static final By SELECT_GENDER = new By.ByCssSelector(".homepage-popup-content img[alt='Male']");
    public static final By SIGN_IN_HOVER = By.xpath("//p[contains(text(),'Giriş Yap')]");
    public static final By SIGN_IN = new By.ByCssSelector("div[class='login-button']");
    public static final String EMAIL = "test@mail.com";
    public static final String PASSWORD = "password123";
    public static final By EMAIL_AREA = By.id("login-email");
    public static final By PASSWORD_AREA = By.id("login-password-input");
    public static final By LOGIN_BUTTON = new By.ByCssSelector(".q-primary > span");


    public static final By SELECT_BOX = By.className("search-box");
    public static final By PRODUCT_LIST = By.cssSelector("div[class='image-container']");
    public static final By ADD_FAV = By.cssSelector(".fv>.i-heart");
    public final By GO_TO_CARD = By.cssSelector(".add-to-basket");
    public static final By PRODUCT_PRICE_CHECK = By.cssSelector("div.product-price-container > div.pr-bx-w  > div > span.prc-slg");

}
