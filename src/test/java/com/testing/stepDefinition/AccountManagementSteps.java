package com.testing.stepDefinition;

import com.testing.cucumber.Hooks;
import com.testing.pageObject.CreateAccountPagePO;
import com.testing.pageObject.HomePagePO;
import com.testing.pageObject.SignInPO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AccountManagementSteps {
    WebDriver driver = Hooks.driver;
    @Given("I am on create an account page")
    public void iAmOnCreateAnAccountPage() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickCreateAccountLink();
    }

    @When("I enter {string} {string} {string} {string} {string}")
    public void iEnter(String FirstName, String LastName, String Email, String Password, String ConfirmPassword) {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterFirstName(FirstName);
        createAccountPagePO.enterLastName(LastName);
        createAccountPagePO.enterEmailAddress(Email);
        createAccountPagePO.enterPassword(Password);
        createAccountPagePO.enterConfirmPassword(ConfirmPassword);

    }

    @And("I click on create an account")
    public void iClickOnCreateAnAccount() {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.clickCreateAccountButton();

    }

    @Then("My account page is displayed")
    public void myAccountPageIsDisplayed() {
    }

    @Given("I am on Account Sign in")
    public void iAmOnAccountSignIn() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickSignInLInk();

    }

    @When("I enter {string} {string}")
    public void iEnter(String Email, String Password) {
        SignInPO signInPO = new SignInPO(driver);
        signInPO.enterEmail(Email);
        signInPO.enterPassword(Password);

    }

    @And("I click on sign in")
    public void iClickOnSignIn() {
        SignInPO signInPO = new SignInPO(driver);
        signInPO.setSignInButton();

    }



    @Then("My sign in page displayed")
    public void mySignInPageDisplayed() {
    }
}
