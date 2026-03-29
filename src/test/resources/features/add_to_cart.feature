Feature: Add to Cart

  Scenario: Add item to cart after login
    Given user is on login page
    When user logs in
    And user adds item to cart
    And user opens cart
    Then item should be visible in cart