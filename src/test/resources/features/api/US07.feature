@US07_API
Feature: Dean rolu ile mesajlari gorebilme

  @api_smoke_test
  Scenario: Dean rolu ile mesajlari gorebilme
    Given Mesajlari gorebilmek icin endpoint hazirlanir US07
    When Dean rolu ile token olusturulur
    And Get request gonderilir US07
    And Status Code'unun 200 oldugu dogrulanir
