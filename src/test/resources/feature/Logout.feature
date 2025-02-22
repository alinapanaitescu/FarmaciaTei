Feature: Logout

  Scenario: Successful logout
    Given access link
    When click my account button
    And Customer enters "thegooduser@yahoo.com"
    And Customer clicks continue button
    And Customer enters password "Aa@98765"
    And Customer clicks connect button
    And Customer click logout button
    Then current URL contains "https://comenzi.farmaciatei.ro/"