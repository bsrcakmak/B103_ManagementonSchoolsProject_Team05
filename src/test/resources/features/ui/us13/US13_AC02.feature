@US14
Feature: US-13 Vice Dean ogretmen olusturabilmelidir

  Background:
    Given Site adresine gidilir
    When Vice Dean rolu ile login islemi gerceklestirilir
    When Menu butonuna tiklar
    When Teacher Management'a tiklar

  @US13_TC05
  Scenario: TC05_Ogretmen_olusturulurken_Name_alaninin_bos_birakilmamasi
    And Sayfayi Submit butonu gorulecek sekilde asagi kaydirir.
    And Submit tiklanir
    And Name bos olarak birakilir
    Then Name_bolumunun_altinda_"Required"_yazisinin_oldugunu_dogrular
    Then Sayfa kapatilir

  @US13_TC06
  Scenario: TC05_Ogretmen_olusturulurken_Name_alaninin_bos_birakilmamasi
    And Ogretmenin girecegi ders secilir
    And Name alanina " " karakteri girilir.
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
    Then Hata mesajini goruntuler.
    Then Sayfa kapatilir