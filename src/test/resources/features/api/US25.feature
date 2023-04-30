@us25_student_save
Feature: Student_save

  @api_us25_api01
  Scenario: TC01_Admin_student_olusturabilmeli
    Given Admin rolu ile student olusturmak icin endpoint hazirlanir US25
    And  Admin rolu ile token olusturulur
    And Data hazirlanir US25
    And Post request gonderilir US25
    Then Status Code'unun 200 oldugu dogrulanir
    Then Request data’si ile response data’sinin ayni oldugu dogrulanir US25

  @api_us25_api02
  Scenario: TC02_API-Ogrenci olusturken "name" bilgisi girilmelidir
    Given Admin rolu ile student olusturmak icin endpoint hazirlanir US25
    And  Admin rolu ile token olusturulur
    And Sadece name bilgisi girilmeden data hazirlanir US25
    And Post request gonderilir US25
    Then Status Code'unun 400 oldugu dogrulanir

  @api_us25_api03
  Scenario: TC03_API-Ogrenci olusturken "surname" bilgisi girilmelidir
    Given Admin rolu ile student olusturmak icin endpoint hazirlanir US25
    And  Admin rolu ile token olusturulur
    And Sadece surname bilgisi girilmeden data hazirlanir US25
    And Post request gonderilir US25
    Then Status Code'unun 400 oldugu dogrulanir

  @api_us25_api04
  Scenario: TC03_API-Ogrenci olusturken "birthplace" bilgisi girilmelidir
    Given Admin rolu ile student olusturmak icin endpoint hazirlanir US25
    And  Admin rolu ile token olusturulur
    When Admin rolu ile token olusturulur US25
    And Sadece birthplace bilgisi girilmeden data hazirlanir US25
    And Post request gonderilir US25
    Then Status Code'unun 400 oldugu dogrulanir