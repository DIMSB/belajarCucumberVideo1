//package stepDefenition;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.WebDriver;
//import pages.JSAllert;
//import utilities.AllertHandler;
//import utilities.DriverManagerial;
//
//public class AllertStepDefinition {
//    @Given("i on a web {string}")
//    public void iOnAWeb(String Url) {
//        DriverManagerial.getDriver().get(Url);
//
//    }
//
//    @When("I click Show Alert")
//    public void iClickShowAlert() throws InterruptedException {
//        Thread.sleep(200);
//        JSAllert jsAllert= new JSAllert();
//        jsAllert.clickButtonShowAllert();
//
//    }
//
//    @Then("i should see allert message {string}")
//    public void iShouldSeeAllertMessage(String arg0) throws InterruptedException {
//        Thread.sleep(200);
//        AllertHandler allertHandler = new AllertHandler();
//        String actualAllertMessage = allertHandler.getAlertText();
//        System.out.printf("actual allert Message" +actualAllertMessage);
//    }
//}
