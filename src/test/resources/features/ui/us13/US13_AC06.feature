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

  @US13_TC19
  Scenario: TC19_Ogretmen_olusturulurken_Phone_Number_alaninin_bos_birakilmamasi

    And Sayfayi Submit butonu gorulecek sekilde asagi kaydirir.
    And 1 saniye bekler
    And Submit tiklanir
    And 1 saniye bekler
    And Phone_Number bos olarak birakilir
    Then Phone_Number_bolumunun_altinda_"Required"_yazisinin_oldugunu_dogrular
    And 1 saniye bekler
    Then Sayfa kapatilir

  @US13_TC20
  Scenario: TC20_Ogretmen_olusturulurken_Phone_Number_alaninin_bos_birakilmamasi

    And Ogretmenin girecegi ders "Java" olarak secilir
    And 2 saniye bekler
    And Name "name(faker)" olarak girilir
    And 1 saniye bekler
    And Surname "surname(faker)" olarak girilir
    And 1 saniye bekler
    And birt place "birthplace(faker)" olarak girilir
    And 1 saniye bekler
    And Email "email(faker)" olarak girilir
    And 1 saniye bekler
    And Phone number alanina formata uygun "789-246-145" girer
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
    Then Phone number bolumunun_altinda_"Minimum 12 character"_yazisinin_oldugunu_dogrular
    And 1 saniye bekler
    Then Sayfa kapatilir

  @US13_TC21
  Scenario: TC21_Ogretmen_olusturulurken_Phone_Number_alaninin_bos_birakilmamasi

    And Ogretmenin girecegi ders "Java" olarak secilir
    And 2 saniye bekler
    And Name "name(faker)" olarak girilir
    And 1 saniye bekler
    And Surname "surname(faker)" olarak girilir
    And 1 saniye bekler
    And birt place "birthplace(faker)" olarak girilir
    And 1 saniye bekler
    And Email "email(faker)" olarak girilir
    And 1 saniye bekler
    And Phone number alanina formata uygun "789-246-14500" girer
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

