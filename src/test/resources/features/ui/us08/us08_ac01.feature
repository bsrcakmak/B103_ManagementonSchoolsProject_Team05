Feature:Vice_Dean_ders_olusturabilmelidir
  Background:
    Given  Site adresine gidilir
    When Admin rolu ile login islemi gerceklestirilir
    Then Menu butonuna tiklar
    Then Kullanici acilan menuden Lesson Management e tiklar.
    And Acilan sayfada Lessons i secer.

  @US08_TC01
  Scenario: Vice_dean_ders_olusturma
    Given Lesson Name alanina ders adi girer.
    Then Compulsory Checkbox ini isaretler.
    Then Credit Score alanina bir sayi girer.
    And Submit butonuna tiklar

  @US08_TC02
  Scenario: Vice_dean_ders_olusturmada_Lesson_Name_kismini_bos_birakma
    Given Kullanici Lesson Name alanini bos birakir.

  @US08_TC03
  Scenario: Vice_dean_ders_olusturmada_Compulsory_checkbox_kismini_bos_birakma
    Given Compulsory checkbox alanini bos birakir.
    Then Credit Score alanina bir sayi girer.
    And Submit butonuna tiklar.

  @US08_TC04
  Scenario: Vice_dean_ders_olusturmada_Credit_Score_kismini_bos_birakma
    Given Kullanici Credit Score alanini bos birakir.










