Feature: FailedLogin

   Scenario Outline: Failed login
    Given access link
    When click my account button
    And Customer enters "<email>"
    And Customer clicks continue button
    And Customer enters password "<password>"
    And Customer clicks connect button
    Then an error message is displayed "<expected>"

     Examples:
     |  email                | password | expected             |
     | thegooduser@yahoo.com | Aa@98761 | invalid password     |
     | gooduser@yahoo.com    | Aa@98765 |  invalid email       |
