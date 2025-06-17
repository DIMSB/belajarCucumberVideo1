package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverManagerial;

public class JSAllert  {

    WebDriver driver;

            public JSAllert() {
        this.driver = DriverManagerial.getDriver();
        PageFactory.initElements(driver,this);

            }

    @FindBy(xpath = "/html/body/div/div/div[3]/main/div/div/div[1]/button")
    WebElement buttonShowAlert;

    public void clickButtonShowAllert() {
        buttonShowAlert.click();
    }
}

