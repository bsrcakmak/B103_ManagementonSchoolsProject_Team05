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

  @US13_TC11
  Scenario: TC11_Ogretmen_olusturulurken_Birth_Place_alaninin_bos_birakilmamasi

    And Sayfayi Submit butonu gorulecek sekilde asagi kaydirir.
    And 1 saniye bekler
    And Submit tiklanir
    And 1 saniye bekler
    And Email bos olarak birakilir
    Then Email_bolumunun_altinda_"Required"_yazisinin_oldugunu_dogrular
    And 1 saniye bekler
    Then Sayfa kapatilir

  @US13_TC12
  Scenario: TC12_Ogretmen_olusturulurken_Email_alanina_gecersiz_email_girilmesi

    And Ogretmenin girecegi ders "Java" olarak secilir
    And 1 saniye bekler
    And Name "name(faker)" olarak girilir
    And 1 saniye bekler
    And Surname "surname(faker)" olarak girilir
    And 1 saniye bekler
    And birt place "birthplace(faker)" olarak girilir
    And 1 saniye bekler
    And Email alanina _abc_ formatinda email karakteri girilir
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

  @US13_TC13
  Scenario: TC13_Ogretmen_olusturulurken_Email_alanina_gecersiz_email_girilmesi

    And Ogretmenin girecegi ders "Java" olarak secilir
    And 1 saniye bekler
    And Name "name(faker)" olarak girilir
    And 1 saniye bekler
    And Surname "surname(faker)" olarak girilir
    And 1 saniye bekler
    And birt place "birthplace(faker)" olarak girilir
    And 1 saniye bekler
    And Email alanina _abc@_ formatinda email karakteri girilir
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
