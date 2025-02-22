Feature: Add to cart

  Scenario: Successful add to cart
    Given access link
    When customer search in search bar a firstproduct "avene"
    And click submit button
    And add to cart firstproduct
    And click cart button
    And click purchase button
    Then cart quantity changed to "1"
    Then current URL contains "/cart"
