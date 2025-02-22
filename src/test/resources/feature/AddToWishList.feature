Feature: Add to wish list

  Scenario: Successful add to wish list
    Given access link
    When customer search in search bar a firstproduct "avene"
    And click submit button
    And add to wish list firstproduct
    And Customer enters "thegooduser@yahoo.com"
    And Customer clicks continue button
    And Customer enters password "Aa@98765"
    And Customer clicks connect button
    Then current URL contains "/contul-meu"
    When customer search in search bar again a firstproduct "avene"
    And click submit button
    And add to wish list firstproduct
    And select list
    And click wish list
    Then current URL contains "/dashboard/favorite"
