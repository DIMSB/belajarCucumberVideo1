package pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class PopUpSignUp extends BasePage {

    @FindBy(id = "sign-username")
    WebElement signUsername;

    @FindBy(id = "sign-password")
    WebElement signPassword;

    @FindBy(xpath = "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
    WebElement signInButton;

    public void enterUsername(String username) {
        waitForElementVisible(signUsername); // wait here
        signUsername.clear();
        signUsername.sendKeys(username);
    }
    public void enterPassword(String password)
    {
        waitForElementVisible(signPassword); // wait here
        signPassword.clear();
        signPassword.sendKeys(password);
    }
    public void clickPopUpSignUp() {
        waitForElementClickable(signInButton); // optional
        signInButton.click();


    }

}
