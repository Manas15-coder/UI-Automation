package com.company.automation.config;

import com.codeborne.selenide.Configuration;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@org.springframework.context.annotation.Configuration
@ComponentScan("com.company.automation")
@PropertySource("classpath:application.properties")   // ✅ ADD THIS
public class SauceDemoConfig {

    @Value("${app.url}")
    private String url;

    @Value("${browser}")
    private String browser;

    @Value("${timeout}")
    private long timeout;

    @PostConstruct
    public void setup() {
        Configuration.baseUrl = url;
        Configuration.browser = browser;
        Configuration.timeout = timeout;
        Configuration.browserSize = "1920x1080";
    }
}