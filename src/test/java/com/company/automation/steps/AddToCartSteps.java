package com.company.automation.steps;

import com.company.automation.pages.AddToCartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class AddToCartSteps {

    @Autowired
    private AddToCartPage addToCartPage;

    @When("user adds item to cart")
    public void userAddsItemToCart() {
        addToCartPage.addItemToCart();
    }

    @When("user opens cart")
    public void userOpensCart() {
        addToCartPage.openCart();
    }

    @Then("item should be visible in cart")
    public void itemShouldBeVisibleInCart() {
        addToCartPage.verifyItemInCart();
    }
}