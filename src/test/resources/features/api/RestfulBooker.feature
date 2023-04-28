@restful_booker
Feature: Restful Booker

  @restful_booker_1
  Scenario: Restful Booker Without Generating Token
    Given Endpoint hazirlanir
    When Data hazirlanir
    And Request gonderilip response alinir
    Then Assertion yapilir

  @restful_booker_2
  Scenario: Deneme
    Given Endpoint hazirlanir
#    When Token uretilir
    And Data hazirlanir
    When Request gonderilip response alinir
    Then Assertion yapilir