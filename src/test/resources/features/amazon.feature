Feature: Amazon product add to cart test.
  @amazon
  Scenario: Add product to the cart.
    Given User is on amazon site.
    When User search for the product.
    And User select the product from search list.
    And User add that product to the cart.
    Then User verify the product in cart.
