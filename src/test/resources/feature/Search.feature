Feature: Search

  Scenario: Successful search
    Given access link
    When customer search in search bar a firstproduct "avene"
    And click submit button
    Then current URL contains "/cauti/avene"
    And Customer clicks products button
    And customer click prescription drugs
    And customer click insulins button
    Then current URL contains "/medicamente-cu-reteta/insuline/"