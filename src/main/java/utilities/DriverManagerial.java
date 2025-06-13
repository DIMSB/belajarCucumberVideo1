package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManagerial {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = WebDriverManager.chromedriver().create();
            driver.manage().window().maximize();
            driver.get("https://demoblaze.com/index.html");
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
