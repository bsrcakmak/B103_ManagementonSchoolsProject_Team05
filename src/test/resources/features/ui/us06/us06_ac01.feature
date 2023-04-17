@us06
Feature: Dean_Vice_Dean_hesabi_olusturabilmelidir

  Background:
    Given Site adresine gidilir
    When Admin rolu ile login islemi gerceklestirilir
    Then Baslikta bulunan Menu butonuna tiklanir
    Then Acilan bolumden Dean Management'a tiklar
  @US06_TC01
  Scenario:Dean_Olusturma
    Then Name alanina veri girer
    Then Surname alanina veri girer
    Then Birth Place alanina veri girer
    Then Dean Gender bolumunde gecerli bir secim yapilir
    Then Birthday alanina veri girer
    Then Phone alanina veri girer
    Then Ssn alanina veri girer
    And User Name alanina veri girer
    And Password alanina veri girer
    And Submit butonuna tiklar
    @US_TC02
    Scenario: Dean_olusturmada_Name_kismini_bos_birakma
      Given Name alani bos birakilir
    @US_TC03
    Scenario: Dean_olusturmada_Surname_kismini_bos_birakma
      Given  Surname alanini bos birakir
  @US_TC04
    Scenario: Dean_olusturmada_Birth_place_kismini_bos_birakma
    Given Birth_Place alani  bos birakilir
  @US_TC05
  Scenario: Dean_olusturmada_Birth_of_Date_kismini_bos_birakma
    Given  Date Of Birth alani bos birakilir
  @US_TC06
  Scenario: Dean_olusturmada_Phone_kismini_bos_birakma
    Given Phone_Number alani bos olarak birakilir
  @US_TC07
  Scenario: Dean_olusturmada_Ssn_kismini_bos_birakma
    Given SSN alanini bos birakilir
  @US_TC08
  Scenario: Dean_olusturmada_Ssn_kisminda_ucuncu_rakamdan_sonra_-_koymama
    Given Ssn alanina ucuncü rakamdan sonra - isareti koymadan Ssn numarasi girer.
  @US_TC09
  Scenario: Dean_olusturmada_Ssn_kisminda_besinci_rakamdan_sonra_-_koymama
    Given  Ssn alanina besinci rakamdan sonra - isareti koymadan Ssn numarasi girer.

  @US_TC11
  Scenario: Dean_olusturmada_User_Name_kismini_bos_birakma
    Given User name alanini bos birakilir
  @US_TC12
  Scenario: Dean_olusturmada_Password_kismini_bos_birakma
    Given Password alanini bos birakilir
  @US_TC13
  Scenario: Dean_olusturmada_Password_kismini_yedi_karakterden_az_karakter_girme
    Given Password alanina yedi karakterden az bir deger girer
  @US_TC14
  Scenario: Dean_olusturmada_Password_kismina_yedi_karakter_girme
    Given Password alanina yedi karakterli bir deger girer

  @US_TC15
  Scenario: Dean_olusturmada_Gender_kismini_bos_birakma
    Given Name alanina veri girer
    Then Surname alanina veri girer
    Then Birth Place alanina veri girer
    Then Date Of Birth kutusuna bir deger girilir
    And Phone alanina veri girer
    And Ssn alanina veri girer
    And User Name alanina veri girer
    And Password alanina veri girer
    And Submit butonuna tiklar
    And Logout islemi gerceklestirilir














