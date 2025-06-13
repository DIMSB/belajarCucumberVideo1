package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverManagerial;

public class BasePage {

    protected WebDriver driver;

    public BasePage(){
        this.driver = DriverManagerial.getDriver();
        PageFactory.initElements(driver,this);

    }
}
