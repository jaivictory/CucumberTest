package org.jai.test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefination {
    WebDriver driver;
    @Given("user is already on Login Page")
    public void userIsAlreadyOnLoginPage() {
        WebDriverManager.chromedriver ().setup();
        driver= new ChromeDriver();
        driver.get ("https://www.amazon.com/");
    }

    @When("title of login page is Free CRM")
    public void titleOfLoginPageIsFreeCRM() {
    }

    @Then("user enters {string} and {string}")
    public void userEntersAnd(String arg0, String arg1) {
    }

    @Then("user clicks on login button")
    public void userClicksOnLoginButton() {
        
    }

    @Then("user is on home page")
    public void userIsOnHomePage() {
    }
}
