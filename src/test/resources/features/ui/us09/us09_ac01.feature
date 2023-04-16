Feature: Vice_Dean_ders_listesini_gorebilmeli_ve_guncellemeler_yapabilmelidir

  Background:
    Given  Site adresine gidilir
    When Admin rolu ile login islemi gerceklestirilir
    Then Menu butonuna tiklar
    Then Kullancı açılan menüden Lesson Management e tıklar.
    And Acılan sayfada Lessons ı secer.

  @US09_TC01
  Scenario:  Lesson_Name_bilgilerini_gorüntuleyebilme
    Given Lesson List bolumunde Lesson Name bilgisini gorur.

  @US09_TC02
  Scenario: Compulsory_bilgilerini_gorüntuleyebilme
    Given Lesson List bolumunde Compulsory bilgisini gorur.

  @US09_TC03
  Scenario: Credit_Score_bilgilerini goruntuleyebilme
    Given Lesson List bolumunde Credit Score bilgisini gorur.

  @US09_TC04
  Scenario: Lesson_Name_Compulsory_ve_Credit_Score_bilgilerini_silebilme
    Given Lesson Name alanına ders adı girer.
    Then  Compulsory Checkbox ını işaretler.
    Then Credit Score alanına bir sayı girer.
    Then Submit butonuna tıklar.
    And son sayfa butonuna tıklar.
    And create edilen lesson ı silme butonuna tıklar

  @US09_TC05
  Scenario: Edit_butonunun_goruntulenmemesi
    Given Lesson Name alanına ders adı girer.
    Then  Compulsory Checkbox ını işaretler.
    Then Credit Score alanına bir sayı girer.
    Then Submit butonuna tıklar.
    And son sayfa butonuna tıklar.
    And create edilen lesson ı edit butonuna tıklar






