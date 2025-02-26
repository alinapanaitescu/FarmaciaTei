Feature: Login

  @Sanity
  Scenario: Successful login
    Given access link
    When click my account button
    And Customer enters "thegooduser@yahoo.com"
    And Customer clicks continue button
    And Customer enters password "Aa@98765"
    And Customer clicks connect button
    Then current URL contains "/contul-meu"