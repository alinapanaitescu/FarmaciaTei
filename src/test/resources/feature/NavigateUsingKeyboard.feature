Feature: Navigate Using Keyboard

  Scenario: Navigate Using Keyboard
    Given access link
    When customer use tab key
    When customer use tab key
    When customer use tab key
    When customer use tab key
    When customer use tab key
    When customer search in search bar a firstproduct "avene"
    And customer use enter key
    Then current URL contains "/cauti/avene"
    When customer use tab key
    When customer use tab key
    When customer use tab key
    When customer use tab key
    When customer use tab key
    When customer use tab key
    When customer use tab key
    When customer use tab key
    When customer use tab key
    When customer use enter key
    Then current URL contains "/login"
    And Customer enters "thegooduser@yahoo.com"
    When customer use enter key
    And Customer enters password "Aa@98765"
    When customer use enter key
    Then current URL contains "/contul-meu"
