Feature: Vice Dean ders programını görebilmeli ve güncellemeler yapabilmelidir.


  @US10_TC01
  Scenario: Vice Dean Ders programını görmesi
    Given Ders Programını gorebilmek icin endpoint hazirlanir. US11
    When Vice Dean rolu ile token olusturulur
    Then Get request gonderilir. US11
    And Status Code'unun 200 oldugu dogrulanir

  @US10_TC02
  Scenario: Vice Dean Ders programını görmesi
    Given Ders Program Listten silme işlemi icin endpoint hazirlanir. US11
    When Vice Dean rolu ile token olusturulur
    Then Del request gönderilir. US11
    And Status Code'unun 200 oldugu dogrulanir