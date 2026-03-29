package com.company.automation.hooks;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;

public class CucumberHooks {

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            attachScreenshot();
        }
        Selenide.closeWebDriver();
    }

    @Attachment(value = "Failure Screenshot", type = "image/png")
    public byte[] attachScreenshot() {
        return Selenide.screenshot(OutputType.BYTES);
    }
}