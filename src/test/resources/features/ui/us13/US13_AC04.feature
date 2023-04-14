@US13
Feature: US-13 Vice Dean ogretmen olusturabilmelidir

  Background:

    Given Site adresine gidilir
    And 1 saniye bekler
    When Vice Dean rolu ile login islemi gerceklestirilir
    And 1 saniye bekler
    When Menu butonuna tiklar
    And 1 saniye bekler
    When Teacher Management'a tiklar
    And 1 saniye bekler

  @US13_TC09
  Scenario: TC09_Ogretmen_olusturulurken_Email_alaninin_bos_birakilmamasi

    And Sayfayi Submit butonu gorulecek sekilde asagi kaydirir.
    And 1 saniye bekler
    And Submit tiklanir
    And 1 saniye bekler
    And Birth_Place bos olarak birakilir
    Then Birth_Place_bolumunun_altinda_"Required"_yazisinin_oldugunu_dogrular
    And 1 saniye bekler
    Then Sayfa kapatilir

  @US13_TC10
  Scenario: TC10_Ogretmen_olusturulurken_Email_alaninin_bos_birakilmamasi

    And Ogretmenin girecegi ders "Java" olarak secilir
    And 1 saniye bekler
    And Name "name(faker)" olarak girilir
    And 1 saniye bekler
    And Surname "surname(faker)" olarak girilir
    And 1 saniye bekler
    And BirthPlace alanina " " karakteri girilir
    And 1 saniye bekler
    And Email "email(faker)" olarak girilir
    And 1 saniye bekler
    And Phone number "phone(faker)" olarak girilir
    And 1 saniye bekler
    And Gender female secilir
    And 1 saniye bekler
    And Date of Birth "dateofbirth(faker)" olarak girilir
    And 1 saniye bekler
    And Ssn "ssn(faker)" olarak girilir
    And 1 saniye bekler
    And User Name "username(faker)" olarak  girer
    And 1 saniye bekler
    And Password "password(faker)" olarak girer
    And 1 saniye bekler
    And Submit tiklanir
    And 1 saniye bekler
    Then Hata mesajini goruntuler.
    And 1 saniye bekler
    Then Sayfa kapatilir