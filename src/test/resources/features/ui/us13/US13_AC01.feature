@US13
Feature: US-13 Vice Dean ogretmen olusturabilmelidir

  Background:
    Given Site adresine gidilir
    When Vice Dean rolu ile login islemi gerceklestirilir
    When Menu butonuna tiklar
    When Teacher Management'a tiklar

  @US13_TC01 @smokeTest
  Scenario: TC01_Vice_Dean_olarak_ogretmen_olusturma
    And Ogretmenin girecegi ders secilir
    And Name "name(faker)" olarak girilir
    And Surname "surname(faker)" olarak girilir
    And birt place "birthplace(faker)" olarak girilir
    And Email "email(faker)" olarak girilir
    And Phone number "phone(faker)" olarak girilir
    And Gender female secilir
    And Date of Birth "dateofbirth(faker)" olarak girilir
    And Ssn "ssn(faker)" olarak girilir
    And User Name "username(faker)" olarak  girer
    And Password "password(faker)" olarak girer
    And Submit tiklanir
    Then Islemin gerceklestigine dair popUp mesajini goruntuler
    Then Sayfa kapatilir

  @US13_TC02
  Scenario: TC02_Ogretmen_olusturulurken_ders_secim_alanin_bos_birakilmasi
    And Name "name(faker)" olarak girilir
    And Surname "surname(faker)" olarak girilir
    And birt place "birthplace(faker)" olarak girilir
    And Email "email(faker)" olarak girilir
    And Phone number "phone(faker)" olarak girilir
    And Gender female secilir
    And Date of Birth "dateofbirth(faker)" olarak girilir
    And Ssn "ssn(faker)" olarak girilir
    And User Name "username(faker)" olarak  girer
    And Password "password(faker)" olarak girer
    And Submit tiklanir
    Then Ders secim alani bos birakildigi icin hata mesaji alir
    Then Sayfa kapatilir

  @US13_TC03
  Scenario: TC03_Ogretmen_olustururken_ders_secimi
    And Name "name(faker)" olarak girilir
    And Surname "surname(faker)" olarak girilir
    And birt place "birthplace(faker)" olarak girilir
    And Email "email(faker)" olarak girilir
    And Phone number "phone(faker)" olarak girilir
    And Gender female secilir
    And Date of Birth "dateofbirth(faker)" olarak girilir
    And Ssn "ssn(faker)" olarak girilir
    And User Name "username(faker)" olarak  girer
    And Password "password(faker)" olarak girer
    And Ogretmenin girecegi ders "Java" olarak secilir
    And Submit tiklanir
    Then Islemin gerceklestigine dair popUp mesajini goruntuler
    Then Sayfa kapatilir

  @US13_TC04
  Scenario: TC04_Ogretmen_olustururken_ders_secimi
    And Ogretmenin girecegi ders "Java" olarak secilir
    And Name "name(faker)" olarak girilir
    And Surname "surname(faker)" olarak girilir
    And birt place "birthplace(faker)" olarak girilir
    And Email "email(faker)" olarak girilir
    And Phone number "phone(faker)" olarak girilir
    And Gender female secilir
    And Date of Birth "dateofbirth(faker)" olarak girilir
    And Ssn "ssn(faker)" olarak girilir
    And User Name "username(faker)" olarak  girer
    And Password "password(faker)" olarak girer
    And Choose Lessons kismindan secili dersi siler.
    And Ogretmenin girecegi ders  tekrar "Java" olarak secilir
    And Submit tiklanir
    Then Islemin gerceklestigine dair popUp mesajini goruntuler
    Then Sayfa kapatilir