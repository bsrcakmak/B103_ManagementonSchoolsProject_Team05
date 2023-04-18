Feature: Vice Dean, kullanıcıların gönderdiği mesajları görebilmeli

  Background:
    Given Site adresine gidilir
    When Vice Dean rolu ile login islemi gerceklestirilir

    # BUG -> Delete butonu yok silme islemi gerceklesmiyor
  @us16_tc06
  Scenario: Vice Dean'in kullanicilarin gonderdigi mesajlari silebilmeli
    And Vice Dean Menu butonuna tiklar
    And Vice Dean Contact Get All yazisina tiklar
    And Vice Dean Delete butonuna tiklar
    Then Vice Dean sayfada istedigi mesajin silindigini dogrular
    Then Sayfa kapatilir

