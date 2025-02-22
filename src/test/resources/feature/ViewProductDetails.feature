Feature: View product details

  Scenario: User search a product and want to see details about that product
    Given access link
    When customer search in search bar a firstproduct "avene"
    And click submit button
    And user click on a specific firstproduct
    Then current URL contains "/dermato-cosmetice/fata/acnee/concentrat-anti-imperfectiuni-pentru-ten-cu-tendinta-acneica-cleanance-comedomed-30-ml-avene-p343507"