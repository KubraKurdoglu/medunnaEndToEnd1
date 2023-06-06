package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.MedunnaHomePage;
import pages.MedunnaLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;

public class MedunnaSignInStepDefs {
    MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
    MedunnaLoginPage medunnaLoginPage = new MedunnaLoginPage();


    @Given("go to {string}")
    public void go_to(String url) {

        Driver.getDriver().get(url);

    }
    @When("click in user icon")
    public void click_in_user_icon() {
        medunnaHomePage.userIcon.click();

    }
    @When("click on sign in option")
    public void click_on_sign_in_option() {
        medunnaHomePage.signInOption.click();

    }
    @When("enter username")
    public void enter_username() {
        medunnaLoginPage.usernameInput.sendKeys(ConfigReader.getProperty("medunna_username"));

    }
    @When("enter password")
    public void enter_password() {
        medunnaLoginPage.passwordInput.sendKeys(ConfigReader.getProperty("medunna_password"));

    }
    @When("click on sign in submit button")
    public void click_on_sign_in_submit_button() throws InterruptedException {

        medunnaLoginPage.signInSubmitButton.sendKeys(Keys.PAGE_DOWN);
        medunnaLoginPage.signInSubmitButton.click();
        Thread.sleep(3000);


    }


}
