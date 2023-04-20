@US13
Feature: US-13 Vice Dean ogretmen olusturabilmelidir

  Background:
    Given Site adresine gidilir
    When Vice Dean rolu ile login islemi gerceklestirilir
    When Menu butonuna tiklar
    When Teacher Management'a tiklar

  @US13_TC22
  Scenario: TC22_Öğretmenin danışmanlığı varsa "Is Advisor Teacher" seçeneğini seçilebilme
    And Ogretmenin girecegi ders "Java" olarak secilir
    And Name "name(faker)" olarak girilir
    And Surname "surname(faker)" olarak girilir
    And birt place "birthplace(faker)" olarak girilir
    And Email "email(faker)" olarak girilir
    And Phone number "phone(faker)" olarak girilir
    And "is Advisor Teacher" secenegini isaretler
    And Gender female secilir
    And Date of Birth "dateofbirth(faker)" olarak girilir
    And Ssn "ssn(faker)" olarak girilir
    And User Name "username(faker)" olarak  girer
    And Password "password(faker)" olarak girer
    And Submit tiklanir
    Then Islemin gerceklestigine dair popUp mesajini goruntuler
    Then Sayfa kapatilir