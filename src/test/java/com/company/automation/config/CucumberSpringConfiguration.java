package com.company.automation.config;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = SauceDemoConfig.class)
public class CucumberSpringConfiguration {
}