@us13_tc01
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

    Scenario: TC01_Vice_Dean_olarak_ogretmen_olusturma

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
      And 3 saniye bekler
    Then Islemin gerceklestigine dair popUp mesajini goruntuler
      And 8 saniye bekler
    Then Sayfa kapatilir

      Scenario: TC02_Ogretmen_olusturulurken_ders_secim_alanin_bos_birakilmasi

        And Name "name(faker)" olarak girilir
        And 1 saniye bekler
        And Surname "surname(faker)" olarak girilir
        And 1 saniye bekler
        And birt place "birthplace(faker)" olarak girilir
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
        And 2 saniye bekler
        Then Ders secim alani bos birakildigi icin hata mesaji alir
        And 5 saniye bekler
        Then Sayfa kapatilir