Feature: Dean_Vice_Dean_hesabi_olusturabilmelidir

  Background:
    Given Site adresine gidilir
    When Dean rolu ile login islemi gerceklestirilir

  @US06_TC01
  Scenario:Vice_Dean_Olusturma
    Then Name alanina veri girer
    Then Surname alanina veri girer
    Then Birth Place alanina veri girer
    Then Gender bolumunde gecerli bir secim yapilir
    Then Kullanici Date Of Birth alanina gun-ay-yil formatinda gecerli deger girer
    Then Phone alanina veri girer
    Then Ssn alanina veri girer
    And User Name alanina veri girer
    And Password alanina veri girer
    And Submit butonuna tiklar
  @US_TC02
  Scenario: Vice_Dean_olusturmada_Name_kismini_bos_birakma
    Given Name bos olarak birakilir
  @US_TC03
  Scenario: Vice_Dean_olusturmada_Surname_kismini_bos_birakma
    Given Surname bos olarak birakilir
  @US_TC04
  Scenario: Vice_Dean_olusturmada_Birth_place_kismini_bos_birakma
    Given Birth_Place bos olarak birakilir
  @US_TC05
  Scenario: Vice_Dean_olusturmada_Birth_of_Date_kismini_bos_birakma
    Given Kullanici Date Of Birth alanini bos birakir
  @US_TC06
  Scenario: Vice_Dean_olusturmada_Phone_kismini_bos_birakma
    Given Phone_Number bos olarak birakilir
  @US_TC07
  Scenario: Vice_Dean_olusturmada_Ssn_kismini_bos_birakma
    Given Kullanici SSN alanini bos birakir
  @US_TC08
  Scenario: Vice_Dean_olusturmada_Ssn_kisminda_ucuncu_rakamdan_sonra_-_koymama
    Given Ssn alanına üçüncü rakamdan sonra - işareti koymadan Ssn numarası girer.
  @US_TC09
  Scenario: Vice_Dean_olusturmada_Ssn_kisminda_besinci_rakamdan_sonra_-_koymama
    Given  Ssn alanına besinci rakamdan sonra - isareti koymadan Ssn numarasi girer.
  @US_TC10
  Scenario: Vice_Dean_olusturmada_Ssn_kisminda_ucuncu_ve_besinci_rakamdan_sonra_-_koymama
    Given Ssn alanina ucuncu ve besinci rakamdan sonra - isareti koymadan Ssn numarası girer
  @US_TC11
  Scenario: Vice_Dean_olusturmada_User_Name_kismini_bos_birakma
    Given Kullanici User name alanini bos birakir
  @US_TC12
  Scenario:Vice_Dean_olusturmada_Password_kismini_bos_birakma
    Given Kullanici Password alanini bos birakir
  @US_TC13
  Scenario: Vice_Dean_olusturmada_Password_kismini_yedi_karakterden_az_karakter_girme
    Given Password alanina yedi karakterden az bir deger girer
  @US_TC14
  Scenario: Vice_Dean_olusturmada_Password_kismina_yedi_karakter_girme
    Given Kullanici Password alanina yedi karakterli bir deger girer
  @US_TC15
  Scenario: Vice_Dean_olusturmada_Gender_kismini_bos_birakma
    Given Name alanina veri girer
    Then Surname alanina veri girer
    Then Birth Place alanina veri girer
    Then Kullanıcı Gender alanından cinsiyeti boş bırakır.
    Then Kullanici Date Of Birth alanina gun-ay-yil formatinda gecerli deger girer
    And Phone alanina veri girer
    And Ssn alanina veri girer
    And User Name alanina veri girer
    And Password alanina veri girer
    And Submit butonuna tiklar
















