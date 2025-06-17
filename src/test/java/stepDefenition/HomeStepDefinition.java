package stepDefenition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.home.PopUpSignUp;
import pages.homePage;
import utilities.AllertHandler;
import utilities.DriverManagerial;

import java.time.Duration;


public class HomeStepDefinition  {

    @Given("User is in home Page")
    public void user_is_in_home_page()  {
        DriverManagerial.getDriver().get("https://demoblaze.com/index.html");

    }


    @When("user click sign Up Button")
    public void user_click_sign_Up_button() {
       homePage homepagis = new homePage();
       homepagis.clickSignUpLink();
    }

    @And("fill the username textbox with {string}")
    public void fillTheUsernameTextboxWith(String username) {
        PopUpSignUp popUpSignUp = new PopUpSignUp();
        popUpSignUp.enterUsername(username);
    }

    @And("i fill the password textbox with {string}")
    public void iFillThePasswordTextboxWith(String password)
    {PopUpSignUp popUpSignUp = new PopUpSignUp();
        popUpSignUp.enterPassword(password);
    }

    @When("I click on the Sign Up Button")
    public void i_click_on_the_Sign_Up_button()  {
        PopUpSignUp popUpSignUp = new PopUpSignUp();
        popUpSignUp.clickPopUpSignUp();


    }

    @Then("I should see Message {string}")
    public void verifiyMessage(String message)  {
        WebDriver driver = DriverManagerial.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        AllertHandler allertHandler = new AllertHandler();
        String actualAllertMessage= allertHandler.getAlertText();
        System.out.println("actual Allert Message" +actualAllertMessage);

    }


}


