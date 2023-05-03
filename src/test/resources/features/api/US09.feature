
Feature:

  Scenario:Olusturulan; Lesson Name, Compulsory ve Credit Score gorebilmelidir
    Given Lesson goruntuleyebilmek icin endpoint hazirlanir US09_TC01
    Then Vice Dean rolu ile token olusturulur
    Then Get request gonderilir US09_TC01
    And Status Code'unun 200 oldugu dogrulanir

  Scenario: Ders silebilmelidir
    Given Lesson List bilgilerini silebilmek icin endpoint hazirlanir US09_TC02
    Then  Vice Dean rolu ile token olusturulur
    Then  Endpoint'e delete request gonderilir US09_TC02
    And Status Code'unun 200 oldugu dogrulanir

  Scenario: Ders bilgilerini guncelleyebilmelidir
    Given  Lesson List list bilgilerini guncellemek icin endpoint hazirlanir US09_TC03
    Then   Vice Dean rolu ile token olusturulur
    Then Endpoint'e delete request gonderilir US09_TC03
    And Status Code'unun 200 oldugu dogrulanir


