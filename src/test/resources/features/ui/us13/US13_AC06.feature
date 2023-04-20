@US13
Feature: US-13 Vice Dean ogretmen olusturabilmelidir

  Background:
    Given Site adresine gidilir
    When Vice Dean rolu ile login islemi gerceklestirilir
    When Menu butonuna tiklar
    When Teacher Management'a tiklar

  @US13_TC19
  Scenario: TC19_Ogretmen_olusturulurken_Phone_Number_alaninin_bos_birakilmamasi
    And Sayfayi Submit butonu gorulecek sekilde asagi kaydirir.
    And Submit tiklanir
    And Phone_Number bos olarak birakilir
    Then Phone_Number_bolumunun_altinda_"Required"_yazisinin_oldugunu_dogrular
    Then Sayfa kapatilir

  @US13_TC20
  Scenario: TC20_Ogretmen_olusturulurken_Phone_Number_alaninin_bos_birakilmamasi
    And Ogretmenin girecegi ders "Java" olarak secilir
    And Name "name(faker)" olarak girilir
    And Surname "surname(faker)" olarak girilir
    And birt place "birthplace(faker)" olarak girilir
    And Email "email(faker)" olarak girilir
    And Phone number alanina formata uygun "789-246-145" girer
    And Gender female secilir
    And Date of Birth "dateofbirth(faker)" olarak girilir
    And Ssn "ssn(faker)" olarak girilir
    And User Name "username(faker)" olarak  girer
    And Password "password(faker)" olarak girer
    And Submit tiklanir
    Then Phone number bolumunun_altinda_"Minimum 12 character"_yazisinin_oldugunu_dogrular
    Then Sayfa kapatilir

  @US13_TC21
  Scenario: TC21_Ogretmen_olusturulurken_Phone_Number_alaninin_bos_birakilmamasi
    And Ogretmenin girecegi ders "Java" olarak secilir
    And Name "name(faker)" olarak girilir
    And Surname "surname(faker)" olarak girilir
    And birt place "birthplace(faker)" olarak girilir
    And Email "email(faker)" olarak girilir
    And Phone number alanina formata uygun "789-246-14500" girer
    And Gender female secilir
    And Date of Birth "dateofbirth(faker)" olarak girilir
    And Ssn "ssn(faker)" olarak girilir
    And User Name "username(faker)" olarak  girer
    And Password "password(faker)" olarak girer
    And Submit tiklanir
    Then Hata mesajini goruntuler.
    Then Sayfa kapatilir