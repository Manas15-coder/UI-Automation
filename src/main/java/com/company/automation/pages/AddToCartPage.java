package com.company.automation.pages;

import com.codeborne.selenide.SelenideElement;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

@Component
public class AddToCartPage {

    private SelenideElement addToCartBtn = $("#add-to-cart-sauce-labs-backpack");
    private SelenideElement cartIcon = $(".shopping_cart_link");
    private SelenideElement cartItem = $(".inventory_item_name");

    public void addItemToCart() {
        addToCartBtn.click();
    }

    public void openCart() {
        cartIcon.click();
    }

    public void verifyItemInCart() {
        cartItem.shouldBe(visible);
    }
}