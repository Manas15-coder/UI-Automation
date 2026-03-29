package com.company.automation.pages;

import com.codeborne.selenide.SelenideElement;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.*;

@Component
public class LoginPage {

    private SelenideElement username = $("#user-name");
    private SelenideElement password = $("#password");
    private SelenideElement loginBtn = $("#login-button");

    @Value("${app.url}")
    private String url;

    @Value("${app.username}")
    private String user;

    @Value("${app.password}")
    private String pass;

    public void openLoginPage() {
        open(url);
    }

    public void login() {
        username.setValue(user);
        password.setValue(pass);
        loginBtn.click();
    }
}