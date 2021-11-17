package base;

import org.junit.After;
import org.junit.Before;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class baseTest {

    public WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofMillis(05));
        System.out.println("Test Başlıyor...");
        driver.get("https://www.trendyol.com/");
        driver.manage().deleteAllCookies();
    }

    @After
    public void tearDown() {
        if (driver != null)
            // driver.close();
            System.out.println("Test Bitiyor...");
        driver = null;

    }

}
