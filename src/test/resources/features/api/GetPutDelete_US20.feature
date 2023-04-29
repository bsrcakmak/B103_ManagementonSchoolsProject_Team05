@US20
Feature: Teacher rolu ile toplantilarin goruntulenmesi ile guncellenmesi ve silinmesi

  # Get Request
  @US20_TC1
  Scenario: Toplanti goruntuleme
    Given Toplanti goruntulemek icin endpoint hazirlanir US20_TC01
    # Token CommonStepDefinition'dan aliniyor
    When Teacher rolu ile token olusturulur
    And Get request gonderilir US20_TC01
    # Status Code CommonStepDefinition'dan aliniyor
    Then Status Code'unun 200 oldugu dogrulanir

  # Put Request
  @US20_TC2
  Scenario: Toplanti guncelleme
    Given Toplanti guncellemek icin endpoint hazirlanir US20_TC02
    # Token CommonStepDefinition'dan aliniyor
    When Teacher rolu ile token olusturulur
    And Data hazirlanir US20_TC02
    When Put request gonderilir US20_TC02
    # Status Code CommonStepDefinition'dan aliniyor
    Then Status Code'unun 200 oldugu dogrulanir
    Then Hazirlanan data ile toplantinin guncellendigi dogrulanir US20_TC02

  # Delete Request
  @US20_TC3
  Scenario: Toplanti silme
    Given Toplanti silmek icin endpoint hazirlanir US20_TC03
    # Token CommonStepDefinition'dan aliniyor
    When Teacher rolu ile token olusturulur
    And Delete request gonderilir US20_TC03
    # Status Code CommonStepDefinition'dan aliniyor
    Then Status Code'unun 200 oldugu dogrulanir