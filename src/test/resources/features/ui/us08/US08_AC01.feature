Feature:Vice_Dean_ders_olusturabilmelidir
  Background:
    Given  Site adresine gidilir
    When Admin rolu ile login islemi gerceklestirilir
    Then Menu butonuna tiklar
    Then Kullancı açılan menüden Lesson Management e tıklar.
    And Acılan sayfada Lessons ı secer.

  @US08_TC01
  Scenario: Vice_dean_ders_olusturma
    Given Lesson Name alanına ders adı girer.
    Then Compulsory Checkbox ını işaretler.
    Then Credit Score alanına bir sayı girer.
    And Submit butonuna tiklar

  @US08_TC02
  Scenario: Vice_dean_ders_olusturmada_Lesson_Name_kismini_bos_birakma
    Given Kullanıcı Lesson Name alanını boş bırakır.

  @US08_TC03
  Scenario: Vice_dean_ders_olusturmada_Compulsory_checkbox_kismini_bos_birakma
    Given Compulsory checkbox alanını boş bırakır.
    Then Credit Score alanına bir sayı girer.
    And Submit butonuna tıklar.

  @US08_TC04
  Scenario: Vice_dean_ders_olusturmada_Credit_Score_kismini_bos_birakma
    Given Kullanıcı Credit Score alanını boş bırakır.










