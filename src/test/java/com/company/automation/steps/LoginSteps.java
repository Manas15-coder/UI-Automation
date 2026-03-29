package com.company.automation.steps;

import com.company.automation.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginSteps {

    @Autowired
    private LoginPage loginPage;

    @Given("user is on login page")
    public void openPage() {
        loginPage.openLoginPage();
    }

    @When("user logs in")
    public void login() {
        loginPage.login();
    }
}