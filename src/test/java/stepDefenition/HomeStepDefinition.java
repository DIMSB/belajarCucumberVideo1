package stepDefenition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.home.PopUpSignUp;
import pages.homePage;
import utilities.DriverManagerial;

import static org.bouncycastle.cms.RecipientId.password;

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

    @And("fill the username textbox with {string username}")
    public void fillTheUsernameTextboxWith(String username) {
        PopUpSignUp popUpSignUp = new PopUpSignUp();
        popUpSignUp.enterUsername(username);
    }

    @And("i fill the password textbox with {string password}")
    public void iFillThePasswordTextboxWith(String arg0) {
        PopUpSignUp popUpSignUp = new PopUpSignUp();
        popUpSignUp.enterPassword(password);
    }

    @When("I click on the Sign Up Button")
    public void i_click_on_the_Sign_Up_button()  {
        PopUpSignUp popUpSignUp = new PopUpSignUp();
        popUpSignUp.clickPopUpSignUp();


    }

    @Then("I should see Message {string}")
    public void verifiyMessage(String message)  {

    }}


