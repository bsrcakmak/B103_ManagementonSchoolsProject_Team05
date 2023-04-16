
Feature: "Vice Dean öğretmene ders atayabilmelidir.(Lesson Program - Lesson Program Assignment)"

  @US12_AC01
  Scenario: Ders seçebilmelidir
    Given Site adresine gidilir
    Then Vice Dean rolu ile login islemi gerceklestirilir
    Then  kullanıcı menü ye tıklar
    Then ana menüden Lesson Management ders seçimine tıklar
    Then açılan sayfadan" lesson program " tıklar
    Then kullanıcı choose lessons tıklar ,ders seçimini yapar
    And  dersin seçili olduğunu doğrular


