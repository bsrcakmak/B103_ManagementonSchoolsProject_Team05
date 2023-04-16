Feature: Vice_Dean_ders_listesini_gorebilmeli_ve_guncellemeler_yapabilmelidir

  Background:
    Given  Site adresine gidilir
    When Admin rolu ile login islemi gerceklestirilir
    Then Menu butonuna tiklar
    Then Kullanici acilan menüden Lesson Management e tiklar.
    And Acilan sayfada Lessons i secer.

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
    Given Lesson Name alanina ders adi girer.
    Then  Compulsory Checkbox ini isaretler.
    Then Credit Score alanina bir sayı girer.
    Then Submit butonuna tiklar.
    And son sayfa butonuna tiklar.
    And create edilen lesson i silme butonuna tiklar

  @US09_TC05
  Scenario: Edit_butonunun_goruntulenmemesi
    Given Lesson Name alanina ders adi girer.
    Then  Compulsory Checkbox ini isaretler.
    Then Credit Score alanina bir sayi girer.
    Then Submit butonuna tiklar.
    And son sayfa butonuna tiklar.
    And create edilen lesson i edit butonuna tiklar






