package utilities;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utilities.DriverManagerial.driver;

public class AllertHandler {

    public String getAlertText(){
    String alertText = driver.switchTo().alert().getText();
    return alertText;
    }

    public void waitAllert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.alertIsPresent());

    }

    public void acceptAllert() {
        driver.switchTo().alert().getText();

    }
}
