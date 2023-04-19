Feature: Vice Dean, kullanıcıların gönderdiği mesajları görebilmeli

  Background:
    Given Site adresine gidilir
    When Vice Dean rolu ile login islemi gerceklestirilir

<<<<<<< HEAD
  @us16_tc06 @smokeTest
=======
    # BUG -> Delete butonu yok silme islemi gerceklesmiyor
  @us16_tc06
>>>>>>> origin/Esra
  Scenario: Vice Dean'in kullanicilarin gonderdigi mesajlari silebilmeli
    And Vice Dean Menu butonuna tiklar
    And Vice Dean Contact Get All yazisina tiklar
    And Vice Dean Delete butonuna tiklar
    Then Vice Dean sayfada istedigi mesajin silindigini dogrular
<<<<<<< HEAD
    Then Sayfa kapatilir
=======
    Then Sayfa kapatilir

>>>>>>> origin/Esra
