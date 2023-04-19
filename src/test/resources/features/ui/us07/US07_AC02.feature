Feature: Dean, kullanıcıların gönderdiği mesajları görebilmeli

  Background:
    Given Site adresine gidilir
    When Dean rolu ile login islemi gerceklestirilir

<<<<<<< HEAD
  @us07_tc06 @smokeTest
=======
    # BUG -> Delete butonu yok
  @us07_tc06
>>>>>>> origin/Esra
  Scenario: Dean'in kullanicilarin gonderdigi mesajlari silebilmeli
    And Dean Menu butonuna tiklar
    And Dean Contact Get All yazisina tiklar
    And Dean Delete butonuna tiklar
    Then Dean sayfada istedigi mesajin silindigini dogrular
<<<<<<< HEAD
    Then Sayfa kapatilir
=======
    Then Sayfa kapatilir
>>>>>>> origin/Esra
